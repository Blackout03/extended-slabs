package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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
			ItemLike ingredient = definition.source().asItem() == Items.AIR ? Items.STONE : definition.source().asItem();

			if (definition.type() == ESBlockDefinitions.BlockType.SLAB) {
				ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
						.define('#', ingredient)
						.pattern("###")
						.unlockedBy("has_ingredient", has(ingredient))
						.save(recipeOutput);
			} else {
				ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
						.define('#', ingredient)
						.pattern("#  ")
						.pattern("## ")
						.pattern("###")
						.unlockedBy("has_ingredient", has(ingredient))
						.save(recipeOutput);
			}
		}
	}
}
