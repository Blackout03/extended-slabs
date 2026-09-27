package com.blackout.extendedslabs.loader.fabric;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FabricCreativeTabs {
    private static final long ICON_CHANGE_INTERVAL_MS = 3000L;
    public static final CreativeModeTab EXTENDED_SLABS = FabricCreativeModeTab.builder()
            .title(Component.translatable("itemGroup.extendedslabs"))
            .icon(FabricCreativeTabs::icon)
            .displayItems((displayContext, entries) -> {
                for (RegistrySupplier<Item> item : ESBlockDefinitions.orderedItems()) {
                    entries.accept(item.get());
                }
            })
            .build();
    private static ItemStack currentIcon = ItemStack.EMPTY;
    private static long nextIconChangeTime;

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "extended_slabs"), EXTENDED_SLABS);
    }

    public static ItemStack icon() {
        ArrayList<RegistrySupplier<Item>> iconItems = new ArrayList<>(ESBlockDefinitions.orderedItems());
        long currentTime = System.currentTimeMillis();

        if (!iconItems.isEmpty() && (currentIcon.isEmpty() || currentTime >= nextIconChangeTime)) {
            int nextIndex = ThreadLocalRandom.current().nextInt(iconItems.size());
            Item nextItem = iconItems.get(nextIndex).get();

            if (iconItems.size() > 1 && currentIcon.is(nextItem)) {
                nextIndex = (nextIndex + 1 + ThreadLocalRandom.current().nextInt(iconItems.size() - 1)) % iconItems.size();
                nextItem = iconItems.get(nextIndex).get();
            }

            currentIcon = new ItemStack(nextItem);
            nextIconChangeTime = currentTime + ICON_CHANGE_INTERVAL_MS;
        }

        return currentIcon;
    }
}