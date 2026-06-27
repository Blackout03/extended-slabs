package com.blackout.extendedslabs.platform;

import net.minecraft.resources.ResourceLocation;

public interface RegistrySupplier<T> extends java.util.function.Supplier<T> {
	String id();

	default ResourceLocation location(String modId) {
		return ResourceLocation.fromNamespaceAndPath(modId, id());
	}
}
