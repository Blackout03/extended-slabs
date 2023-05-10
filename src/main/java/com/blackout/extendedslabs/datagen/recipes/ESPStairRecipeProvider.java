package com.blackout.extendedslabs.datagen.recipes;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPStairs;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Consumer;

public class ESPStairRecipeProvider {
	public static void recipes(@NotNull Consumer<FinishedRecipe> consumer) {
		final Collection<RegistryObject<Block>> blocks = ESPCorners.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			if (block.get() instanceof CornerBlock cornerBlock) {
				generateStairRecipes(cornerBlock.asItem(), cornerBlock.getMaterialStair().asItem(), consumer);
			}
		}

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.DIRT_STAIRS.get(), 4).define('#', Blocks.DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.COARSE_DIRT_STAIRS.get(), 4).define('#', Blocks.COARSE_DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_coarse_dirt", has(Blocks.COARSE_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.ROOTED_DIRT_STAIRS.get(), 4).define('#', Blocks.ROOTED_DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_rooted_dirt", has(Blocks.ROOTED_DIRT)).save(consumer);

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.TUFF_STAIRS.get(), 4).define('#', Blocks.TUFF).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_tuff", has(Blocks.TUFF)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.CALCITE_STAIRS.get(), 4).define('#', Blocks.CALCITE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.DRIPSTONE_STAIRS.get(), 4).define('#', Blocks.DRIPSTONE_BLOCK).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.MUD_STAIRS.get(), 4).define('#', Blocks.MUD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_mud", has(Blocks.MUD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.PACKED_MUD_STAIRS.get(), 4).define('#', Blocks.PACKED_MUD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_packed_mud", has(Blocks.PACKED_MUD)).save(consumer);

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.ACACIA_WOOD_STAIRS.get(), 4).define('#', Blocks.ACACIA_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.BIRCH_WOOD_STAIRS.get(), 4).define('#', Blocks.BIRCH_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.CRIMSON_HYPHAE_STAIRS.get(), 4).define('#', Blocks.CRIMSON_HYPHAE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.DARK_OAK_WOOD_STAIRS.get(), 4).define('#', Blocks.DARK_OAK_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.JUNGLE_WOOD_STAIRS.get(), 4).define('#', Blocks.JUNGLE_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.MANGROVE_WOOD_STAIRS.get(), 4).define('#', Blocks.MANGROVE_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_mangrove_wood", has(Blocks.MANGROVE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.OAK_WOOD_STAIRS.get(), 4).define('#', Blocks.OAK_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.SPRUCE_WOOD_STAIRS.get(), 4).define('#', Blocks.SPRUCE_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.WARPED_HYPHAE_STAIRS.get(), 4).define('#', Blocks.WARPED_HYPHAE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.NETHERRACK_STAIRS.get(), 4).define('#', Blocks.NETHERRACK).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer);

		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ESPStairs.END_STONE_STAIRS.get(), 4).define('#', Blocks.END_STONE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer);
	}

	public static void generateStairRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
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
