package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ESPVerticalSlabsLootTables extends BlockLootSubProvider {
	List<Block> blocksToRemove = new ArrayList<>();
	private static final Block[] DROP_DIRT_VERTICAL = {
			ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(),
			ESPVerticalSlabs.PODZOL_VERTICAL.get(),
			ESPVerticalSlabs.MYCELIUM_VERTICAL.get(),
			ESPVerticalSlabs.DIRT_PATH_VERTICAL.get()
	};
	private static final Block[] DROP_NETHERRACK_VERTICAL = {
			ESPVerticalSlabs.CRIMSON_NYLIUM_VERTICAL.get(),
			ESPVerticalSlabs.WARPED_NYLIUM_VERTICAL.get()
	};

	public ESPVerticalSlabsLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		List<Block> blocks = new ArrayList<>(ForgeRegistries.BLOCKS.getValues());
		final Collection<RegistryObject<Block>> validBlocks = ESPVerticalSlabs.BLOCKS.getEntries();
		blocks.removeIf(block -> name(block) != null && validBlocks.stream().noneMatch(registryObject -> registryObject.getId().equals(name(block))));

		// Generate loot tables for specific blocks
		generateSilkLootTables(DROP_DIRT_VERTICAL, ESPVerticalSlabs.DIRT_VERTICAL.get());
		generateSilkLootTables(DROP_NETHERRACK_VERTICAL, ESPVerticalSlabs.NETHERRACK_VERTICAL.get());

		blocks.removeIf(block -> blocksToRemove.contains(block));

		for (Block block : blocks) {
			ExtendedSlabs.LOGGER.info(name(block));
			dropSelf(block);
		}
	}

	private void generateSilkLootTables(Block[] blocks, Block lootBlock) {
		for (Block block : blocks) {
			ExtendedSlabs.LOGGER.info(name(block));
			if (block.equals(ESPVerticalSlabs.DIRT_PATH_VERTICAL.get())) {
				dropOther(block, lootBlock);
			} else {
				add(block, (vertical) -> this.createSingleItemTableWithSilkTouch(vertical, lootBlock));
			}
			// Add the block to the list of blocks to remove
			blocksToRemove.add(block);
		}
	}

	private ResourceLocation name(Block block) {
		return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
	}

	@Override
	protected @NotNull Iterable<Block> getKnownBlocks() {
		return ESPVerticalSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}

