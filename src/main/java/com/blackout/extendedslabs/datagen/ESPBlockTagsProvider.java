package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ESPBlockTagsProvider extends BlockTagsProvider {
    public ESPBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ExtendedSlabs.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.WOOL).add(ESPSlabs.WHITE_WOOL_SLAB.get(), ESPSlabs.ORANGE_WOOL_SLAB.get(),
                ESPSlabs.MAGENTA_WOOL_SLAB.get(), ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(),
                ESPSlabs.YELLOW_WOOL_SLAB.get(), ESPSlabs.LIME_WOOL_SLAB.get(),
                ESPSlabs.PINK_WOOL_SLAB.get(), ESPSlabs.GRAY_WOOL_SLAB.get(),
                ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), ESPSlabs.CYAN_WOOL_SLAB.get(),
                ESPSlabs.PURPLE_WOOL_SLAB.get(), ESPSlabs.BLUE_WOOL_SLAB.get(),
                ESPSlabs.BROWN_WOOL_SLAB.get(), ESPSlabs.GREEN_WOOL_SLAB.get(),
                ESPSlabs.RED_WOOL_SLAB.get(), ESPSlabs.BLACK_WOOL_SLAB.get(),
                ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(), ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(), ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(), ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(),
                ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get());
    }
}