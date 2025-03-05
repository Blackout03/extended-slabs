package com.blackout.extendedslabs.events.placehandlers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BlockSlabifiedPlaceHandler {
	public static final Map<ResourceLocation, Supplier<Block>> PLACE_ENTRIES = new HashMap<>();
	public static final Map<Class<? extends Block>, TriConsumer<PlayerInteractEvent.RightClickBlock, ItemStack, Block>> HANDLERS = new HashMap<>();

	@SubscribeEvent
	public static void onBlockEntityPlace(PlayerInteractEvent.RightClickBlock event) {
		ItemStack held = event.getItemStack();
		ResourceLocation rl = BuiltInRegistries.ITEM.getKey(held.getItem());

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