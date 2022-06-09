package com.blackout.extendedslabs.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import com.blackout.extendedslabs.init.modded.BOPStairs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ESPSlabRecipeProvider extends RecipeProvider {

    public ESPSlabRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        generateSlabRecipes(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get().asItem(), ESPSlabs.GRASS_BLOCK_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.DIRT_VERTICAL.get().asItem(), ESPSlabs.DIRT_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.PODZOL_VERTICAL.get().asItem(), ESPSlabs.PODZOL_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.GRASS_PATH_VERTICAL.get().asItem(), ESPSlabs.GRASS_PATH_SLAB.get().asItem(), consumer);
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

        generateSlabRecipes(ESPVerticalSlabs.NETHERRACK_VERTICAL.get().asItem(), ESPSlabs.NETHERRACK_SLAB.get().asItem(), consumer);
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

        generateSlabRecipes(BOPVerticalSlabs.CHERRY_VERTICAL.get().asItem(), BOPBlocks.cherry_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.DEAD_VERTICAL.get().asItem(), BOPBlocks.dead_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.FIR_VERTICAL.get().asItem(), BOPBlocks.fir_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.HELLBARK_VERTICAL.get().asItem(), BOPBlocks.hellbark_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.JACARANDA_VERTICAL.get().asItem(), BOPBlocks.jacaranda_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.MAGIC_VERTICAL.get().asItem(), BOPBlocks.magic_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.MAHOGANY_VERTICAL.get().asItem(), BOPBlocks.mahogany_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.PALM_VERTICAL.get().asItem(), BOPBlocks.palm_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.REDWOOD_VERTICAL.get().asItem(), BOPBlocks.redwood_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.UMBRAN_VERTICAL.get().asItem(), BOPBlocks.umbran_slab.asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.WILLOW_VERTICAL.get().asItem(), BOPBlocks.willow_slab.asItem(), consumer);

        generateSlabRecipes(BOPVerticalSlabs.CHERRY_WOOD_VERTICAL.get().asItem(), BOPSlabs.CHERRY_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.DEAD_WOOD_VERTICAL.get().asItem(), BOPSlabs.DEAD_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.FIR_WOOD_VERTICAL.get().asItem(), BOPSlabs.FIR_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.HELLBARK_WOOD_VERTICAL.get().asItem(), BOPSlabs.HELLBARK_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.JACARANDA_WOOD_VERTICAL.get().asItem(), BOPSlabs.JACARANDA_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.MAGIC_WOOD_VERTICAL.get().asItem(), BOPSlabs.MAGIC_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.MAHOGANY_WOOD_VERTICAL.get().asItem(), BOPSlabs.MAHOGANY_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.PALM_WOOD_VERTICAL.get().asItem(), BOPSlabs.PALM_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.REDWOOD_WOOD_VERTICAL.get().asItem(), BOPSlabs.REDWOOD_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.UMBRAN_WOOD_VERTICAL.get().asItem(), BOPSlabs.UMBRAN_WOOD_SLAB.get().asItem(), consumer);
        generateSlabRecipes(BOPVerticalSlabs.WILLOW_WOOD_VERTICAL.get().asItem(), BOPSlabs.WILLOW_WOOD_SLAB.get().asItem(), consumer);

        ShapedRecipeBuilder.shaped(ESPSlabs.GRASS_BLOCK_SLAB.get(), 6).define('#', Blocks.GRASS_BLOCK).pattern("###").unlockedBy("has_grass_block", has(Blocks.GRASS_BLOCK)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.DIRT_SLAB.get(), 6).define('#', Blocks.DIRT).pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.PODZOL_SLAB.get(), 6).define('#', Blocks.PODZOL).pattern("###").unlockedBy("has_podzol", has(Blocks.PODZOL)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.GRASS_PATH_SLAB.get(), 6).define('#', Blocks.GRASS_PATH).pattern("###").unlockedBy("has_grass_path", has(Blocks.GRASS_PATH)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.SAND_SLAB.get(), 6).define('#', Blocks.SAND).pattern("###").unlockedBy("has_sand", has(Blocks.SAND)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.RED_SAND_SLAB.get(), 6).define('#', Blocks.RED_SAND).pattern("###").unlockedBy("has_red_sand", has(Blocks.RED_SAND)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPSlabs.GRAVEL_SLAB.get(), 6).define('#', Blocks.GRAVEL).pattern("###").unlockedBy("has_gravel", has(Blocks.GRAVEL)).save(consumer);
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

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), ESPSlabs.NETHERRACK_SLAB.get(), 2).unlocks("has_netherrack", has(Blocks.NETHERRACK)).save(consumer, "netherrack_slab_from_netherrack_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), ESPSlabs.END_STONE_SLAB.get(), 2).unlocks("has_end_stone", has(Blocks.NETHERRACK)).save(consumer, "end_stone_slab_from_end_stone_stonecutting");
    }

    public void generateSlabRecipes(Item output, Item input, Consumer<IFinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.getRegistryName());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
