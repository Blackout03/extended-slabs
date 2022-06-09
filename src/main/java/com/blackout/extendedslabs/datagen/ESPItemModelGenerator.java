package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import com.blackout.extendedslabs.init.modded.BOPStairs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Collection;

public class ESPItemModelGenerator extends ItemModelProvider {
    public ESPItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtendedSlabs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        generateSlabBlockItems(ESPSlabs.ITEMS.getEntries());
        generateSlabBlockItems(BOPSlabs.ITEMS.getEntries());
        generateStairBlockItems(ESPStairs.ITEMS.getEntries());
        generateStairBlockItems(BOPStairs.ITEMS.getEntries());
        generateCornerBlockItems(ESPCorners.ITEMS.getEntries());
        generateCornerBlockItems(BOPCorners.ITEMS.getEntries());
        generateVerticalSlabBlockItems(ESPVerticalSlabs.ITEMS.getEntries());
        generateVerticalSlabBlockItems(BOPVerticalSlabs.ITEMS.getEntries());
    }

    @Nonnull
    @Override
    public String getName() {
        return ExtendedSlabs.MODNAME + " Item models";
    }

    private void generateSlabBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
        }
    }

    private void generateStairBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
        }
    }

    private void generateCornerBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
        }
    }

    private void generateVerticalSlabBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
        }
    }
}
