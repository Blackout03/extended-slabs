package com.blackout.extendedslabs.loader.fabric;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.RegistryDispatcher;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

public class FabricRegistryBridge {
	public static void register() {
		RegistryDispatcher.registries().forEach(FabricRegistryBridge::registerRegistry);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private static void registerRegistry(ModRegistry registry) {
		Registry target = getTargetRegistry(registry);

		for (Object rawEntry : registry.entries()) {
			ModRegistry.Entry entry = (ModRegistry.Entry) rawEntry;
			Registry.register(target, entry.location(ExtendedSlabs.MODID), entry.get());
		}
	}

	@SuppressWarnings("rawtypes")
	private static Registry getTargetRegistry(ModRegistry registry) {
		if (registry.registryKey() == Registries.BLOCK) {
			return BuiltInRegistries.BLOCK;
		}

		if (registry.registryKey() == Registries.ITEM) {
			return BuiltInRegistries.ITEM;
		}

		if (registry.registryKey() == Registries.CREATIVE_MODE_TAB) {
			return BuiltInRegistries.CREATIVE_MODE_TAB;
		}

		throw new IllegalStateException("Unsupported Fabric registry key: " + registry.registryKey());
	}
}