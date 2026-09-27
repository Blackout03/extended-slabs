package com.blackout.extendedslabs.platform;

import net.minecraft.resources.Identifier;

public interface RegistrySupplier<T> extends java.util.function.Supplier<T> {
	String id();

	default Identifier location(String modId) {
		return Identifier.fromNamespaceAndPath(modId, id());
	}
}
