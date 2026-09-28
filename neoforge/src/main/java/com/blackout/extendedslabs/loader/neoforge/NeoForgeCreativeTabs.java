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

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NeoForgeCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, ExtendedSlabs.MODID);

    public static final Supplier<CreativeModeTab> EXTENDED_SLABS = CREATIVE_MODE_TABS.register("extended_slabs", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.extendedslabs"))
            .icon(NeoForgeCreativeTabs::icon)
            .withSearchBar()
            .withTabFactory(RandomIconCreativeModeTab::new)
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

    private static class RandomIconCreativeModeTab extends CreativeModeTab {
        private static final long ICON_CHANGE_INTERVAL_MS = 3000L;
        private final List<RegistrySupplier<Item>> iconItems = List.copyOf(ESBlockDefinitions.orderedItems());
        private ItemStack currentIcon = ItemStack.EMPTY;
        private long nextIconChangeTime;

        private RandomIconCreativeModeTab(Builder builder) {
            super(builder);
        }

        @Override
        public ItemStack getIconItem() {
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
}