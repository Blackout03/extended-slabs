package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class StainedGlassVerticalSlabBlock extends GlassVerticalSlabBlock implements BeaconBeamBlock {
	public Block material;
	public Block materialSlab;
	private final DyeColor color;

	public StainedGlassVerticalSlabBlock(Block material, Block materialSlab, DyeColor color, Properties builder) {
		super(material, materialSlab, builder);
		this.material = material;
		this.materialSlab = materialSlab;
		this.color = color;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab;
	}

	public @NotNull DyeColor getColor() {
		return this.color;
	}
}
