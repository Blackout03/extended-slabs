package com.blackout.extendedslabs.loader.fabric;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESCopperFamilies;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class FabricEntrypoint implements ModInitializer {
	@Override
	public void onInitialize() {
		ExtendedSlabs.init();
		FabricRegistryBridge.register();
		registerCopperFamilies();
		FabricCreativeTabs.register();
	}

	private static void registerCopperFamilies() {
		for (ESCopperFamilies.BlockPair pair : ESCopperFamilies.oxidationPairs()) {
			OxidizableBlocksRegistry.registerNextStage(pair.from(), pair.to());
		}

		for (ESCopperFamilies.BlockPair pair : ESCopperFamilies.waxPairs()) {
			OxidizableBlocksRegistry.registerWaxable(pair.from(), pair.to());
		}
	}
}
