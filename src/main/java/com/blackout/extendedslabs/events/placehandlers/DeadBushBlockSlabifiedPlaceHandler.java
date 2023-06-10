package com.blackout.extendedslabs.events.placehandlers;

import com.blackout.extendedslabs.init.ESPSlabs;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.function.Supplier;

public class DeadBushBlockSlabifiedPlaceHandler {
	private static final HashMap<ResourceLocation, Supplier<Block>> PLACE_ENTRIES = new HashMap<>();

	public static void onBlockEntityPlace(PlayerInteractEvent.RightClickBlock event) {
		ItemStack held = event.getItemStack();
		ResourceLocation rl = ForgeRegistries.ITEMS.getKey(held.getItem());

		if (PLACE_ENTRIES.containsKey(rl)) {
			placeDeadBushBlock(event, held, PLACE_ENTRIES.get(rl).get());
		}
	}

	public static void placeDeadBushBlock(PlayerInteractEvent.RightClickBlock event, ItemStack held, Block block) {
		BlockPos pos = event.getPos();
		Direction face = event.getFace();
		BlockPos placeAt = pos.relative(face);
		Level world = event.getLevel();
		SoundType soundType;
		Player player = event.getEntity();
		BlockState blockState = world.getBlockState(pos);

		if (face == Direction.UP
				&& ((blockState.is(ESPSlabs.SAND_SLAB.get()) || blockState.is(ESPSlabs.RED_SAND_SLAB.get())
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
				|| blockState.is(ESPSlabs.RED_TERRACOTTA_SLAB.get()) || blockState.is(ESPSlabs.BLACK_TERRACOTTA_SLAB.get()))
				&& world.getBlockState(pos).getValue(SlabBlock.TYPE) == SlabType.BOTTOM)
				&& (world.isEmptyBlock(placeAt) || world.getFluidState(placeAt).getType() == Fluids.WATER || world.getFluidState(placeAt).getType() == Fluids.FLOWING_WATER)) {
			if (block instanceof SimpleWaterloggedBlock) {
				world.setBlockAndUpdate(placeAt, block.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, (world.getFluidState(placeAt).getType() == Fluids.WATER) ));
			} else {
				world.setBlockAndUpdate(placeAt, block.defaultBlockState());
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

	public static void registerPlaceEntry(ResourceLocation itemName, Supplier<Block> deadBushSlabSupplier) {
		if (!PLACE_ENTRIES.containsKey(itemName) && deadBushSlabSupplier != null) {
			PLACE_ENTRIES.put(itemName, deadBushSlabSupplier);
		}
	}
}
