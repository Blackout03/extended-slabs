package com.blackout.extendedslabs.events.placehandlers;

import com.blackout.extendedslabs.blocks.NaturalSlabBlock;
import com.blackout.extendedslabs.blocks.slabified.DoublePlantBlockSlabified;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.function.Supplier;

public class DoublePlantBlockSlabifiedPlaceHandler {
	private static final HashMap<ResourceLocation, Supplier<Block>> PLACE_ENTRIES = new HashMap<>();

	public static void onBlockEntityPlace(PlayerInteractEvent.RightClickBlock event) {
		ItemStack held = event.getItemStack();
		ResourceLocation rl = ForgeRegistries.ITEMS.getKey(held.getItem());

		if (PLACE_ENTRIES.containsKey(rl)) {
			placeDoublePlantBlock(event, held, PLACE_ENTRIES.get(rl).get());
		}
	}

	public static void placeDoublePlantBlock(PlayerInteractEvent.RightClickBlock event, ItemStack held, Block block) {
		BlockPos pos = event.getPos();
		Direction face = event.getFace();
		BlockPos placeAt = pos.relative(face);
		Level world = event.getLevel();
		SoundType soundType;
		Player player = event.getEntity();

		if (face == Direction.UP && ((world.getBlockState(pos).getBlock() instanceof NaturalSlabBlock && world.getBlockState(pos).getValue(SlabBlock.TYPE) == SlabType.BOTTOM))
				&& (world.isEmptyBlock(placeAt) || world.getFluidState(placeAt).getType() == Fluids.WATER || world.getFluidState(placeAt).getType() == Fluids.FLOWING_WATER)) {
			if (block instanceof SimpleWaterloggedBlock) {
				world.setBlockAndUpdate(placeAt, block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.LOWER).setValue(BlockStateProperties.WATERLOGGED, (world.getFluidState(placeAt).getType() == Fluids.WATER) ));
				world.setBlockAndUpdate(placeAt.above(), block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.UPPER).setValue(BlockStateProperties.WATERLOGGED, (world.getFluidState(placeAt).getType() == Fluids.WATER) ));
			} else {
				world.setBlockAndUpdate(placeAt, block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.LOWER));
				world.setBlockAndUpdate(placeAt.above(), block.defaultBlockState().setValue(DoublePlantBlockSlabified.HALF, DoubleBlockHalf.UPPER));
			}

//			world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), block.getSoundType(world.getBlockState(pos)).getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
			soundType = block.getSoundType(block.defaultBlockState(), world, pos, player);
			world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), soundType.getPlaceSound(), SoundSource.BLOCKS, soundType.getVolume(), soundType.getPitch() - 0.2F);
			player.swing(event.getHand());

			if (!player.isCreative()) {
				held.shrink(1);
			}
			event.setCanceled(true);
		}
	}

	public static void registerPlaceEntry(ResourceLocation itemName, Supplier<Block> doublePlantSlabSupplier) {
		if (!PLACE_ENTRIES.containsKey(itemName) && doublePlantSlabSupplier != null) {
			PLACE_ENTRIES.put(itemName, doublePlantSlabSupplier);
		}
	}
}
