package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPMaterial;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ESPBlockTagsProvider extends BlockTagsProvider {
	public ESPBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		for (Block block : ForgeRegistries.BLOCKS) {
			final Material material = block.defaultBlockState().getMaterial();

			if (material == ESPMaterial.PICKAXE_MUD || material == ESPMaterial.PICKAXE_STONE || material == ESPMaterial.PICKAXE_METAL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_PICKAXE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
			}
			if (material == ESPMaterial.SHOVEL_DIRT || material == ESPMaterial.SHOVEL_GRASS || material == ESPMaterial.SHOVEL_SAND || material == ESPMaterial.SHOVEL_CLAY) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_SHOVEL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
			}
			if (material == ESPMaterial.AXE_WOOD || material == ESPMaterial.AXE_NETHER_WOOD) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.MINEABLE_WITH_AXE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.MINEABLE_WITH_AXE).add(block);
			}
			if (material == ESPMaterial.WOOL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.WOOL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.WOOL).add(block);
			}
			if (material == ESPMaterial.GLASS) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.IMPERMEABLE.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.IMPERMEABLE).add(block);
			}
			if (material == ESPMaterial.PICKAXE_METAL) {
				ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.NEEDS_STONE_TOOL.location() + " Block: " + ForgeRegistries.BLOCKS.getKey(block));
				tag(BlockTags.NEEDS_STONE_TOOL).add(block);
			}
		}

		for (RegistryObject<Block> block : ESPSlabs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + block.getId());
			tag(BlockTags.SLABS).add(block.get());
		}

		for (RegistryObject<Block> block : ESPStairs.BLOCKS.getEntries()) {
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + block.getId());
			tag(BlockTags.STAIRS).add(block.get());
		}
	}
}