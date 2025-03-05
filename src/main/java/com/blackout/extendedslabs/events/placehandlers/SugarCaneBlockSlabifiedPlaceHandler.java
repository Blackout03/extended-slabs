package com.blackout.extendedslabs.events.placehandlers;

import com.blackout.extendedslabs.registry.ESPSlabifiedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.common.IPlantable;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

public class SugarCaneBlockSlabifiedPlaceHandler {
	public static void placeSugarCaneBlock(PlayerInteractEvent.RightClickBlock event, ItemStack held, Block block) {
		Player player = event.getEntity();
		Level level = event.getLevel();
		BlockPos blockPos = event.getPos();
		BlockState blockState = level.getBlockState(blockPos);
		Direction direction = event.getFace();
		BlockPos relativePos = blockPos.relative(direction);

		if (block instanceof IPlantable plantable && (direction == Direction.UP && (blockState.canSustainPlant(level, blockPos, Direction.UP, plantable)
				&& ((blockState.is(BlockTags.SLABS) && blockState.getValue(SlabBlock.TYPE) == SlabType.BOTTOM)
				|| blockState.is(ESPSlabifiedBlocks.SUGAR_CANE.get()))) && level.isEmptyBlock(relativePos))) {
			boolean waterAnyDirection = false;
			for (Direction direction1 : Direction.Plane.HORIZONTAL) {
				if (!waterAnyDirection) {
					BlockState belowState1 = level.getBlockState(blockPos.relative(direction1));
					FluidState fluidState1 = level.getFluidState(blockPos.relative(direction1));
					if (blockState.canBeHydrated(level, blockPos, fluidState1, blockPos.relative(direction1)) || belowState1.is(Blocks.FROSTED_ICE)) {
						waterAnyDirection = true;
					}
				}
			}

			if (waterAnyDirection || blockState.is(ESPSlabifiedBlocks.SUGAR_CANE.get())) {
				level.setBlockAndUpdate(relativePos, block.defaultBlockState());

				SoundType soundType = block.getSoundType(block.defaultBlockState(), level, blockPos, player);
				level.playSound(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), soundType.getPlaceSound(), SoundSource.BLOCKS, soundType.getVolume(), soundType.getPitch() - 0.2F);
				player.swing(event.getHand());

				if (!player.isCreative()) {
					held.shrink(1);
				}
				event.setCanceled(true);
			}
		}
	}
}
