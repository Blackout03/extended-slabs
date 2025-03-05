package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ESPStairsLootTables extends BlockLootSubProvider {
    List<Block> blocksToRemove = new ArrayList<>();
    private static final Block[] DROP_DIRT_SLABS = {
            ESPStairs.GRASS_BLOCK_STAIRS.get(),
            ESPStairs.PODZOL_STAIRS.get(),
            ESPStairs.MYCELIUM_STAIRS.get(),
            ESPStairs.DIRT_PATH_STAIRS.get()
    };
    private static final Block[] DROP_NETHERRACK_SLABS = {
            ESPStairs.CRIMSON_NYLIUM_STAIRS.get(),
            ESPStairs.WARPED_NYLIUM_STAIRS.get()
    };

    public ESPStairsLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        List<Block> blocks = new ArrayList<>(BuiltInRegistries.BLOCK.stream().toList());
        final Collection<DeferredHolder<Block, ? extends Block>> validBlocks = ESPStairs.BLOCKS.getEntries();
        blocks.removeIf(block -> name(block) != null && validBlocks.stream().noneMatch(registryObject -> registryObject.getId().equals(name(block))));

        // Generate loot tables for specific blocks
        generateSilkLootTables(DROP_DIRT_SLABS, ESPStairs.DIRT_STAIRS.get());
        generateSilkLootTables(DROP_DIRT_SLABS, ESPStairs.NETHERRACK_STAIRS.get());

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
                add(block, (vertical) -> this.createSingleItemTableWithSilkTouch(vertical, lootBlock));
            }
            // Add the block to the list of blocks to remove
            blocksToRemove.add(block);
        }
    }

    private ResourceLocation name(Block block) {
        return Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ESPStairs.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
