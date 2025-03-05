package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public abstract class ESPVerticalSlabRecipeProvider extends RecipeProvider {
	public ESPVerticalSlabRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, provider);
	}

	public static void recipes(RecipeOutput consumer) {
		final Collection<DeferredHolder<Block, ? extends Block>> blocks = ESPVerticalSlabs.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : blocks) {
			if (block.get() instanceof ESPVerticalSlabBlock verticalSlabBlock) {
				generateVerticalSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterial().asItem(), consumer);
				generateVerticalSlabFromSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterialSlab().asItem(), consumer);
			}
			if (block.get() instanceof FallingVerticalSlabBlock verticalSlabBlock) {
				generateVerticalSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterial().asItem(), consumer);
				generateVerticalSlabFromSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterialSlab().asItem(), consumer);
			}
		}

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.STONE_VERTICAL.get(), 2).unlockedBy("has_stone", has(Blocks.STONE)).save(consumer,  ExtendedSlabs.MODID + ":stone_vertical_slab_from_stone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.STONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_stone", has(Blocks.STONE)).save(consumer,  ExtendedSlabs.MODID + ":stone_brick_vertical_slab_from_stone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":sandstone_vertical_slab_from_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":cut_sandstone_vertical_slab_from_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_sandstone", has(Blocks.SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":cut_sandstone_vertical_slab_from_cut_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":red_sandstone_vertical_slab_from_red_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_red_sandstone", has(Blocks.RED_SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":cut_red_sandstone_vertical_slab_from_red_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(), 2).unlockedBy("has_cut_red_sandstone", has(Blocks.CUT_RED_SANDSTONE)).save(consumer,  ExtendedSlabs.MODID + ":cut_red_sandstone_vertical_slab_from_cut_red_sandstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.COBBLESTONE_VERTICAL.get(), 2).unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE)).save(consumer,  ExtendedSlabs.MODID + ":cobblestone_vertical_slab_from_cobblestone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.STONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":stone_brick_vertical_slab_from_stone_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.BRICK_VERTICAL.get(), 2).unlockedBy("has_bricks", has(Blocks.BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":brick_vertical_slab_from_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.ANDESITE_VERTICAL.get(), 2).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer,  ExtendedSlabs.MODID + ":andesite_vertical_slab_from_andesite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(), 2).unlockedBy("has_andesite", has(Blocks.ANDESITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_andesite_vertical_slab_from_andesite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(), 2).unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_andesite_vertical_slab_from_polished_andesite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.DIORITE_VERTICAL.get(), 2).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer,  ExtendedSlabs.MODID + ":diorite_vertical_slab_from_diorite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(), 2).unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_diorite_vertical_slab_from_diorite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(), 2).unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_diorite_vertical_slab_from_polished_diorite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.GRANITE_VERTICAL.get(), 2).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer,  ExtendedSlabs.MODID + ":granite_vertical_slab_from_granite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(), 2).unlockedBy("has_granite", has(Blocks.GRANITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_granite_vertical_slab_from_granite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(), 2).unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(consumer,  ExtendedSlabs.MODID + ":polished_granite_vertical_slab_from_polished_granite_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MOSSY_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_mossy_stone_bricks", has(Blocks.MOSSY_STONE_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":mossy_stone_brick_vertical_slab_from_stone_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MOSSY_COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get(), 2).unlockedBy("has_mossy_cobblestone", has(Blocks.MOSSY_COBBLESTONE)).save(consumer,  ExtendedSlabs.MODID + ":mossy_cobblestone_vertical_slab_from_cobblestone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get(), 2).unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(consumer,  ExtendedSlabs.MODID + ":smooth_stone_vertical_slab_from_smooth_stone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.NETHERRACK_VERTICAL.get(), 2).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":netherrack_vertical_slab_from_netherrack_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get(), 2).unlockedBy("has_nether_bricks", has(Blocks.NETHER_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":nether_brick_vertical_slab_from_nether_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get(), 2).unlockedBy("has_red_nether_bricks", has(Blocks.RED_NETHER_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":red_nether_brick_vertical_slab_from_red_nether_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.BLACKSTONE_VERTICAL.get(), 2).unlockedBy("has_blackstone", has(Blocks.BLACKSTONE)).save(consumer,  ExtendedSlabs.MODID + ":blackstone_vertical_slab_from_blackstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get(), 2).unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(consumer,  ExtendedSlabs.MODID + ":polished_blackstone_vertical_slab_from_polished_blackstone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_polished_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":polished_blackstone_brick_vertical_slab_from_polished_blackstone_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.QUARTZ_VERTICAL.get(), 2).unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK)).save(consumer,  ExtendedSlabs.MODID + ":quartz_vertical_slab_from_quartz_block_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get(), 2).unlockedBy("has_smooth_quartz", has(Blocks.SMOOTH_QUARTZ)).save(consumer,  ExtendedSlabs.MODID + ":smooth_quartz_vertical_slab_from_smooth_quartz_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.END_STONE_VERTICAL.get(), 2).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_vertical_slab_from_end_stone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_brick_vertical_slab_from_end_stone_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get(), 2).unlockedBy("has_end_stone_bricks", has(Blocks.END_STONE_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_brick_vertical_slab_from_end_stone_brick_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.PURPUR_VERTICAL.get(), 2).unlockedBy("has_purpur_block", has(Blocks.PURPUR_BLOCK)).save(consumer,  ExtendedSlabs.MODID + ":purpur_block_vertical_slab_from_purpur_block_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OXIDIZED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_oxidized_cut_copper", has(Blocks.OXIDIZED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":oxidized_cut_copper_vertical_slab_from_oxidized_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WEATHERED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_weathered_cut_copper", has(Blocks.WEATHERED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":weathered_cut_copper_vertical_slab_from_weathered_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.EXPOSED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_exposed_cut_copper", has(Blocks.EXPOSED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":exposed_cut_copper_vertical_slab_from_exposed_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_cut_copper", has(Blocks.CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":cut_copper_vertical_slab_from_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WAXED_OXIDIZED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_waxed_oxidized_cut_copper", has(Blocks.WAXED_OXIDIZED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":waxed_oxidized_cut_copper_vertical_slab_from_waxed_oxidized_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WAXED_WEATHERED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_waxed_weathered_cut_copper", has(Blocks.WAXED_WEATHERED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":waxed_weathered_cut_copper_vertical_slab_from_waxed_weathered_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WAXED_EXPOSED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_waxed_exposed_cut_copper", has(Blocks.WAXED_EXPOSED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":waxed_exposed_cut_copper_vertical_slab_from_waxed_exposed_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WAXED_CUT_COPPER), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get(), 2).unlockedBy("has_waxed_cut_copper", has(Blocks.WAXED_CUT_COPPER)).save(consumer,  ExtendedSlabs.MODID + ":waxed_cut_copper_vertical_slab_from_waxed_cut_copper_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get(), 2).unlockedBy("has_cobbled_deepslate", has(Blocks.COBBLED_DEEPSLATE)).save(consumer,  ExtendedSlabs.MODID + ":cobbled_deepslate_vertical_slab_from_cobbled_deepslate_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get(), 2).unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE)).save(consumer,  ExtendedSlabs.MODID + ":polished_deepslate_vertical_slab_from_polished_deepslate_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get(), 2).unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS)).save(consumer,  ExtendedSlabs.MODID + ":deepslate_brick_vertical_slab_from_deepslate_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get(), 2).unlockedBy("has_deepslate_tiles", has(Blocks.DEEPSLATE_TILES)).save(consumer,  ExtendedSlabs.MODID + ":deepslate_tile_vertical_slab_from_deepslate_tiles_stonecutting");
	}

	public static void generateVerticalSlabRecipes(Item output, Item input, RecipeOutput consumer) {
		ExtendedSlabs.LOGGER.info(BuiltInRegistries.ITEM.getKey(output.asItem()));

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
				.define('#', input)
				.pattern("#")
				.pattern("#")
				.pattern("#")
				.unlockedBy("has_item", has(input))
				.save(consumer);
	}

	public static void generateVerticalSlabFromSlabRecipes(Item output, Item input, RecipeOutput consumer) {
		ExtendedSlabs.LOGGER.info(BuiltInRegistries.ITEM.getKey(output.asItem()) + " from " + BuiltInRegistries.ITEM.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
				.requires(input)
				.unlockedBy("has_item", has(input))
				.save(consumer, ExtendedSlabs.MODID + ":" + stripPrefix(output) + "_from_" + stripPrefix(input));
	}

	public static String stripPrefix(Item input) {
		return input.toString().replaceAll(ExtendedSlabs.MODID + ":", "").replaceAll("minecraft:", "");
	}
}
