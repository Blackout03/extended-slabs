package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ESItemModelProvider extends ItemModelProvider {
	public ESItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			if (definition.type() == ESBlockDefinitions.BlockType.WALL || definition.type() == ESBlockDefinitions.BlockType.BUTTON) {
				withExistingParent(definition.id(), modLoc("block/" + definition.id() + "_inventory"));
			} else {
				withExistingParent(definition.id(), modLoc("block/" + definition.id()));
			}
		}
	}
}
