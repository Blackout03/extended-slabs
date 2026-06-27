package com.blackout.extendedslabs.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

public class ESBlockFamilies {
	public static final ESBlockDefinitions.BlockFamily DIRT = ESBlockDefinitions.family("dirt", Blocks.DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily COARSE_DIRT = ESBlockDefinitions.family("coarse_dirt", Blocks.COARSE_DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily ROOTED_DIRT = ESBlockDefinitions.family("rooted_dirt", Blocks.ROOTED_DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily TUFF = ESBlockDefinitions.family("tuff", Blocks.TUFF, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily CALCITE = ESBlockDefinitions.family("calcite", Blocks.CALCITE, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily MUD = ESBlockDefinitions.family("mud", Blocks.MUD, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily PACKED_MUD = ESBlockDefinitions.family("packed_mud", Blocks.PACKED_MUD, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab()
			.stairs()
			.verticalSlab()
			.corner()
			.wall()
			.button()
			.build();
	public static final ESBlockDefinitions.BlockFamily MUD_BRICKS = ESBlockDefinitions.family("mud_brick", "mud_bricks", Blocks.MUD_BRICKS, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab(Blocks.MUD_BRICK_SLAB)
			.stairs(Blocks.MUD_BRICK_STAIRS)
			.wall(Blocks.MUD_BRICK_WALL)
			.verticalSlab()
			.corner()
			.button()
			.build();

	public static void init() {
	}
}
