package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.blocks.NaturalSlabBlock;
import com.blackout.extendedslabs.init.ESPSlabifiedBlocks;
import com.blackout.extendedslabs.init.ESPSlabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
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

public class DeadBushBlockSlabified extends DeadBushBlock {
	protected static final VoxelShape SHAPE = Block.box(2.0D, -8.0D, 2.0D, 14.0D, 5.0D, 14.0D);


	public DeadBushBlockSlabified(Properties properties) {
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return blockState.is(ESPSlabs.SAND_SLAB.get()) || blockState.is(ESPSlabs.RED_SAND_SLAB.get())
				|| blockState.is(ESPSlabs.DIRT_SLAB.get()) || blockState.is(ESPSlabs.GRASS_BLOCK_SLAB.get())
				|| blockState.is(ESPSlabs.PODZOL_SLAB.get()) || blockState.is(ESPSlabs.COARSE_DIRT_SLAB.get())
				|| blockState.is(ESPSlabs.MYCELIUM_SLAB.get()) || blockState.is(ESPSlabs.ROOTED_DIRT_SLAB.get())
				|| blockState.is(ESPSlabs.MUD_SLAB.get()) || blockState.is(ESPSlabs.TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.WHITE_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.ORANGE_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.YELLOW_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.LIME_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.PINK_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.GRAY_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.CYAN_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.PURPLE_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.BLUE_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.BROWN_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.GREEN_TERRACOTTA_SLAB.get())
				|| blockState.is(ESPSlabs.RED_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.BLACK_TERRACOTTA_SLAB.get());
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
	public ItemStack getCloneItemStack(BlockGetter p_49823_, BlockPos p_49824_, BlockState p_49825_) {
		return new ItemStack(Items.DEAD_BUSH);
	}
}
