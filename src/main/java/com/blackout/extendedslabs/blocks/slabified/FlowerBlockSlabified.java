package com.blackout.extendedslabs.blocks.slabified;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class FlowerBlockSlabified extends FlowerBlock implements ISlabified {
	final Block blockOf;
	protected static final VoxelShape SHAPE = Block.box(5.0D, -80.0D, 5.0D, 11.0D, 2.0D, 11.0D);

	public FlowerBlockSlabified(Supplier<MobEffect> mobEffectSupplier, int level, Properties properties, Block blockOf) {
		super(mobEffectSupplier, level, properties);
		this.blockOf = blockOf;
	}

	public Block getBlockOf() {
		return blockOf;
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		Vec3 vec3 = blockState.getOffset(blockGetter, blockPos);
		return SHAPE.move(vec3.x, vec3.y, vec3.z);
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
