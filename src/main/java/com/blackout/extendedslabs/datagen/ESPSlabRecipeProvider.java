package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ESPSlabRecipeProvider extends RecipeProvider {

	public ESPSlabRecipeProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	public void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		generateSlabRecipes(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get().asItem(), ESPSlabs.GRASS_BLOCK_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DIRT_VERTICAL.get().asItem(), ESPSlabs.DIRT_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get().asItem(), ESPSlabs.COARSE_DIRT_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ROOTED_DIRT_VERTICAL.get().asItem(), ESPSlabs.ROOTED_DIRT_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PODZOL_VERTICAL.get().asItem(), ESPSlabs.PODZOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MYCELIUM_VERTICAL.get().asItem(), ESPSlabs.MYCELIUM_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DIRT_PATH_VERTICAL.get().asItem(), ESPSlabs.DIRT_PATH_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SAND_VERTICAL.get().asItem(), ESPSlabs.SAND_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_SAND_VERTICAL.get().asItem(), ESPSlabs.RED_SAND_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAVEL_VERTICAL.get().asItem(), ESPSlabs.GRAVEL_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.STONE_VERTICAL.get().asItem(), Blocks.STONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get().asItem(), Blocks.COBBLESTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.STONE_BRICK_VERTICAL.get().asItem(), Blocks.STONE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get().asItem(), Blocks.SMOOTH_STONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get().asItem(), Blocks.MOSSY_COBBLESTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get().asItem(), Blocks.MOSSY_STONE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ANDESITE_VERTICAL.get().asItem(), Blocks.ANDESITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get().asItem(), Blocks.POLISHED_ANDESITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DIORITE_VERTICAL.get().asItem(), Blocks.DIORITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get().asItem(), Blocks.POLISHED_DIORITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRANITE_VERTICAL.get().asItem(), Blocks.GRANITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get().asItem(), Blocks.POLISHED_GRANITE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BRICK_VERTICAL.get().asItem(), Blocks.BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.TUFF_VERTICAL.get().asItem(), ESPSlabs.TUFF_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CALCITE_VERTICAL.get().asItem(), ESPSlabs.CALCITE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DRIPSTONE_VERTICAL.get().asItem(), ESPSlabs.DRIPSTONE_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get().asItem(), ESPSlabs.WHITE_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get().asItem(), ESPSlabs.ORANGE_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get().asItem(), ESPSlabs.YELLOW_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIME_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get().asItem(), ESPSlabs.PINK_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get().asItem(), ESPSlabs.GRAY_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get().asItem(), ESPSlabs.CYAN_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get().asItem(), ESPSlabs.PURPLE_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get().asItem(), ESPSlabs.BLUE_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get().asItem(), ESPSlabs.BROWN_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get().asItem(), ESPSlabs.GREEN_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_WOOL_VERTICAL.get().asItem(), ESPSlabs.RED_WOOL_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get().asItem(), ESPSlabs.BLACK_WOOL_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.RED_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.WHITE_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.ORANGE_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.YELLOW_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIME_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.PINK_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.GRAY_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.CYAN_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.PURPLE_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BLUE_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BROWN_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.GREEN_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.RED_CONCRETE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BLACK_CONCRETE_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.CLAY_VERTICAL.get().asItem(), ESPSlabs.CLAY_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.WHITE_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.ORANGE_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.YELLOW_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIME_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PINK_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GRAY_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.CYAN_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PURPLE_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLUE_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BROWN_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GREEN_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.RED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLACK_TERRACOTTA_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.GLASS_VERTICAL.get().asItem(), ESPSlabs.GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.WHITE_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIME_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.PINK_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.GRAY_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.CYAN_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BLUE_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BROWN_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.GREEN_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.RED_STAINED_GLASS_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BLACK_STAINED_GLASS_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.SANDSTONE_VERTICAL.get().asItem(), Blocks.SANDSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_SANDSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_SANDSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.RED_SANDSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_RED_SANDSTONE_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get().asItem(), Blocks.COBBLED_DEEPSLATE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get().asItem(), Blocks.POLISHED_DEEPSLATE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get().asItem(), Blocks.DEEPSLATE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get().asItem(), Blocks.DEEPSLATE_TILE_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.NETHERRACK_VERTICAL.get().asItem(), ESPSlabs.NETHERRACK_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CRIMSON_NYLIUM_VERTICAL.get().asItem(), ESPSlabs.CRIMSON_NYLIUM_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WARPED_NYLIUM_VERTICAL.get().asItem(), ESPSlabs.WARPED_NYLIUM_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get().asItem(), Blocks.NETHER_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get().asItem(), Blocks.RED_NETHER_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get().asItem(), Blocks.BLACKSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.QUARTZ_VERTICAL.get().asItem(), Blocks.QUARTZ_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get().asItem(), Blocks.SMOOTH_QUARTZ_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.END_STONE_VERTICAL.get().asItem(), ESPSlabs.END_STONE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get().asItem(), Blocks.END_STONE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PURPUR_VERTICAL.get().asItem(), Blocks.PURPUR_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.PRISMARINE_VERTICAL.get().asItem(), Blocks.PRISMARINE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get().asItem(), Blocks.PRISMARINE_BRICK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get().asItem(), Blocks.DARK_PRISMARINE_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.ACACIA_VERTICAL.get().asItem(), Blocks.ACACIA_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BIRCH_VERTICAL.get().asItem(), Blocks.BIRCH_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CRIMSON_VERTICAL.get().asItem(), Blocks.CRIMSON_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DARK_OAK_VERTICAL.get().asItem(), Blocks.DARK_OAK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.JUNGLE_VERTICAL.get().asItem(), Blocks.JUNGLE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.OAK_VERTICAL.get().asItem(), Blocks.OAK_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SPRUCE_VERTICAL.get().asItem(), Blocks.SPRUCE_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WARPED_VERTICAL.get().asItem(), Blocks.WARPED_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get().asItem(), Blocks.PETRIFIED_OAK_SLAB.asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.ACACIA_WOOD_VERTICAL.get().asItem(), ESPSlabs.ACACIA_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.BIRCH_WOOD_VERTICAL.get().asItem(), ESPSlabs.BIRCH_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL.get().asItem(), ESPSlabs.CRIMSON_HYPHAE_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL.get().asItem(), ESPSlabs.DARK_OAK_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL.get().asItem(), ESPSlabs.JUNGLE_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.OAK_WOOD_VERTICAL.get().asItem(), ESPSlabs.OAK_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL.get().asItem(), ESPSlabs.SPRUCE_WOOD_SLAB.get().asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL.get().asItem(), ESPSlabs.WARPED_HYPHAE_SLAB.get().asItem(), consumer);

		generateSlabRecipes(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.OXIDIZED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WEATHERED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.EXPOSED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get().asItem(), Blocks.CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), consumer);
		generateSlabRecipes(ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_CUT_COPPER_SLAB.asItem(), consumer);

		ShapedRecipeBuilder.shaped(ESPSlabs.GRASS_BLOCK_SLAB.get(), 6).define('#', Blocks.GRASS_BLOCK).pattern("###").unlockedBy("has_grass_block", has(Blocks.GRASS_BLOCK)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.DIRT_SLAB.get(), 6).define('#', Blocks.DIRT).pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.COARSE_DIRT_SLAB.get(), 6).define('#', Blocks.COARSE_DIRT).pattern("###").unlockedBy("has_coarse_dirt", has(Blocks.COARSE_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ROOTED_DIRT_SLAB.get(), 6).define('#', Blocks.ROOTED_DIRT).pattern("###").unlockedBy("has_rooted_dirt", has(Blocks.ROOTED_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PODZOL_SLAB.get(), 6).define('#', Blocks.PODZOL).pattern("###").unlockedBy("has_podzol", has(Blocks.PODZOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MYCELIUM_SLAB.get(), 6).define('#', Blocks.MYCELIUM).pattern("###").unlockedBy("has_mycelium", has(Blocks.MYCELIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.DIRT_PATH_SLAB.get(), 6).define('#', Blocks.DIRT_PATH).pattern("###").unlockedBy("has_dirt_path", has(Blocks.DIRT_PATH)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.SAND_SLAB.get(), 6).define('#', Blocks.SAND).pattern("###").unlockedBy("has_sand", has(Blocks.SAND)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_SAND_SLAB.get(), 6).define('#', Blocks.RED_SAND).pattern("###").unlockedBy("has_red_sand", has(Blocks.RED_SAND)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAVEL_SLAB.get(), 6).define('#', Blocks.GRAVEL).pattern("###").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.TUFF_SLAB.get(), 6).define('#', Blocks.TUFF).pattern("###").unlockedBy("has_tuff", has(Blocks.TUFF)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CALCITE_SLAB.get(), 6).define('#', Blocks.CALCITE).pattern("###").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.DRIPSTONE_SLAB.get(), 6).define('#', Blocks.DRIPSTONE_BLOCK).pattern("###").unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_WOOL_SLAB.get(), 6).define('#', Blocks.WHITE_WOOL).pattern("###").unlockedBy("has_white_wool", has(Blocks.WHITE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_WOOL_SLAB.get(), 6).define('#', Blocks.ORANGE_WOOL).pattern("###").unlockedBy("has_orange_wool", has(Blocks.ORANGE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_WOOL_SLAB.get(), 6).define('#', Blocks.MAGENTA_WOOL).pattern("###").unlockedBy("has_magenta_wool", has(Blocks.MAGENTA_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_WOOL).pattern("###").unlockedBy("has_light_blue_wool", has(Blocks.LIGHT_BLUE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_WOOL_SLAB.get(), 6).define('#', Blocks.YELLOW_WOOL).pattern("###").unlockedBy("has_yellow_wool", has(Blocks.YELLOW_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_WOOL_SLAB.get(), 6).define('#', Blocks.LIME_WOOL).pattern("###").unlockedBy("has_lime_wool", has(Blocks.LIME_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_WOOL_SLAB.get(), 6).define('#', Blocks.PINK_WOOL).pattern("###").unlockedBy("has_pink_wool", has(Blocks.PINK_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_WOOL_SLAB.get(), 6).define('#', Blocks.GRAY_WOOL).pattern("###").unlockedBy("has_gray_wool", has(Blocks.GRAY_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_WOOL).pattern("###").unlockedBy("has_light_gray_wool", has(Blocks.LIGHT_GRAY_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_WOOL_SLAB.get(), 6).define('#', Blocks.CYAN_WOOL).pattern("###").unlockedBy("has_cyan_wool", has(Blocks.CYAN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_WOOL_SLAB.get(), 6).define('#', Blocks.PURPLE_WOOL).pattern("###").unlockedBy("has_purple_wool", has(Blocks.PURPLE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_WOOL_SLAB.get(), 6).define('#', Blocks.BLUE_WOOL).pattern("###").unlockedBy("has_blue_wool", has(Blocks.BLUE_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_WOOL_SLAB.get(), 6).define('#', Blocks.BROWN_WOOL).pattern("###").unlockedBy("has_brown_wool", has(Blocks.BROWN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_WOOL_SLAB.get(), 6).define('#', Blocks.GREEN_WOOL).pattern("###").unlockedBy("has_green_wool", has(Blocks.GREEN_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_WOOL_SLAB.get(), 6).define('#', Blocks.RED_WOOL).pattern("###").unlockedBy("has_red_wool", has(Blocks.RED_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_WOOL_SLAB.get(), 6).define('#', Blocks.BLACK_WOOL).pattern("###").unlockedBy("has_black_wool", has(Blocks.BLACK_WOOL)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.WHITE_CONCRETE_POWDER).pattern("###").unlockedBy("has_white_concrete_powder", has(Blocks.WHITE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.ORANGE_CONCRETE_POWDER).pattern("###").unlockedBy("has_orange_concrete_powder", has(Blocks.ORANGE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.MAGENTA_CONCRETE_POWDER).pattern("###").unlockedBy("has_magenta_concrete_powder", has(Blocks.MAGENTA_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE_POWDER).pattern("###").unlockedBy("has_light_blue_concrete_powder", has(Blocks.LIGHT_BLUE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.YELLOW_CONCRETE_POWDER).pattern("###").unlockedBy("has_yellow_concrete_powder", has(Blocks.YELLOW_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIME_CONCRETE_POWDER).pattern("###").unlockedBy("has_lime_concrete_powder", has(Blocks.LIME_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.PINK_CONCRETE_POWDER).pattern("###").unlockedBy("has_pink_concrete_powder", has(Blocks.PINK_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.GRAY_CONCRETE_POWDER).pattern("###").unlockedBy("has_gray_concrete_powder", has(Blocks.GRAY_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE_POWDER).pattern("###").unlockedBy("has_light_gray_concrete_powder", has(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.CYAN_CONCRETE_POWDER).pattern("###").unlockedBy("has_cyan_concrete_powder", has(Blocks.CYAN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.PURPLE_CONCRETE_POWDER).pattern("###").unlockedBy("has_purple_concrete_powder", has(Blocks.PURPLE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BLUE_CONCRETE_POWDER).pattern("###").unlockedBy("has_blue_concrete_powder", has(Blocks.BLUE_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BROWN_CONCRETE_POWDER).pattern("###").unlockedBy("has_brown_concrete_powder", has(Blocks.BROWN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.GREEN_CONCRETE_POWDER).pattern("###").unlockedBy("has_green_concrete_powder", has(Blocks.GREEN_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.RED_CONCRETE_POWDER).pattern("###").unlockedBy("has_red_concrete_powder", has(Blocks.RED_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get(), 6).define('#', Blocks.BLACK_CONCRETE_POWDER).pattern("###").unlockedBy("has_black_concrete_powder", has(Blocks.BLACK_CONCRETE_POWDER)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_CONCRETE_SLAB.get(), 6).define('#', Blocks.WHITE_CONCRETE).pattern("###").unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_CONCRETE_SLAB.get(), 6).define('#', Blocks.ORANGE_CONCRETE).pattern("###").unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_CONCRETE_SLAB.get(), 6).define('#', Blocks.MAGENTA_CONCRETE).pattern("###").unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE).pattern("###").unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_CONCRETE_SLAB.get(), 6).define('#', Blocks.YELLOW_CONCRETE).pattern("###").unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIME_CONCRETE).pattern("###").unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_CONCRETE_SLAB.get(), 6).define('#', Blocks.PINK_CONCRETE).pattern("###").unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_CONCRETE_SLAB.get(), 6).define('#', Blocks.GRAY_CONCRETE).pattern("###").unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE).pattern("###").unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_CONCRETE_SLAB.get(), 6).define('#', Blocks.CYAN_CONCRETE).pattern("###").unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_CONCRETE_SLAB.get(), 6).define('#', Blocks.PURPLE_CONCRETE).pattern("###").unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_CONCRETE_SLAB.get(), 6).define('#', Blocks.BLUE_CONCRETE).pattern("###").unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_CONCRETE_SLAB.get(), 6).define('#', Blocks.BROWN_CONCRETE).pattern("###").unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_CONCRETE_SLAB.get(), 6).define('#', Blocks.GREEN_CONCRETE).pattern("###").unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_CONCRETE_SLAB.get(), 6).define('#', Blocks.RED_CONCRETE).pattern("###").unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_CONCRETE_SLAB.get(), 6).define('#', Blocks.BLACK_CONCRETE).pattern("###").unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CLAY_SLAB.get(), 6).define('#', Blocks.CLAY).pattern("###").unlockedBy("has_clay", has(Blocks.CLAY)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.TERRACOTTA_SLAB.get(), 6).define('#', Blocks.TERRACOTTA).pattern("###").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.WHITE_TERRACOTTA).pattern("###").unlockedBy("has_white_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.ORANGE_TERRACOTTA).pattern("###").unlockedBy("has_orange_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.MAGENTA_TERRACOTTA).pattern("###").unlockedBy("has_magenta_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_TERRACOTTA).pattern("###").unlockedBy("has_light_blue_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.YELLOW_TERRACOTTA).pattern("###").unlockedBy("has_yellow_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIME_TERRACOTTA).pattern("###").unlockedBy("has_lime_terracotta", has(Blocks.LIME_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PINK_TERRACOTTA).pattern("###").unlockedBy("has_pink_terracotta", has(Blocks.PINK_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GRAY_TERRACOTTA).pattern("###").unlockedBy("has_gray_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_TERRACOTTA).pattern("###").unlockedBy("has_light_gray_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.CYAN_TERRACOTTA).pattern("###").unlockedBy("has_cyan_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PURPLE_TERRACOTTA).pattern("###").unlockedBy("has_purple_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLUE_TERRACOTTA).pattern("###").unlockedBy("has_blue_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BROWN_TERRACOTTA).pattern("###").unlockedBy("has_brown_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GREEN_TERRACOTTA).pattern("###").unlockedBy("has_green_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.RED_TERRACOTTA).pattern("###").unlockedBy("has_red_terracotta", has(Blocks.RED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLACK_TERRACOTTA).pattern("###").unlockedBy("has_black_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.WHITE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_white_glazed_terracotta", has(Blocks.WHITE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.ORANGE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_orange_glazed_terracotta", has(Blocks.ORANGE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.MAGENTA_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_magenta_glazed_terracotta", has(Blocks.MAGENTA_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_light_blue_glazed_terracotta", has(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.YELLOW_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_yellow_glazed_terracotta", has(Blocks.YELLOW_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIME_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_lime_glazed_terracotta", has(Blocks.LIME_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PINK_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_pink_glazed_terracotta", has(Blocks.PINK_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GRAY_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_gray_glazed_terracotta", has(Blocks.GRAY_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_light_gray_glazed_terracotta", has(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.CYAN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_cyan_glazed_terracotta", has(Blocks.CYAN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.PURPLE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_purple_glazed_terracotta", has(Blocks.PURPLE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLUE_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_blue_glazed_terracotta", has(Blocks.BLUE_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BROWN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_brown_glazed_terracotta", has(Blocks.BROWN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.GREEN_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_green_glazed_terracotta", has(Blocks.GREEN_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.RED_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_red_glazed_terracotta", has(Blocks.RED_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(), 6).define('#', Blocks.BLACK_GLAZED_TERRACOTTA).pattern("###").unlockedBy("has_black_glazed_terracotta", has(Blocks.BLACK_GLAZED_TERRACOTTA)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GLASS_SLAB.get(), 6).define('#', Blocks.GLASS).pattern("###").unlockedBy("has_glass", has(Blocks.GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.WHITE_STAINED_GLASS).pattern("###").unlockedBy("has_white_stained_glass", has(Blocks.WHITE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.ORANGE_STAINED_GLASS).pattern("###").unlockedBy("has_orange_stained_glass", has(Blocks.ORANGE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.MAGENTA_STAINED_GLASS).pattern("###").unlockedBy("has_magenta_stained_glass", has(Blocks.MAGENTA_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIGHT_BLUE_STAINED_GLASS).pattern("###").unlockedBy("has_light_blue_stained_glass", has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.YELLOW_STAINED_GLASS).pattern("###").unlockedBy("has_yellow_stained_glass", has(Blocks.YELLOW_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIME_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIME_STAINED_GLASS).pattern("###").unlockedBy("has_lime_stained_glass", has(Blocks.LIME_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.PINK_STAINED_GLASS).pattern("###").unlockedBy("has_pink_stained_glass", has(Blocks.PINK_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.GRAY_STAINED_GLASS).pattern("###").unlockedBy("has_gray_stained_glass", has(Blocks.GRAY_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.LIGHT_GRAY_STAINED_GLASS).pattern("###").unlockedBy("has_light_gray_stained_glass", has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.CYAN_STAINED_GLASS).pattern("###").unlockedBy("has_cyan_stained_glass", has(Blocks.CYAN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.PURPLE_STAINED_GLASS).pattern("###").unlockedBy("has_purple_stained_glass", has(Blocks.PURPLE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BLUE_STAINED_GLASS).pattern("###").unlockedBy("has_blue_stained_glass", has(Blocks.BLUE_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BROWN_STAINED_GLASS).pattern("###").unlockedBy("has_brown_stained_glass", has(Blocks.BROWN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.GREEN_STAINED_GLASS).pattern("###").unlockedBy("has_green_stained_glass", has(Blocks.GREEN_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.RED_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.RED_STAINED_GLASS).pattern("###").unlockedBy("has_red_stained_glass", has(Blocks.RED_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), 6).define('#', Blocks.BLACK_STAINED_GLASS).pattern("###").unlockedBy("has_black_stained_glass", has(Blocks.BLACK_STAINED_GLASS)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.NETHERRACK_SLAB.get(), 6).define('#', Blocks.NETHERRACK).pattern("###").unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CRIMSON_NYLIUM_SLAB.get(), 6).define('#', Blocks.CRIMSON_NYLIUM).pattern("###").unlockedBy("has_crimson_nylium", has(Blocks.CRIMSON_NYLIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WARPED_NYLIUM_SLAB.get(), 6).define('#', Blocks.WARPED_NYLIUM).pattern("###").unlockedBy("has_warped_nylium", has(Blocks.WARPED_NYLIUM)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.END_STONE_SLAB.get(), 6).define('#', Blocks.END_STONE).pattern("###").unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.OAK_WOOD_SLAB.get(), 6).define('#', Blocks.OAK_WOOD).pattern("###").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.SPRUCE_WOOD_SLAB.get(), 6).define('#', Blocks.SPRUCE_WOOD).pattern("###").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.BIRCH_WOOD_SLAB.get(), 6).define('#', Blocks.BIRCH_WOOD).pattern("###").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.JUNGLE_WOOD_SLAB.get(), 6).define('#', Blocks.JUNGLE_WOOD).pattern("###").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.ACACIA_WOOD_SLAB.get(), 6).define('#', Blocks.ACACIA_WOOD).pattern("###").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.DARK_OAK_WOOD_SLAB.get(), 6).define('#', Blocks.DARK_OAK_WOOD).pattern("###").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.CRIMSON_HYPHAE_SLAB.get(), 6).define('#', Blocks.CRIMSON_HYPHAE).pattern("###").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPSlabs.WARPED_HYPHAE_SLAB.get(), 6).define('#', Blocks.WARPED_HYPHAE).pattern("###").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), ESPSlabs.NETHERRACK_SLAB.get(), 2).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer, "netherrack_slab_from_netherrack_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), ESPSlabs.END_STONE_SLAB.get(), 2).unlockedBy("has_end_stone", has(Blocks.NETHERRACK)).save(consumer, "end_stone_slab_from_end_stone_stonecutting");
	}

	public void generateSlabRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(output)
				.requires(input)
				.unlockedBy("has_item", has(output))
				.save(consumer, input + "_to_" + output);
	}
}
