package com.blackout.extendedslabs.blocks.soulsand;

import com.blackout.extendedslabs.blocks.ESPSlabBlock;
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
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.function.Supplier;

public class SoulSandSlabBlock extends ESPSlabBlock implements IBlockCharacteristics {
	private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialVerticalSlab;

	protected static final VoxelShape COLLISION_BOTTOM_AABB = Block.box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
	protected static final VoxelShape COLLISION_TOP_AABB = Block.box(0.0, 8.0, 0.0, 16.0, 14.0, 16.0);
	protected static final VoxelShape COLLISION_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

	public SoulSandSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab) {
		super(characteristics, material, materialVerticalSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
	}

	public SoulSandSlabBlock(Block material, Supplier<Block> materialVerticalSlab) {
		this(IBlockCharacteristics.tag(), material, materialVerticalSlab);
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialVerticalSlab() {
		return materialVerticalSlab.get();
	}

	@Override
	public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		SlabType slabtype = pState.getValue(TYPE);
		switch (slabtype) {
			case DOUBLE -> {
				return COLLISION_SHAPE;
			}
			case TOP -> {
				return COLLISION_TOP_AABB;
			}
			default -> {
				return COLLISION_BOTTOM_AABB;
			}
		}
	}

	@Override
	public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pReader, BlockPos pPos) {
		SlabType slabtype = pState.getValue(TYPE);
		switch (slabtype) {
			case DOUBLE -> {
				return Shapes.block();
			}
			case TOP -> {
				return TOP_AABB;
			}
			default -> {
				return BOTTOM_AABB;
			}
		}
	}

	@Override
	public VoxelShape getVisualShape(BlockState pState, BlockGetter pReader, BlockPos pPos, CollisionContext pContext) {
		SlabType slabtype = pState.getValue(TYPE);
		switch (slabtype) {
			case DOUBLE -> {
				return Shapes.block();
			}
			case TOP -> {
				return TOP_AABB;
			}
			default -> {
				return BOTTOM_AABB;
			}
		}
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
