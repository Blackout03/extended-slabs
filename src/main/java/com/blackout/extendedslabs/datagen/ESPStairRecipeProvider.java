package com.blackout.extendedslabs.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPStairs;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;

import java.util.function.Consumer;

public class ESPStairRecipeProvider extends RecipeProvider {

    public ESPStairRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        generateStairRecipes(ESPCorners.STONE_CORNER.get().asItem(), Blocks.STONE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.COBBLESTONE_CORNER.get().asItem(), Blocks.COBBLESTONE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.STONE_BRICK_CORNER.get().asItem(), Blocks.STONE_BRICK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.ANDESITE_CORNER.get().asItem(), Blocks.ANDESITE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.POLISHED_ANDESITE_CORNER.get().asItem(), Blocks.POLISHED_ANDESITE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.DIORITE_CORNER.get().asItem(), Blocks.DIORITE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.POLISHED_DIORITE_CORNER.get().asItem(), Blocks.POLISHED_DIORITE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.GRANITE_CORNER.get().asItem(), Blocks.GRANITE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.POLISHED_GRANITE_CORNER.get().asItem(), Blocks.POLISHED_GRANITE_STAIRS.asItem(), consumer);

        generateStairRecipes(ESPCorners.NETHERRACK_CORNER.get().asItem(), ESPStairs.NETHERRACK_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.NETHER_BRICK_CORNER.get().asItem(), Blocks.NETHER_BRICK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.RED_NETHER_BRICK_CORNER.get().asItem(), Blocks.RED_NETHER_BRICK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.BLACKSTONE_CORNER.get().asItem(), Blocks.BLACKSTONE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.POLISHED_BLACKSTONE_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(), consumer);

        generateStairRecipes(ESPCorners.END_STONE_CORNER.get().asItem(), ESPStairs.END_STONE_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.END_STONE_BRICK_CORNER.get().asItem(), Blocks.END_STONE_BRICK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.PURPUR_CORNER.get().asItem(), Blocks.PURPUR_STAIRS.asItem(), consumer);

        generateStairRecipes(ESPCorners.ACACIA_CORNER.get().asItem(), Blocks.ACACIA_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.BIRCH_CORNER.get().asItem(), Blocks.BIRCH_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.CRIMSON_CORNER.get().asItem(), Blocks.CRIMSON_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.DARK_OAK_CORNER.get().asItem(), Blocks.DARK_OAK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.JUNGLE_CORNER.get().asItem(), Blocks.JUNGLE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.OAK_CORNER.get().asItem(), Blocks.OAK_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.SPRUCE_CORNER.get().asItem(), Blocks.SPRUCE_STAIRS.asItem(), consumer);
        generateStairRecipes(ESPCorners.WARPED_CORNER.get().asItem(), Blocks.WARPED_STAIRS.asItem(), consumer);

        generateStairRecipes(ESPCorners.ACACIA_WOOD_CORNER.get().asItem(), ESPStairs.ACACIA_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.BIRCH_WOOD_CORNER.get().asItem(), ESPStairs.BIRCH_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.CRIMSON_HYPHAE_CORNER.get().asItem(), ESPStairs.CRIMSON_HYPHAE_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.DARK_OAK_WOOD_CORNER.get().asItem(), ESPStairs.DARK_OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.JUNGLE_WOOD_CORNER.get().asItem(), ESPStairs.JUNGLE_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.OAK_WOOD_CORNER.get().asItem(), ESPStairs.OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.SPRUCE_WOOD_CORNER.get().asItem(), ESPStairs.SPRUCE_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(ESPCorners.WARPED_HYPHAE_CORNER.get().asItem(), ESPStairs.WARPED_HYPHAE_STAIRS.get().asItem(), consumer);

        generateStairRecipes(BOPCorners.CHERRY_CORNER.get().asItem(), BOPBlocks.cherry_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.DEAD_CORNER.get().asItem(), BOPBlocks.dead_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.FIR_CORNER.get().asItem(), BOPBlocks.fir_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.HELLBARK_CORNER.get().asItem(), BOPBlocks.hellbark_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.JACARANDA_CORNER.get().asItem(), BOPBlocks.jacaranda_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.MAGIC_CORNER.get().asItem(), BOPBlocks.magic_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.MAHOGANY_CORNER.get().asItem(), BOPBlocks.mahogany_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.PALM_CORNER.get().asItem(), BOPBlocks.palm_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.REDWOOD_CORNER.get().asItem(), BOPBlocks.redwood_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.UMBRAN_CORNER.get().asItem(), BOPBlocks.umbran_stairs.asItem(), consumer);
        generateStairRecipes(BOPCorners.WILLOW_CORNER.get().asItem(), BOPBlocks.willow_stairs.asItem(), consumer);

        generateStairRecipes(BOPCorners.CHERRY_WOOD_CORNER.get().asItem(), BOPStairs.CHERRY_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.DEAD_WOOD_CORNER.get().asItem(), BOPStairs.DEAD_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.FIR_WOOD_CORNER.get().asItem(), BOPStairs.FIR_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.HELLBARK_WOOD_CORNER.get().asItem(), BOPStairs.HELLBARK_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.JACARANDA_WOOD_CORNER.get().asItem(), BOPStairs.JACARANDA_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.MAGIC_WOOD_CORNER.get().asItem(), BOPStairs.MAGIC_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.MAHOGANY_WOOD_CORNER.get().asItem(), BOPStairs.MAHOGANY_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.PALM_WOOD_CORNER.get().asItem(), BOPStairs.PALM_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.REDWOOD_WOOD_CORNER.get().asItem(), BOPStairs.REDWOOD_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.UMBRAN_WOOD_CORNER.get().asItem(), BOPStairs.UMBRAN_WOOD_STAIRS.get().asItem(), consumer);
        generateStairRecipes(BOPCorners.WILLOW_WOOD_CORNER.get().asItem(), BOPStairs.WILLOW_WOOD_STAIRS.get().asItem(), consumer);

        ShapedRecipeBuilder.shaped(ESPStairs.DIRT_STAIRS.get(), 4).define('#', Blocks.DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
        ShapedRecipeBuilder.shaped(ESPStairs.COARSE_DIRT_STAIRS.get(), 4).define('#', Blocks.COARSE_DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_coarse_dirt", has(Blocks.COARSE_DIRT)).save(consumer);

        ShapedRecipeBuilder.shaped(ESPStairs.NETHERRACK_STAIRS.get(), 4).define('#', Blocks.NETHERRACK).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer);

        ShapedRecipeBuilder.shaped(ESPStairs.END_STONE_STAIRS.get(), 4).define('#', Blocks.END_STONE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer);
    }

    public void generateStairRecipes(Item output, Item input, Consumer<IFinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.getRegistryName());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
