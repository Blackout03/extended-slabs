package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPMaterial;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ESPBlockTagsProvider extends IntrinsicHolderTagsProvider<Block> {
	public ESPBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, ExistingFileHelper existingFileHelper) {
		super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		final @NotNull Set<Map.Entry<ResourceKey<Block>, Block>> blocks = ForgeRegistries.BLOCKS.getEntries();
		for (Map.Entry<ResourceKey<Block>, Block> blockEntry : blocks) {
			Block block = blockEntry.getValue();
			final Material material = block.defaultBlockState().getMaterial();

			if (material == ESPMaterial.PICKAXE_MUD || material == ESPMaterial.PICKAXE_STONE || material == ESPMaterial.PICKAXE_METAL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_PICKAXE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.MINEABLE_WITH_PICKAXE).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
				}
			}
			if (material == ESPMaterial.SHOVEL_DIRT || material == ESPMaterial.SHOVEL_GRASS || material == ESPMaterial.SHOVEL_SAND || material == ESPMaterial.SHOVEL_CLAY) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_SHOVEL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.MINEABLE_WITH_SHOVEL).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
				}
			}
			if (material == ESPMaterial.AXE_WOOD || material == ESPMaterial.AXE_NETHER_WOOD) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_AXE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.MINEABLE_WITH_AXE).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.MINEABLE_WITH_AXE).add(block);
				}
			}
			if (material == ESPMaterial.WOOL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.WOOL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.WOOL).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.WOOL).add(block);
				}
			}
			if (material == ESPMaterial.GLASS) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.IMPERMEABLE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.IMPERMEABLE).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.IMPERMEABLE).add(block);
				}
			}
			if (material == ESPMaterial.PICKAXE_METAL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.NEEDS_STONE_TOOL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
					tag(BlockTags.NEEDS_STONE_TOOL).addOptional(block.getLootTable());
				} else {
					tag(BlockTags.NEEDS_STONE_TOOL).add(block);
				}
			}
		}

		for (RegistryObject<Block> blockRegistryObject : ESPSlabs.BLOCKS.getEntries()) {
			Block block = blockRegistryObject.get();
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + blockRegistryObject.getId());
			if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
				tag(BlockTags.SLABS).addOptional(block.getLootTable());
			} else {
				tag(BlockTags.SLABS).add(block);
			}
		}

		for (RegistryObject<Block> blockRegistryObject : ESPStairs.BLOCKS.getEntries()) {
			Block block = blockRegistryObject.get();
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + blockRegistryObject.getId());
			if (block.requiredFeatures().contains(FeatureFlags.UPDATE_1_20)) {
				tag(BlockTags.STAIRS).addOptional(block.getLootTable());
			} else {
				tag(BlockTags.STAIRS).add(block);
			}
		}
	}
}