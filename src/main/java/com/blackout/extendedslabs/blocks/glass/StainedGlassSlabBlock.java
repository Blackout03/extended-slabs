package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class StainedGlassSlabBlock extends GlassSlabBlock implements BeaconBeamBlock, IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialVerticalSlab;
    private final DyeColor color;


    public StainedGlassSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, DyeColor color) {
        super(IBlockCharacteristics.tag(), material, materialVerticalSlab);
        this.characteristics = characteristics;
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
        this.color = color;
    }

    public StainedGlassSlabBlock(Block material, Supplier<Block> materialVerticalSlab, DyeColor color) {
        this(IBlockCharacteristics.tag(), material, materialVerticalSlab, color);
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Block getMaterialVerticalSlab() {
        return materialVerticalSlab.get();
    }

    public @NotNull DyeColor getColor() {
        return this.color;
    }
}
