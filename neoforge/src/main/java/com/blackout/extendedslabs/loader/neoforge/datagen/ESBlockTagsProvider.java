package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ESBlockTagsProvider extends BlockTagsProvider {
	public ESBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			tag(BlockTags.MINEABLE_WITH_PICKAXE).add(definition.block().get());
		}
	}
}
