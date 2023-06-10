package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.init.ESPSlabifiedBlocks;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPSlabRecipeProvider {
	public static void recipes(@NotNull Consumer<FinishedRecipe> consumer) {
		final Collection<RegistryObject<Block>> blocks = ESPSlabs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			if (block.get() instanceof ESPSlabBlock slabBlock) {
				generateSlabRecipes(slabBlock.asItem(), slabBlock.getMaterial().asItem(), consumer);
				generateSlabFromVerticalSlabRecipes(slabBlock.asItem(), slabBlock.getMaterialVerticalSlab().get().asItem(), consumer);
			}
			if (block.get() instanceof FallingSlabBlock slabBlock) {
				generateSlabRecipes(slabBlock.asItem(), slabBlock.getMaterial().asItem(), consumer);
				generateSlabFromVerticalSlabRecipes(slabBlock.asItem(), slabBlock.getMaterialVerticalSlab().get().asItem(), consumer);
			}
		}

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.NETHERRACK_SLAB.get(), 2).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":netherrack_slab_from_netherrack_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.END_STONE_SLAB.get(), 2).unlockedBy("has_end_stone", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_slab_from_end_stone_stonecutting");
	}

	public static void generateSlabRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(output.asItem()));

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
				.define('#', input)
				.pattern("###")
				.unlockedBy("has_item", has(input))
				.save(consumer);
	}

	public static void generateSlabFromVerticalSlabRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
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
