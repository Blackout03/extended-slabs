package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.registry.ESPSlabifiedBlocks;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.CommonHooks;
import net.neoforged.neoforge.common.IPlantable;

import java.util.Iterator;

public class SugarCaneBlockSlabified extends SugarCaneBlock implements ISlabified {
    final Block blockOf;
	protected static final VoxelShape SHAPE = Block.box(2.0D, -8.0D, 2.0D, 14.0D, 8.0D, 14.0D);

    public SugarCaneBlockSlabified(Properties properties, Block blockOf) {
        super(properties);
        this.blockOf = blockOf;
    }

    @Override
    public Block getBlockOf() {
        return blockOf;
    }

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
		if (!canSurvive(blockState, serverLevel, blockPos)) {
			serverLevel.destroyBlock(blockPos, true);
		}
	}

	@Override
	public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
		if (serverLevel.isEmptyBlock(blockPos.above())) {
			int i;
			i = 1;
			while (serverLevel.getBlockState(blockPos.below(i)).is(this)) {
				++i;
			}

			if (i < 3) {
				int j = blockState.getValue(AGE);
				if (CommonHooks.onCropsGrowPre(serverLevel, blockPos, blockState, true)) {
					if (j == 15) {
						serverLevel.setBlockAndUpdate(blockPos.above(), this.defaultBlockState());
						CommonHooks.onCropsGrowPost(serverLevel, blockPos.above(), this.defaultBlockState());
						serverLevel.setBlock(blockPos, blockState.setValue(AGE, 0), 4);
					} else {
						serverLevel.setBlock(blockPos, blockState.setValue(AGE, j + 1), 4);
					}
				}
			}
		}
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
		BlockPos belowPos = blockPos.below();
		BlockState belowState = levelReader.getBlockState(belowPos);
		FluidState fluidState = levelReader.getFluidState(belowPos);
		if (belowState.canSustainPlant(levelReader, belowPos, Direction.UP, this)) return true;
		if (belowState.is(this)) {
			return true;
		} else {
			if (levelReader.getBlockState(blockPos.below()).is(BlockTags.SLABS)
					&& ((belowState.is(BlockTags.DIRT) || belowState.is(BlockTags.SAND))
					&& belowState.getValue(SlabBlock.TYPE) == SlabType.BOTTOM)) {
				if (belowState.getValue(BlockStateProperties.WATERLOGGED)) {
					return true;
				}
				for(Direction direction : Direction.Plane.HORIZONTAL) {
					BlockState belowState1 = levelReader.getBlockState(belowPos.relative(direction));
					FluidState fluidState1 = levelReader.getFluidState(belowPos.relative(direction));
					if (blockState.canBeHydrated(levelReader, blockPos, fluidState1, belowPos.relative(direction)) || belowState1.is(Blocks.FROSTED_ICE)) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
		BlockState plant = plantable.getPlant(world, pos.relative(facing));

		if (plant.getBlock() == ESPSlabifiedBlocks.SUGAR_CANE.get()) {
			boolean isBeach = state.is(BlockTags.SLABS) && ((state.is(BlockTags.DIRT) || state.is(BlockTags.SAND)) && state.getValue(SlabBlock.TYPE) == SlabType.BOTTOM);
			boolean hasWater = false;

			for (Direction face : Direction.Plane.HORIZONTAL) {
				BlockState adjacentBlockState = world.getBlockState(pos.relative(face));
				FluidState adjacentFluidState = world.getFluidState(pos.relative(face));
				hasWater = adjacentBlockState.is(Blocks.FROSTED_ICE) || adjacentFluidState.is(FluidTags.WATER);
				if (hasWater) {
					break;
				}
			}

			return (isBeach && hasWater) || state.is(ESPSlabifiedBlocks.SUGAR_CANE.get());
		}
		return false;
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState) {
		return new ItemStack(blockOf.asItem());
	}
}
