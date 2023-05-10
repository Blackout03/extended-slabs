package com.blackout.extendedslabs.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ESPRecipeProvider extends RecipeProvider {
	public ESPRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	public void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		ESPCornerRecipeProvider.recipes(consumer);
		ESPSlabRecipeProvider.recipes(consumer);
		ESPStairRecipeProvider.recipes(consumer);
		ESPVerticalSlabRecipeProvider.recipes(consumer);
	}
}
