package com.blackout.extendedslabs.blocks.slabified;

import com.blackout.extendedslabs.registry.ESPSlabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class WitherRoseBlockSlabified extends FlowerBlockSlabified {
	public WitherRoseBlockSlabified(Supplier<MobEffect> mobEffect, Properties properties, Block blockOf) {
		super(mobEffect, 8, properties, blockOf);
	}

	protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return super.mayPlaceOn(blockState, blockGetter, blockPos) || blockState.is(ESPSlabs.NETHERRACK_SLAB.get());
//				|| blockState.is(Blocks.SOUL_SAND) || blockState.is(Blocks.SOUL_SOIL);
	}

	public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
		VoxelShape voxelshape = this.getShape(blockState, level, blockPos, CollisionContext.empty());
		Vec3 vec3 = voxelshape.bounds().getCenter();
		double d0 = (double)blockPos.getX() + vec3.x;
		double d1 = (double)blockPos.getZ() + vec3.z;

		for(int i = 0; i < 3; ++i) {
			if (randomSource.nextBoolean()) {
				level.addParticle(ParticleTypes.SMOKE, d0 + randomSource.nextDouble() / 5.0D, (double)blockPos.getY() + (0.5D - randomSource.nextDouble()), d1 + randomSource.nextDouble() / 5.0D, 0.0D, 0.0D, 0.0D);
			}
		}

	}

	public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
		if (!level.isClientSide && level.getDifficulty() != Difficulty.PEACEFUL) {
			if (entity instanceof LivingEntity livingentity) {
				if (!livingentity.isInvulnerableTo(level.damageSources().wither())) {
					livingentity.addEffect(new MobEffectInstance(MobEffects.WITHER, 40));
				}
			}

		}
	}
}
