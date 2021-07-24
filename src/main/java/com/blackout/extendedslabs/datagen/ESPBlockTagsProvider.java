package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
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
                ESPStairs.END_STONE_STAIRS.get(), ESPStairs.NETHERRACK_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ESPSlabs.DIRT_SLAB.get(), ESPSlabs.GRASS_SLAB.get(),
                ESPSlabs.GRAVEL_SLAB.get(), ESPSlabs.PATH_SLAB.get(), ESPSlabs.PODZOL_SLAB.get(),
                ESPSlabs.RED_SAND_SLAB.get(), ESPSlabs.SAND_SLAB.get(), ESPStairs.DIRT_STAIRS.get());
    }
}