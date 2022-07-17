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
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.orcinus.galosphere.init.GBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ESPCornerRecipeProvider extends RecipeProvider {

    public ESPCornerRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        generateCornerRecipes(ESPCorners.STONE_CORNER.get().asItem(), Blocks.STONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.COBBLESTONE_CORNER.get().asItem(), Blocks.COBBLESTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.STONE_BRICK_CORNER.get().asItem(), Blocks.STONE_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.ANDESITE_CORNER.get().asItem(), Blocks.ANDESITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_ANDESITE_CORNER.get().asItem(), Blocks.POLISHED_ANDESITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.DIORITE_CORNER.get().asItem(), Blocks.DIORITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_DIORITE_CORNER.get().asItem(), Blocks.POLISHED_DIORITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.GRANITE_CORNER.get().asItem(), Blocks.GRANITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_GRANITE_CORNER.get().asItem(), Blocks.POLISHED_GRANITE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.TUFF_CORNER.get().asItem(), ESPStairs.TUFF_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.CALCITE_CORNER.get().asItem(), ESPStairs.CALCITE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.DRIPSTONE_CORNER.get().asItem(), ESPStairs.DRIPSTONE_STAIRS.get().asItem(), consumer);

        generateCornerRecipes(ESPCorners.NETHERRACK_CORNER.get().asItem(), ESPStairs.NETHERRACK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.NETHER_BRICK_CORNER.get().asItem(), Blocks.NETHER_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.RED_NETHER_BRICK_CORNER.get().asItem(), Blocks.RED_NETHER_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.BLACKSTONE_CORNER.get().asItem(), Blocks.BLACKSTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_BLACKSTONE_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get().asItem(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.END_STONE_CORNER.get().asItem(), ESPStairs.END_STONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.END_STONE_BRICK_CORNER.get().asItem(), Blocks.END_STONE_BRICK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.PURPUR_CORNER.get().asItem(), Blocks.PURPUR_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.ACACIA_CORNER.get().asItem(), Blocks.ACACIA_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.BIRCH_CORNER.get().asItem(), Blocks.BIRCH_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.CRIMSON_CORNER.get().asItem(), Blocks.CRIMSON_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.DARK_OAK_CORNER.get().asItem(), Blocks.DARK_OAK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.JUNGLE_CORNER.get().asItem(), Blocks.JUNGLE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.OAK_CORNER.get().asItem(), Blocks.OAK_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.SPRUCE_CORNER.get().asItem(), Blocks.SPRUCE_STAIRS.asItem(), consumer);
        generateCornerRecipes(ESPCorners.WARPED_CORNER.get().asItem(), Blocks.WARPED_STAIRS.asItem(), consumer);

        generateCornerRecipes(ESPCorners.ACACIA_WOOD_CORNER.get().asItem(), ESPStairs.ACACIA_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.BIRCH_WOOD_CORNER.get().asItem(), ESPStairs.BIRCH_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.CRIMSON_HYPHAE_CORNER.get().asItem(), ESPStairs.CRIMSON_HYPHAE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.DARK_OAK_WOOD_CORNER.get().asItem(), ESPStairs.DARK_OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.JUNGLE_WOOD_CORNER.get().asItem(), ESPStairs.JUNGLE_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.OAK_WOOD_CORNER.get().asItem(), ESPStairs.OAK_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.SPRUCE_WOOD_CORNER.get().asItem(), ESPStairs.SPRUCE_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(ESPCorners.WARPED_HYPHAE_CORNER.get().asItem(), ESPStairs.WARPED_HYPHAE_STAIRS.get().asItem(), consumer);

        generateCornerRecipes(WBPCorners.MUD_CORNER.get().asItem(), WBPStairs.MUD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(WBPCorners.PACKED_MUD_CORNER.get().asItem(), WBPStairs.PACKED_MUD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(WBPCorners.MUD_BRICK_CORNER.get().asItem(), WBBlocks.MUD_BRICK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(WBPCorners.MANGROVE_CORNER.get().asItem(), WBBlocks.MANGROVE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(WBPCorners.MANGROVE_WOOD_CORNER.get().asItem(), WBPStairs.MANGROVE_WOOD_STAIRS.get().asItem(), consumer);

        generateCornerRecipes(GaloCorners.AMETHYST_CORNER.get().asItem(), GBlocks.AMETHYST_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.ALLURITE_CORNER.get().asItem(), GBlocks.ALLURITE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.LUMIERE_CORNER.get().asItem(), GBlocks.LUMIERE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.SMOOTH_AMETHYST_CORNER.get().asItem(), GBlocks.SMOOTH_AMETHYST_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.SMOOTH_ALLURITE_CORNER.get().asItem(), GBlocks.SMOOTH_ALLURITE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.SMOOTH_LUMIERE_CORNER.get().asItem(), GBlocks.SMOOTH_LUMIERE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.AMETHYST_BRICK_CORNER.get().asItem(), GBlocks.AMETHYST_BRICK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.ALLURITE_BRICK_CORNER.get().asItem(), GBlocks.ALLURITE_BRICK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(GaloCorners.LUMIERE_BRICK_CORNER.get().asItem(), GBlocks.LUMIERE_BRICK_STAIRS.get().asItem(), consumer);

        generateCornerRecipes(DDCorners.PETRIFIED_CORNER.get().asItem(), DDBlocks.PETRIFIED_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.PETRIFIED_WOOD_CORNER.get().asItem(), DDStairs.PETRIFIED_WOOD_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.SHALE_CORNER.get().asItem(), DDBlocks.SHALE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.POLISHED_SHALE_CORNER.get().asItem(), DDBlocks.POLISHED_SHALE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.SHALE_BRICK_CORNER.get().asItem(), DDBlocks.SHALE_BRICKS_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.ARIDROCK_CORNER.get().asItem(), DDBlocks.ARIDROCK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.POLISHED_ARIDROCK_CORNER.get().asItem(), DDBlocks.POLISHED_ARIDROCK_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.ARIDROCK_BRICK_CORNER.get().asItem(), DDBlocks.ARIDROCK_BRICKS_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.LIMESTONE_CORNER.get().asItem(), DDBlocks.LIMESTONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.POLISHED_LIMESTONE_CORNER.get().asItem(), DDBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.LIMESTONE_BRICK_CORNER.get().asItem(), DDBlocks.LIMESTONE_BRICKS_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.GRIMESTONE_CORNER.get().asItem(), DDBlocks.GRIMESTONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.POLISHED_GRIMESTONE_CORNER.get().asItem(), DDBlocks.POLISHED_GRIMESTONE_STAIRS.get().asItem(), consumer);
        generateCornerRecipes(DDCorners.GRIMESTONE_BRICK_CORNER.get().asItem(), DDBlocks.GRIMESTONE_BRICKS_STAIRS.get().asItem(), consumer);
    }

    public void generateCornerRecipes(Item output, Item input, Consumer<FinishedRecipe> consumer) {
        ExtendedSlabs.LOGGER.info(ForgeRegistries.ITEMS.getKey(output.asItem()));

        ShapelessRecipeBuilder.shapeless(output)
                .requires(input)
                .unlockedBy("has_stair", has(input))
                .save(consumer, ExtendedSlabs.MODID + ":" + input + "_to_" + output);
    }
}
