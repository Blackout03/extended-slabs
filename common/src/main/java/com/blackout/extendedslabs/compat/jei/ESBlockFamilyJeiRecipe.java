package com.blackout.extendedslabs.compat.jei;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import com.blackout.extendedslabs.registry.ESBlockFamilies;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public record ESBlockFamilyJeiRecipe(Block originalBlock, List<Block> familyBlocks) {
    public static List<ESBlockFamilyJeiRecipe> createAll() {
        return ESBlockFamilies.families().stream()
                .map(ESBlockFamilyJeiRecipe::create)
                .filter(recipe -> !recipe.familyBlocks().isEmpty())
                .toList();
    }

    private static ESBlockFamilyJeiRecipe create(ESBlockDefinitions.BlockFamily family) {
        List<Block> familyBlocks = Stream.of(
                        family.slab(),
                        family.verticalSlab(),
                        family.stairs(),
                        family.corner(),
                        family.wall(),
                        family.button()
                )
                .filter(Objects::nonNull)
                .map(RegistrySupplier::get)
                .filter(block -> block.asItem() != Items.AIR)
                .toList();

        return new ESBlockFamilyJeiRecipe(family.originalBlock(), familyBlocks);
    }
}