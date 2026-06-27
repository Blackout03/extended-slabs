package com.blackout.extendedslabs.platform;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class PlatformRegistry {
	public static <T> ModRegistry<T> create(ResourceKey<? extends Registry<T>> registryKey) {
		return RegistryDispatcher.create(registryKey);
	}
}
