package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.Random;

public class ESPCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtendedSlabs.MODID);

	public static final RegistryObject<CreativeModeTab> EXTENDED_SLABS = CREATIVE_MODE_TAB.register("extended_slabs",
			() -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup.extendedslabs"))
					.icon(ESPCreativeTabs::makeIcon)
					.displayItems((featureFlag, output) -> {
						add(output, ESPStairs.orderedItems());
						add(output, ESPSlabs.orderedItems());
						add(output, ESPVerticalSlabs.orderedItems());
						add(output, ESPCorners.orderedItems());
					})
					.build());

	private static void add(final CreativeModeTab.Output output, final Collection<RegistryObject<Item>> items) {
		items.stream().map(RegistryObject::get).forEach(output::accept);
	}

	public static ItemStack makeIcon() {
		int nextIntBlockTypes = new Random().nextInt(4);
		return new ItemStack((switch (nextIntBlockTypes) {
			case 1 -> ESPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPCorners.ITEMS.getEntries().size()));
			case 2 -> ESPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPSlabs.ITEMS.getEntries().size()));
			case 3 -> ESPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPStairs.ITEMS.getEntries().size()));
			default -> ESPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPVerticalSlabs.ITEMS.getEntries().size()));
		}).findAny().get().get());
	}
}
