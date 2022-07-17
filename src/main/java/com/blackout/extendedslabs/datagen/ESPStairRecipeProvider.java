package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDCorners;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDStairs;
import com.blackout.extendedslabs.init.modded.galosphere.GaloCorners;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPCorners;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPStairs;
import com.cursedcauldron.wildbackport.init.WBBlocks;
import com.naterbobber.darkerdepths.init.DDBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.orcinus.galosphere.init.GBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ESPStairRecipeProvider extends RecipeProvider {

	public ESPStairRecipeProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	public void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		generateStairRecipes(ESPCorners.STONE_CORNER.get().asItem(), Blocks.STONE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.COBBLESTONE_CORNER.get().asItem(), Blocks.COBBLESTONE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.STONE_BRICK_CORNER.get().asItem(), Blocks.STONE_BRICK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.ANDESITE_CORNER.get().asItem(), Blocks.ANDESITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.POLISHED_ANDESITE_CORNER.get().asItem(), Blocks.POLISHED_ANDESITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.DIORITE_CORNER.get().asItem(), Blocks.DIORITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.POLISHED_DIORITE_CORNER.get().asItem(), Blocks.POLISHED_DIORITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.GRANITE_CORNER.get().asItem(), Blocks.GRANITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.POLISHED_GRANITE_CORNER.get().asItem(), Blocks.POLISHED_GRANITE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.TUFF_CORNER.get().asItem(), ESPStairs.TUFF_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.CALCITE_CORNER.get().asItem(), ESPStairs.CALCITE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.DRIPSTONE_CORNER.get().asItem(), ESPStairs.DRIPSTONE_STAIRS.get().asItem(), consumer);

		generateStairRecipes(ESPCorners.NETHERRACK_CORNER.get().asItem(), ESPStairs.NETHERRACK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.NETHER_BRICK_CORNER.get().asItem(), Blocks.NETHER_BRICK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.RED_NETHER_BRICK_CORNER.get().asItem(), Blocks.RED_NETHER_BRICK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.BLACKSTONE_CORNER.get().asItem(), Blocks.BLACKSTONE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.POLISHED_BLACKSTONE_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(), consumer);

		generateStairRecipes(ESPCorners.END_STONE_CORNER.get().asItem(), ESPStairs.END_STONE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.END_STONE_BRICK_CORNER.get().asItem(), Blocks.END_STONE_BRICK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.PURPUR_CORNER.get().asItem(), Blocks.PURPUR_STAIRS.asItem(), consumer);

		generateStairRecipes(ESPCorners.ACACIA_CORNER.get().asItem(), Blocks.ACACIA_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.BIRCH_CORNER.get().asItem(), Blocks.BIRCH_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.CRIMSON_CORNER.get().asItem(), Blocks.CRIMSON_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.DARK_OAK_CORNER.get().asItem(), Blocks.DARK_OAK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.JUNGLE_CORNER.get().asItem(), Blocks.JUNGLE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.OAK_CORNER.get().asItem(), Blocks.OAK_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.SPRUCE_CORNER.get().asItem(), Blocks.SPRUCE_STAIRS.asItem(), consumer);
		generateStairRecipes(ESPCorners.WARPED_CORNER.get().asItem(), Blocks.WARPED_STAIRS.asItem(), consumer);

		generateStairRecipes(ESPCorners.ACACIA_WOOD_CORNER.get().asItem(), ESPStairs.ACACIA_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.BIRCH_WOOD_CORNER.get().asItem(), ESPStairs.BIRCH_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.CRIMSON_HYPHAE_CORNER.get().asItem(), ESPStairs.CRIMSON_HYPHAE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.DARK_OAK_WOOD_CORNER.get().asItem(), ESPStairs.DARK_OAK_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.JUNGLE_WOOD_CORNER.get().asItem(), ESPStairs.JUNGLE_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.OAK_WOOD_CORNER.get().asItem(), ESPStairs.OAK_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.SPRUCE_WOOD_CORNER.get().asItem(), ESPStairs.SPRUCE_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(ESPCorners.WARPED_HYPHAE_CORNER.get().asItem(), ESPStairs.WARPED_HYPHAE_STAIRS.get().asItem(), consumer);

		ShapedRecipeBuilder.shaped(ESPStairs.DIRT_STAIRS.get(), 4).define('#', Blocks.DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dirt", has(Blocks.DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.COARSE_DIRT_STAIRS.get(), 4).define('#', Blocks.COARSE_DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_coarse_dirt", has(Blocks.COARSE_DIRT)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.ROOTED_DIRT_STAIRS.get(), 4).define('#', Blocks.ROOTED_DIRT).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_rooted_dirt", has(Blocks.ROOTED_DIRT)).save(consumer);

		ShapedRecipeBuilder.shaped(ESPStairs.TUFF_STAIRS.get(), 4).define('#', Blocks.TUFF).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_tuff", has(Blocks.TUFF)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.CALCITE_STAIRS.get(), 4).define('#', Blocks.CALCITE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.DRIPSTONE_STAIRS.get(), 4).define('#', Blocks.DRIPSTONE_BLOCK).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK)).save(consumer);

		ShapedRecipeBuilder.shaped(ESPStairs.ACACIA_WOOD_STAIRS.get(), 4).define('#', Blocks.ACACIA_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.BIRCH_WOOD_STAIRS.get(), 4).define('#', Blocks.BIRCH_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.CRIMSON_HYPHAE_STAIRS.get(), 4).define('#', Blocks.CRIMSON_HYPHAE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.DARK_OAK_WOOD_STAIRS.get(), 4).define('#', Blocks.DARK_OAK_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.JUNGLE_WOOD_STAIRS.get(), 4).define('#', Blocks.JUNGLE_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.OAK_WOOD_STAIRS.get(), 4).define('#', Blocks.OAK_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.SPRUCE_WOOD_STAIRS.get(), 4).define('#', Blocks.SPRUCE_WOOD).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
		ShapedRecipeBuilder.shaped(ESPStairs.WARPED_HYPHAE_STAIRS.get(), 4).define('#', Blocks.WARPED_HYPHAE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);

		ShapedRecipeBuilder.shaped(ESPStairs.NETHERRACK_STAIRS.get(), 4).define('#', Blocks.NETHERRACK).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_netherrack", has(Blocks.NETHERRACK)).save(consumer);

		ShapedRecipeBuilder.shaped(ESPStairs.END_STONE_STAIRS.get(), 4).define('#', Blocks.END_STONE).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(consumer);

		generateStairRecipes(WBPCorners.MUD_CORNER.get().asItem(), WBPStairs.MUD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(WBPCorners.PACKED_MUD_CORNER.get().asItem(), WBPStairs.PACKED_MUD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(WBPCorners.MUD_BRICK_CORNER.get().asItem(), WBBlocks.MUD_BRICK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(WBPCorners.MANGROVE_CORNER.get().asItem(), WBBlocks.MANGROVE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(WBPCorners.MANGROVE_WOOD_CORNER.get().asItem(), WBPStairs.MANGROVE_WOOD_STAIRS.get().asItem(), consumer);

		ShapedRecipeBuilder.shaped(WBPStairs.MUD_STAIRS.get(), 4).define('#', WBBlocks.MUD.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_mud", has(WBBlocks.MUD.get())).save(consumer);
		ShapedRecipeBuilder.shaped(WBPStairs.PACKED_MUD_STAIRS.get(), 4).define('#', WBBlocks.PACKED_MUD.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_packed_mud", has(WBBlocks.PACKED_MUD.get())).save(consumer);
		ShapedRecipeBuilder.shaped(WBPStairs.MANGROVE_WOOD_STAIRS.get(), 4).define('#', WBBlocks.MANGROVE_WOOD.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_mangrove_wood", has(WBBlocks.MANGROVE_WOOD.get())).save(consumer);

		generateStairRecipes(GaloCorners.AMETHYST_CORNER.get().asItem(), GBlocks.AMETHYST_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.ALLURITE_CORNER.get().asItem(), GBlocks.ALLURITE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.LUMIERE_CORNER.get().asItem(), GBlocks.LUMIERE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.SMOOTH_AMETHYST_CORNER.get().asItem(), GBlocks.SMOOTH_AMETHYST_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.SMOOTH_ALLURITE_CORNER.get().asItem(), GBlocks.SMOOTH_ALLURITE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.SMOOTH_LUMIERE_CORNER.get().asItem(), GBlocks.SMOOTH_LUMIERE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.AMETHYST_BRICK_CORNER.get().asItem(), GBlocks.AMETHYST_BRICK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.ALLURITE_BRICK_CORNER.get().asItem(), GBlocks.ALLURITE_BRICK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(GaloCorners.LUMIERE_BRICK_CORNER.get().asItem(), GBlocks.LUMIERE_BRICK_STAIRS.get().asItem(), consumer);

		generateStairRecipes(DDCorners.PETRIFIED_CORNER.get().asItem(), DDBlocks.PETRIFIED_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.PETRIFIED_WOOD_CORNER.get().asItem(), DDStairs.PETRIFIED_WOOD_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.SHALE_CORNER.get().asItem(), DDBlocks.SHALE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.POLISHED_SHALE_CORNER.get().asItem(), DDBlocks.POLISHED_SHALE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.SHALE_BRICK_CORNER.get().asItem(), DDBlocks.SHALE_BRICKS_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.ARIDROCK_CORNER.get().asItem(), DDBlocks.ARIDROCK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.POLISHED_ARIDROCK_CORNER.get().asItem(), DDBlocks.POLISHED_ARIDROCK_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.ARIDROCK_BRICK_CORNER.get().asItem(), DDBlocks.ARIDROCK_BRICKS_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.LIMESTONE_CORNER.get().asItem(), DDBlocks.LIMESTONE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.POLISHED_LIMESTONE_CORNER.get().asItem(), DDBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.LIMESTONE_BRICK_CORNER.get().asItem(), DDBlocks.LIMESTONE_BRICKS_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.GRIMESTONE_CORNER.get().asItem(), DDBlocks.GRIMESTONE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.POLISHED_GRIMESTONE_CORNER.get().asItem(), DDBlocks.POLISHED_GRIMESTONE_STAIRS.get().asItem(), consumer);
		generateStairRecipes(DDCorners.GRIMESTONE_BRICK_CORNER.get().asItem(), DDBlocks.GRIMESTONE_BRICKS_STAIRS.get().asItem(), consumer);

		ShapedRecipeBuilder.shaped(DDStairs.PETRIFIED_WOOD_STAIRS.get(), 4).define('#', DDBlocks.PETRIFIED_WOOD.get()).pattern("#  ").pattern("## ").pattern("###").unlockedBy("has_petrified_wood", has(DDBlocks.PETRIFIED_WOOD.get())).save(consumer);
	}

	public void generateStairRecipes(Item input, Item output, Consumer<FinishedRecipe> consumer) {
		ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(input.asItem()));

		ShapelessRecipeBuilder.shapeless(output)
				.requires(input)
				.unlockedBy("has_corner", has(input))
				.save(consumer, ExtendedSlabs.MODID + ":" + input + "_to_" + output);
	}
}
