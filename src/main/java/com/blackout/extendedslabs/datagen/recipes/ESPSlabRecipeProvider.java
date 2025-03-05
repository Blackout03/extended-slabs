package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.registry.ESPSlabs;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public abstract class ESPSlabRecipeProvider extends RecipeProvider {
	public ESPSlabRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, provider);
	}

	public static void recipes(RecipeOutput consumer) {
		final Collection<DeferredHolder<Block, ? extends Block>> blocks = ESPSlabs.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : blocks) {
			if (block.get() instanceof ESPSlabBlock slabBlock) {
				generateSlabRecipes(slabBlock.asItem(), slabBlock.getMaterial().asItem(), consumer);
				generateSlabFromVerticalSlabRecipes(slabBlock.asItem(), slabBlock.getMaterialVerticalSlab().asItem(), consumer);
			}
			if (block.get() instanceof FallingSlabBlock slabBlock) {
				generateSlabRecipes(slabBlock.asItem(), slabBlock.getMaterial().asItem(), consumer);
				generateSlabFromVerticalSlabRecipes(slabBlock.asItem(), slabBlock.getMaterialVerticalSlab().asItem(), consumer);
			}
		}

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.NETHERRACK_SLAB.get(), 2).unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":netherrack_slab_from_netherrack_stonecutting");
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS, ESPSlabs.END_STONE_SLAB.get(), 2).unlockedBy("has_end_stone", has(Blocks.NETHERRACK)).save(consumer,  ExtendedSlabs.MODID + ":end_stone_slab_from_end_stone_stonecutting");
	}

	public static void generateSlabRecipes(Item output, Item input, RecipeOutput consumer) {
		ExtendedSlabs.LOGGER.info(BuiltInRegistries.ITEM.getKey(output.asItem()));

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
				.define('#', input)
				.pattern("###")
				.unlockedBy("has_item", has(input))
				.save(consumer);
	}

	public static void generateSlabFromVerticalSlabRecipes(Item output, Item input, RecipeOutput consumer) {
		ExtendedSlabs.LOGGER.info(BuiltInRegistries.ITEM.getKey(output.asItem()) + " from " + BuiltInRegistries.ITEM.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
				.requires(input)
				.unlockedBy("has_item", has(input))
				.save(consumer, ExtendedSlabs.MODID + ":" + stripPrefix(output) + "_from_" + stripPrefix(input));
	}

	public static String stripPrefix(Item input) {
		return input.toString().replaceAll(ExtendedSlabs.MODID + ":", "").replaceAll("minecraft:", "");
	}
}
