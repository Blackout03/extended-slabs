package com.blackout.extendedslabs.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class ESPRecipeProvider extends RecipeProvider {
	public ESPRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, provider);
	}

	@Override
	protected void buildRecipes(RecipeOutput output) {
		ESPCornerRecipeProvider.recipes(output);
		ESPSlabRecipeProvider.recipes(output);
		ESPStairRecipeProvider.recipes(output);
		ESPVerticalSlabRecipeProvider.recipes(output);
	}
}
