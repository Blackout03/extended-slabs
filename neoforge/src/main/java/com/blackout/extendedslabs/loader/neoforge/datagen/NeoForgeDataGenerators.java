package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = ExtendedSlabs.MODID)
public class NeoForgeDataGenerators {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent.Client event) {
		ExtendedSlabs.LOGGER.info("[Datagen] Starting provider registration");

		event.createProvider(ESBlockStateProvider::new);
		ExtendedSlabs.LOGGER.info("[Datagen] Registered ESBlockStateProvider");

		event.createProvider(ESBlockTagsProvider::new);
		ExtendedSlabs.LOGGER.info("[Datagen] Registered ESBlockTagsProvider");

		event.createProvider(ESCopperDataMapProvider::new);
		ExtendedSlabs.LOGGER.info("[Datagen] Registered ESCopperDataMapProvider");

		ExtendedSlabs.LOGGER.info("[Datagen] Finished provider registration");
	}
}