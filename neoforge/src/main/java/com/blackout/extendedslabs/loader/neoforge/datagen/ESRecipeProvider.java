package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class ESRecipeProvider extends RecipeProvider {
	public ESRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			ItemLike result = definition.item().get();
			ItemLike ingredient = definition.originalBlock().asItem() == Items.AIR ? Items.STONE : definition.originalBlock().asItem();

			if (definition.type() == ESBlockDefinitions.BlockType.SLAB) {
				ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6).define('#', ingredient).pattern("###").unlockedBy("has_ingredient", has(ingredient)).save(recipeOutput);
			} else if (definition.type() == ESBlockDefinitions.BlockType.VERTICAL_SLAB) {
				ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6).define('#', ingredient).pattern("#").pattern("#").pattern("#").unlockedBy("has_ingredient", has(ingredient)).save(recipeOutput);
				if (definition.slabVariant() != null) {
					ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result).requires(definition.slabVariant().get()).unlockedBy("has_slab", has(definition.slabVariant().get())).save(recipeOutput, ExtendedSlabs.MODID + ":" + definition.id() + "_from_" + definition.slabVariant().id());
				}
			} else if (definition.type() == ESBlockDefinitions.BlockType.STAIRS) {
				ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4).define('#', ingredient).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_ingredient", has(ingredient)).save(recipeOutput);
			} else if (definition.type() == ESBlockDefinitions.BlockType.CORNER) {
				if (definition.stairVariant() != null) {
					ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result).requires(definition.stairVariant().get()).unlockedBy("has_stairs", has(definition.stairVariant().get())).save(recipeOutput);
				}
			} else if (definition.type() == ESBlockDefinitions.BlockType.WALL) {
				ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 6).define('#', ingredient).pattern("###").pattern("###").unlockedBy("has_ingredient", has(ingredient)).save(recipeOutput);
			} else if (definition.type() == ESBlockDefinitions.BlockType.BUTTON) {
				ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result).define('#', ingredient).pattern("#").unlockedBy("has_ingredient", has(ingredient)).save(recipeOutput);
			}
		}
	}
}
