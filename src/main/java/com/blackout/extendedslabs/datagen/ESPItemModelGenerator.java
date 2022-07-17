package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDCorners;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDStairs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDVerticalSlabs;
import com.blackout.extendedslabs.init.modded.galosphere.GaloCorners;
import com.blackout.extendedslabs.init.modded.galosphere.GaloVerticalSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPCorners;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPStairs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPVerticalSlabs;
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
        generateBlockItems(ESPCorners.ITEMS.getEntries());
        generateBlockItems(ESPSlabs.ITEMS.getEntries());
        generateBlockItems(ESPStairs.ITEMS.getEntries());
        generateBlockItems(ESPVerticalSlabs.ITEMS.getEntries());
        generateBlockItems(WBPCorners.ITEMS.getEntries());
        generateBlockItems(WBPSlabs.ITEMS.getEntries());
        generateBlockItems(WBPStairs.ITEMS.getEntries());
        generateBlockItems(WBPVerticalSlabs.ITEMS.getEntries());
        generateBlockItems(GaloCorners.ITEMS.getEntries());
        generateBlockItems(GaloVerticalSlabs.ITEMS.getEntries());
        generateBlockItems(DDCorners.ITEMS.getEntries());
        generateBlockItems(DDSlabs.ITEMS.getEntries());
        generateBlockItems(DDStairs.ITEMS.getEntries());
        generateBlockItems(DDVerticalSlabs.ITEMS.getEntries());
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
