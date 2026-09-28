package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;

import java.util.ArrayList;
import java.util.List;

public final class ESCopperFamilies {
	private ESCopperFamilies() {
	}

	public static List<BlockPair> oxidationPairs() {
		List<BlockPair> pairs = new ArrayList<>();

		addOxidationPairs(
				pairs,
				WeatheringCopper.WeatherState.UNAFFECTED,
				WeatheringCopper.WeatherState.EXPOSED
		);
		addOxidationPairs(
				pairs,
				WeatheringCopper.WeatherState.EXPOSED,
				WeatheringCopper.WeatherState.WEATHERED
		);
		addOxidationPairs(
				pairs,
				WeatheringCopper.WeatherState.WEATHERED,
				WeatheringCopper.WeatherState.OXIDIZED
		);

		return List.copyOf(pairs);
	}

	public static List<BlockPair> waxPairs() {
		List<BlockPair> pairs = new ArrayList<>();

		for (WeatheringCopper.WeatherState state : WeatheringCopper.WeatherState.values()) {
			ESBlockDefinitions.BlockFamily unwaxed = findFamily(state, false);
			ESBlockDefinitions.BlockFamily waxed = findFamily(state, true);

			if (unwaxed != null && waxed != null) {
				addMatchingBlocks(pairs, unwaxed, waxed);
			}
		}

		return List.copyOf(pairs);
	}

	private static void addOxidationPairs(List<BlockPair> pairs, WeatheringCopper.WeatherState fromState, WeatheringCopper.WeatherState toState) {
		ESBlockDefinitions.BlockFamily from = findFamily(fromState, false);
		ESBlockDefinitions.BlockFamily to = findFamily(toState, false);

		if (from != null && to != null) {
			addMatchingBlocks(pairs, from, to);
		}
	}

	private static ESBlockDefinitions.BlockFamily findFamily(WeatheringCopper.WeatherState state, boolean waxed) {
		return ESBlockDefinitions.families().stream()
				.filter(family -> family.weatherState() == state)
				.filter(family -> family.waxed() == waxed)
				.findFirst()
				.orElse(null);
	}

	private static void addMatchingBlocks(List<BlockPair> pairs, ESBlockDefinitions.BlockFamily from, ESBlockDefinitions.BlockFamily to) {
		addPair(pairs, from.slab(), to.slab());
		addPair(pairs, from.verticalSlab(), to.verticalSlab());
		addPair(pairs, from.stairs(), to.stairs());
		addPair(pairs, from.corner(), to.corner());
		addPair(pairs, from.wall(), to.wall());
		addPair(pairs, from.fence(), to.fence());
		addPair(pairs, from.fenceGate(), to.fenceGate());
		addPair(pairs, from.button(), to.button());
		addPair(pairs, from.pressurePlate(), to.pressurePlate());
	}

	private static void addPair(List<BlockPair> pairs, RegistrySupplier<Block> from, RegistrySupplier<Block> to) {
		if (isExtendedSlabsBlock(from) && isExtendedSlabsBlock(to)) {
			pairs.add(new BlockPair(from.get(), to.get()));
		}
	}

	private static boolean isExtendedSlabsBlock(RegistrySupplier<Block> block) {
		return block != null && ESBlockDefinitions.blocks().stream()
				.anyMatch(definition -> definition.block() == block);
	}

	public record BlockPair(Block from, Block to) {
	}
}