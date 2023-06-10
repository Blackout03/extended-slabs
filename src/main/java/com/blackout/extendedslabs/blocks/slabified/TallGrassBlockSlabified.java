package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.blocks.NaturalSlabBlock;
import com.blackout.extendedslabs.init.ESPSlabifiedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallGrassBlockSlabified extends TallGrassBlock {
	protected static final VoxelShape SHAPE = Block.box(2.0D, -8.0D, 2.0D, 14.0D, 5.0D, 14.0D);

	final String ITEM;

	public TallGrassBlockSlabified(Properties properties, String item) {
		super(properties);
		this.ITEM = item;
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		return !canSurvive(state, world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
		return (levelReader.getBlockState(blockPos.below()).getBlock() instanceof NaturalSlabBlock
				&& levelReader.getBlockState(blockPos.below()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM);
	}

	@Override
	public void performBonemeal(ServerLevel serverLevel, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
		DoublePlantBlockSlabified doubleplantblockslabified = (DoublePlantBlockSlabified)(blockState.is(ESPSlabifiedBlocks.FERN.get()) ? ESPSlabifiedBlocks.LARGE_FERN.get() : ESPSlabifiedBlocks.TALL_GRASS.get());
		if (doubleplantblockslabified.defaultBlockState().canSurvive(serverLevel, blockPos) && serverLevel.isEmptyBlock(blockPos.above())) {
			DoublePlantBlockSlabified.placeAt(serverLevel, doubleplantblockslabified.defaultBlockState(), blockPos, 2);
		}
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter p_49823_, BlockPos p_49824_, BlockState p_49825_) {
		switch (ITEM) {
			case "grass" -> {
				return new ItemStack(Items.GRASS);
			}
			case "fern" -> {
				return new ItemStack(Items.FERN);
			}
		}
		return new ItemStack(Items.AIR);
	}
}
