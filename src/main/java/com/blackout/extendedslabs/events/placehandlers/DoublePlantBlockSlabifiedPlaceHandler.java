package com.blackout.extendedslabs.events.placehandlers;

import com.blackout.extendedslabs.blocks.slabified.DoublePlantBlockSlabified;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.common.IPlantable;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

public class DoublePlantBlockSlabifiedPlaceHandler {
	public static void placeDoublePlantBlock(PlayerInteractEvent.RightClickBlock event, ItemStack held, Block block) {
		Player player = event.getEntity();
		Level level = event.getLevel();
		BlockPos blockPos = event.getPos();
		BlockState blockState = level.getBlockState(blockPos);
		Direction direction = event.getFace();
		BlockPos relativePos = blockPos.relative(direction);

		if (block instanceof IPlantable plantable && (direction == Direction.UP && (blockState.canSustainPlant(level, blockPos, Direction.UP, plantable)
				&& (blockState.is(BlockTags.SLABS) && blockState.getValue(SlabBlock.TYPE) == SlabType.BOTTOM))
				&& level.isEmptyBlock(relativePos))) {
			level.setBlockAndUpdate(relativePos, block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.LOWER));
			level.setBlockAndUpdate(relativePos.above(), block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.UPPER));

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
