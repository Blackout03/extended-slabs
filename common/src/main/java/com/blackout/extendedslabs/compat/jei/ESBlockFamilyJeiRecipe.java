package com.blackout.extendedslabs.compat.jei;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import com.blackout.extendedslabs.registry.ESBlockFamilies;

import java.lang.reflect.RecordComponent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
		List<Block> familyBlocks = Arrays.stream(ESBlockDefinitions.BlockFamily.class.getRecordComponents())
				.filter(component -> RegistrySupplier.class.isAssignableFrom(component.getType()))
				.map(component -> getBlockSupplier(component, family))
				.filter(Objects::nonNull)
				.map(RegistrySupplier::get)
				.filter(block -> block.asItem() != Items.AIR)
				.toList();

		return new ESBlockFamilyJeiRecipe(family.originalBlock(), familyBlocks);
	}

	private static RegistrySupplier<Block> getBlockSupplier(RecordComponent component, ESBlockDefinitions.BlockFamily family) {
		try {
			return (RegistrySupplier<Block>) component.getAccessor().invoke(family);
		} catch (ReflectiveOperationException exception) {
			throw new IllegalStateException("Could not read block family component " + component.getName(), exception);
		}
	}
}