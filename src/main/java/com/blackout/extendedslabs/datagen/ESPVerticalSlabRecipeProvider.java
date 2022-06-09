package com.blackout.extendedslabs.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ESPVerticalSlabRecipeProvider extends RecipeProvider {

    public ESPVerticalSlabRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get().asItem(), ESPSlabs.GRASS_BLOCK_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DIRT_VERTICAL.get().asItem(), ESPSlabs.DIRT_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PODZOL_VERTICAL.get().asItem(), ESPSlabs.PODZOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRASS_PATH_VERTICAL.get().asItem(), ESPSlabs.GRASS_PATH_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SAND_VERTICAL.get().asItem(), ESPSlabs.SAND_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_SAND_VERTICAL.get().asItem(), ESPSlabs.RED_SAND_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAVEL_VERTICAL.get().asItem(), ESPSlabs.GRAVEL_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.STONE_VERTICAL.get().asItem(), Blocks.STONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get().asItem(), Blocks.COBBLESTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.STONE_BRICK_VERTICAL.get().asItem(), Blocks.STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get().asItem(), Blocks.SMOOTH_STONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get().asItem(), Blocks.MOSSY_COBBLESTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get().asItem(), Blocks.MOSSY_STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ANDESITE_VERTICAL.get().asItem(), Blocks.ANDESITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get().asItem(), Blocks.POLISHED_ANDESITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DIORITE_VERTICAL.get().asItem(), Blocks.DIORITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get().asItem(), Blocks.POLISHED_DIORITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRANITE_VERTICAL.get().asItem(), Blocks.GRANITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get().asItem(), Blocks.POLISHED_GRANITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BRICK_VERTICAL.get().asItem(), Blocks.BRICK_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get().asItem(), ESPSlabs.WHITE_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get().asItem(), ESPSlabs.ORANGE_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get().asItem(), ESPSlabs.YELLOW_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIME_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get().asItem(), ESPSlabs.PINK_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get().asItem(), ESPSlabs.GRAY_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get().asItem(), ESPSlabs.CYAN_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get().asItem(), ESPSlabs.PURPLE_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get().asItem(), ESPSlabs.BLUE_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get().asItem(), ESPSlabs.BROWN_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get().asItem(), ESPSlabs.GREEN_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_WOOL_VERTICAL.get().asItem(), ESPSlabs.RED_WOOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get().asItem(), ESPSlabs.BLACK_WOOL_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.RED_CONCRETE_POWDER_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get().asItem(), ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.WHITE_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.ORANGE_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.YELLOW_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIME_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.PINK_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.GRAY_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.CYAN_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.PURPLE_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BLUE_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BROWN_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.GREEN_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.RED_CONCRETE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get().asItem(), ESPSlabs.BLACK_CONCRETE_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.CLAY_VERTICAL.get().asItem(), ESPSlabs.CLAY_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.WHITE_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.ORANGE_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.YELLOW_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIME_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PINK_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GRAY_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.CYAN_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PURPLE_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLUE_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BROWN_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GREEN_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.RED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLACK_TERRACOTTA_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get().asItem(), ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.GLASS_VERTICAL.get().asItem(), ESPSlabs.GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.WHITE_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIME_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.PINK_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.GRAY_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.CYAN_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BLUE_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BROWN_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.GREEN_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.RED_STAINED_GLASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get().asItem(), ESPSlabs.BLACK_STAINED_GLASS_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.SANDSTONE_VERTICAL.get().asItem(), Blocks.SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.RED_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_RED_SANDSTONE_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.NETHERRACK_VERTICAL.get().asItem(), ESPSlabs.NETHERRACK_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get().asItem(), Blocks.NETHER_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get().asItem(), Blocks.RED_NETHER_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get().asItem(), Blocks.BLACKSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.QUARTZ_VERTICAL.get().asItem(), Blocks.QUARTZ_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get().asItem(), Blocks.SMOOTH_QUARTZ_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.END_STONE_VERTICAL.get().asItem(), ESPSlabs.END_STONE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get().asItem(), Blocks.END_STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPUR_VERTICAL.get().asItem(), Blocks.PURPUR_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.PRISMARINE_VERTICAL.get().asItem(), Blocks.PRISMARINE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get().asItem(), Blocks.PRISMARINE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get().asItem(), Blocks.DARK_PRISMARINE_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.ACACIA_VERTICAL.get().asItem(), Blocks.ACACIA_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BIRCH_VERTICAL.get().asItem(), Blocks.BIRCH_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CRIMSON_VERTICAL.get().asItem(), Blocks.CRIMSON_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DARK_OAK_VERTICAL.get().asItem(), Blocks.DARK_OAK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.JUNGLE_VERTICAL.get().asItem(), Blocks.JUNGLE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.OAK_VERTICAL.get().asItem(), Blocks.OAK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SPRUCE_VERTICAL.get().asItem(), Blocks.SPRUCE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WARPED_VERTICAL.get().asItem(), Blocks.WARPED_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get().asItem(), Blocks.PETRIFIED_OAK_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.ACACIA_WOOD_VERTICAL.get().asItem(), ESPSlabs.ACACIA_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BIRCH_WOOD_VERTICAL.get().asItem(), ESPSlabs.BIRCH_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL.get().asItem(), ESPSlabs.CRIMSON_HYPHAE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL.get().asItem(), ESPSlabs.DARK_OAK_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL.get().asItem(), ESPSlabs.JUNGLE_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.OAK_WOOD_VERTICAL.get().asItem(), ESPSlabs.OAK_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL.get().asItem(), ESPSlabs.SPRUCE_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL.get().asItem(), ESPSlabs.WARPED_HYPHAE_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(BOPVerticalSlabs.CHERRY_VERTICAL.get().asItem(), BOPBlocks.cherry_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.DEAD_VERTICAL.get().asItem(), BOPBlocks.dead_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.FIR_VERTICAL.get().asItem(), BOPBlocks.fir_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.HELLBARK_VERTICAL.get().asItem(), BOPBlocks.hellbark_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.JACARANDA_VERTICAL.get().asItem(), BOPBlocks.jacaranda_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.MAGIC_VERTICAL.get().asItem(), BOPBlocks.magic_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.MAHOGANY_VERTICAL.get().asItem(), BOPBlocks.mahogany_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.PALM_VERTICAL.get().asItem(), BOPBlocks.palm_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.REDWOOD_VERTICAL.get().asItem(), BOPBlocks.redwood_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.UMBRAN_VERTICAL.get().asItem(), BOPBlocks.umbran_slab.asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.WILLOW_VERTICAL.get().asItem(), BOPBlocks.willow_slab.asItem(), consumer);

        generateVerticalSlabRecipes(BOPVerticalSlabs.CHERRY_WOOD_VERTICAL.get().asItem(), BOPSlabs.CHERRY_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.DEAD_WOOD_VERTICAL.get().asItem(), BOPSlabs.DEAD_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.FIR_WOOD_VERTICAL.get().asItem(), BOPSlabs.FIR_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.HELLBARK_WOOD_VERTICAL.get().asItem(), BOPSlabs.HELLBARK_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.JACARANDA_WOOD_VERTICAL.get().asItem(), BOPSlabs.JACARANDA_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.MAGIC_WOOD_VERTICAL.get().asItem(), BOPSlabs.MAGIC_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.MAHOGANY_WOOD_VERTICAL.get().asItem(), BOPSlabs.MAHOGANY_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.PALM_WOOD_VERTICAL.get().asItem(), BOPSlabs.PALM_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.REDWOOD_WOOD_VERTICAL.get().asItem(), BOPSlabs.REDWOOD_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.UMBRAN_WOOD_VERTICAL.get().asItem(), BOPSlabs.UMBRAN_WOOD_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(BOPVerticalSlabs.WILLOW_WOOD_VERTICAL.get().asItem(), BOPSlabs.WILLOW_WOOD_SLAB.get().asItem(), consumer);

        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(), 6).define('#', Blocks.GRASS_BLOCK).pattern("#").pattern("#").pattern("#").unlockedBy("has_grass_block", has(Blocks.GRASS_BLOCK)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.DIRT_VERTICAL.get(), 6).define('#', Blocks.DIRT).pattern("#").pattern("#").pattern("#").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PODZOL_VERTICAL.get(), 6).define('#', Blocks.PODZOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_podzol", has(Blocks.PODZOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRASS_PATH_VERTICAL.get(), 6).define('#', Blocks.GRASS_PATH).pattern("#").pattern("#").pattern("#").unlockedBy("has_grass_path", has(Blocks.GRASS_PATH)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.SAND_VERTICAL.get(), 6).define('#', Blocks.SAND).pattern("#").pattern("#").pattern("#").unlockedBy("has_sand", has(Blocks.SAND)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_SAND_VERTICAL.get(), 6).define('#', Blocks.RED_SAND).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_sand", has(Blocks.RED_SAND)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAVEL_VERTICAL.get(), 6).define('#', Blocks.GRAVEL).pattern("#").pattern("#").pattern("#").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(), 6).define('#', Blocks.WHITE_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_wool", has(Blocks.WHITE_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(), 6).define('#', Blocks.ORANGE_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_wool", has(Blocks.ORANGE_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_wool", has(Blocks.MAGENTA_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_wool", has(Blocks.LIGHT_BLUE_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), 6).define('#', Blocks.YELLOW_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_wool", has(Blocks.YELLOW_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(), 6).define('#', Blocks.LIME_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_wool", has(Blocks.LIME_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), 6).define('#', Blocks.PINK_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_wool", has(Blocks.PINK_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(), 6).define('#', Blocks.GRAY_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_wool", has(Blocks.GRAY_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_wool", has(Blocks.LIGHT_GRAY_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(), 6).define('#', Blocks.CYAN_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_wool", has(Blocks.CYAN_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), 6).define('#', Blocks.PURPLE_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_wool", has(Blocks.PURPLE_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(), 6).define('#', Blocks.BLUE_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_wool", has(Blocks.BLUE_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(), 6).define('#', Blocks.BROWN_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_wool", has(Blocks.BROWN_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(), 6).define('#', Blocks.GREEN_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_wool", has(Blocks.GREEN_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), 6).define('#', Blocks.RED_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_wool", has(Blocks.RED_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get(), 6).define('#', Blocks.BLACK_WOOL).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_wool", has(Blocks.BLACK_WOOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.WHITE_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_concrete_powder", has(Blocks.WHITE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.ORANGE_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_concrete_powder", has(Blocks.ORANGE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_concrete_powder", has(Blocks.MAGENTA_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_concrete_powder", has(Blocks.LIGHT_BLUE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.YELLOW_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_concrete_powder", has(Blocks.YELLOW_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.LIME_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_concrete_powder", has(Blocks.LIME_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.PINK_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_concrete_powder", has(Blocks.PINK_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.GRAY_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_concrete_powder", has(Blocks.GRAY_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_concrete_powder", has(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.CYAN_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_concrete_powder", has(Blocks.CYAN_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.PURPLE_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_concrete_powder", has(Blocks.PURPLE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.BLUE_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_concrete_powder", has(Blocks.BLUE_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.BROWN_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_concrete_powder", has(Blocks.BROWN_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.GREEN_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_concrete_powder", has(Blocks.GREEN_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.RED_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_concrete_powder", has(Blocks.RED_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get(), 6).define('#', Blocks.BLACK_CONCRETE_POWDER).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_concrete_powder", has(Blocks.BLACK_CONCRETE_POWDER)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.WHITE_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.ORANGE_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.YELLOW_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.LIME_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.PINK_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.GRAY_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.CYAN_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.PURPLE_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.BLUE_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.BROWN_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.GREEN_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.RED_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get(), 6).define('#', Blocks.BLACK_CONCRETE).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CLAY_VERTICAL.get(), 6).define('#', Blocks.CLAY).pattern("#").pattern("#").pattern("#").unlockedBy("has_clay", has(Blocks.CLAY)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.WHITE_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.ORANGE_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.YELLOW_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIME_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_terracotta", has(Blocks.LIME_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.PINK_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_terracotta", has(Blocks.PINK_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.GRAY_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.CYAN_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.PURPLE_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BLUE_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BROWN_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.GREEN_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.RED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_terracotta", has(Blocks.RED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BLACK_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.WHITE_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_glazed_terracotta", has(Blocks.WHITE_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.ORANGE_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_glazed_terracotta", has(Blocks.ORANGE_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_glazed_terracotta", has(Blocks.MAGENTA_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_glazed_terracotta", has(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.YELLOW_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_glazed_terracotta", has(Blocks.YELLOW_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIME_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_glazed_terracotta", has(Blocks.LIME_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.PINK_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_glazed_terracotta", has(Blocks.PINK_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.GRAY_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_glazed_terracotta", has(Blocks.GRAY_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_glazed_terracotta", has(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.CYAN_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_glazed_terracotta", has(Blocks.CYAN_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.PURPLE_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_glazed_terracotta", has(Blocks.PURPLE_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BLUE_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_glazed_terracotta", has(Blocks.BLUE_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BROWN_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_glazed_terracotta", has(Blocks.BROWN_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.GREEN_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_glazed_terracotta", has(Blocks.GREEN_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.RED_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_glazed_terracotta", has(Blocks.RED_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get(), 6).define('#', Blocks.BLACK_GLAZED_TERRACOTTA).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_glazed_terracotta", has(Blocks.BLACK_GLAZED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GLASS_VERTICAL.get(), 6).define('#', Blocks.GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_glass", has(Blocks.GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.WHITE_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_white_stained_glass", has(Blocks.WHITE_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.ORANGE_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_orange_stained_glass", has(Blocks.ORANGE_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.MAGENTA_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_magenta_stained_glass", has(Blocks.MAGENTA_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.LIGHT_BLUE_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_blue_stained_glass", has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.YELLOW_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_yellow_stained_glass", has(Blocks.YELLOW_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.LIME_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_lime_stained_glass", has(Blocks.LIME_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.PINK_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_pink_stained_glass", has(Blocks.PINK_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.GRAY_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_gray_stained_glass", has(Blocks.GRAY_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.LIGHT_GRAY_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_light_gray_stained_glass", has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.CYAN_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_cyan_stained_glass", has(Blocks.CYAN_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.PURPLE_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_purple_stained_glass", has(Blocks.PURPLE_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.BLUE_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_blue_stained_glass", has(Blocks.BLUE_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.BROWN_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_brown_stained_glass", has(Blocks.BROWN_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.GREEN_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_green_stained_glass", has(Blocks.GREEN_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.RED_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_red_stained_glass", has(Blocks.RED_STAINED_GLASS)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), 6).define('#', Blocks.BLACK_STAINED_GLASS).pattern("#").pattern("#").pattern("#").unlockedBy("has_black_stained_glass", has(Blocks.BLACK_STAINED_GLASS)).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), ESPVerticalSlabs.NETHERRACK_VERTICAL.get(), 2).unlocks("has_netherrack", has(Blocks.NETHERRACK)).save(consumer, "netherrack_vertical_slab_from_netherrack_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), ESPVerticalSlabs.END_STONE_VERTICAL.get(), 2).unlocks("has_end_stone", has(Blocks.NETHERRACK)).save(consumer, "end_stone_vertical_slab_from_end_stone_stonecutting");
    }

    public void generateVerticalSlabRecipes(Item input, Item output, Consumer<IFinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.getRegistryName());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
