package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ESBlockTags {
	public static final TagKey<Block> VERTICAL_SLABS = create("vertical_slabs");
	public static final TagKey<Block> CORNERS = create("corners");

	private ESBlockTags() {
	}

	private static TagKey<Block> create(String name) {
		return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, name));
	}
}