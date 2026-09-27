package com.blackout.extendedslabs.registry;

import java.util.List;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

public class ESBlockFamilies {
	public static final ESBlockDefinitions.BlockFamily DIRT = ESBlockDefinitions.family("dirt", Blocks.DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily COARSE_DIRT = ESBlockDefinitions.family("coarse_dirt", Blocks.COARSE_DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily ROOTED_DIRT = ESBlockDefinitions.family("rooted_dirt", Blocks.ROOTED_DIRT, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily TUFF = ESBlockDefinitions.family("tuff", Blocks.TUFF, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab(Blocks.TUFF_SLAB)
			.stairs(Blocks.TUFF_STAIRS)
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily CALCITE = ESBlockDefinitions.family("calcite", Blocks.CALCITE, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily MUD = ESBlockDefinitions.family("mud", Blocks.MUD, BlockTags.MINEABLE_WITH_SHOVEL)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.build();
	public static final ESBlockDefinitions.BlockFamily PACKED_MUD = ESBlockDefinitions.family("packed_mud", Blocks.PACKED_MUD, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab()
//			.stairs()
			.verticalSlab()
//			.corner()
			.wall()
//			.button()
			.build();
	public static final ESBlockDefinitions.BlockFamily MUD_BRICKS = ESBlockDefinitions.family("mud_brick", "mud_bricks", Blocks.MUD_BRICKS, BlockTags.MINEABLE_WITH_PICKAXE)
			.slab(Blocks.MUD_BRICK_SLAB)
			.stairs(Blocks.MUD_BRICK_STAIRS)
			.wall(Blocks.MUD_BRICK_WALL)
			.verticalSlab()
//			.corner()
//			.button()
			.build();

	private static final List<ESBlockDefinitions.BlockFamily> FAMILIES = List.of(
			DIRT,
			COARSE_DIRT,
			ROOTED_DIRT,
			TUFF,
			CALCITE,
			MUD,
			PACKED_MUD,
			MUD_BRICKS
	);

	public static List<ESBlockDefinitions.BlockFamily> families() {
		return FAMILIES;
	}

	public static void init() {
	}
}