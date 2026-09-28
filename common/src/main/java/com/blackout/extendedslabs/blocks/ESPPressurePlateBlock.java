package com.blackout.extendedslabs.blocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.List;

public class ESPPressurePlateBlock extends PressurePlateBlock {
	private final List<TagKey<Block>> tags;
	private final Block originalBlock;

	public ESPPressurePlateBlock(List<TagKey<Block>> tags, Block originalBlock, BlockSetType type, Properties properties) {
		super(type, properties);
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