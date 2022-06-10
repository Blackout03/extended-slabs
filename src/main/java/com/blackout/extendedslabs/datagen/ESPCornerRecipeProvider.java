package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPStairs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ESPCornerRecipeProvider extends RecipeProvider {

    public ESPCornerRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        generateCornerRecipes(ESPCorners.STONE_CORNER.get().asItem(), Blocks.STONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.COBBLESTONE_CORNER.get().asItem(), Blocks.COBBLESTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.STONE_BRICK_CORNER.get().asItem(), Blocks.STONE_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.ANDESITE_CORNER.get().asItem(), Blocks.ANDESITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_ANDESITE_CORNER.get().asItem(), Blocks.POLISHED_ANDESITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.DIORITE_CORNER.get().asItem(), Blocks.DIORITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_DIORITE_CORNER.get().asItem(), Blocks.POLISHED_DIORITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.GRANITE_CORNER.get().asItem(), Blocks.GRANITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_GRANITE_CORNER.get().asItem(), Blocks.POLISHED_GRANITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.TUFF_CORNER.get().asItem(), ESPStairs.TUFF_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.CALCITE_CORNER.get().asItem(), ESPStairs.CALCITE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.DRIPSTONE_CORNER.get().asItem(), ESPStairs.DRIPSTONE_STAIRS.get().asItem(), consumer);

        generateCornerRecipes(ESPCorners.NETHERRACK_CORNER.get().asItem(), ESPStairs.NETHERRACK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.NETHER_BRICK_CORNER.get().asItem(), Blocks.NETHER_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.RED_NETHER_BRICK_CORNER.get().asItem(), Blocks.RED_NETHER_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.BLACKSTONE_CORNER.get().asItem(), Blocks.BLACKSTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_BLACKSTONE_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.END_STONE_CORNER.get().asItem(), ESPStairs.END_STONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.END_STONE_BRICK_CORNER.get().asItem(), Blocks.END_STONE_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.PURPUR_CORNER.get().asItem(), Blocks.PURPUR_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.ACACIA_CORNER.get().asItem(), Blocks.ACACIA_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.BIRCH_CORNER.get().asItem(), Blocks.BIRCH_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.CRIMSON_CORNER.get().asItem(), Blocks.CRIMSON_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.DARK_OAK_CORNER.get().asItem(), Blocks.DARK_OAK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.JUNGLE_CORNER.get().asItem(), Blocks.JUNGLE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.OAK_CORNER.get().asItem(), Blocks.OAK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.SPRUCE_CORNER.get().asItem(), Blocks.SPRUCE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.WARPED_CORNER.get().asItem(), Blocks.WARPED_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.ACACIA_WOOD_CORNER.get().asItem(), ESPStairs.ACACIA_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.BIRCH_WOOD_CORNER.get().asItem(), ESPStairs.BIRCH_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.CRIMSON_HYPHAE_CORNER.get().asItem(), ESPStairs.CRIMSON_HYPHAE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.DARK_OAK_WOOD_CORNER.get().asItem(), ESPStairs.DARK_OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.JUNGLE_WOOD_CORNER.get().asItem(), ESPStairs.JUNGLE_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.OAK_WOOD_CORNER.get().asItem(), ESPStairs.OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.SPRUCE_WOOD_CORNER.get().asItem(), ESPStairs.SPRUCE_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.WARPED_HYPHAE_CORNER.get().asItem(), ESPStairs.WARPED_HYPHAE_STAIRS.get().asItem(), consumer);
    }

    public void generateCornerRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.asItem());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
