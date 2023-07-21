package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.falling.FallingStairBlock;
import com.blackout.extendedslabs.registry.ESPStairs;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPStairRecipeProvider {
	public static void recipes(@NotNull Consumer<FinishedRecipe> consumer) {
		final Collection<RegistryObject<Block>> blocks = ESPStairs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			if (block.get() instanceof ESPStairBlock stairBlock) {
				generateStairRecipes(stairBlock.asItem(), stairBlock.getMaterial().asItem(), consumer);
				generateStairFromCornerRecipes(stairBlock.asItem(), stairBlock.getMaterialCorner().get().asItem(), consumer);
			} else if (block.get() instanceof FallingStairBlock stairBlock) {
				generateStairRecipes(stairBlock.asItem(), stairBlock.getMaterial().asItem(), consumer);
				generateStairFromCornerRecipes(stairBlock.asItem(), stairBlock.getMaterialCorner().get().asItem(), consumer);
			}
		}}

	public static void generateStairRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(output.asItem()));

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
				.define('#', input)
				.pattern("#  ")
				.pattern("## ")
				.pattern("###")
				.unlockedBy("has_item", has(input))
				.save(consumer);
	}

	public static void generateStairFromCornerRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(output.asItem()) + " from " + ForgeRegistries.ITEMS.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
				.requires(input)
				.unlockedBy("has_item", has(input))
				.save(consumer, ExtendedSlabs.MODID + ":" + output + "_from_" + input);
	}

	protected static InventoryChangeTrigger.TriggerInstance has(ItemLike p_125978_) {
		return inventoryTrigger(ItemPredicate.Builder.item().of(p_125978_).build());
	}

	protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... p_126012_) {
		return new InventoryChangeTrigger.TriggerInstance(EntityPredicate.wrap(EntityPredicate.ANY), MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, p_126012_);
	}
}
