package com.blackout.extendedslabs.platform;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ModRegistry<T> {
	private final ResourceKey<? extends Registry<T>> registryKey;
	private final List<Entry<T>> entries = new ArrayList<>();

	public ModRegistry(ResourceKey<? extends Registry<T>> registryKey) {
		this.registryKey = registryKey;
	}

	public <I extends T> RegistrySupplier<I> register(String id, Supplier<I> supplier) {
		Entry<I> entry = new Entry<>(id, supplier);
		entries.add((Entry<T>) entry);
		return entry;
	}

	public ResourceKey<? extends Registry<T>> registryKey() {
		return registryKey;
	}

	public Collection<Entry<T>> entries() {
		return entries;
	}

	public record Entry<T>(String id, Supplier<T> supplier) implements RegistrySupplier<T> {
		@Override
		public T get() {
			return supplier.get();
		}

		public ResourceLocation location(String modId) {
			return ResourceLocation.fromNamespaceAndPath(modId, id);
		}
	}
}
