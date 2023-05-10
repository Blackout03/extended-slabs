package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.datagen.loottables.ESPCornersLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPStairsLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPVerticalSlabsLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ESPLootTableProvider extends LootTableProvider {
    public ESPLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(ESPCornersLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ESPSlabsLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ESPStairsLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ESPVerticalSlabsLootTables::new, LootContextParamSets.BLOCK)));
    }
}