package com.blackout.extendedslabs.blocks.magma;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.function.Supplier;

public class MagmaSlabBlock extends ESPSlabBlock implements IBlockCharacteristics {
	private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialVerticalSlab;

	public MagmaSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab) {
		super(characteristics, material, materialVerticalSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
	}

	public MagmaSlabBlock(Block material, Supplier<Block> materialVerticalSlab) {
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
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
		if (!pEntity.isSteppingCarefully() && pEntity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)pEntity)) {
			pEntity.hurt(pLevel.damageSources().hotFloor(), 1.0F);
		}

		super.stepOn(pLevel, pPos, pState, pEntity);
	}

	@Override
	public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		BubbleColumnBlock.updateColumn(pLevel, pPos.above(), pState);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pFacing == Direction.UP && pFacingState.is(Blocks.WATER)) {
			pLevel.scheduleTick(pCurrentPos, this, 20);
		}

		return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
		pLevel.scheduleTick(pPos, this, 20);
	}
}
