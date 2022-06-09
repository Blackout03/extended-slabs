package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import com.blackout.extendedslabs.init.modded.BOPStairs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModList;

import java.util.Random;

public class ESPItemGroup extends ItemGroup {
    public ESPItemGroup() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public ItemStack makeIcon() {
        int nextIntMods = new Random().nextInt(3);
        int nextIntBlockTypes = new Random().nextInt(4);
        if (nextIntMods == 2) {
            makeIcon();
        } else if (nextIntMods == 1) {
            if (ModList.get().isLoaded("biomesoplenty")) {
                if (nextIntBlockTypes == 1) {
                    return new ItemStack(BOPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(BOPCorners.ITEMS.getEntries().size())).findAny().get().get());
                } else if (nextIntBlockTypes == 2) {
                    return new ItemStack(BOPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(BOPSlabs.ITEMS.getEntries().size())).findAny().get().get());
                } else if (nextIntBlockTypes == 3) {
                    return new ItemStack(BOPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(BOPStairs.ITEMS.getEntries().size())).findAny().get().get());
                } else {
                    return new ItemStack(BOPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(BOPVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
                }
            } else {
                makeIcon();
            }
        } else {
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
        return new ItemStack(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get());
    }
}
