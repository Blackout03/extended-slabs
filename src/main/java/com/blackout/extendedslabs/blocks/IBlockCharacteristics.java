package com.blackout.extendedslabs.blocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.Arrays;
import java.util.List;

public interface IBlockCharacteristics {
	List<TagKey<Block>> getCharacteristics();

	@SafeVarargs
	static List<TagKey<Block>> tag(TagKey<Block>... tags) {
		return Arrays.asList(tags);
	}
}
