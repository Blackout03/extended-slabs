package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPSlabs;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ESPSlabsLootTables extends BlockLootSubProvider {
	List<Block> blocksToRemove = new ArrayList<>();
	private static final Block[] DROP_DIRT_SLABS = {
			ESPSlabs.GRASS_BLOCK_SLAB.get(),
			ESPSlabs.PODZOL_SLAB.get(),
			ESPSlabs.MYCELIUM_SLAB.get(),
			ESPSlabs.DIRT_PATH_SLAB.get()
	};
	private static final Block[] DROP_NETHERRACK_SLABS = {
			ESPSlabs.CRIMSON_NYLIUM_SLAB.get(),
			ESPSlabs.WARPED_NYLIUM_SLAB.get()
	};

	public ESPSlabsLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		List<Block> blocks = new ArrayList<>(ForgeRegistries.BLOCKS.getValues());
		final Collection<RegistryObject<Block>> validBlocks = ESPSlabs.BLOCKS.getEntries();
		blocks.removeIf(block -> name(block) != null && validBlocks.stream().noneMatch(registryObject -> registryObject.getId().equals(name(block))));

		// Generate loot tables for specific blocks
		generateSilkLootTables(DROP_DIRT_SLABS, ESPSlabs.DIRT_SLAB.get());
		generateSilkLootTables(DROP_NETHERRACK_SLABS, ESPSlabs.NETHERRACK_SLAB.get());

		blocks.removeIf(block -> blocksToRemove.contains(block));

		for (Block block : blocks) {
			ExtendedSlabs.LOGGER.info(name(block));
			dropSelf(block);
		}
	}

	private void generateSilkLootTables(Block[] blocks, Block lootBlock) {
		for (Block block : blocks) {
			ExtendedSlabs.LOGGER.info(name(block));
			if (block.equals(ESPSlabs.DIRT_PATH_SLAB.get())) {
				dropOther(block, lootBlock);
			} else {
				dropSelfSilk(block, lootBlock);
			}
			// Add the block to the list of blocks to remove
			blocksToRemove.add(block);
		}
	}

	public void dropSelf(@NotNull Block block) {
		add(block, createSlabItemTable(block));
	}

	public void dropSelfSilk(@NotNull Block block, ItemLike item) {
		add(block, createSilkTouchSlabItemTable(block, item));
	}

	public LootTable.@NotNull Builder createSlabItemTable(@NotNull Block block) {
		return LootTable
				.lootTable()
				.withPool(LootPool
						.lootPool()
						.setRolls(ConstantValue.exactly(1.0F))
						.add(this.applyExplosionDecay(block, LootItem.lootTableItem(block)
								.apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
										.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
												.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))));
	}

	public LootTable.@NotNull Builder createSilkTouchSlabItemTable(@NotNull Block block, ItemLike item) {
		return LootTable
				.lootTable()
				.withPool(LootPool
						.lootPool()
						.setRolls(ConstantValue.exactly(1.0F))
						.add(this.applyExplosionDecay(block, LootItem.lootTableItem(block)
										.when(HAS_SILK_TOUCH)
										.apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
												.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
														.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))
								.otherwise(LootItem.lootTableItem(item)
										.apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
												.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
														.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))));
	}

	private ResourceLocation name(Block block) {
		return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
	}

	@Override
	protected @NotNull Iterable<Block> getKnownBlocks() {
		return ESPSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}
