package com.blackout.extendedslabs.events;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPCorners;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeModeTabEvents {
	@SubscribeEvent
	public static void buildContentsEvent(BuildCreativeModeTabContentsEvent event) {
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.OAK_WOOD,
				List.of(ESPCorners.OAK_WOOD_CORNER.get(), ESPVerticalSlabs.OAK_WOOD_VERTICAL.get(),
						ESPSlabs.OAK_WOOD_SLAB.get(), ESPStairs.OAK_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.OAK_SLAB,
				List.of(ESPCorners.OAK_CORNER.get(), ESPVerticalSlabs.OAK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SPRUCE_WOOD,
				List.of(ESPCorners.SPRUCE_WOOD_CORNER.get(), ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL.get(),
						ESPSlabs.SPRUCE_WOOD_SLAB.get(), ESPStairs.SPRUCE_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SPRUCE_SLAB,
				List.of(ESPCorners.SPRUCE_CORNER.get(), ESPVerticalSlabs.SPRUCE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BIRCH_WOOD,
				List.of(ESPCorners.BIRCH_WOOD_CORNER.get(), ESPVerticalSlabs.BIRCH_WOOD_VERTICAL.get(),
						ESPSlabs.BIRCH_WOOD_SLAB.get(), ESPStairs.BIRCH_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BIRCH_SLAB,
				List.of(ESPCorners.BIRCH_CORNER.get(), ESPVerticalSlabs.BIRCH_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.JUNGLE_WOOD,
				List.of(ESPCorners.JUNGLE_WOOD_CORNER.get(), ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL.get(),
						ESPSlabs.JUNGLE_WOOD_SLAB.get(), ESPStairs.JUNGLE_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.JUNGLE_SLAB,
				List.of(ESPCorners.JUNGLE_CORNER.get(), ESPVerticalSlabs.JUNGLE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.ACACIA_WOOD,
				List.of(ESPCorners.ACACIA_WOOD_CORNER.get(), ESPVerticalSlabs.ACACIA_WOOD_VERTICAL.get(),
						ESPSlabs.ACACIA_WOOD_SLAB.get(), ESPStairs.ACACIA_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.ACACIA_SLAB,
				List.of(ESPCorners.ACACIA_CORNER.get(), ESPVerticalSlabs.ACACIA_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DARK_OAK_WOOD,
				List.of(ESPCorners.DARK_OAK_WOOD_CORNER.get(), ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL.get(),
						ESPSlabs.DARK_OAK_WOOD_SLAB.get(), ESPStairs.DARK_OAK_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DARK_OAK_SLAB,
				List.of(ESPCorners.DARK_OAK_CORNER.get(), ESPVerticalSlabs.DARK_OAK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MANGROVE_WOOD,
				List.of(ESPCorners.MANGROVE_WOOD_CORNER.get(), ESPVerticalSlabs.MANGROVE_WOOD_VERTICAL.get(),
						ESPSlabs.MANGROVE_WOOD_SLAB.get(), ESPStairs.MANGROVE_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MANGROVE_SLAB,
				List.of(ESPCorners.MANGROVE_CORNER.get(), ESPVerticalSlabs.MANGROVE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CHERRY_WOOD,
				List.of(ESPCorners.CHERRY_WOOD_CORNER.get(), ESPVerticalSlabs.CHERRY_WOOD_VERTICAL.get(),
						ESPSlabs.CHERRY_WOOD_SLAB.get(), ESPStairs.CHERRY_WOOD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CHERRY_SLAB,
				List.of(ESPCorners.CHERRY_CORNER.get(), ESPVerticalSlabs.CHERRY_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BAMBOO_MOSAIC_SLAB,
				List.of(ESPCorners.BAMBOO_MOSAIC_CORNER.get(), ESPCorners.BAMBOO_CORNER.get(),
						ESPVerticalSlabs.BAMBOO_MOSAIC_VERTICAL.get(), ESPVerticalSlabs.BAMBOO_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CRIMSON_HYPHAE,
				List.of(ESPCorners.CRIMSON_HYPHAE_CORNER.get(), ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL.get(),
						ESPSlabs.CRIMSON_HYPHAE_SLAB.get(), ESPStairs.CRIMSON_HYPHAE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CRIMSON_SLAB,
				List.of(ESPCorners.CRIMSON_CORNER.get(), ESPVerticalSlabs.CRIMSON_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WARPED_HYPHAE,
				List.of(ESPCorners.WARPED_HYPHAE_CORNER.get(), ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL.get(),
						ESPSlabs.WARPED_HYPHAE_SLAB.get(), ESPStairs.WARPED_HYPHAE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WARPED_SLAB,
				List.of(ESPCorners.WARPED_CORNER.get(), ESPVerticalSlabs.WARPED_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.STONE_SLAB,
				List.of(ESPCorners.STONE_CORNER.get(), ESPVerticalSlabs.STONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.COBBLESTONE_SLAB,
				List.of(ESPCorners.COBBLESTONE_CORNER.get(), ESPVerticalSlabs.COBBLESTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE_SLAB,
				List.of(ESPCorners.MOSSY_COBBLESTONE_CORNER.get(), ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB,
				List.of(ESPCorners.STONE_BRICK_CORNER.get(), ESPVerticalSlabs.STONE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICK_SLAB,
				List.of(ESPCorners.MOSSY_STONE_BRICK_CORNER.get(), ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.GRANITE_SLAB,
				List.of(ESPCorners.GRANITE_CORNER.get(), ESPVerticalSlabs.GRANITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_GRANITE_SLAB,
				List.of(ESPCorners.POLISHED_GRANITE_CORNER.get(), ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DIORITE_SLAB,
				List.of(ESPCorners.DIORITE_CORNER.get(), ESPVerticalSlabs.DIORITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_DIORITE_SLAB,
				List.of(ESPCorners.POLISHED_DIORITE_CORNER.get(), ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.ANDESITE_SLAB,
				List.of(ESPCorners.ANDESITE_CORNER.get(), ESPVerticalSlabs.ANDESITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_ANDESITE_SLAB,
				List.of(ESPCorners.POLISHED_ANDESITE_CORNER.get(), ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.COBBLED_DEEPSLATE_SLAB,
				List.of(ESPCorners.COBBLED_DEEPSLATE_CORNER.get(), ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_DEEPSLATE_SLAB,
				List.of(ESPCorners.POLISHED_DEEPSLATE_CORNER.get(), ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DEEPSLATE_BRICK_SLAB,
				List.of(ESPCorners.DEEPSLATE_BRICK_CORNER.get(), ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DEEPSLATE_TILE_SLAB,
				List.of(ESPCorners.DEEPSLATE_TILE_CORNER.get(), ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BRICK_SLAB,
				List.of(ESPCorners.BRICK_CORNER.get(), ESPVerticalSlabs.BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PACKED_MUD,
				List.of(ESPCorners.PACKED_MUD_CORNER.get(), ESPVerticalSlabs.PACKED_MUD_VERTICAL.get(),
						ESPSlabs.PACKED_MUD_SLAB.get(), ESPStairs.PACKED_MUD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB,
				List.of(ESPCorners.MUD_BRICK_CORNER.get(), ESPVerticalSlabs.MUD_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SANDSTONE_SLAB,
				List.of(ESPCorners.SANDSTONE_CORNER.get(), ESPVerticalSlabs.SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE_SLAB,
				List.of(ESPCorners.SMOOTH_SANDSTONE_CORNER.get(), ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE,
				List.of(ESPStairs.CUT_SANDSTONE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE_SLAB,
				List.of(ESPCorners.CUT_SANDSTONE_CORNER.get(), ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.RED_SANDSTONE_SLAB,
				List.of(ESPCorners.RED_SANDSTONE_CORNER.get(), ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE_SLAB,
				List.of(ESPCorners.SMOOTH_RED_SANDSTONE_CORNER.get(), ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE,
				List.of(ESPStairs.CUT_RED_SANDSTONE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE_SLAB,
				List.of(ESPCorners.CUT_RED_SANDSTONE_CORNER.get(), ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PRISMARINE_SLAB,
				List.of(ESPVerticalSlabs.PRISMARINE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICK_SLAB,
				List.of(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DARK_PRISMARINE_SLAB,
				List.of(ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.NETHERRACK,
				List.of(ESPCorners.NETHERRACK_CORNER.get(), ESPVerticalSlabs.NETHERRACK_VERTICAL.get(),
						ESPSlabs.NETHERRACK_SLAB.get(), ESPStairs.NETHERRACK_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.NETHER_BRICK_SLAB,
				List.of(ESPCorners.NETHER_BRICK_CORNER.get(), ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.RED_NETHER_BRICK_SLAB,
				List.of(ESPCorners.RED_NETHER_BRICK_CORNER.get(), ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BLACKSTONE_SLAB,
				List.of(ESPCorners.BLACKSTONE_CORNER.get(), ESPVerticalSlabs.BLACKSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_SLAB,
				List.of(ESPCorners.POLISHED_BLACKSTONE_CORNER.get(), ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB,
				List.of(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get(), ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.END_STONE,
				List.of(ESPCorners.END_STONE_CORNER.get(), ESPVerticalSlabs.END_STONE_VERTICAL.get(),
						ESPSlabs.END_STONE_SLAB.get(), ESPStairs.END_STONE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB,
				List.of(ESPCorners.END_STONE_BRICK_CORNER.get(), ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PURPUR_SLAB,
				List.of(ESPCorners.PURPUR_CORNER.get(), ESPVerticalSlabs.PURPUR_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.QUARTZ_SLAB,
				List.of(ESPCorners.QUARTZ_CORNER.get(), ESPVerticalSlabs.QUARTZ_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_QUARTZ_SLAB,
				List.of(ESPCorners.SMOOTH_QUARTZ_CORNER.get(), ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB,
				List.of(ESPCorners.CUT_COPPER_CORNER.get(), ESPVerticalSlabs.CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB,
				List.of(ESPCorners.EXPOSED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB,
				List.of(ESPCorners.WEATHERED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB,
				List.of(ESPCorners.OXIDIZED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB,
				List.of(ESPCorners.WAXED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB,
				List.of(ESPCorners.WAXED_EXPOSED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB,
				List.of(ESPCorners.WAXED_WEATHERED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB,
				List.of(ESPCorners.WAXED_OXIDIZED_CUT_COPPER_CORNER.get(), ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_WOOL,
				List.of(ESPCorners.PINK_WOOL_CORNER.get(), ESPCorners.MAGENTA_WOOL_CORNER.get(),
						ESPCorners.PURPLE_WOOL_CORNER.get(), ESPCorners.BLUE_WOOL_CORNER.get(),
						ESPCorners.LIGHT_BLUE_WOOL_CORNER.get(), ESPCorners.CYAN_WOOL_CORNER.get(),
						ESPCorners.GREEN_WOOL_CORNER.get(), ESPCorners.LIME_WOOL_CORNER.get(),
						ESPCorners.YELLOW_WOOL_CORNER.get(), ESPCorners.ORANGE_WOOL_CORNER.get(),
						ESPCorners.RED_WOOL_CORNER.get(), ESPCorners.BROWN_WOOL_CORNER.get(),
						ESPCorners.BLACK_WOOL_CORNER.get(), ESPCorners.GRAY_WOOL_CORNER.get(),
						ESPCorners.LIGHT_GRAY_WOOL_CORNER.get(), ESPCorners.WHITE_WOOL_CORNER.get(),
						ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(), ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(), ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get(), ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(),
						ESPSlabs.PINK_WOOL_SLAB.get(), ESPSlabs.MAGENTA_WOOL_SLAB.get(),
						ESPSlabs.PURPLE_WOOL_SLAB.get(), ESPSlabs.BLUE_WOOL_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(), ESPSlabs.CYAN_WOOL_SLAB.get(),
						ESPSlabs.GREEN_WOOL_SLAB.get(), ESPSlabs.LIME_WOOL_SLAB.get(),
						ESPSlabs.YELLOW_WOOL_SLAB.get(), ESPSlabs.ORANGE_WOOL_SLAB.get(),
						ESPSlabs.RED_WOOL_SLAB.get(), ESPSlabs.BROWN_WOOL_SLAB.get(),
						ESPSlabs.BLACK_WOOL_SLAB.get(), ESPSlabs.GRAY_WOOL_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), ESPSlabs.WHITE_WOOL_SLAB.get(),
						ESPStairs.PINK_WOOL_STAIRS.get(), ESPStairs.MAGENTA_WOOL_STAIRS.get(),
						ESPStairs.PURPLE_WOOL_STAIRS.get(), ESPStairs.BLUE_WOOL_STAIRS.get(),
						ESPStairs.LIGHT_BLUE_WOOL_STAIRS.get(), ESPStairs.CYAN_WOOL_STAIRS.get(),
						ESPStairs.GREEN_WOOL_STAIRS.get(), ESPStairs.LIME_WOOL_STAIRS.get(),
						ESPStairs.YELLOW_WOOL_STAIRS.get(), ESPStairs.ORANGE_WOOL_STAIRS.get(),
						ESPStairs.RED_WOOL_STAIRS.get(), ESPStairs.BROWN_WOOL_STAIRS.get(),
						ESPStairs.BLACK_WOOL_STAIRS.get(), ESPStairs.GRAY_WOOL_STAIRS.get(),
						ESPStairs.LIGHT_GRAY_WOOL_STAIRS.get(), ESPStairs.WHITE_WOOL_STAIRS.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_TERRACOTTA,
				List.of(ESPCorners.PINK_TERRACOTTA_CORNER.get(), ESPCorners.MAGENTA_TERRACOTTA_CORNER.get(),
						ESPCorners.PURPLE_TERRACOTTA_CORNER.get(), ESPCorners.BLUE_TERRACOTTA_CORNER.get(),
						ESPCorners.LIGHT_BLUE_TERRACOTTA_CORNER.get(), ESPCorners.CYAN_TERRACOTTA_CORNER.get(),
						ESPCorners.GREEN_TERRACOTTA_CORNER.get(), ESPCorners.LIME_TERRACOTTA_CORNER.get(),
						ESPCorners.YELLOW_TERRACOTTA_CORNER.get(), ESPCorners.ORANGE_TERRACOTTA_CORNER.get(),
						ESPCorners.RED_TERRACOTTA_CORNER.get(), ESPCorners.BROWN_TERRACOTTA_CORNER.get(),
						ESPCorners.BLACK_TERRACOTTA_CORNER.get(), ESPCorners.GRAY_TERRACOTTA_CORNER.get(),
						ESPCorners.LIGHT_GRAY_TERRACOTTA_CORNER.get(), ESPCorners.WHITE_TERRACOTTA_CORNER.get(),
						ESPCorners.TERRACOTTA_CORNER.get(), ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(),
						ESPSlabs.PINK_TERRACOTTA_SLAB.get(), ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(),
						ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_TERRACOTTA_SLAB.get(),
						ESPSlabs.GREEN_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_TERRACOTTA_SLAB.get(),
						ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(),
						ESPSlabs.RED_TERRACOTTA_SLAB.get(), ESPSlabs.BROWN_TERRACOTTA_SLAB.get(),
						ESPSlabs.BLACK_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), ESPSlabs.WHITE_TERRACOTTA_SLAB.get(),
						ESPSlabs.TERRACOTTA_SLAB.get(), ESPStairs.PINK_TERRACOTTA_STAIRS.get(),
						ESPStairs.MAGENTA_TERRACOTTA_STAIRS.get(), ESPStairs.PURPLE_TERRACOTTA_STAIRS.get(),
						ESPStairs.BLUE_TERRACOTTA_STAIRS.get(), ESPStairs.LIGHT_BLUE_TERRACOTTA_STAIRS.get(),
						ESPStairs.CYAN_TERRACOTTA_STAIRS.get(), ESPStairs.GREEN_TERRACOTTA_STAIRS.get(),
						ESPStairs.LIME_TERRACOTTA_STAIRS.get(), ESPStairs.YELLOW_TERRACOTTA_STAIRS.get(),
						ESPStairs.ORANGE_TERRACOTTA_STAIRS.get(), ESPStairs.RED_TERRACOTTA_STAIRS.get(),
						ESPStairs.BROWN_TERRACOTTA_STAIRS.get(), ESPStairs.BLACK_TERRACOTTA_STAIRS.get(),
						ESPStairs.GRAY_TERRACOTTA_STAIRS.get(), ESPStairs.LIGHT_GRAY_TERRACOTTA_STAIRS.get(),
						ESPStairs.WHITE_TERRACOTTA_STAIRS.get(), ESPStairs.TERRACOTTA_STAIRS.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_CONCRETE,
				List.of(ESPCorners.PINK_CONCRETE_CORNER.get(), ESPCorners.MAGENTA_CONCRETE_CORNER.get(),
						ESPCorners.PURPLE_CONCRETE_CORNER.get(), ESPCorners.BLUE_CONCRETE_CORNER.get(),
						ESPCorners.LIGHT_BLUE_CONCRETE_CORNER.get(), ESPCorners.CYAN_CONCRETE_CORNER.get(),
						ESPCorners.GREEN_CONCRETE_CORNER.get(), ESPCorners.LIME_CONCRETE_CORNER.get(),
						ESPCorners.YELLOW_CONCRETE_CORNER.get(), ESPCorners.ORANGE_CONCRETE_CORNER.get(),
						ESPCorners.RED_CONCRETE_CORNER.get(), ESPCorners.BROWN_CONCRETE_CORNER.get(),
						ESPCorners.BLACK_CONCRETE_CORNER.get(), ESPCorners.GRAY_CONCRETE_CORNER.get(),
						ESPCorners.LIGHT_GRAY_CONCRETE_CORNER.get(), ESPCorners.WHITE_CONCRETE_CORNER.get(),
						ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get(),
						ESPSlabs.PINK_CONCRETE_SLAB.get(), ESPSlabs.MAGENTA_CONCRETE_SLAB.get(),
						ESPSlabs.PURPLE_CONCRETE_SLAB.get(), ESPSlabs.BLUE_CONCRETE_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), ESPSlabs.CYAN_CONCRETE_SLAB.get(),
						ESPSlabs.GREEN_CONCRETE_SLAB.get(), ESPSlabs.LIME_CONCRETE_SLAB.get(),
						ESPSlabs.YELLOW_CONCRETE_SLAB.get(), ESPSlabs.ORANGE_CONCRETE_SLAB.get(),
						ESPSlabs.RED_CONCRETE_SLAB.get(), ESPSlabs.BROWN_CONCRETE_SLAB.get(),
						ESPSlabs.BLACK_CONCRETE_SLAB.get(), ESPSlabs.GRAY_CONCRETE_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(), ESPSlabs.WHITE_CONCRETE_SLAB.get(),
						ESPStairs.PINK_CONCRETE_STAIRS.get(), ESPStairs.MAGENTA_CONCRETE_STAIRS.get(),
						ESPStairs.PURPLE_CONCRETE_STAIRS.get(), ESPStairs.BLUE_CONCRETE_STAIRS.get(),
						ESPStairs.LIGHT_BLUE_CONCRETE_STAIRS.get(), ESPStairs.CYAN_CONCRETE_STAIRS.get(),
						ESPStairs.GREEN_CONCRETE_STAIRS.get(), ESPStairs.LIME_CONCRETE_STAIRS.get(),
						ESPStairs.YELLOW_CONCRETE_STAIRS.get(), ESPStairs.ORANGE_CONCRETE_STAIRS.get(),
						ESPStairs.RED_CONCRETE_STAIRS.get(), ESPStairs.BROWN_CONCRETE_STAIRS.get(),
						ESPStairs.BLACK_CONCRETE_STAIRS.get(), ESPStairs.GRAY_CONCRETE_STAIRS.get(),
						ESPStairs.LIGHT_GRAY_CONCRETE_STAIRS.get(), ESPStairs.WHITE_CONCRETE_STAIRS.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_CONCRETE_POWDER,
				List.of(ESPCorners.PINK_CONCRETE_POWDER_CORNER.get(), ESPCorners.MAGENTA_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.PURPLE_CONCRETE_POWDER_CORNER.get(), ESPCorners.BLUE_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.LIGHT_BLUE_CONCRETE_POWDER_CORNER.get(), ESPCorners.CYAN_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.GREEN_CONCRETE_POWDER_CORNER.get(), ESPCorners.LIME_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.YELLOW_CONCRETE_POWDER_CORNER.get(), ESPCorners.ORANGE_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.RED_CONCRETE_POWDER_CORNER.get(), ESPCorners.BROWN_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.BLACK_CONCRETE_POWDER_CORNER.get(), ESPCorners.GRAY_CONCRETE_POWDER_CORNER.get(),
						ESPCorners.LIGHT_GRAY_CONCRETE_POWDER_CORNER.get(), ESPCorners.WHITE_CONCRETE_POWDER_CORNER.get(),
						ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get(),
						ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get(), ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get(), ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(), ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get(), ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get(), ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.RED_CONCRETE_POWDER_SLAB.get(), ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get(), ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get(),
						ESPStairs.PINK_CONCRETE_POWDER_STAIRS.get(), ESPStairs.MAGENTA_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.PURPLE_CONCRETE_POWDER_STAIRS.get(), ESPStairs.BLUE_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.LIGHT_BLUE_CONCRETE_POWDER_STAIRS.get(), ESPStairs.CYAN_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.GREEN_CONCRETE_POWDER_STAIRS.get(), ESPStairs.LIME_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.YELLOW_CONCRETE_POWDER_STAIRS.get(), ESPStairs.ORANGE_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.RED_CONCRETE_POWDER_STAIRS.get(), ESPStairs.BROWN_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.BLACK_CONCRETE_POWDER_STAIRS.get(), ESPStairs.GRAY_CONCRETE_POWDER_STAIRS.get(),
						ESPStairs.LIGHT_GRAY_CONCRETE_POWDER_STAIRS.get(), ESPStairs.WHITE_CONCRETE_POWDER_STAIRS.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_GLAZED_TERRACOTTA,
				List.of(ESPCorners.PINK_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.MAGENTA_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.PURPLE_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.BLUE_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.LIGHT_BLUE_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.CYAN_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.GREEN_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.LIME_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.YELLOW_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.ORANGE_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.RED_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.BROWN_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.BLACK_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.GRAY_GLAZED_TERRACOTTA_CORNER.get(),
						ESPCorners.LIGHT_GRAY_GLAZED_TERRACOTTA_CORNER.get(), ESPCorners.WHITE_GLAZED_TERRACOTTA_CORNER.get(),
						ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get(),
						ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(),
						ESPStairs.PINK_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.BLUE_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.CYAN_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.LIME_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.RED_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.BROWN_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.GRAY_GLAZED_TERRACOTTA_STAIRS.get(),
						ESPStairs.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), ESPStairs.WHITE_GLAZED_TERRACOTTA_STAIRS.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_STAINED_GLASS,
				List.of(ESPCorners.PINK_STAINED_GLASS_CORNER.get(), ESPCorners.MAGENTA_STAINED_GLASS_CORNER.get(),
						ESPCorners.PURPLE_STAINED_GLASS_CORNER.get(), ESPCorners.BLUE_STAINED_GLASS_CORNER.get(),
						ESPCorners.LIGHT_BLUE_STAINED_GLASS_CORNER.get(), ESPCorners.CYAN_STAINED_GLASS_CORNER.get(),
						ESPCorners.GREEN_STAINED_GLASS_CORNER.get(), ESPCorners.LIME_STAINED_GLASS_CORNER.get(),
						ESPCorners.YELLOW_STAINED_GLASS_CORNER.get(), ESPCorners.ORANGE_STAINED_GLASS_CORNER.get(),
						ESPCorners.RED_STAINED_GLASS_CORNER.get(), ESPCorners.BROWN_STAINED_GLASS_CORNER.get(),
						ESPCorners.BLACK_STAINED_GLASS_CORNER.get(), ESPCorners.GRAY_STAINED_GLASS_CORNER.get(),
						ESPCorners.LIGHT_GRAY_STAINED_GLASS_CORNER.get(), ESPCorners.WHITE_STAINED_GLASS_CORNER.get(),
						ESPCorners.TINTED_GLASS_CORNER.get(), ESPCorners.GLASS_CORNER.get(),
						ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(),
						ESPVerticalSlabs.TINTED_GLASS_VERTICAL.get(), ESPVerticalSlabs.GLASS_VERTICAL.get(),
						ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(),
						ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(),
						ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(),
						ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), ESPSlabs.LIME_STAINED_GLASS_SLAB.get(),
						ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(),
						ESPSlabs.RED_STAINED_GLASS_SLAB.get(), ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(),
						ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(),
						ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(),
						ESPSlabs.TINTED_GLASS_SLAB.get(), ESPSlabs.GLASS_SLAB.get(),
						ESPStairs.PINK_STAINED_GLASS_STAIRS.get(), ESPStairs.MAGENTA_STAINED_GLASS_STAIRS.get(),
						ESPStairs.PURPLE_STAINED_GLASS_STAIRS.get(), ESPStairs.BLUE_STAINED_GLASS_STAIRS.get(),
						ESPStairs.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), ESPStairs.CYAN_STAINED_GLASS_STAIRS.get(),
						ESPStairs.GREEN_STAINED_GLASS_STAIRS.get(), ESPStairs.LIME_STAINED_GLASS_STAIRS.get(),
						ESPStairs.YELLOW_STAINED_GLASS_STAIRS.get(), ESPStairs.ORANGE_STAINED_GLASS_STAIRS.get(),
						ESPStairs.RED_STAINED_GLASS_STAIRS.get(), ESPStairs.BROWN_STAINED_GLASS_STAIRS.get(),
						ESPStairs.BLACK_STAINED_GLASS_STAIRS.get(), ESPStairs.GRAY_STAINED_GLASS_STAIRS.get(),
						ESPStairs.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), ESPStairs.WHITE_STAINED_GLASS_STAIRS.get(),
						ESPStairs.TINTED_GLASS_STAIRS.get(), ESPStairs.GLASS_STAIRS.get()));
	}

	public static void putAfter(BuildCreativeModeTabContentsEvent event, ResourceKey<CreativeModeTab> tab, Block after, List<Block> blockList) {
		if (event.getTabKey() == tab) {
			for (Block block : blockList) {
				event.getEntries().putAfter(new ItemStack(after), new ItemStack(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}
}
