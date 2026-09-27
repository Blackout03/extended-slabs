package com.blackout.extendedslabs.loader.fabric;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class FabricCreativeTabs {
    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "extended_slabs"), FabricCreativeModeTab.builder()
                .title(Component.translatable("itemGroup.extendedslabs"))
                .icon(FabricCreativeTabs::icon)
                .displayItems((displayContext, entries) -> {
                    for (RegistrySupplier<Item> item : ESBlockDefinitions.orderedItems()) {
                        entries.accept(item.get());
                    }
                })
                .build());
    }

    private static ItemStack icon() {
        for (RegistrySupplier<Item> item : ESBlockDefinitions.orderedItems()) {
            return new ItemStack(item.get());
        }

        return ItemStack.EMPTY;
    }
}