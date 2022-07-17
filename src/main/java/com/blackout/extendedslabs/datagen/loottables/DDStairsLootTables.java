package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDStairs;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class DDStairsLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        final Collection<RegistryObject<Block>> blocks = DDStairs.BLOCKS.getEntries();
        for (RegistryObject<Block> block : blocks) {
            ExtendedSlabs.LOGGER.info(block.getId());
            dropSelf(block.get());
        }
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DDStairs.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
