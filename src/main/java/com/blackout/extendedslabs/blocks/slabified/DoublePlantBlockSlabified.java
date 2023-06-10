package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.blocks.NaturalSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DoublePlantBlockSlabified extends DoublePlantBlock {
	public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
	final String ITEM;
	protected static final VoxelShape SHAPE = Block.box(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);

	public DoublePlantBlockSlabified(Properties properties, String item) {
		super(properties);
		this.ITEM = item;
		this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER));
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
		if (blockState.getValue(HALF) != DoubleBlockHalf.UPPER) {
			return (levelReader.getBlockState(blockPos.below()).getBlock() instanceof NaturalSlabBlock && levelReader.getBlockState(blockPos.below()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM);
		} else {
			BlockState belowPos = levelReader.getBlockState(blockPos.below());
			if (blockState.getBlock() != this) return super.canSurvive(blockState, levelReader, blockPos); //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
			return belowPos.is(this) && belowPos.getValue(HALF) == DoubleBlockHalf.LOWER;
		}
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter p_49823_, BlockPos p_49824_, BlockState p_49825_) {
		switch (ITEM) {
			case "tall_grass" -> {
				return new ItemStack(Items.TALL_GRASS);
			}
			case "large_fern" -> {
				return new ItemStack(Items.LARGE_FERN);
			}
		}
		return new ItemStack(Items.AIR);
	}
}
