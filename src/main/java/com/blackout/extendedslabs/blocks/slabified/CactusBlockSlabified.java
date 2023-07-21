package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPSlabifiedBlocks;
import com.blackout.extendedslabs.registry.ESPSlabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;

public class CactusBlockSlabified extends CactusBlock implements ISlabified {
    final Block blockOf;
	protected static final VoxelShape COLLISION_SHAPE = Block.box(1.0D, -8.0D, 1.0D, 15.0D, 7.0D, 15.0D);
	protected static final VoxelShape OUTLINE_SHAPE = Block.box(1.0D, -8.0D, 1.0D, 15.0D, 8.0D, 15.0D);

    public CactusBlockSlabified(Properties properties, Block blockOf) {
        super(properties);
        this.blockOf = blockOf;
    }

    @Override
    public Block getBlockOf() {
        return blockOf;
    }

	@Override
	public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
		if (!serverLevel.isAreaLoaded(blockPos, 1)) return; // Forge: prevent growing cactus from loading unloaded chunks with block update
		if (!canSurvive(blockState, serverLevel, blockPos)) {
			serverLevel.destroyBlock(blockPos, true);
		}
	}

	@Override
	public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
		BlockPos blockPos1 = blockPos.above();
		if (serverLevel.isEmptyBlock(blockPos1)) {
			int i = 1;
			while (serverLevel.getBlockState(blockPos.below(i)).is(this)) {
				++i;
			}

			if (i < 3) {
				int j = blockState.getValue(AGE);
				if(ForgeHooks.onCropsGrowPre(serverLevel, blockPos1, blockState, true)) {
					if (j == 15) {
						serverLevel.setBlockAndUpdate(blockPos1, this.defaultBlockState());
						BlockState blockState1 = blockState.setValue(AGE, 0);
						serverLevel.setBlock(blockPos, blockState1, 4);
						serverLevel.neighborChanged(blockState1, blockPos1, this, blockPos, false);
					} else {
						serverLevel.setBlock(blockPos, blockState.setValue(AGE, j + 1), 4);
					}
					ForgeHooks.onCropsGrowPost(serverLevel, blockPos, blockState);
				}
			}
		}
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return OUTLINE_SHAPE;
	}

	@Override
	public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return COLLISION_SHAPE;
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (!state.canSurvive(world, currentPos)) {
			world.scheduleTick(currentPos, this, 1);
		}

		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
		for(Direction direction : Direction.Plane.HORIZONTAL) {
			BlockPos belowPos = blockPos.below();
			BlockState blockState1 = levelReader.getBlockState(blockPos.relative(direction));
			BlockState belowState1 = levelReader.getBlockState(belowPos.relative(direction));
			if (((blockState1.isSolid() && !blockState1.is(BlockTags.SLABS)) || levelReader.getFluidState(blockPos.relative(direction)).is(FluidTags.LAVA))
			&& (blockState1.is(BlockTags.SLABS) && (blockState1.getValue(SlabBlock.TYPE) == SlabType.BOTTOM || blockState1.getValue(SlabBlock.TYPE) == SlabType.DOUBLE))) {
				ExtendedSlabs.LOGGER.debug("blockState1: " + blockPos);
				return false;
			}
			if (((belowState1.isSolid() && !belowState1.is(BlockTags.SLABS)) || levelReader.getFluidState(belowPos.relative(direction)).is(FluidTags.LAVA))
			&& (belowState1.is(BlockTags.SLABS) && (belowState1.getValue(SlabBlock.TYPE) == SlabType.TOP || belowState1.getValue(SlabBlock.TYPE) == SlabType.DOUBLE))) {
				ExtendedSlabs.LOGGER.debug("belowState1: " + belowPos);
				return false;
			}
		}

		BlockState belowState2 = levelReader.getBlockState(blockPos.below());
		return ((((belowState2.getBlock() == ESPSlabs.SAND_SLAB.get() || belowState2.getBlock() == ESPSlabs.RED_SAND_SLAB.get())
				&& belowState2.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) || belowState2.getBlock() == this)
				&& (belowState2.canSustainPlant(levelReader, blockPos, Direction.UP, this) && !levelReader.getBlockState(blockPos.above()).liquid()));
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
		BlockState plant = plantable.getPlant(world, pos.relative(facing));

		if (plant.getBlock() == ESPSlabifiedBlocks.CACTUS.get())
			return state.is(ESPSlabifiedBlocks.CACTUS.get()) || state.is(BlockTags.SAND);

		return false;
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState) {
		return new ItemStack(blockOf.asItem());
	}
}
