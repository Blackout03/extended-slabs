package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.*;
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
import com.blackout.extendedslabs.render.block.BlockRenderLayer;
import com.blackout.extendedslabs.util.ESPCreativeModeTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.loading.DatagenModLoader;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
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

	public static final CreativeModeTab GROUP = new ESPCreativeModeTab();

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

		ESPCorners.BLOCKS.register(eventBus);
		ESPCorners.ITEMS.register(eventBus);
		ESPSlabs.BLOCKS.register(eventBus);
		ESPSlabs.ITEMS.register(eventBus);
		ESPStairs.BLOCKS.register(eventBus);
		ESPStairs.ITEMS.register(eventBus);
		ESPVerticalSlabs.BLOCKS.register(eventBus);
		ESPVerticalSlabs.ITEMS.register(eventBus);
		LOGGER.debug(ExtendedSlabs.MODID + ": Vanilla Minecraft Compat Loaded");
		if (DatagenModLoader.isRunningDataGen() || ModList.get().isLoaded("wildbackport")) {
			WBPCorners.BLOCKS.register(eventBus);
			WBPCorners.ITEMS.register(eventBus);
			WBPSlabs.BLOCKS.register(eventBus);
			WBPSlabs.ITEMS.register(eventBus);
			WBPStairs.BLOCKS.register(eventBus);
			WBPStairs.ITEMS.register(eventBus);
			WBPVerticalSlabs.BLOCKS.register(eventBus);
			WBPVerticalSlabs.ITEMS.register(eventBus);
			LOGGER.debug(ExtendedSlabs.MODID + ": The Wild Backport Compat Loaded");
		}
		if (DatagenModLoader.isRunningDataGen() || ModList.get().isLoaded("galosphere")) {
			GaloCorners.BLOCKS.register(eventBus);
			GaloCorners.ITEMS.register(eventBus);
			GaloVerticalSlabs.BLOCKS.register(eventBus);
			GaloVerticalSlabs.ITEMS.register(eventBus);
			LOGGER.debug(ExtendedSlabs.MODID + ": Galosphere Compat Loaded");
		}
		if (DatagenModLoader.isRunningDataGen() || ModList.get().isLoaded("darkerdepths")) {
			DDCorners.BLOCKS.register(eventBus);
			DDCorners.ITEMS.register(eventBus);
			DDSlabs.BLOCKS.register(eventBus);
			DDSlabs.ITEMS.register(eventBus);
			DDStairs.BLOCKS.register(eventBus);
			DDStairs.ITEMS.register(eventBus);
			DDVerticalSlabs.BLOCKS.register(eventBus);
			DDVerticalSlabs.ITEMS.register(eventBus);
			LOGGER.debug(ExtendedSlabs.MODID + ": Darker Depths Compat Loaded");
		}
		MinecraftForge.EVENT_BUS.register(this);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}

	private void gatherData(final GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		final ExistingFileHelper existing = event.getExistingFileHelper();

		if (event.includeServer()) {
			dataGenerator.addProvider(new ESPLootTableProvider(dataGenerator));
			dataGenerator.addProvider(new ESPBlockTagsProvider(dataGenerator, existing));
			dataGenerator.addProvider(new ESPStairRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPCornerRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPSlabRecipeProvider(dataGenerator));
			dataGenerator.addProvider(new ESPVerticalSlabRecipeProvider(dataGenerator));
		}
		if (event.includeClient()) {
			dataGenerator.addProvider(new ESPBlockModelProvider(dataGenerator, MODID, existing));
			dataGenerator.addProvider(new ESPItemModelGenerator(dataGenerator, existing));
			dataGenerator.addProvider(new ESPBlockStateProvider(dataGenerator, MODID, existing));
		}
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		BlockRenderLayer.renderBlock();
	}
}
