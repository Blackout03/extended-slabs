package com.blackout.extendedslabs;

import com.blackout.extendedslabs.blocks.ISlabifiedCompat;
import com.blackout.extendedslabs.datagen.*;
import com.blackout.extendedslabs.datagen.recipes.ESPRecipeProvider;
import com.blackout.extendedslabs.events.placehandlers.DeadBushBlockSlabifiedPlaceHandler;
import com.blackout.extendedslabs.events.placehandlers.DoublePlantBlockSlabifiedPlaceHandler;
import com.blackout.extendedslabs.events.placehandlers.TallGrassBlockSlabifiedPlaceHandler;
import com.blackout.extendedslabs.init.*;
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
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.IModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.artifact.versioning.ArtifactVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@Mod(ExtendedSlabs.MODID)
public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs";
	public static ArtifactVersion VERSION = null;
	public static final Logger LOGGER = LogManager.getLogger();
	private static final List<Supplier<ISlabifiedCompat>> compatList = new ArrayList<>(List.of(
			ESPSlabifiedBlocks::new
	));

	public ExtendedSlabs() {
		Optional<? extends ModContainer> opt = ModList.get().getModContainerById(MODID);
		if (opt.isPresent()) {
			IModInfo modInfo = opt.get().getModInfo();
			VERSION = modInfo.getVersion();
		} else LOGGER.warn("Cannot get version from mod info");

		LOGGER.debug(MODNAME + " Version is: " + VERSION);
		LOGGER.debug("Mod ID for " + MODNAME + " is: " + MODID);

		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(this::gatherData);
		modEventBus.addListener(this::onInterModEnqueue);

		ESPSlabs.ITEMS.register(modEventBus);
		ESPSlabs.BLOCKS.register(modEventBus);
		ESPStairs.ITEMS.register(modEventBus);
		ESPStairs.BLOCKS.register(modEventBus);
		ESPCorners.ITEMS.register(modEventBus);
		ESPCorners.BLOCKS.register(modEventBus);
		ESPVerticalSlabs.ITEMS.register(modEventBus);
		ESPVerticalSlabs.BLOCKS.register(modEventBus);
		ESPSlabifiedBlocks.BLOCKS.register(modEventBus);
		ESPCreativeTabs.CREATIVE_MODE_TAB.register(modEventBus);

		IEventBus forgeBus = MinecraftForge.EVENT_BUS;
		forgeBus.addListener(TallGrassBlockSlabifiedPlaceHandler::onBlockEntityPlace);
		forgeBus.addListener(DeadBushBlockSlabifiedPlaceHandler::onBlockEntityPlace);
		forgeBus.addListener(DoublePlantBlockSlabifiedPlaceHandler::onBlockEntityPlace);
		forgeBus.register(this);
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
	public void onInterModEnqueue(InterModEnqueueEvent event) {
		for (Supplier<ISlabifiedCompat> compat : compatList) {
			compat.get().registerPlaceEntries();
		}
	}
}
