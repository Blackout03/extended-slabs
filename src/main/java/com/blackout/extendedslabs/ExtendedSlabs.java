package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.*;
import com.blackout.extendedslabs.datagen.recipes.ESPRecipeProvider;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.IModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.artifact.versioning.ArtifactVersion;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Mod(ExtendedSlabs.MODID)
public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs";
	public static ArtifactVersion VERSION = null;
	public static final Logger LOGGER = LogManager.getLogger();

	public ExtendedSlabs() {
		Optional<? extends ModContainer> opt = ModList.get().getModContainerById(MODID);
		if (opt.isPresent()) {
			IModInfo modInfo = opt.get().getModInfo();
			VERSION = modInfo.getVersion();
		} else LOGGER.warn("Cannot get version from mod info");

		LOGGER.debug(MODNAME + " Version is: " + VERSION);
		LOGGER.debug("Mod ID for " + MODNAME + " is: " + MODID);

		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		eventBus.addListener(this::gatherData);

		ESPSlabs.ITEMS.register(eventBus);
		ESPSlabs.BLOCKS.register(eventBus);
		ESPStairs.ITEMS.register(eventBus);
		ESPStairs.BLOCKS.register(eventBus);
		ESPCorners.ITEMS.register(eventBus);
		ESPCorners.BLOCKS.register(eventBus);
		ESPVerticalSlabs.ITEMS.register(eventBus);
		ESPVerticalSlabs.BLOCKS.register(eventBus);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void gatherData(final GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		PackOutput output = event.getGenerator().getPackOutput();
		CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
		final ExistingFileHelper existing = event.getExistingFileHelper();

		dataGenerator.addProvider(event.includeServer(), new ESPLootTableProvider(output));
		dataGenerator.addProvider(event.includeClient(), new ESPBlockModelProvider(output, existing));
		dataGenerator.addProvider(event.includeClient(), new ESPItemModelGenerator(output, existing));
		dataGenerator.addProvider(event.includeClient(), new ESPBlockStateProvider(output, existing));
		dataGenerator.addProvider(event.includeServer(), new ESPBlockTagsProvider(output, provider, existing));
		dataGenerator.addProvider(event.includeServer(), new ESPRecipeProvider(output));
	}
}
