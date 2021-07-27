package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.Collection;

public class ESPVerticalSlabsLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        final Collection<RegistryObject<Block>> blocks = ESPVerticalSlabs.BLOCKS.getEntries();
        for (RegistryObject<Block> block : blocks) {

            ExtendedSlabs.LOGGER.info(block.getId());

            dropSelf(block.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ESPVerticalSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

