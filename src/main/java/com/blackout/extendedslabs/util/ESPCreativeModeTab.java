package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ESPCreativeModeTab extends CreativeModeTab {
    public ESPCreativeModeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        int nextIntBlockTypes = new Random().nextInt(4);
        if (nextIntBlockTypes == 1) {
            return new ItemStack(ESPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPCorners.ITEMS.getEntries().size())).findAny().get().get());
        } else if (nextIntBlockTypes == 2) {
            return new ItemStack(ESPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPSlabs.ITEMS.getEntries().size())).findAny().get().get());
        } else if (nextIntBlockTypes == 3) {
            return new ItemStack(ESPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPStairs.ITEMS.getEntries().size())).findAny().get().get());
        } else {
            return new ItemStack(ESPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
        }
    }
}
