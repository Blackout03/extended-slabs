package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPSlabRecipeProvider {
	public static void recipes(@NotNull Consumer<FinishedRecipe> consumer) {
		final Collection<RegistryObject<Block>> blocks = ESPVerticalSlabs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			if (block.get() instanceof VerticalSlabBlock verticalSlabBlock) {
				generateSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterialSlab().asItem(), consumer);
			}
			if (block.get() instanceof PathVerticalSlabBlock verticalSlabBlock) {
				generateSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterialSlab().asItem(), consumer);
			}
			if (block.get() instanceof FallingVerticalSlabBlock verticalSlabBlock) {
				generateSlabRecipes(verticalSlabBlock.asItem(), verticalSlabBlock.getMaterialSlab().asItem(), consumer);
			}
		}

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRASS_BLOCK_SLAB.get(), 6).define('#', Blocks.GRASS_BLOCK).pattern("###").unlockedBy("has_grass_block", has(Blocks.GRASS_BLOCK)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.DIRT_SLAB.get(), 6).define('#', Blocks.DIRT).pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.COARSE_DIRT_SLAB.get(), 6).define('#', Blocks.COARSE_DIRT).pattern("###").unlockedBy("has_coarse_dirt", has(Blocks.COARSE_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ROOTED_DIRT_SLAB.get(), 6).define('#', Blocks.ROOTED_DIRT).pattern("###").unlockedBy("has_rooted_dirt", has(Blocks.ROOTED_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PODZOL_SLAB.get(), 6).define('#', Blocks.PODZOL).pattern("###").unlockedBy("has_podzol", has(Blocks.PODZOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MYCELIUM_SLAB.get(), 6).define('#', Blocks.MYCELIUM).pattern("###").unlockedBy("has_mycelium", has(Blocks.MYCELIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.DIRT_PATH_SLAB.get(), 6).define('#', Blocks.DIRT_PATH).pattern("###").unlockedBy("has_dirt_path", has(Blocks.DIRT_PATH)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.SAND_SLAB.get(), 6).define('#', Blocks.SAND).pattern("###").unlockedBy("has_sand", has(Blocks.SAND)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_SAND_SLAB.get(), 6).define('#', Blocks.RED_SAND).pattern("###").unlockedBy("has_red_sand", has(Blocks.RED_SAND)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAVEL_SLAB.get(), 6).define('#', Blocks.GRAVEL).pattern("###").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.TUFF_SLAB.get(), 6).define('#', Blocks.TUFF).pattern("###").unlockedBy("has_tuff", has(Blocks.TUFF)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CALCITE_SLAB.get(), 6).define('#', Blocks.CALCITE).pattern("###").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.DRIPSTONE_SLAB.get(), 6).define('#', Blocks.DRIPSTONE_BLOCK).pattern("###").unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MUD_SLAB.get(), 6).define('#', Blocks.MUD).pattern("###").unlockedBy("has_mud", has(Blocks.MUD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PACKED_MUD_SLAB.get(), 6).define('#', Blocks.PACKED_MUD).pattern("###").unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_WOOL_SLAB.get(), 6).define('#', Blocks.WHITE_WOOL).pattern("###").unlockedBy("has_white_wool", has(Blocks.WHITE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_WOOL_SLAB.get(), 6).define('#', Blocks.ORANGE_WOOL).pattern("###").unlockedBy("has_orange_wool", has(Blocks.ORANGE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_WOOL_SLAB.get(), 6).define('#', Blocks.MAGENTA_WOOL).pattern("###").unlockedBy("has_magenta_wool", has(Blocks.MAGENTA_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_WOOL).pattern("###").unlockedBy("has_light_blue_wool", has(Blocks.LIGHT_BLUE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_WOOL_SLAB.get(), 6).define('#', Blocks.YELLOW_WOOL).pattern("###").unlockedBy("has_yellow_wool", has(Blocks.YELLOW_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_WOOL_SLAB.get(), 6).define('#', Blocks.LIME_WOOL).pattern("###").unlockedBy("has_lime_wool", has(Blocks.LIME_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_WOOL_SLAB.get(), 6).define('#', Blocks.PINK_WOOL).pattern("###").unlockedBy("has_pink_wool", has(Blocks.PINK_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_WOOL_SLAB.get(), 6).define('#', Blocks.GRAY_WOOL).pattern("###").unlockedBy("has_gray_wool", has(Blocks.GRAY_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_WOOL).pattern("###").unlockedBy("has_light_gray_wool", has(Blocks.LIGHT_GRAY_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_WOOL_SLAB.get(), 6).define('#', Blocks.CYAN_WOOL).pattern("###").unlockedBy("has_cyan_wool", has(Blocks.CYAN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_WOOL_SLAB.get(), 6).define('#', Blocks.PURPLE_WOOL).pattern("###").unlockedBy("has_purple_wool", has(Blocks.PURPLE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_WOOL_SLAB.get(), 6).define('#', Blocks.BLUE_WOOL).pattern("###").unlockedBy("has_blue_wool", has(Blocks.BLUE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_WOOL_SLAB.get(), 6).define('#', Blocks.BROWN_WOOL).pattern("###").unlockedBy("has_brown_wool", has(Blocks.BROWN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_WOOL_SLAB.get(), 6).define('#', Blocks.GREEN_WOOL).pattern("###").unlockedBy("has_green_wool", has(Blocks.GREEN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_WOOL_SLAB.get(), 6).define('#', Blocks.RED_WOOL).pattern("###").unlockedBy("has_red_wool", has(Blocks.RED_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_WOOL_SLAB.get(), 6).define('#', Blocks.BLACK_WOOL).pattern("###").unlockedBy("has_black_wool", has(Blocks.BLACK_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.WHITE_CONCRETE_POWDER).pattern("###").unlockedBy("has_white_concrete_powder", has(Blocks.WHITE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.ORANGE_CONCRETE_POWDER).pattern("###").unlockedBy("has_orange_concrete_powder", has(Blocks.ORANGE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.MAGENTA_CONCRETE_POWDER).pattern("###").unlockedBy("has_magenta_concrete_powder", has(Blocks.MAGENTA_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE_POWDER).pattern("###").unlockedBy("has_light_blue_concrete_powder", has(Blocks.LIGHT_BLUE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.YELLOW_CONCRETE_POWDER).pattern("###").unlockedBy("has_yellow_concrete_powder", has(Blocks.YELLOW_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIME_CONCRETE_POWDER).pattern("###").unlockedBy("has_lime_concrete_powder", has(Blocks.LIME_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.PINK_CONCRETE_POWDER).pattern("###").unlockedBy("has_pink_concrete_powder", has(Blocks.PINK_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.GRAY_CONCRETE_POWDER).pattern("###").unlockedBy("has_gray_concrete_powder", has(Blocks.GRAY_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE_POWDER).pattern("###").unlockedBy("has_light_gray_concrete_powder", has(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.CYAN_CONCRETE_POWDER).pattern("###").unlockedBy("has_cyan_concrete_powder", has(Blocks.CYAN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.PURPLE_CONCRETE_POWDER).pattern("###").unlockedBy("has_purple_concrete_powder", has(Blocks.PURPLE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BLUE_CONCRETE_POWDER).pattern("###").unlockedBy("has_blue_concrete_powder", has(Blocks.BLUE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BROWN_CONCRETE_POWDER).pattern("###").unlockedBy("has_brown_concrete_powder", has(Blocks.BROWN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.GREEN_CONCRETE_POWDER).pattern("###").unlockedBy("has_green_concrete_powder", has(Blocks.GREEN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.RED_CONCRETE_POWDER).pattern("###").unlockedBy("has_red_concrete_powder", has(Blocks.RED_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BLACK_CONCRETE_POWDER).pattern("###").unlockedBy("has_black_concrete_powder", has(Blocks.BLACK_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_CONCRETE_SLAB.get(), 6).define('#', Blocks.WHITE_CONCRETE).pattern("###").unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_CONCRETE_SLAB.get(), 6).define('#', Blocks.ORANGE_CONCRETE).pattern("###").unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_CONCRETE_SLAB.get(), 6).define('#', Blocks.MAGENTA_CONCRETE).pattern("###").unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE).pattern("###").unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_CONCRETE_SLAB.get(), 6).define('#', Blocks.YELLOW_CONCRETE).pattern("###").unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIME_CONCRETE).pattern("###").unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_CONCRETE_SLAB.get(), 6).define('#', Blocks.PINK_CONCRETE).pattern("###").unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_CONCRETE_SLAB.get(), 6).define('#', Blocks.GRAY_CONCRETE).pattern("###").unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE).pattern("###").unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_CONCRETE_SLAB.get(), 6).define('#', Blocks.CYAN_CONCRETE).pattern("###").unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_CONCRETE_SLAB.get(), 6).define('#', Blocks.PURPLE_CONCRETE).pattern("###").unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_CONCRETE_SLAB.get(), 6).define('#', Blocks.BLUE_CONCRETE).pattern("###").unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_CONCRETE_SLAB.get(), 6).define('#', Blocks.BROWN_CONCRETE).pattern("###").unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_CONCRETE_SLAB.get(), 6).define('#', Blocks.GREEN_CONCRETE).pattern("###").unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_CONCRETE_SLAB.get(), 6).define('#', Blocks.RED_CONCRETE).pattern("###").unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_CONCRETE_SLAB.get(), 6).define('#', Blocks.BLACK_CONCRETE).pattern("###").unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CLAY_SLAB.get(), 6).define('#', Blocks.CLAY).pattern("###").unlockedBy("has_clay", has(Blocks.CLAY)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.TERRACOTTA_SLAB.get(), 6).define('#', Blocks.TERRACOTTA).pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.WHITE_TERRACOTTA).pattern("###").unlockedBy("has_white_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.ORANGE_TERRACOTTA).pattern("###").unlockedBy("has_orange_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.MAGENTA_TERRACOTTA).pattern("###").unlockedBy("has_magenta_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_TERRACOTTA).pattern("###").unlockedBy("has_light_blue_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.YELLOW_TERRACOTTA).pattern("###").unlockedBy("has_yellow_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIME_TERRACOTTA).pattern("###").unlockedBy("has_lime_terracotta", has(Blocks.LIME_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PINK_TERRACOTTA).pattern("###").unlockedBy("has_pink_terracotta", has(Blocks.PINK_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GRAY_TERRACOTTA).pattern("###").unlockedBy("has_gray_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_TERRACOTTA).pattern("###").unlockedBy("has_light_gray_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.CYAN_TERRACOTTA).pattern("###").unlockedBy("has_cyan_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PURPLE_TERRACOTTA).pattern("###").unlockedBy("has_purple_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLUE_TERRACOTTA).pattern("###").unlockedBy("has_blue_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BROWN_TERRACOTTA).pattern("###").unlockedBy("has_brown_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GREEN_TERRACOTTA).pattern("###").unlockedBy("has_green_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.RED_TERRACOTTA).pattern("###").unlockedBy("has_red_terracotta", has(Blocks.RED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLACK_TERRACOTTA).pattern("###").unlockedBy("has_black_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.WHITE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_white_glazed_terracotta", has(Blocks.WHITE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.ORANGE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_orange_glazed_terracotta", has(Blocks.ORANGE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.MAGENTA_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_magenta_glazed_terracotta", has(Blocks.MAGENTA_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_light_blue_glazed_terracotta", has(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.YELLOW_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_yellow_glazed_terracotta", has(Blocks.YELLOW_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIME_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_lime_glazed_terracotta", has(Blocks.LIME_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PINK_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_pink_glazed_terracotta", has(Blocks.PINK_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GRAY_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_gray_glazed_terracotta", has(Blocks.GRAY_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_light_gray_glazed_terracotta", has(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.CYAN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_cyan_glazed_terracotta", has(Blocks.CYAN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PURPLE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_purple_glazed_terracotta", has(Blocks.PURPLE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLUE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_blue_glazed_terracotta", has(Blocks.BLUE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BROWN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_brown_glazed_terracotta", has(Blocks.BROWN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GREEN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_green_glazed_terracotta", has(Blocks.GREEN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.RED_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_red_glazed_terracotta", has(Blocks.RED_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLACK_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_black_glazed_terracotta", has(Blocks.BLACK_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GLASS_SLAB.get(), 6).define('#', Blocks.GLASS).pattern("###").unlockedBy("has_glass", has(Blocks.GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.TINTED_GLASS_SLAB.get(), 6).define('#', Blocks.TINTED_GLASS).pattern("###").unlockedBy("has_tinted_glass", has(Blocks.TINTED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.WHITE_STAINED_GLASS).pattern("###").unlockedBy("has_white_stained_glass", has(Blocks.WHITE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.ORANGE_STAINED_GLASS).pattern("###").unlockedBy("has_orange_stained_glass", has(Blocks.ORANGE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.MAGENTA_STAINED_GLASS).pattern("###").unlockedBy("has_magenta_stained_glass", has(Blocks.MAGENTA_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_STAINED_GLASS).pattern("###").unlockedBy("has_light_blue_stained_glass", has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.YELLOW_STAINED_GLASS).pattern("###").unlockedBy("has_yellow_stained_glass", has(Blocks.YELLOW_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIME_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIME_STAINED_GLASS).pattern("###").unlockedBy("has_lime_stained_glass", has(Blocks.LIME_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.PINK_STAINED_GLASS).pattern("###").unlockedBy("has_pink_stained_glass", has(Blocks.PINK_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.GRAY_STAINED_GLASS).pattern("###").unlockedBy("has_gray_stained_glass", has(Blocks.GRAY_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_STAINED_GLASS).pattern("###").unlockedBy("has_light_gray_stained_glass", has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.CYAN_STAINED_GLASS).pattern("###").unlockedBy("has_cyan_stained_glass", has(Blocks.CYAN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.PURPLE_STAINED_GLASS).pattern("###").unlockedBy("has_purple_stained_glass", has(Blocks.PURPLE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BLUE_STAINED_GLASS).pattern("###").unlockedBy("has_blue_stained_glass", has(Blocks.BLUE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BROWN_STAINED_GLASS).pattern("###").unlockedBy("has_brown_stained_glass", has(Blocks.BROWN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.GREEN_STAINED_GLASS).pattern("###").unlockedBy("has_green_stained_glass", has(Blocks.GREEN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.RED_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.RED_STAINED_GLASS).pattern("###").unlockedBy("has_red_stained_glass", has(Blocks.RED_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BLACK_STAINED_GLASS).pattern("###").unlockedBy("has_black_stained_glass", has(Blocks.BLACK_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.NETHERRACK_SLAB.get(), 6).define('#', Blocks.NETHERRACK).pattern("###").unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CRIMSON_NYLIUM_SLAB.get(), 6).define('#', Blocks.CRIMSON_NYLIUM).pattern("###").unlockedBy("has_crimson_nylium", has(Blocks.CRIMSON_NYLIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WARPED_NYLIUM_SLAB.get(), 6).define('#', Blocks.WARPED_NYLIUM).pattern("###").unlockedBy("has_warped_nylium", has(Blocks.WARPED_NYLIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.END_STONE_SLAB.get(), 6).define('#', Blocks.END_STONE).pattern("###").unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.OAK_WOOD_SLAB.get(), 6).define('#', Blocks.OAK_WOOD).pattern("###").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.SPRUCE_WOOD_SLAB.get(), 6).define('#', Blocks.SPRUCE_WOOD).pattern("###").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.BIRCH_WOOD_SLAB.get(), 6).define('#', Blocks.BIRCH_WOOD).pattern("###").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.JUNGLE_WOOD_SLAB.get(), 6).define('#', Blocks.JUNGLE_WOOD).pattern("###").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.MANGROVE_WOOD_SLAB.get(), 6).define('#', Blocks.MANGROVE_WOOD).pattern("###").unlockedBy("has_mangrove_wood", has(Blocks.MANGROVE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.ACACIA_WOOD_SLAB.get(), 6).define('#', Blocks.ACACIA_WOOD).pattern("###").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.DARK_OAK_WOOD_SLAB.get(), 6).define('#', Blocks.DARK_OAK_WOOD).pattern("###").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.CRIMSON_HYPHAE_SLAB.get(), 6).define('#', Blocks.CRIMSON_HYPHAE).pattern("###").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPSlabs.WARPED_HYPHAE_SLAB.get(), 6).define('#', Blocks.WARPED_HYPHAE).pattern("###").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.NETHERRACK_SLAB.get(), 2).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":netherrack_slab_from_netherrack_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.END_STONE_SLAB.get(), 2).unlockedBy("has_end_stone", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_slab_from_end_stone_stonecutting");
	}

	public static void generateSlabRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
				.requires(input)
				.unlockedBy("has_item", has(output))
				.save(consumer, ExtendedSlabs.MODID + ":" + input + "_to_" + output);
	}

	protected static InventoryChangeTrigger.TriggerInstance has(ItemLike p_125978_) {
		return inventoryTrigger(ItemPredicate.Builder.item().of(p_125978_).build());
	}

	protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... p_126012_) {
		return new InventoryChangeTrigger.TriggerInstance(EntityPredicate.Composite.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, p_126012_);
	}
}
