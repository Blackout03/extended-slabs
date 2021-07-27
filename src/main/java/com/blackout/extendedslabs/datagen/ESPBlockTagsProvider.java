package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ESPBlockTagsProvider extends BlockTagsProvider {
    public ESPBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ExtendedSlabs.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ESPSlabs.END_STONE_SLAB.get(), ESPSlabs.NETHERRACK_SLAB.get(),
                ESPStairs.END_STONE_STAIRS.get(), ESPStairs.NETHERRACK_STAIRS.get(),
                ESPVerticalSlabs.ANDESITE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(),
                ESPVerticalSlabs.DIORITE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(),
                ESPVerticalSlabs.GRANITE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(),
                ESPVerticalSlabs.BLACKSTONE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get(),
                ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICKS_VERTICAL.get(), ESPVerticalSlabs.COBBLESTONE_VERTICAL.get(),
                ESPVerticalSlabs.BRICK_VERTICAL.get(), ESPVerticalSlabs.SANDSTONE_VERTICAL.get(),
                ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get(),
                ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(),
                ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get(), ESPVerticalSlabs.STONE_VERTICAL.get(),
                ESPVerticalSlabs.STONE_BRICKS_VERTICAL.get(), ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get(),
                ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get(), ESPVerticalSlabs.MOSSY_STONE_BRICKS_VERTICAL.get(),
                ESPVerticalSlabs.END_STONE_BRICKS_VERTICAL.get(), ESPVerticalSlabs.END_STONE_VERTICAL.get(),
                ESPVerticalSlabs.PRISMARINE_VERTICAL.get(), ESPVerticalSlabs.PRISMARINE_BRICKS_VERTICAL.get(),
                ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get(), ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get(),
                ESPVerticalSlabs.QUARTZ_VERTICAL.get(), ESPVerticalSlabs.PURPUR_VERTICAL.get(),
                ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get(), ESPVerticalSlabs.NETHERRACK_VERTICAL.get(),
                ESPVerticalSlabs.NETHER_BRICKS_VERTICAL.get(), ESPVerticalSlabs.RED_NETHER_BRICKS_VERTICAL.get(),
                ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(),
                ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(),
                ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get(),
                ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get(),
                ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get(), ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get(),
                ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get(), ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get(),
                ESPCorners.ANDESITE_CORNER.get(), ESPCorners.POLISHED_ANDESITE_CORNER.get(),
                ESPCorners.DIORITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
                ESPCorners.GRANITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
                ESPCorners.STONE_CORNER.get(), ESPCorners.COBBLESTONE_CORNER.get(),
                ESPCorners.STONE_BRICKS_CORNER.get(), ESPCorners.BLACKSTONE_CORNER.get(),
                ESPCorners.POLISHED_BLACKSTONE_CORNER.get(), ESPCorners.POLISHED_BLACKSTONE_BRICKS_CORNER.get(),
                ESPCorners.NETHERRACK_CORNER.get(), ESPCorners.NETHER_BRICKS_CORNER.get(),
                ESPCorners.RED_NETHER_BRICKS_CORNER.get(), ESPCorners.END_STONE_CORNER.get(),
                ESPCorners.END_STONE_BRICKS_CORNER.get(), ESPCorners.PURPUR_CORNER.get());
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ESPSlabs.DIRT_SLAB.get(), ESPSlabs.GRASS_SLAB.get(),
                ESPSlabs.GRAVEL_SLAB.get(), ESPSlabs.PATH_SLAB.get(),
                ESPSlabs.PODZOL_SLAB.get(), ESPSlabs.RED_SAND_SLAB.get(),
                ESPSlabs.SAND_SLAB.get(), ESPStairs.DIRT_STAIRS.get(),
                ESPVerticalSlabs.DIRT_VERTICAL.get(), ESPVerticalSlabs.GRASS_VERTICAL.get(),
                ESPVerticalSlabs.GRAVEL_VERTICAL.get(), ESPVerticalSlabs.PATH_VERTICAL.get(),
                ESPVerticalSlabs.PODZOL_VERTICAL.get(), ESPVerticalSlabs.SAND_VERTICAL.get(),
                ESPVerticalSlabs.RED_SAND_VERTICAL.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(ESPVerticalSlabs.OAK_VERTICAL.get(), ESPVerticalSlabs.BIRCH_VERTICAL.get(),
                ESPVerticalSlabs.SPRUCE_VERTICAL.get(), ESPVerticalSlabs.JUNGLE_VERTICAL.get(),
                ESPVerticalSlabs.DARK_OAK_VERTICAL.get(), ESPVerticalSlabs.ACACIA_VERTICAL.get(),
                ESPVerticalSlabs.CRIMSON_VERTICAL.get(), ESPVerticalSlabs.WARPED_VERTICAL.get(),
                ESPCorners.OAK_CORNER.get(), ESPCorners.BIRCH_CORNER.get(),
                ESPCorners.SPRUCE_CORNER.get(), ESPCorners.JUNGLE_CORNER.get(),
                ESPCorners.DARK_OAK_CORNER.get(), ESPCorners.ACACIA_CORNER.get(),
                ESPCorners.CRIMSON_CORNER.get(), ESPCorners.WARPED_CORNER.get());
    }
}