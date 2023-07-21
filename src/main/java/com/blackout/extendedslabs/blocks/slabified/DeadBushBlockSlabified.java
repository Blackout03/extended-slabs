package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DeadBushBlockSlabified extends DeadBushBlock implements ISlabified {
	final Block blockOf;
	protected static final VoxelShape SHAPE = Block.box(2.0D, -8.0D, 2.0D, 14.0D, 5.0D, 14.0D);


	public DeadBushBlockSlabified(Properties properties, Block blockOf) {
		super(properties);
		this.blockOf = blockOf;
	}

	public Block getBlockOf() {
		return blockOf;
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
		return levelReader.getBlockState(blockPos.below()).is(BlockTags.SLABS)
				&& (levelReader.getBlockState(blockPos.below()).canSustainPlant(levelReader, blockPos, Direction.UP, this)
				&& levelReader.getBlockState(blockPos.below()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM);
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState) {
		return new ItemStack(blockOf.asItem());
	}
}
