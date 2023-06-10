package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class StainedGlassStairBlock extends GlassStairBlock implements BeaconBeamBlock, IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;
	private final DyeColor color;

	public StainedGlassStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, DyeColor color, Supplier<BlockState> state, Properties builder) {
		super(material, materialCorner, state, builder);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
		this.color = color;
	}

	public StainedGlassStairBlock(Block material, Supplier<Block> materialCorner, DyeColor color, Supplier<BlockState> state, Properties builder) {
		this(IBlockCharacteristics.tag(), material, materialCorner, color, state, builder);
		this.material = material;
		this.materialCorner = materialCorner;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Supplier<Block> getMaterialCorner() {
		return materialCorner;
	}

	public @NotNull DyeColor getColor() {
		return this.color;
	}
}
