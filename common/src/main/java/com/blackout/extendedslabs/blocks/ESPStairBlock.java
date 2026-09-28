package com.blackout.extendedslabs.blocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;

import java.util.List;

public class ESPStairBlock extends StairBlock {
	private final List<TagKey<Block>> tags;
	private final Block originalBlock;

	public ESPStairBlock(List<TagKey<Block>> tags, Block originalBlock, Properties properties) {
		super(originalBlock.defaultBlockState(), properties);
		this.tags = tags;
		this.originalBlock = originalBlock;
	}

	public List<TagKey<Block>> tags() {
		return tags;
	}

	public Block originalBlock() {
		return originalBlock;
	}
}