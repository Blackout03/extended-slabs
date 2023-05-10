package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPCreativeTabs {
	public static CreativeModeTab EXTENDED_SLABS;
	@SubscribeEvent
	public static void registerCreativeTabsEvent(CreativeModeTabEvent.Register event) {
		EXTENDED_SLABS = event.registerCreativeModeTab(new ResourceLocation(ExtendedSlabs.MODID, "extended_slabs"),
				builder -> builder.title(Component.translatable("itemGroup.extendedslabs"))
						.icon(ESPCreativeTabs::makeIcon)
						.displayItems((featureFlag, output, operator) -> {
							add(output, ESPStairs.orderedItems());
							add(output, ESPSlabs.orderedItems());
							add(output, ESPVerticalSlabs.orderedItems());
							add(output, ESPCorners.orderedItems());
						}));
	}

	private static void add(final CreativeModeTab.Output output, final Collection<RegistryObject<Item>> items) {
		items.stream().map(RegistryObject::get).forEach(output::accept);
	}

	public static ItemStack makeIcon() {
		int nextIntBlockTypes = new Random().nextInt(4);
		if (nextIntBlockTypes == 1) {
			return new ItemStack(ESPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPCorners.ITEMS.getEntries().size())).findAny().get().get());
		} else if (nextIntBlockTypes == 2) {
			return new ItemStack(ESPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPSlabs.ITEMS.getEntries().size())).findAny().get().get());
		} else if (nextIntBlockTypes == 3) {
			return new ItemStack(ESPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPStairs.ITEMS.getEntries().size())).findAny().get().get());
		} else {
			return new ItemStack(ESPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
		}
	}

	@SubscribeEvent
	public static void buildContentsEvent(CreativeModeTabEvent.BuildContents event) {
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
				List.of(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB,
				List.of(ESPCorners.STONE_BRICK_CORNER.get(), ESPVerticalSlabs.STONE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICK_SLAB,
				List.of(ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get()));
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
				List.of(ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_DEEPSLATE_SLAB,
				List.of(ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DEEPSLATE_BRICK_SLAB,
				List.of(ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.DEEPSLATE_TILE_SLAB,
				List.of(ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BRICK_SLAB,
				List.of(ESPVerticalSlabs.BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PACKED_MUD,
				List.of(ESPCorners.PACKED_MUD_CORNER.get(), ESPVerticalSlabs.PACKED_MUD_VERTICAL.get(),
						ESPSlabs.PACKED_MUD_SLAB.get(), ESPStairs.PACKED_MUD_STAIRS.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.MUD_BRICK_SLAB,
				List.of(ESPCorners.MUD_BRICK_CORNER.get(), ESPVerticalSlabs.MUD_BRICK_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.RED_SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE_SLAB,
				List.of(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get()));
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
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.BLACKSTONE,
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
				List.of(ESPVerticalSlabs.QUARTZ_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_QUARTZ_SLAB,
				List.of(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB,
				List.of(ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_WOOL,
				List.of(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(),
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
						ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), ESPSlabs.WHITE_WOOL_SLAB.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_TERRACOTTA,
				List.of(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(),
						ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(), ESPSlabs.PINK_TERRACOTTA_SLAB.get(),
						ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(),
						ESPSlabs.BLUE_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
						ESPSlabs.CYAN_TERRACOTTA_SLAB.get(), ESPSlabs.GREEN_TERRACOTTA_SLAB.get(),
						ESPSlabs.LIME_TERRACOTTA_SLAB.get(), ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(),
						ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(), ESPSlabs.RED_TERRACOTTA_SLAB.get(),
						ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), ESPSlabs.BLACK_TERRACOTTA_SLAB.get(),
						ESPSlabs.GRAY_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
						ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), ESPSlabs.TERRACOTTA_SLAB.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_CONCRETE,
				List.of(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(),
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
						ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(), ESPSlabs.WHITE_CONCRETE_SLAB.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_CONCRETE_POWDER,
				List.of(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(),
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
						ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_GLAZED_TERRACOTTA,
				List.of(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(),
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
						ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get()));
		putAfter(event, CreativeModeTabs.COLORED_BLOCKS, Blocks.PINK_STAINED_GLASS,
				List.of(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(),
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
						ESPSlabs.TINTED_GLASS_SLAB.get(), ESPSlabs.GLASS_SLAB.get()));
	}

	public static void putAfter(CreativeModeTabEvent.BuildContents event, CreativeModeTab tab, Block after, List<Block> blockList) {
		if (event.getTab() == tab) {
			for (Block block : blockList) {
				event.getEntries().putAfter(new ItemStack(after), new ItemStack(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			}
		}
	}
}
