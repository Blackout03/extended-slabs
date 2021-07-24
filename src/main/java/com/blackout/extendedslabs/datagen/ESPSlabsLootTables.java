package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.Collection;

public class ESPSlabsLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        final Collection<RegistryObject<Block>> blocks = ESPSlabs.BLOCKS.getEntries();
        for (RegistryObject<Block> block : blocks) {

            ExtendedSlabs.LOGGER.info(block.getId());

            dropSelf(block.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ESPSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
