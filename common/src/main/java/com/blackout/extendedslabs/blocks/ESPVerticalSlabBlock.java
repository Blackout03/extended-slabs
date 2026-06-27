package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class ESPVerticalSlabBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<VerticalSlabShape> SHAPE = EnumProperty.create("shape", VerticalSlabShape.class);

	protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
	protected static final VoxelShape EAST_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);

	protected static final VoxelShape NORTH_OUTER_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 8.0D);
	protected static final VoxelShape EAST_OUTER_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
	protected static final VoxelShape SOUTH_OUTER_SHAPE = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape WEST_OUTER_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 16.0D, 16.0D);

	private final List<TagKey<Block>> tags;
	private final Block originalBlock;
	private final Block slabVariant;

	public ESPVerticalSlabBlock(List<TagKey<Block>> tags, Block originalBlock, Block slabVariant, Properties properties) {
		super(properties);
		this.tags = tags;
		this.originalBlock = originalBlock;
		this.slabVariant = slabVariant;
		registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
	}

	public List<TagKey<Block>> tags() {
		return tags;
	}

	public Block originalBlock() {
		return originalBlock;
	}

	public Block slabVariant() {
		return slabVariant;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, SHAPE, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
		BlockState state = defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
		return state.setValue(SHAPE, getSlabShape(state, context.getLevel(), context.getClickedPos()));
	}

	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		VerticalSlabShape shape = state.getValue(SHAPE);
		Direction facing = state.getValue(FACING);
		return switch (shape) {
			case OUTER_LEFT -> getOuterLeftFacingShapes(facing);
			case OUTER_RIGHT -> getOuterRightFacingShapes(facing);
			case INNER_LEFT -> getInnerLeftFacingShapes(facing);
			case INNER_RIGHT -> getInnerRightFacingShapes(facing);
			default -> getStraightFacingShapes(facing);
		};
	}

	private static VoxelShape getStraightFacingShapes(Direction facing) {
		return switch (facing) {
			case WEST -> WEST_SHAPE;
			case EAST -> EAST_SHAPE;
			case SOUTH -> SOUTH_SHAPE;
			default -> NORTH_SHAPE;
		};
	}

	private static VoxelShape getOuterLeftFacingShapes(Direction facing) {
		return switch (facing) {
			case WEST -> WEST_OUTER_SHAPE;
			case EAST -> EAST_OUTER_SHAPE;
			case SOUTH -> SOUTH_OUTER_SHAPE;
			default -> NORTH_OUTER_SHAPE;
		};
	}

	private static VoxelShape getInnerLeftFacingShapes(Direction facing) {
		return switch (facing) {
			case WEST -> Shapes.or(WEST_SHAPE, SOUTH_SHAPE);
			case EAST -> Shapes.or(EAST_SHAPE, NORTH_SHAPE);
			case SOUTH -> Shapes.or(SOUTH_SHAPE, EAST_SHAPE);
			default -> Shapes.or(NORTH_SHAPE, WEST_SHAPE);
		};
	}

	private static VoxelShape getOuterRightFacingShapes(Direction facing) {
		return switch (facing) {
			case WEST -> NORTH_OUTER_SHAPE;
			case EAST -> SOUTH_OUTER_SHAPE;
			case SOUTH -> WEST_OUTER_SHAPE;
			default -> EAST_OUTER_SHAPE;
		};
	}

	private static VoxelShape getInnerRightFacingShapes(Direction facing) {
		return switch (facing) {
			case WEST -> Shapes.or(WEST_SHAPE, NORTH_SHAPE);
			case EAST -> Shapes.or(EAST_SHAPE, SOUTH_SHAPE);
			case SOUTH -> Shapes.or(SOUTH_SHAPE, WEST_SHAPE);
			default -> Shapes.or(NORTH_SHAPE, EAST_SHAPE);
		};
	}

	private static VerticalSlabShape getSlabShape(BlockState state, Level level, BlockPos pos) {
		Direction direction = state.getValue(FACING);
		BlockState forward = level.getBlockState(pos.relative(direction));
		if (isBlockVerticalSlab(forward)) {
			Direction forwardDirection = forward.getValue(FACING);
			if (forwardDirection.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, level, pos, forwardDirection.getOpposite())) {
				return forwardDirection == direction.getCounterClockWise() ? VerticalSlabShape.OUTER_LEFT : VerticalSlabShape.OUTER_RIGHT;
			}
		}

		BlockState backward = level.getBlockState(pos.relative(direction.getOpposite()));
		if (isBlockVerticalSlab(backward)) {
			Direction backwardDirection = backward.getValue(FACING);
			if (backwardDirection.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, level, pos, backwardDirection)) {
				return backwardDirection == direction.getCounterClockWise() ? VerticalSlabShape.INNER_LEFT : VerticalSlabShape.INNER_RIGHT;
			}
		}

		return VerticalSlabShape.STRAIGHT;
	}

	private static boolean isDifferentVerticalSlab(BlockState state, Level level, BlockPos pos, Direction direction) {
		BlockState other = level.getBlockState(pos.relative(direction));
		return !isBlockVerticalSlab(other) || other.getValue(FACING) != state.getValue(FACING);
	}

	public static boolean isBlockVerticalSlab(BlockState state) {
		return state.getBlock() instanceof ESPVerticalSlabBlock;
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
		if (state.getValue(WATERLOGGED)) {
			level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
		}

		return direction.getAxis().isHorizontal() ? state.setValue(SHAPE, getSlabShape(state, (Level) level, pos)) : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
		return SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid);
	}

	@Override
	public boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState state, FluidState fluidState) {
		return SimpleWaterloggedBlock.super.placeLiquid(level, pos, state, fluidState);
	}
}
