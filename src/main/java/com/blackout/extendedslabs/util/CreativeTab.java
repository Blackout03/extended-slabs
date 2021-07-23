package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ModVerticalSlabs;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;

public class CreativeTab extends CreativeModeTab {
    public CreativeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public ItemStack makeIcon() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            return new ItemStack(ModVerticalSlabs.MAGIC_VERTICAL.get());
        } else {
            return new ItemStack(ModVerticalSlabs.PRISMARINE_BRICKS_VERTICAL.get());
        }
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    public int getSearchbarWidth() {
        return 75;
    }

    public ResourceLocation getBackgroundImage() {
        return new ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tab_extendedslabs.png");
    }

    public ResourceLocation getTabsImage() {
        return new ResourceLocation("extendedslabs:textures/gui/container/creative_inventory/tabs.png");
    }
}
