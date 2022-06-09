package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.*;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.BOPCorners;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import com.blackout.extendedslabs.init.modded.BOPStairs;
import com.blackout.extendedslabs.init.modded.BOPVerticalSlabs;
import com.blackout.extendedslabs.render.block.BlockRenderLayer;
import com.blackout.extendedslabs.util.ESPItemGroup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DatagenModLoader;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.IModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.artifact.versioning.ArtifactVersion;

import java.util.Optional;

@Mod(ExtendedSlabs.MODID)
public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs";
	public static ArtifactVersion VERSION = null;
	public static final Logger LOGGER = LogManager.getLogger();

	public static final ItemGroup GROUP = new ESPItemGroup();

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
		LOGGER.debug(ExtendedSlabs.MODID + ": Vanilla Minecraft Compat Loaded");
		if (DatagenModLoader.isRunningDataGen() || ModList.get().isLoaded("biomesoplenty")) {
			BOPSlabs.ITEMS.register(eventBus);
			BOPSlabs.BLOCKS.register(eventBus);
			BOPStairs.ITEMS.register(eventBus);
			BOPStairs.BLOCKS.register(eventBus);
			BOPCorners.ITEMS.register(eventBus);
			BOPCorners.BLOCKS.register(eventBus);
			BOPVerticalSlabs.ITEMS.register(eventBus);
			BOPVerticalSlabs.BLOCKS.register(eventBus);
			LOGGER.debug(ExtendedSlabs.MODID + ": Biomes O' Plenty Compat Loaded");
		}
		MinecraftForge.EVENT_BUS.register(this);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}

	private void gatherData(final GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		final ExistingFileHelper existing = event.getExistingFileHelper();

		if (event.includeServer()) {
			dataGenerator.addProvider(new ESPLootTableProvider(dataGenerator));
			dataGenerator.addProvider(new ESPBlockModelProvider(dataGenerator, MODID, existing));
			dataGenerator.addProvider(new ESPItemModelGenerator(dataGenerator, existing));
			dataGenerator.addProvider(new ESPBlockStateProvider(dataGenerator, MODID, existing));
			dataGenerator.addProvider(new ESPBlockTagsProvider(dataGenerator, existing));
			dataGenerator.addProvider(new ESPStairRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPCornerRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPSlabRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPVerticalSlabRecipeProvider(dataGenerator));
		}
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		BlockRenderLayer.renderBlock();
	}
}
