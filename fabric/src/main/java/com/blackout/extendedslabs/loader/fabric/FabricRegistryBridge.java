package com.blackout.extendedslabs.loader.fabric;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.RegistryDispatcher;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public class FabricRegistryBridge {
	public static void register() {
		RegistryDispatcher.registries().forEach(FabricRegistryBridge::registerRegistry);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private static void registerRegistry(ModRegistry registry) {
		Registry target = (Registry) BuiltInRegistries.REGISTRY.get(registry.registryKey().location());

		for (Object rawEntry : registry.entries()) {
			ModRegistry.Entry entry = (ModRegistry.Entry) rawEntry;
			Registry.register(target, entry.location(ExtendedSlabs.MODID), entry.get());
		}
	}
}
