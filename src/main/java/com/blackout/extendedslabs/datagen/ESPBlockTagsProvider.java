package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDCorners;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDStairs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDVerticalSlabs;
import com.blackout.extendedslabs.init.modded.galosphere.GaloCorners;
import com.blackout.extendedslabs.init.modded.galosphere.GaloVerticalSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPCorners;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPStairs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPVerticalSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ESPBlockTagsProvider extends BlockTagsProvider {
	public ESPBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		for (RegistryObject<Block> block : ESPSlabs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + block.getId());
			tag(BlockTags.SLABS).add(block.get());
		}
		for (RegistryObject<Block> block : WBPSlabs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + block.getId());
			tag(BlockTags.SLABS).addOptional(block.getId());
		}
		for (RegistryObject<Block> block : DDSlabs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + block.getId());
			tag(BlockTags.SLABS).addOptional(block.getId());
		}

		for (RegistryObject<Block> block : ESPStairs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + block.getId());
			tag(BlockTags.STAIRS).add(block.get());
		}
		for (RegistryObject<Block> block : WBPStairs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + block.getId());
			tag(BlockTags.STAIRS).addOptional(block.getId());
		}
		for (RegistryObject<Block> block : DDStairs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + block.getId());
			tag(BlockTags.STAIRS).addOptional(block.getId());
		}

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ESPSlabs.TUFF_SLAB.get(), ESPSlabs.CALCITE_SLAB.get(),
						ESPSlabs.DRIPSTONE_SLAB.get(), ESPSlabs.END_STONE_SLAB.get(),
						ESPSlabs.NETHERRACK_SLAB.get(), ESPSlabs.WHITE_CONCRETE_SLAB.get(),
						ESPSlabs.ORANGE_CONCRETE_SLAB.get(), ESPSlabs.MAGENTA_CONCRETE_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), ESPSlabs.YELLOW_CONCRETE_SLAB.get(),
						ESPSlabs.LIME_CONCRETE_SLAB.get(), ESPSlabs.PINK_CONCRETE_SLAB.get(),
						ESPSlabs.GRAY_CONCRETE_SLAB.get(), ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(),
						ESPSlabs.CYAN_CONCRETE_SLAB.get(), ESPSlabs.PURPLE_CONCRETE_SLAB.get(),
						ESPSlabs.BLUE_CONCRETE_SLAB.get(), ESPSlabs.BROWN_CONCRETE_SLAB.get(),
						ESPSlabs.GREEN_CONCRETE_SLAB.get(), ESPSlabs.RED_CONCRETE_SLAB.get(),
						ESPSlabs.BLACK_CONCRETE_SLAB.get(), ESPSlabs.TERRACOTTA_SLAB.get(),
						ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(),
						ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
						ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_TERRACOTTA_SLAB.get(),
						ESPSlabs.PINK_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_TERRACOTTA_SLAB.get(),
						ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_TERRACOTTA_SLAB.get(),
						ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), ESPSlabs.GREEN_TERRACOTTA_SLAB.get(),
						ESPSlabs.RED_TERRACOTTA_SLAB.get(), ESPSlabs.BLACK_TERRACOTTA_SLAB.get(),
						ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(),
						ESPStairs.TUFF_STAIRS.get(), ESPStairs.CALCITE_STAIRS.get(),
						ESPStairs.DRIPSTONE_STAIRS.get(), ESPStairs.END_STONE_STAIRS.get(),
						ESPStairs.NETHERRACK_STAIRS.get(), ESPVerticalSlabs.ANDESITE_VERTICAL.get(),
						ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(), ESPVerticalSlabs.DIORITE_VERTICAL.get(),
						ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(), ESPVerticalSlabs.GRANITE_VERTICAL.get(),
						ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(), ESPVerticalSlabs.TUFF_VERTICAL.get(),
						ESPVerticalSlabs.CALCITE_VERTICAL.get(), ESPVerticalSlabs.DRIPSTONE_VERTICAL.get(),
						ESPVerticalSlabs.BLACKSTONE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get(),
						ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get(), ESPVerticalSlabs.COBBLESTONE_VERTICAL.get(),
						ESPVerticalSlabs.BRICK_VERTICAL.get(), ESPVerticalSlabs.SANDSTONE_VERTICAL.get(),
						ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get(),
						ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(),
						ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.STONE_VERTICAL.get(),
						ESPVerticalSlabs.STONE_BRICK_VERTICAL.get(), ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get(),
						ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get(), ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get(),
						ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get(),
						ESPVerticalSlabs.END_STONE_VERTICAL.get(), ESPVerticalSlabs.PRISMARINE_VERTICAL.get(),
						ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get(), ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get(),
						ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get(), ESPVerticalSlabs.QUARTZ_VERTICAL.get(),
						ESPVerticalSlabs.PURPUR_VERTICAL.get(), ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get(),
						ESPVerticalSlabs.NETHERRACK_VERTICAL.get(), ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get(),
						ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get(), ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(),
						ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(),
						ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get(),
						ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get(),
						ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get(),
						ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get(), ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get(),
						ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get(), ESPCorners.STONE_CORNER.get(),
						ESPCorners.COBBLESTONE_CORNER.get(), ESPCorners.STONE_BRICK_CORNER.get(),
						ESPCorners.ANDESITE_CORNER.get(), ESPCorners.POLISHED_ANDESITE_CORNER.get(),
						ESPCorners.DIORITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
						ESPCorners.GRANITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
						ESPCorners.TUFF_CORNER.get(), ESPCorners.CALCITE_CORNER.get(),
						ESPCorners.DRIPSTONE_CORNER.get(), ESPCorners.BLACKSTONE_CORNER.get(),
						ESPCorners.POLISHED_BLACKSTONE_CORNER.get(), ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get(),
						ESPCorners.NETHERRACK_CORNER.get(), ESPCorners.NETHER_BRICK_CORNER.get(),
						ESPCorners.RED_NETHER_BRICK_CORNER.get(), ESPCorners.END_STONE_CORNER.get(),
						ESPCorners.END_STONE_BRICK_CORNER.get(), ESPCorners.PURPUR_CORNER.get())
				.addOptional(WBPSlabs.PACKED_MUD_SLAB.getId()).addOptional(WBPStairs.PACKED_MUD_STAIRS.getId())
				.addOptional(WBPVerticalSlabs.PACKED_MUD_VERTICAL.getId()).addOptional(WBPVerticalSlabs.MUD_BRICK_VERTICAL.getId())
				.addOptional(WBPCorners.PACKED_MUD_CORNER.getId()).addOptional(WBPCorners.MUD_BRICK_CORNER.getId())
				.addOptional(GaloVerticalSlabs.AMETHYST_VERTICAL.getId()).addOptional(GaloVerticalSlabs.SMOOTH_AMETHYST_VERTICAL.getId())
				.addOptional(GaloVerticalSlabs.AMETHYST_BRICK_VERTICAL.getId()).addOptional(GaloVerticalSlabs.ALLURITE_VERTICAL.getId())
				.addOptional(GaloVerticalSlabs.SMOOTH_ALLURITE_VERTICAL.getId()).addOptional(GaloVerticalSlabs.ALLURITE_BRICK_VERTICAL.getId())
				.addOptional(GaloVerticalSlabs.LUMIERE_VERTICAL.getId()).addOptional(GaloVerticalSlabs.SMOOTH_LUMIERE_VERTICAL.getId())
				.addOptional(GaloVerticalSlabs.LUMIERE_BRICK_VERTICAL.getId()).addOptional(GaloCorners.AMETHYST_CORNER.getId())
				.addOptional(GaloCorners.SMOOTH_AMETHYST_CORNER.getId()).addOptional(GaloCorners.AMETHYST_BRICK_CORNER.getId())
				.addOptional(GaloCorners.ALLURITE_CORNER.getId()).addOptional(GaloCorners.SMOOTH_ALLURITE_CORNER.getId())
				.addOptional(GaloCorners.ALLURITE_BRICK_CORNER.getId()).addOptional(GaloCorners.LUMIERE_CORNER.getId())
				.addOptional(GaloCorners.SMOOTH_LUMIERE_CORNER.getId()).addOptional(GaloCorners.LUMIERE_BRICK_CORNER.getId())
				.addOptional(DDSlabs.PETRIFIED_WOOD_SLAB.getId()).addOptional(DDStairs.PETRIFIED_WOOD_STAIRS.getId())
				.addOptional(DDVerticalSlabs.PETRIFIED_VERTICAL.getId()).addOptional(DDVerticalSlabs.PETRIFIED_WOOD_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.SHALE_VERTICAL.getId()).addOptional(DDVerticalSlabs.POLISHED_SHALE_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.SHALE_BRICK_VERTICAL.getId()).addOptional(DDVerticalSlabs.ARIDROCK_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.POLISHED_ARIDROCK_VERTICAL.getId()).addOptional(DDVerticalSlabs.ARIDROCK_BRICK_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.LIMESTONE_VERTICAL.getId()).addOptional(DDVerticalSlabs.POLISHED_LIMESTONE_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.LIMESTONE_BRICK_VERTICAL.getId()).addOptional(DDVerticalSlabs.GRIMESTONE_VERTICAL.getId())
				.addOptional(DDVerticalSlabs.POLISHED_GRIMESTONE_VERTICAL.getId()).addOptional(DDVerticalSlabs.GRIMESTONE_BRICK_VERTICAL.getId())
				.addOptional(DDCorners.PETRIFIED_CORNER.getId()).addOptional(DDCorners.PETRIFIED_WOOD_CORNER.getId())
				.addOptional(DDCorners.SHALE_CORNER.getId()).addOptional(DDCorners.POLISHED_SHALE_CORNER.getId())
				.addOptional(DDCorners.SHALE_BRICK_CORNER.getId()).addOptional(DDCorners.ARIDROCK_CORNER.getId())
				.addOptional(DDCorners.POLISHED_ARIDROCK_CORNER.getId()).addOptional(DDCorners.ARIDROCK_BRICK_CORNER.getId())
				.addOptional(DDCorners.LIMESTONE_CORNER.getId()).addOptional(DDCorners.POLISHED_LIMESTONE_CORNER.getId())
				.addOptional(DDCorners.LIMESTONE_BRICK_CORNER.getId()).addOptional(DDCorners.GRIMESTONE_CORNER.getId())
				.addOptional(DDCorners.POLISHED_GRIMESTONE_CORNER.getId()).addOptional(DDCorners.GRIMESTONE_BRICK_CORNER.getId());
		tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ESPSlabs.DIRT_SLAB.get(), ESPSlabs.COARSE_DIRT_SLAB.get(),
						ESPSlabs.ROOTED_DIRT_SLAB.get(), ESPSlabs.GRASS_BLOCK_SLAB.get(),
						ESPSlabs.PODZOL_SLAB.get(), ESPSlabs.MYCELIUM_SLAB.get(), ESPSlabs.DIRT_PATH_SLAB.get(),
						ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get(), ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get(), ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get(), ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get(), ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get(), ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get(), ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.RED_CONCRETE_POWDER_SLAB.get(), ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.GRAVEL_SLAB.get(), ESPSlabs.RED_SAND_SLAB.get(),
						ESPSlabs.SAND_SLAB.get(), ESPSlabs.CLAY_SLAB.get(),
						ESPStairs.DIRT_STAIRS.get(),ESPVerticalSlabs.CLAY_VERTICAL.get(),
						ESPVerticalSlabs.DIRT_VERTICAL.get(), ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get(),
						ESPVerticalSlabs.ROOTED_DIRT_VERTICAL.get(), ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(),
						ESPVerticalSlabs.DIRT_PATH_VERTICAL.get(), ESPVerticalSlabs.PODZOL_VERTICAL.get(),
						ESPVerticalSlabs.DIRT_PATH_VERTICAL.get(), ESPVerticalSlabs.PODZOL_VERTICAL.get(), ESPVerticalSlabs.MYCELIUM_VERTICAL.get(),
						ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.GRAVEL_VERTICAL.get(), ESPVerticalSlabs.SAND_VERTICAL.get(),
						ESPVerticalSlabs.RED_SAND_VERTICAL.get())
				.addOptional(WBPSlabs.MUD_SLAB.getId()).addOptional(WBPStairs.MUD_STAIRS.getId())
				.addOptional(WBPCorners.MUD_CORNER.getId()).addOptional(WBPVerticalSlabs.MUD_VERTICAL.getId());
		tag(BlockTags.MINEABLE_WITH_AXE).add(ESPSlabs.OAK_WOOD_SLAB.get(), ESPSlabs.BIRCH_WOOD_SLAB.get(),
						ESPSlabs.SPRUCE_WOOD_SLAB.get(), ESPSlabs.JUNGLE_WOOD_SLAB.get(),
						ESPSlabs.DARK_OAK_WOOD_SLAB.get(), ESPSlabs.ACACIA_WOOD_SLAB.get(),
						ESPSlabs.CRIMSON_HYPHAE_SLAB.get(), ESPSlabs.WARPED_HYPHAE_SLAB.get(),
						ESPStairs.OAK_WOOD_STAIRS.get(), ESPStairs.BIRCH_WOOD_STAIRS.get(),
						ESPStairs.SPRUCE_WOOD_STAIRS.get(), ESPStairs.JUNGLE_WOOD_STAIRS.get(),
						ESPStairs.DARK_OAK_WOOD_STAIRS.get(), ESPStairs.ACACIA_WOOD_STAIRS.get(),
						ESPStairs.CRIMSON_HYPHAE_STAIRS.get(), ESPStairs.WARPED_HYPHAE_STAIRS.get(),
						ESPVerticalSlabs.OAK_VERTICAL.get(), ESPVerticalSlabs.BIRCH_VERTICAL.get(),
						ESPVerticalSlabs.SPRUCE_VERTICAL.get(), ESPVerticalSlabs.JUNGLE_VERTICAL.get(),
						ESPVerticalSlabs.DARK_OAK_VERTICAL.get(), ESPVerticalSlabs.ACACIA_VERTICAL.get(),
						ESPVerticalSlabs.CRIMSON_VERTICAL.get(), ESPVerticalSlabs.WARPED_VERTICAL.get(),
						ESPVerticalSlabs.OAK_WOOD_VERTICAL.get(), ESPVerticalSlabs.BIRCH_WOOD_VERTICAL.get(),
						ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL.get(), ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL.get(),
						ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL.get(), ESPVerticalSlabs.ACACIA_WOOD_VERTICAL.get(),
						ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL.get(), ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL.get(),
						ESPCorners.OAK_CORNER.get(), ESPCorners.BIRCH_CORNER.get(),
						ESPCorners.SPRUCE_CORNER.get(), ESPCorners.JUNGLE_CORNER.get(),
						ESPCorners.DARK_OAK_CORNER.get(), ESPCorners.ACACIA_CORNER.get(),
						ESPCorners.OAK_WOOD_CORNER.get(), ESPCorners.BIRCH_WOOD_CORNER.get(),
						ESPCorners.SPRUCE_WOOD_CORNER.get(), ESPCorners.JUNGLE_WOOD_CORNER.get(),
						ESPCorners.DARK_OAK_WOOD_CORNER.get(), ESPCorners.ACACIA_WOOD_CORNER.get(),
						ESPCorners.CRIMSON_HYPHAE_CORNER.get(), ESPCorners.WARPED_HYPHAE_CORNER.get())
				.addOptional(WBPSlabs.MANGROVE_WOOD_SLAB.getId()).addOptional(WBPStairs.MANGROVE_WOOD_STAIRS.getId())
				.addOptional(WBPVerticalSlabs.MANGROVE_VERTICAL.getId()).addOptional(WBPVerticalSlabs.MANGROVE_WOOD_VERTICAL.getId())
				.addOptional(WBPCorners.MANGROVE_CORNER.getId()).addOptional(WBPCorners.MANGROVE_WOOD_CORNER.getId());
		tag(BlockTags.WOOL).add(ESPSlabs.WHITE_WOOL_SLAB.get(), ESPSlabs.ORANGE_WOOL_SLAB.get(),
				ESPSlabs.MAGENTA_WOOL_SLAB.get(), ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(),
				ESPSlabs.YELLOW_WOOL_SLAB.get(), ESPSlabs.LIME_WOOL_SLAB.get(),
				ESPSlabs.PINK_WOOL_SLAB.get(), ESPSlabs.GRAY_WOOL_SLAB.get(),
				ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), ESPSlabs.CYAN_WOOL_SLAB.get(),
				ESPSlabs.PURPLE_WOOL_SLAB.get(), ESPSlabs.BLUE_WOOL_SLAB.get(),
				ESPSlabs.BROWN_WOOL_SLAB.get(), ESPSlabs.GREEN_WOOL_SLAB.get(),
				ESPSlabs.RED_WOOL_SLAB.get(), ESPSlabs.BLACK_WOOL_SLAB.get(),
				ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(), ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(), ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(), ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(),
				ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get());
	}
}