package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.datagen.loottables.DDCornersLootTables;
import com.blackout.extendedslabs.datagen.loottables.DDSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.DDStairsLootTables;
import com.blackout.extendedslabs.datagen.loottables.DDVerticalSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPCornersLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPStairsLootTables;
import com.blackout.extendedslabs.datagen.loottables.ESPVerticalSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.GaloCornersLootTables;
import com.blackout.extendedslabs.datagen.loottables.GaloVerticalSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.WBPCornersLootTables;
import com.blackout.extendedslabs.datagen.loottables.WBPSlabsLootTables;
import com.blackout.extendedslabs.datagen.loottables.WBPStairsLootTables;
import com.blackout.extendedslabs.datagen.loottables.WBPVerticalSlabsLootTables;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ESPLootTableProvider extends LootTableProvider {
    public ESPLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(ESPCornersLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(ESPSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(ESPStairsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(ESPVerticalSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(WBPCornersLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(WBPSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(WBPStairsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(WBPVerticalSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(GaloCornersLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(GaloVerticalSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(DDCornersLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(DDSlabsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(DDStairsLootTables::new, LootContextParamSets.BLOCK),
                Pair.of(DDVerticalSlabsLootTables::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(@NotNull Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
    }
}