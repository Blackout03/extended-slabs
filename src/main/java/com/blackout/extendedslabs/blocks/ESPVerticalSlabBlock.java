package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class ESPVerticalSlabBlock extends Block implements SimpleWaterloggedBlock, IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Block materialSlab;
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

	public ESPVerticalSlabBlock(List<TagKey<Block>> characteristics, Block material, Block materialSlab, Properties builder) {
		super(builder);
		this.characteristics = characteristics;
		this.material = material;
		this.materialSlab = materialSlab;
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
	}

	public ESPVerticalSlabBlock(Block material, Block materialSlab, Properties builder) {
		this(IBlockCharacteristics.tag(), material, materialSlab, builder);
		this.material = material;
		this.materialSlab = materialSlab;
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, SHAPE, WATERLOGGED);
	}

	@Override
	@SuppressWarnings("deprecation")
	public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
		VerticalSlabShape verticalslabshape = state.getValue(SHAPE);
		Direction enumfacing = state.getValue(FACING);

		if (verticalslabshape != VerticalSlabShape.STRAIGHT) {
			return switch (verticalslabshape) {
				case OUTER_LEFT -> getOuterLeftFacingShapes(enumfacing);
				case OUTER_RIGHT -> getOuterRightFacingShapes(enumfacing);
				case INNER_LEFT -> getInnerLeftFacingShapes(enumfacing);
				case INNER_RIGHT -> getInnerRightFacingShapes(enumfacing);
				default -> getStraightFacingShapes(enumfacing);
			};
		} else {
			return getStraightFacingShapes(enumfacing);
		}
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

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
		BlockState iblockstate = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, ifluidstate.getType() == Fluids.WATER);
		return iblockstate.setValue(SHAPE, getSlabShape(iblockstate, context.getLevel(), context.getClickedPos()));
	}

	private static VerticalSlabShape getSlabShape(BlockState state, Level worldIn, BlockPos pos) {
		Direction direction = state.getValue(FACING);
		BlockState iblockstate = worldIn.getBlockState(pos.relative(direction));
		if (isBlockVerticalSlab(iblockstate)) {
			Direction direction1 = iblockstate.getValue(FACING);
			if (direction1.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, worldIn, pos, direction1.getOpposite())) {
				if (direction1 == direction.getCounterClockWise()) {
					return VerticalSlabShape.OUTER_LEFT;
				}
				return VerticalSlabShape.OUTER_RIGHT;
			}
		}
		BlockState iblockstate1 = worldIn.getBlockState(pos.relative(direction.getOpposite()));
		if (isBlockVerticalSlab(iblockstate1)) {
			Direction direction2 = iblockstate1.getValue(FACING);
			if (direction2.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, worldIn, pos, direction2)) {
				if (direction2 == direction.getCounterClockWise()) {
					return VerticalSlabShape.INNER_LEFT;
				}
				return VerticalSlabShape.INNER_RIGHT;
			}
		}
		return VerticalSlabShape.STRAIGHT;
	}

	private static boolean isDifferentVerticalSlab(BlockState state, Level worldIn, BlockPos pos, Direction direction) {
		BlockState iblockstate = worldIn.getBlockState(pos.relative(direction));
		return !isBlockVerticalSlab(iblockstate) || iblockstate.getValue(FACING) != state.getValue(FACING);
	}

	public static boolean isBlockVerticalSlab(BlockState state) {
		return state.getBlock() instanceof ESPVerticalSlabBlock || state.getBlock() instanceof FallingVerticalSlabBlock || state.getBlock() instanceof PathVerticalSlabBlock;
	}

	/**
	 * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
	 * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
	 * returns its solidified counterpart.
	 * Note that this method should ideally consider only the specific face passed in.
	 */
	@Override
	@SuppressWarnings("deprecation")
	public @NotNull BlockState updateShape(BlockState stateIn, @NotNull Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor worldIn, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
		if (stateIn.getValue(WATERLOGGED)) {
			worldIn.getFluidTicks().willTickThisTick(currentPos, Fluids.WATER);
		}
		return facing.getAxis().isHorizontal() ? stateIn.setValue(SHAPE, getSlabShape(stateIn, (Level) worldIn, currentPos)) : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	@Override
	@SuppressWarnings("deprecation")
	public @NotNull FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public boolean canPlaceLiquid(@NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Fluid fluidIn) {
		return SimpleWaterloggedBlock.super.canPlaceLiquid(worldIn, pos, state, fluidIn);
	}

	@Override
	public boolean placeLiquid(@NotNull LevelAccessor worldIn, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull FluidState fluidStateIn) {
		return SimpleWaterloggedBlock.super.placeLiquid(worldIn, pos, state, fluidStateIn);
	}

	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
		ItemStack itemStack = context.getItemInHand();
		if (!itemStack.canPerformAction(toolAction))
			return null;

		if (ToolActions.SHOVEL_FLATTEN == toolAction) {
			if (this.equals(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get())
					|| this.equals(ESPVerticalSlabs.DIRT_VERTICAL.get())
					|| this.equals(ESPVerticalSlabs.PODZOL_VERTICAL.get())
					|| this.equals(ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get())
					|| this.equals(ESPVerticalSlabs.MYCELIUM_VERTICAL.get())
					|| this.equals(ESPVerticalSlabs.ROOTED_DIRT_VERTICAL.get())) {
				return ESPVerticalSlabs.DIRT_PATH_VERTICAL.get().withPropertiesOf(state);
			}
		} else if (ToolActions.HOE_TILL == toolAction) {
			Block block = state.getBlock();
			if (block == ESPVerticalSlabs.ROOTED_DIRT_VERTICAL.get()) {
				if (!simulate && !context.getLevel().isClientSide) {
					Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
				}
				return ESPVerticalSlabs.DIRT_VERTICAL.get().withPropertiesOf(state);
			} else if ((block == ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get() || block == ESPVerticalSlabs.DIRT_PATH_VERTICAL.get()
					|| block == ESPVerticalSlabs.DIRT_VERTICAL.get() || block == ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get())
					&& context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
				return block == ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get() ? ESPVerticalSlabs.DIRT_VERTICAL.get().withPropertiesOf(state) : null;
			}
		}
		return null;
	}
}