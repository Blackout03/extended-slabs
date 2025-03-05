package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.*;
import com.blackout.extendedslabs.datagen.recipes.ESPRecipeProvider;
import com.blackout.extendedslabs.events.placehandlers.*;
import com.blackout.extendedslabs.registry.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforgespi.language.IModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.TriConsumer;
import org.apache.maven.artifact.versioning.ArtifactVersion;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Mod(ExtendedSlabs.MODID)
public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs +";
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

		IEventBus neoBus = NeoForge.EVENT_BUS;
		neoBus.register(BlockSlabifiedPlaceHandler.class);
	}

	private void gatherData(final GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		PackOutput output = dataGenerator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
		final ExistingFileHelper existing = event.getExistingFileHelper();

		dataGenerator.addProvider(event.includeServer(), new ESPLootTableProvider(output));
		dataGenerator.addProvider(event.includeClient(), new ESPBlockModelProvider(output, existing));
		dataGenerator.addProvider(event.includeClient(), new ESPItemModelGenerator(output, existing));
		dataGenerator.addProvider(event.includeClient(), new ESPBlockStateProvider(output, existing));
		dataGenerator.addProvider(event.includeServer(), new ESPBlockTagsProvider(output, provider, existing));
		dataGenerator.addProvider(event.includeServer(), new ESPRecipeProvider(output, provider));
		dataGenerator.addProvider(event.includeClient(), new ESPLangProvider(output));
	}

	public void onInterModEnqueue(InterModEnqueueEvent event) {
		registerPlaceEntry(Items.GRASS, ESPSlabifiedBlocks.GRASS.get(), TallGrassBlockSlabifiedPlaceHandler::placeTallGrassBlock);
		registerPlaceEntry(Items.FERN, ESPSlabifiedBlocks.FERN.get(), TallGrassBlockSlabifiedPlaceHandler::placeTallGrassBlock);
		registerPlaceEntry(Items.DEAD_BUSH, ESPSlabifiedBlocks.DEAD_BUSH.get(), DeadBushBlockSlabifiedPlaceHandler::placeDeadBushBlock);
		registerPlaceEntry(Items.TALL_GRASS, ESPSlabifiedBlocks.TALL_GRASS.get(), DoublePlantBlockSlabifiedPlaceHandler::placeDoublePlantBlock);
		registerPlaceEntry(Items.LARGE_FERN, ESPSlabifiedBlocks.LARGE_FERN.get(), DoublePlantBlockSlabifiedPlaceHandler::placeDoublePlantBlock);
		registerPlaceEntry(Items.DANDELION, ESPSlabifiedBlocks.DANDELION.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.POPPY, ESPSlabifiedBlocks.POPPY.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.BLUE_ORCHID, ESPSlabifiedBlocks.BLUE_ORCHID.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.ALLIUM, ESPSlabifiedBlocks.ALLIUM.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.AZURE_BLUET, ESPSlabifiedBlocks.AZURE_BLUET.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.RED_TULIP, ESPSlabifiedBlocks.RED_TULIP.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.ORANGE_TULIP, ESPSlabifiedBlocks.ORANGE_TULIP.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.WHITE_TULIP, ESPSlabifiedBlocks.WHITE_TULIP.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.PINK_TULIP, ESPSlabifiedBlocks.PINK_TULIP.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.OXEYE_DAISY, ESPSlabifiedBlocks.OXEYE_DAISY.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.CORNFLOWER, ESPSlabifiedBlocks.CORNFLOWER.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.LILY_OF_THE_VALLEY, ESPSlabifiedBlocks.LILY_OF_THE_VALLEY.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.TORCHFLOWER, ESPSlabifiedBlocks.TORCHFLOWER.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.WITHER_ROSE, ESPSlabifiedBlocks.WITHER_ROSE.get(), FlowerBlockSlabifiedPlaceHandler::placeFlowerBlock);
		registerPlaceEntry(Items.CACTUS, ESPSlabifiedBlocks.CACTUS.get(), CactusBlockSlabifiedPlaceHandler::placeCactusBlock);
		registerPlaceEntry(Items.SUGAR_CANE, ESPSlabifiedBlocks.SUGAR_CANE.get(), SugarCaneBlockSlabifiedPlaceHandler::placeSugarCaneBlock);
	}

	private void registerPlaceEntry(Item item, Block slabifiedBlock, TriConsumer<PlayerInteractEvent.RightClickBlock, ItemStack, Block> handler) {
		BlockSlabifiedPlaceHandler.registerPlaceEntry(BuiltInRegistries.ITEM.getKey(item), () -> slabifiedBlock, handler);
	}
}
