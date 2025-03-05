package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPCorners;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import javax.annotation.Nonnull;
import java.util.Collection;

public class ESPItemModelGenerator extends ItemModelProvider {

	public ESPItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ExtendedSlabs.MODID, existingFileHelper);
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

	private void generateBlockItems(final Collection<DeferredHolder<Item, ? extends Item>> itemBlocks) {
		for (DeferredHolder<Item, ? extends Item> item : itemBlocks) {
			String name = item.getId().getPath();
			if (!existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "block/" + name), MODEL) || existingFileHelper.exists(new ResourceLocation(ExtendedSlabs.MODID, "item/" + name), MODEL))
				continue;
			ExtendedSlabs.LOGGER.info(item.getId());
			withExistingParent(name, new ResourceLocation(ExtendedSlabs.MODID, "block/" + name));
		}
	}
}
