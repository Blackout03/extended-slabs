package com.blackout.extendedslabs.platform;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

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

	public static class Entry<T> implements RegistrySupplier<T> {
		private final String id;
		private final Supplier<T> supplier;
		private T value;

		public Entry(String id, Supplier<T> supplier) {
			this.id = id;
			this.supplier = supplier;
		}

		@Override
		public String id() {
			return id;
		}

		@Override
		public T get() {
			if (value == null) {
				value = supplier.get();
			}

			return value;
		}
	}
}
