package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Item;

import java.util.function.Consumer;

public class ESPSlabRecipeProvider extends RecipeProvider {

    public ESPSlabRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        generateSlabRecipes(ESPVerticalSlabs.GRASS_VERTICAL.get().asItem(), ESPSlabs.GRASS_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.DIRT_VERTICAL.get().asItem(), ESPSlabs.DIRT_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.PODZOL_VERTICAL.get().asItem(), ESPSlabs.PODZOL_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.PATH_VERTICAL.get().asItem(), ESPSlabs.PATH_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.SAND_VERTICAL.get().asItem(), ESPSlabs.SAND_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.RED_SAND_VERTICAL.get().asItem(), ESPSlabs.RED_SAND_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.GRAVEL_VERTICAL.get().asItem(), ESPSlabs.GRAVEL_SLAB.get().asItem(), consumer);

        generateSlabRecipes(ESPVerticalSlabs.STONE_VERTICAL.get().asItem(), Blocks.STONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get().asItem(), Blocks.COBBLESTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.STONE_BRICKS_VERTICAL.get().asItem(), Blocks.STONE_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get().asItem(), Blocks.SMOOTH_STONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get().asItem(), Blocks.MOSSY_COBBLESTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.MOSSY_STONE_BRICKS_VERTICAL.get().asItem(), Blocks.MOSSY_STONE_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.ANDESITE_VERTICAL.get().asItem(), Blocks.ANDESITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get().asItem(), Blocks.POLISHED_ANDESITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.DIORITE_VERTICAL.get().asItem(), Blocks.DIORITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get().asItem(), Blocks.POLISHED_DIORITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.GRANITE_VERTICAL.get().asItem(), Blocks.GRANITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get().asItem(), Blocks.POLISHED_GRANITE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.BRICK_VERTICAL.get().asItem(), Blocks.BRICK_SLAB.asItem(), consumer);

        generateSlabRecipes(ESPVerticalSlabs.SANDSTONE_VERTICAL.get().asItem(), Blocks.SANDSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_SANDSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_SANDSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.RED_SANDSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get().asItem(), Blocks.CUT_RED_SANDSTONE_SLAB.asItem(), consumer);

        generateSlabRecipes(ESPVerticalSlabs.NETHERRACK_VERTICAL.get().asItem(), ESPSlabs.NETHERRACK_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.NETHER_BRICKS_VERTICAL.get().asItem(), Blocks.NETHER_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.RED_NETHER_BRICKS_VERTICAL.get().asItem(), Blocks.RED_NETHER_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get().asItem(), Blocks.BLACKSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICKS_VERTICAL.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.QUARTZ_VERTICAL.get().asItem(), Blocks.QUARTZ_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get().asItem(), Blocks.SMOOTH_QUARTZ_SLAB.asItem(), consumer);

        generateSlabRecipes(ESPVerticalSlabs.END_STONE_VERTICAL.get().asItem(), ESPSlabs.END_STONE_SLAB.get().asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.END_STONE_BRICKS_VERTICAL.get().asItem(), Blocks.END_STONE_BRICK_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.PURPUR_VERTICAL.get().asItem(), Blocks.PURPUR_SLAB.asItem(), consumer);

        generateSlabRecipes(ESPVerticalSlabs.PRISMARINE_VERTICAL.get().asItem(), Blocks.PRISMARINE_SLAB.asItem(), consumer);
        generateSlabRecipes(ESPVerticalSlabs.PRISMARINE_BRICKS_VERTICAL.get().asItem(), Blocks.PRISMARINE_BRICK_SLAB.asItem(), consumer);
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
    }

    public void generateSlabRecipes(Item output, Item input, Consumer<IFinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(input.getRegistryName());

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_item", has(output))
                .save(consumer, input + "_to_" + output);
    }
}
