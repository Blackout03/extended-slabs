package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.falling.FallingCornerBlock;
import com.blackout.extendedslabs.registry.ESPCorners;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public abstract class ESPCornerRecipeProvider extends RecipeProvider {
	public ESPCornerRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, provider);
	}

	public static void recipes(RecipeOutput consumer) {
		final Collection<DeferredHolder<Block, ? extends Block>> blocks = ESPCorners.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : blocks) {
			if (block.get() instanceof ESPCornerBlock cornerBlock) {
				generateCornerFromStairRecipes(cornerBlock.asItem(), cornerBlock.getMaterialStair().asItem(), consumer);
			} else if (block.get() instanceof FallingCornerBlock cornerBlock) {
				generateCornerFromStairRecipes(cornerBlock.asItem(), cornerBlock.getMaterialStair().asItem(), consumer);
			}
		}
	}

	public static void generateCornerFromStairRecipes(Item output, Item input, RecipeOutput consumer) {
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
