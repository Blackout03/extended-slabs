package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CreativeTab extends CreativeModeTab {
    public CreativeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get());
    }
}
