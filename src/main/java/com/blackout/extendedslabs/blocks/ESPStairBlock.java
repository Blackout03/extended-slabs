package com.blackout.extendedslabs.blocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.function.Supplier;

public class ESPStairBlock extends StairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public ESPStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties properties) {
		super(state, properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public ESPStairBlock(Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties properties) {
		this(IBlockCharacteristics.tag(), material, materialCorner, state, properties);
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
}
