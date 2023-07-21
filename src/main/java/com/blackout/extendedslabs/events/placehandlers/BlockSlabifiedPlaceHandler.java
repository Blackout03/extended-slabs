package com.blackout.extendedslabs.events.placehandlers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BlockSlabifiedPlaceHandler {
	public static final Map<ResourceLocation, Supplier<Block>> PLACE_ENTRIES = new HashMap<>();
	public static final Map<Class<? extends Block>, TriConsumer<PlayerInteractEvent.RightClickBlock, ItemStack, Block>> HANDLERS = new HashMap<>();

	public static void onBlockEntityPlace(PlayerInteractEvent.RightClickBlock event) {
		ItemStack held = event.getItemStack();
		ResourceLocation rl = ForgeRegistries.ITEMS.getKey(held.getItem());

		if (PLACE_ENTRIES.containsKey(rl)) {
			Block slabifiedBlock = PLACE_ENTRIES.get(rl).get();
			Class<? extends Block> slabifiedBlockClass = slabifiedBlock.getClass();

			if (HANDLERS.containsKey(slabifiedBlockClass)) {
				HANDLERS.get(slabifiedBlockClass).accept(event, held, PLACE_ENTRIES.get(rl).get());
			}
		}
	}

	public static void registerPlaceEntry(ResourceLocation itemName, Supplier<Block> slabifiedBlockSupplier, TriConsumer<PlayerInteractEvent.RightClickBlock, ItemStack, Block> handler) {
		if (!PLACE_ENTRIES.containsKey(itemName) && slabifiedBlockSupplier != null && handler != null) {
			PLACE_ENTRIES.put(itemName, slabifiedBlockSupplier);
			HANDLERS.put(slabifiedBlockSupplier.get().getClass(), handler);
		}
	}
}