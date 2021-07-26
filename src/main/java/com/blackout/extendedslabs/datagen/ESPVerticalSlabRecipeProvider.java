package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Consumer;

public class ESPVerticalSlabRecipeProvider extends RecipeProvider {

    public ESPVerticalSlabRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRASS_VERTICAL.get().asItem(), ESPSlabs.GRASS_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DIRT_VERTICAL.get().asItem(), ESPSlabs.DIRT_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PODZOL_VERTICAL.get().asItem(), ESPSlabs.PODZOL_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PATH_VERTICAL.get().asItem(), ESPSlabs.PATH_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SAND_VERTICAL.get().asItem(), ESPSlabs.SAND_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_SAND_VERTICAL.get().asItem(), ESPSlabs.RED_SAND_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRAVEL_VERTICAL.get().asItem(), ESPSlabs.GRAVEL_SLAB.get().asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.STONE_VERTICAL.get().asItem(), Blocks.STONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get().asItem(), Blocks.COBBLESTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.STONE_BRICKS_VERTICAL.get().asItem(), Blocks.STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get().asItem(), Blocks.SMOOTH_STONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get().asItem(), Blocks.MOSSY_COBBLESTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.MOSSY_STONE_BRICKS_VERTICAL.get().asItem(), Blocks.MOSSY_STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.ANDESITE_VERTICAL.get().asItem(), Blocks.ANDESITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get().asItem(), Blocks.POLISHED_ANDESITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DIORITE_VERTICAL.get().asItem(), Blocks.DIORITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get().asItem(), Blocks.POLISHED_DIORITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.GRANITE_VERTICAL.get().asItem(), Blocks.GRANITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get().asItem(), Blocks.POLISHED_GRANITE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BRICK_VERTICAL.get().asItem(), Blocks.BRICK_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.SANDSTONE_VERTICAL.get().asItem(), Blocks.SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.RED_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_RED_SANDSTONE_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get().asItem(), Blocks.COBBLED_DEEPSLATE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get().asItem(), Blocks.POLISHED_DEEPSLATE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get().asItem(), Blocks.DEEPSLATE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get().asItem(), Blocks.DEEPSLATE_TILE_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.NETHERRACK_VERTICAL.get().asItem(), ESPSlabs.NETHERRACK_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.NETHER_BRICKS_VERTICAL.get().asItem(), Blocks.NETHER_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.RED_NETHER_BRICKS_VERTICAL.get().asItem(), Blocks.RED_NETHER_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get().asItem(), Blocks.BLACKSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICKS_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.QUARTZ_VERTICAL.get().asItem(), Blocks.QUARTZ_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get().asItem(), Blocks.SMOOTH_QUARTZ_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.END_STONE_VERTICAL.get().asItem(), ESPSlabs.END_STONE_SLAB.get().asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.END_STONE_BRICKS_VERTICAL.get().asItem(), Blocks.END_STONE_BRICK_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PURPUR_VERTICAL.get().asItem(), Blocks.PURPUR_SLAB.asItem(), consumer);

        generateVerticalSlabRecipes(ESPVerticalSlabs.PRISMARINE_VERTICAL.get().asItem(), Blocks.PRISMARINE_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.PRISMARINE_BRICKS_VERTICAL.get().asItem(), Blocks.PRISMARINE_BRICK_SLAB.asItem(), consumer);
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

        generateVerticalSlabRecipes(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.OXIDIZED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WEATHERED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.EXPOSED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get().asItem(), Blocks.CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), consumer);
        generateVerticalSlabRecipes(ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get().asItem(), Blocks.WAXED_CUT_COPPER_SLAB.asItem(), consumer);
    }

    public void generateVerticalSlabRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.getRegistryName());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
