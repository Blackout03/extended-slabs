package com.blackout.extendedslabs.loader.neoforge.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class NeoForgeDataGenerators {
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		generator.addProvider(event.includeClient(), new ESBlockStateProvider(output, existingFileHelper));
		generator.addProvider(event.includeClient(), new ESItemModelProvider(output, existingFileHelper));
		generator.addProvider(event.includeClient(), new ESLangProvider(output));
		generator.addProvider(event.includeServer(), new ESBlockTagsProvider(output, lookupProvider, existingFileHelper));
		generator.addProvider(event.includeServer(), new ESRecipeProvider(output));
	}
}
