package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StainedGlassSlabBlock extends GlassSlabBlock implements BeaconBeamBlock {
    private final DyeColor color;

    public StainedGlassSlabBlock(DyeColor color, Properties builder) {
        super(builder);
        this.color = color;
    }

    public @NotNull DyeColor getColor() {
        return this.color;
    }
}
