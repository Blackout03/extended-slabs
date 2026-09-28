package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESCopperFamilies;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;
import net.neoforged.neoforge.registries.datamaps.builtin.Waxable;

import java.util.concurrent.CompletableFuture;

public class ESCopperDataMapProvider extends DataMapProvider {
	public ESCopperDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	@Override
	protected void gather(HolderLookup.Provider provider) {
		ExtendedSlabs.LOGGER.info("[Datagen/Copper Data Maps] Starting copper data map generation");

		Builder<Oxidizable, Block> oxidizables = builder(NeoForgeDataMaps.OXIDIZABLES);
		Builder<Waxable, Block> waxables = builder(NeoForgeDataMaps.WAXABLES);
		int oxidationEntries = 0;
		int waxEntries = 0;

		for (ESCopperFamilies.BlockPair pair : ESCopperFamilies.oxidationPairs()) {
			oxidizables.add(key(pair.from()), new Oxidizable(pair.to()), false);
			oxidationEntries++;

			ExtendedSlabs.LOGGER.info(
					"[Datagen/Copper Data Maps] Oxidation: {} -> {}",
					key(pair.from()).identifier(),
					key(pair.to()).identifier()
			);
		}

		for (ESCopperFamilies.BlockPair pair : ESCopperFamilies.waxPairs()) {
			waxables.add(key(pair.from()), new Waxable(pair.to()), false);
			waxEntries++;

			ExtendedSlabs.LOGGER.info(
					"[Datagen/Copper Data Maps] Waxing: {} -> {}",
					key(pair.from()).identifier(),
					key(pair.to()).identifier()
			);
		}

		ExtendedSlabs.LOGGER.info("[Datagen/Copper Data Maps] Finished copper data map generation with {} oxidation entries and {} waxing entries", oxidationEntries, waxEntries);
	}

	private static ResourceKey<Block> key(Block block) {
		return block.builtInRegistryHolder().key();
	}
}