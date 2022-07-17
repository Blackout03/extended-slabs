package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPMaterial;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
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

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ESPSlabs.TUFF_SLAB.get(), ESPSlabs.CALCITE_SLAB.get(),
				ESPSlabs.DRIPSTONE_SLAB.get(), ESPSlabs.END_STONE_SLAB.get(),
				ESPSlabs.NETHERRACK_SLAB.get(), ESPSlabs.CRIMSON_NYLIUM_SLAB.get(),
				ESPSlabs.WARPED_NYLIUM_SLAB.get(), ESPSlabs.WHITE_CONCRETE_SLAB.get(),
				ESPSlabs.ORANGE_CONCRETE_SLAB.get(), ESPSlabs.MAGENTA_CONCRETE_SLAB.get(),
				ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), ESPSlabs.YELLOW_CONCRETE_SLAB.get(),
				ESPSlabs.LIME_CONCRETE_SLAB.get(), ESPSlabs.PINK_CONCRETE_SLAB.get(),
				ESPSlabs.GRAY_CONCRETE_SLAB.get(), ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(),
				ESPSlabs.CYAN_CONCRETE_SLAB.get(), ESPSlabs.PURPLE_CONCRETE_SLAB.get(),
				ESPSlabs.BLUE_CONCRETE_SLAB.get(), ESPSlabs.BROWN_CONCRETE_SLAB.get(),
				ESPSlabs.GREEN_CONCRETE_SLAB.get(), ESPSlabs.RED_CONCRETE_SLAB.get(),
				ESPSlabs.BLACK_CONCRETE_SLAB.get(), ESPSlabs.TERRACOTTA_SLAB.get(),
				ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(),
				ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
				ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_TERRACOTTA_SLAB.get(),
				ESPSlabs.PINK_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_TERRACOTTA_SLAB.get(),
				ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_TERRACOTTA_SLAB.get(),
				ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_TERRACOTTA_SLAB.get(),
				ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), ESPSlabs.GREEN_TERRACOTTA_SLAB.get(),
				ESPSlabs.RED_TERRACOTTA_SLAB.get(), ESPSlabs.BLACK_TERRACOTTA_SLAB.get(),
				ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(),
				ESPSlabs.PACKED_MUD_SLAB.get(), ESPStairs.TUFF_STAIRS.get(),
				ESPStairs.CALCITE_STAIRS.get(), ESPStairs.DRIPSTONE_STAIRS.get(),
				ESPStairs.END_STONE_STAIRS.get(), ESPStairs.NETHERRACK_STAIRS.get(),
				ESPStairs.PACKED_MUD_STAIRS.get(), ESPCorners.STONE_CORNER.get(),
				ESPCorners.COBBLESTONE_CORNER.get(), ESPCorners.STONE_BRICK_CORNER.get(),
				ESPCorners.ANDESITE_CORNER.get(), ESPCorners.POLISHED_ANDESITE_CORNER.get(),
				ESPCorners.DIORITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
				ESPCorners.GRANITE_CORNER.get(), ESPCorners.POLISHED_DIORITE_CORNER.get(),
				ESPCorners.TUFF_CORNER.get(), ESPCorners.CALCITE_CORNER.get(),
				ESPCorners.DRIPSTONE_CORNER.get(), ESPCorners.BLACKSTONE_CORNER.get(),
				ESPCorners.POLISHED_BLACKSTONE_CORNER.get(), ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get(),
				ESPCorners.NETHERRACK_CORNER.get(), ESPCorners.NETHER_BRICK_CORNER.get(),
				ESPCorners.RED_NETHER_BRICK_CORNER.get(), ESPCorners.END_STONE_CORNER.get(),
				ESPCorners.END_STONE_BRICK_CORNER.get(), ESPCorners.PURPUR_CORNER.get(),
				ESPCorners.PACKED_MUD_CORNER.get(), ESPCorners.MUD_BRICK_CORNER.get());
	}
}