package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.item.DyeColor;

public class StainedGlassVerticalSlabBlock extends GlassVerticalSlabBlock implements IBeaconBeamColorProvider {
    private final DyeColor color;

    public StainedGlassVerticalSlabBlock(DyeColor color, Properties builder) {
        super(builder);
        this.color = color;
    }

    public DyeColor getColor() {
        return this.color;
    }
}
