package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

public class ESPSlabsLootTables extends BlockLootSubProvider {
	public ESPSlabsLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		final Collection<RegistryObject<Block>> blocks = ESPSlabs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : blocks) {
			ExtendedSlabs.LOGGER.info(block.getId());
			dropSelf(block.get());
		}
	}

	public void dropSelf(Block p_124289_) {
		this.add(p_124289_, createSlabItemTable(p_124289_));
	}

	public LootTable.Builder createSlabItemTable(Block p_251313_) {
		return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(this.applyExplosionDecay(p_251313_, LootItem.lootTableItem(p_251313_).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(p_251313_).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))));
	}

	@Override
	protected @NotNull Iterable<Block> getKnownBlocks() {
		return ESPSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}
