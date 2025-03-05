package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class StainedGlassCornerBlock extends GlassCornerBlock implements BeaconBeamBlock, IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialSlab;
	private final DyeColor color;

	public StainedGlassCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialSlab, DyeColor color) {
		super(material, materialSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialSlab = materialSlab;
		this.color = color;
	}

	public StainedGlassCornerBlock(Block material, Supplier<Block> materialSlab, DyeColor color) {
		this(IBlockCharacteristics.tag(), material, materialSlab, color);
		this.material = material;
		this.materialSlab = materialSlab;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab.get();
	}

	public @NotNull DyeColor getColor() {
		return this.color;
	}
}
