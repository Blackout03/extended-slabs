package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPRecipeProvider extends RecipeProvider {

    public ESPRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        generateCornerRecipes(ESPCorners.ITEMS.getEntries(), consumer);
    }

    public void generateCornerRecipes(final Collection<RegistryObject<Item>> itemBlocks, Consumer<FinishedRecipe> consumer) {
        for (RegistryObject<Item> item : itemBlocks) {

            ExtendedSlabs.LOGGER.info(item.getId());

            ItemLike input = item.get();
            ItemLike output = item.get();
            ShapelessRecipeBuilder.shapeless(output)
                    .requires(input)
                    .unlockedBy("has_item", has(output))
                    .save(consumer);
        }
    }
}
