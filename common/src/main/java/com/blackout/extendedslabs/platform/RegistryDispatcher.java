package com.blackout.extendedslabs.platform;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RegistryDispatcher {
	private static final List<ModRegistry<?>> REGISTRIES = new ArrayList<>();

	public static <T> ModRegistry<T> create(ResourceKey<? extends Registry<T>> registryKey) {
		ModRegistry<T> registry = new ModRegistry<>(registryKey);
		REGISTRIES.add(registry);
		return registry;
	}

	public static Collection<ModRegistry<?>> registries() {
		return REGISTRIES;
	}
}
