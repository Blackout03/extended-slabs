package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ESPTags {
	public ESPTags() {
	}

	public static class Blocks {
		public static final TagKey<Block> CORNERS = tag("corners");
		public static final TagKey<Block> VERTICAL_SLABS = tag("vertical_slabs");

		public static final TagKey<Block> BUBBLE_COLUMN_DRAG_DOWN = tag("bubble_column/drag_down");
		public static final TagKey<Block> BUBBLE_COLUMN_DRAG_UP = tag("bubble_column/drag_up");

		public Blocks() {
		}

		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(ExtendedSlabs.MODID, name));
		}
	}
}
