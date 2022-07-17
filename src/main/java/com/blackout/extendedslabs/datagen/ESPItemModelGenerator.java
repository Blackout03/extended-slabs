package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Collection;

public class ESPItemModelGenerator extends ItemModelProvider {

    public ESPItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtendedSlabs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        generateBlockItems(ESPSlabs.ITEMS.getEntries());
        generateBlockItems(ESPStairs.ITEMS.getEntries());
        generateBlockItems(ESPCorners.ITEMS.getEntries());
        generateBlockItems(ESPVerticalSlabs.ITEMS.getEntries());
    }

    @Nonnull
    @Override
    public String getName() {
        return ExtendedSlabs.MODNAME + " Item models";
    }

    private void generateBlockItems(final Collection<RegistryObject<Item>> itemBlocks) {
        for (RegistryObject<Item> item : itemBlocks) {
            String name = item.getId().getPath();
            if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
                continue;
            ExtendedSlabs.LOGGER.info(item.getId());
            withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
        }
    }
}
