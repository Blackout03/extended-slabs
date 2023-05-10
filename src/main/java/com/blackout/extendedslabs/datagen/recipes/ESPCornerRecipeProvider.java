package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import com.blackout.extendedslabs.init.ESPCorners;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPCornerRecipeProvider {
	public static void recipes(@NotNull Consumer<FinishedRecipe> consumer) {
		final Collection<RegistryObject<Block>> blocks = ESPCorners.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			if (block.get() instanceof CornerBlock cornerBlock) {
				generateCornerRecipes(cornerBlock.asItem(), cornerBlock.getMaterialStair().asItem(), consumer);
			}
		}
	}

	public static void generateCornerRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
				.requires(input)
				.unlockedBy("has_item", has(output))
				.save(consumer, ExtendedSlabs.MODID + ":" + input + "_to_" + output);
	}

	protected static InventoryChangeTrigger.TriggerInstance has(ItemLike p_125978_) {
		return inventoryTrigger(ItemPredicate.Builder.item().of(p_125978_).build());
	}

	protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... p_126012_) {
		return new InventoryChangeTrigger.TriggerInstance(EntityPredicate.Composite.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, p_126012_);
	}
}
