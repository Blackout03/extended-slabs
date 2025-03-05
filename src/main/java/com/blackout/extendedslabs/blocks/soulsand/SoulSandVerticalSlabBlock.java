package com.blackout.extendedslabs.blocks.soulsand;

import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.function.Supplier;

public class SoulSandVerticalSlabBlock extends ESPVerticalSlabBlock implements IBlockCharacteristics {
	private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialSlab;

	protected static final VoxelShape COLLISION_NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 8.0D);
	protected static final VoxelShape COLLISION_EAST_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);
	protected static final VoxelShape COLLISION_SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 14.0D, 16.0D);
	protected static final VoxelShape COLLISION_WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 14.0D, 16.0D);

	protected static final VoxelShape COLLISION_NORTH_OUTER_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 14.0D, 8.0D);
	protected static final VoxelShape COLLISION_EAST_OUTER_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 14.0D, 8.0D);
	protected static final VoxelShape COLLISION_SOUTH_OUTER_SHAPE = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 14.0D, 16.0D);
	protected static final VoxelShape COLLISION_WEST_OUTER_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 14.0D, 16.0D);

	public SoulSandVerticalSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialSlab) {
		super(material, materialSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialSlab = materialSlab;
	}

	public SoulSandVerticalSlabBlock(Block material, Supplier<Block> materialSlab) {
		this(IBlockCharacteristics.tag(), material, materialSlab);
		this.material = material;
		this.materialSlab = materialSlab;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab.get();
	}

	@Override
	public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		VerticalSlabShape verticalslabshape = pState.getValue(SHAPE);
		Direction enumfacing = pState.getValue(FACING);

		if (verticalslabshape != VerticalSlabShape.STRAIGHT) {
			return switch (verticalslabshape) {
				case OUTER_LEFT -> getOuterLeftFacingCollisionShapes(enumfacing);
				case OUTER_RIGHT -> getOuterRightFacingCollisionShapes(enumfacing);
				case INNER_LEFT -> getInnerLeftFacingCollisionShapes(enumfacing);
				case INNER_RIGHT -> getInnerRightFacingCollisionShapes(enumfacing);
				default -> getStraightFacingCollisionShapes(enumfacing);
			};
		} else {
			return getStraightFacingCollisionShapes(enumfacing);
		}
	}

	@Override
	public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pReader, BlockPos pPos) {
		VerticalSlabShape verticalslabshape = pState.getValue(SHAPE);
		Direction enumfacing = pState.getValue(FACING);

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

	@Override
	public VoxelShape getVisualShape(BlockState pState, BlockGetter pReader, BlockPos pPos, CollisionContext pContext) {
		VerticalSlabShape verticalslabshape = pState.getValue(SHAPE);
		Direction enumfacing = pState.getValue(FACING);

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

	protected static VoxelShape getStraightFacingCollisionShapes(Direction facing) {
		return switch (facing) {
			case WEST -> COLLISION_WEST_SHAPE;
			case EAST -> COLLISION_EAST_SHAPE;
			case SOUTH -> COLLISION_SOUTH_SHAPE;
			default -> COLLISION_NORTH_SHAPE;
		};
	}

	protected static VoxelShape getOuterLeftFacingCollisionShapes(Direction facing) {
		return switch (facing) {
			case WEST -> COLLISION_WEST_OUTER_SHAPE;
			case EAST -> COLLISION_EAST_OUTER_SHAPE;
			case SOUTH -> COLLISION_SOUTH_OUTER_SHAPE;
			default -> COLLISION_NORTH_OUTER_SHAPE;
		};
	}

	protected static VoxelShape getInnerLeftFacingCollisionShapes(Direction facing) {
		return switch (facing) {
			case WEST -> Shapes.or(COLLISION_WEST_SHAPE, COLLISION_SOUTH_SHAPE);
			case EAST -> Shapes.or(COLLISION_EAST_SHAPE, COLLISION_NORTH_SHAPE);
			case SOUTH -> Shapes.or(COLLISION_SOUTH_SHAPE, COLLISION_EAST_SHAPE);
			default -> Shapes.or(COLLISION_NORTH_SHAPE, COLLISION_WEST_SHAPE);
		};
	}

	protected static VoxelShape getOuterRightFacingCollisionShapes(Direction facing) {
		return switch (facing) {
			case WEST -> COLLISION_NORTH_OUTER_SHAPE;
			case EAST -> COLLISION_SOUTH_OUTER_SHAPE;
			case SOUTH -> COLLISION_WEST_OUTER_SHAPE;
			default -> COLLISION_EAST_OUTER_SHAPE;
		};
	}

	protected static VoxelShape getInnerRightFacingCollisionShapes(Direction facing) {
		return switch (facing) {
			case WEST -> Shapes.or(COLLISION_WEST_SHAPE, COLLISION_NORTH_SHAPE);
			case EAST -> Shapes.or(COLLISION_EAST_SHAPE, COLLISION_SOUTH_SHAPE);
			case SOUTH -> Shapes.or(COLLISION_SOUTH_SHAPE, COLLISION_WEST_SHAPE);
			default -> Shapes.or(COLLISION_NORTH_SHAPE, COLLISION_EAST_SHAPE);
		};
	}

	@Override
	public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		BubbleColumnBlock.updateColumn(pLevel, pPos.above(), pState);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pFacing == Direction.UP && pFacingState.is(Blocks.WATER) || this.getFluidState(pState).is(Fluids.WATER)) {
			pLevel.scheduleTick(pCurrentPos, this, 20);
		}

		return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
		pLevel.scheduleTick(pPos, this, 20);
	}

	@Override
	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
		return false;
	}

	@Override
	public float getShadeBrightness(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return 0.2F;
	}
}
