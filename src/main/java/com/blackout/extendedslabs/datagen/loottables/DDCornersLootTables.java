package com.blackout.extendedslabs.datagen.loottables;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDCorners;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class DDCornersLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        final Collection<RegistryObject<Block>> blocks = DDCorners.BLOCKS.getEntries();
        for (RegistryObject<Block> block : blocks) {
            ExtendedSlabs.LOGGER.info(block.getId());
            dropSelf(block.get());
        }
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DDCorners.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
