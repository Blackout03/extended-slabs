package com.blackout.extendedslabs.blocks.soulsand;

import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
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

public class SoulSandCornerBlock extends ESPCornerBlock implements IBlockCharacteristics {
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

	public SoulSandCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialSlab) {
		super(material, materialSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialSlab = materialSlab;
	}

	public SoulSandCornerBlock(Block material, Supplier<Block> materialSlab) {
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
		Direction direction = pState.getValue(FACING);
		return switch (direction) {
			case WEST -> Shapes.or(COLLISION_WEST_SHAPE, COLLISION_SOUTH_OUTER_SHAPE);
			case EAST -> Shapes.or(COLLISION_EAST_SHAPE, COLLISION_NORTH_OUTER_SHAPE);
			case SOUTH -> Shapes.or(COLLISION_SOUTH_SHAPE, COLLISION_EAST_OUTER_SHAPE);
			default -> Shapes.or(COLLISION_NORTH_SHAPE, COLLISION_WEST_OUTER_SHAPE);
		};
	}

	@Override
	public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pReader, BlockPos pPos) {
		Direction direction = pState.getValue(FACING);
		return switch (direction) {
			case WEST -> Shapes.or(WEST_SHAPE, SOUTH_OUTER_SHAPE);
			case EAST -> Shapes.or(EAST_SHAPE, NORTH_OUTER_SHAPE);
			case SOUTH -> Shapes.or(SOUTH_SHAPE, EAST_OUTER_SHAPE);
			default -> Shapes.or(NORTH_SHAPE, WEST_OUTER_SHAPE);
		};
	}

	@Override
	public VoxelShape getVisualShape(BlockState pState, BlockGetter pReader, BlockPos pPos, CollisionContext pContext) {
		Direction direction = pState.getValue(FACING);
		return switch (direction) {
			case WEST -> Shapes.or(WEST_SHAPE, SOUTH_OUTER_SHAPE);
			case EAST -> Shapes.or(EAST_SHAPE, NORTH_OUTER_SHAPE);
			case SOUTH -> Shapes.or(SOUTH_SHAPE, EAST_OUTER_SHAPE);
			default -> Shapes.or(NORTH_SHAPE, WEST_OUTER_SHAPE);
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
