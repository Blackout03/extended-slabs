package com.blackout.extendedslabs.blocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.List;

public class ESPButtonBlock extends ButtonBlock {
	private final List<TagKey<Block>> tags;
	private final Block originalBlock;

	public ESPButtonBlock(List<TagKey<Block>> tags, Block originalBlock, BlockSetType type, int ticksToStayPressed, Properties properties) {
		super(type, ticksToStayPressed, properties);
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