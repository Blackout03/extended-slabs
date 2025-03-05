package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPCorners;
import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

public class ESPCornersLootTables extends BlockLootSubProvider {
    public ESPCornersLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        final Collection<DeferredHolder<Block, ? extends Block>> blocks = ESPCorners.BLOCKS.getEntries();
        for (DeferredHolder<Block, ? extends Block> block : blocks) {
            ExtendedSlabs.LOGGER.info(block.getId());
            dropSelf(block.get());
        }
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ESPCorners.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
