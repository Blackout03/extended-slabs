package com.blackout.extendedslabs.loader.neoforge;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.RegistryDispatcher;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NeoForgeRegistryBridge {
	public static void register(IEventBus modEventBus) {
		RegistryDispatcher.registries().forEach(registry -> registerRegistry(modEventBus, registry));
	}

	private static <T> void registerRegistry(IEventBus modEventBus, ModRegistry<T> registry) {
		DeferredRegister<T> deferredRegister = DeferredRegister.create(registry.registryKey(), ExtendedSlabs.MODID);

		for (ModRegistry.Entry<T> entry : registry.entries()) {
			deferredRegister.register(entry.id(), entry::get);
		}

		deferredRegister.register(modEventBus);
	}
}
