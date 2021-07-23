package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ModCorners;
import com.blackout.extendedslabs.init.ModSlabs;
import com.blackout.extendedslabs.init.ModStairs;
import com.blackout.extendedslabs.init.ModVerticalSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Collection;

public class ESPItemModelGenerator extends ItemModelProvider {

    public ESPItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtendedSlabs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        generateCornerBlockItems(ModCorners.ITEMS.getEntries());
        generateSlabBlockItems(ModSlabs.ITEMS.getEntries());
        generatStairBlockItems(ModStairs.ITEMS.getEntries());
        generateVerticalSlabBlockItems(ModVerticalSlabs.ITEMS.getEntries());
    }

    @Nonnull
    @Override
    public String getName() {
        return ExtendedSlabs.MODNAME + " Item models";
    }

    private void generateCornerBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/corners/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/corners/" + name));

        }
    }

    private void generateSlabBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/slabs/regular/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/slabs/regular/" + name));

        }
    }

    private void generatStairBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/stairs/regular/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/stairs/regular/" + name));

        }
    }

    private void generateVerticalSlabBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();

            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/slabs/vertical/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;

            ExtendedSlabs.LOGGER.info(item.getId());

            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/slabs/vertical/" + name));

        }
    }
}
