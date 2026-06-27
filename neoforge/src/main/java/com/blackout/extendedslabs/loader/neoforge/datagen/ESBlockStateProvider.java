package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ESBlockStateProvider extends BlockStateProvider {
	public ESBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			ResourceLocation texture = mcLoc("block/" + definition.textureName());

			switch (definition.type()) {
				case SLAB -> slabBlock((SlabBlock) definition.block().get(), texture, texture, texture);
				case STAIRS -> stairsBlock((StairBlock) definition.block().get(), texture);
			}
		}
	}
}
