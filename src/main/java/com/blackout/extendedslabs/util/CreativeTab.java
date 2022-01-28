package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModList;

public class CreativeTab extends ItemGroup {
    public CreativeTab() {
        super(ExtendedSlabs.MODID);
    }

    @Override
    public ItemStack makeIcon() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            return new ItemStack(BOPVerticalSlabs.MAGIC_VERTICAL.get());
        } else {
            return new ItemStack(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get());
        }
    }
}
