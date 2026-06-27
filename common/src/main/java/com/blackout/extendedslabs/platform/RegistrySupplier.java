package com.blackout.extendedslabs.platform;

import java.util.function.Supplier;

public interface RegistrySupplier<T> extends Supplier<T> {
	String id();
}
