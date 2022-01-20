package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CreativeTab extends CreativeModeTab {
    public CreativeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ESPVerticalSlabs.PRISMARINE_BRICKS_VERTICAL.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    public int getSearchbarWidth() {
        return 75;
    }

    public @NotNull ResourceLocation getBackgroundImage() {
        return new ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tab_extendedslabs.png");
    }

    public @NotNull ResourceLocation getTabsImage() {
        return new ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tabs.png");
    }
}
