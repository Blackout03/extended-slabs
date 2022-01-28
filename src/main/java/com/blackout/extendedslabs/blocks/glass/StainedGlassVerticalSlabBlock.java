package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;

public class StainedGlassVerticalSlabBlock extends GlassVerticalSlabBlock implements BeaconBeamBlock {
    private final DyeColor color;

    public StainedGlassVerticalSlabBlock(DyeColor color, Properties builder) {
        super(builder);
        this.color = color;
    }

    public DyeColor getColor() {
        return this.color;
    }
}
