package com.blackout.extendedslabs.loader.neoforge;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NeoForgeCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, ExtendedSlabs.MODID);

    public static final Supplier<CreativeModeTab> EXTENDED_SLABS = CREATIVE_MODE_TABS.register("extended_slabs", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.extendedslabs"))
            .icon(NeoForgeCreativeTabs::icon)
            .displayItems((parameters, output) -> {
                for (RegistrySupplier<Item> item : ESBlockDefinitions.orderedItems()) {
                    output.accept(item.get());
                }
            })
            .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    private static ItemStack icon() {
        for (RegistrySupplier<Item> item : ESBlockDefinitions.orderedItems()) {
            return new ItemStack(item.get());
        }

        return ItemStack.EMPTY;
    }
}