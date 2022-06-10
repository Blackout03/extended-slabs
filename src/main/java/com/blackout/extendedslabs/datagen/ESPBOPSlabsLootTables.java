package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.modded.BOPSlabs;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.Collection;

public class ESPBOPSlabsLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        final Collection<RegistryObject<Block>> blocks = BOPSlabs.BLOCKS.getEntries();
        for (RegistryObject<Block> block : blocks) {

            ExtendedSlabs.LOGGER.info(block.getId());

            dropSelf(block.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BOPSlabs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
