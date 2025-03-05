package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.registry.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class ESPBlockTagsProvider extends IntrinsicHolderTagsProvider<Block> {
	public ESPBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, ExistingFileHelper existingFileHelper) {
		super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider provider) {
		final @NotNull Set<Map.Entry<ResourceKey<Block>, Block>> blocks = BuiltInRegistries.BLOCK.entrySet();
		Set<TagKey<Block>> tagSet = new HashSet<>();
		Set<Block> blockSet = new HashSet<>();

		for (Map.Entry<ResourceKey<Block>, Block> blockEntry : blocks) {
			Block block = blockEntry.getValue();
			if (block instanceof IBlockCharacteristics blockCharacteristics) {
				List<TagKey<Block>> characteristics = blockCharacteristics.getCharacteristics();
				tagSet.addAll(characteristics);
				blockSet.add(block);
			}
		}

		for (TagKey<Block> tag : tagSet) {
			for (Block block : blockSet) {
				if (block instanceof IBlockCharacteristics blockCharacteristics) {
					if (blockCharacteristics.getCharacteristics().contains(tag)) {
						ExtendedSlabs.LOGGER.info("Tag: " + tag.location() + " Block: " + BuiltInRegistries.BLOCK.getKey(block));
						this.tag(tag).add(block);
					}
				}
			}
		}

		for (DeferredHolder<Block, ? extends Block> blockDeferredHolder : ESPSlabs.BLOCKS.getEntries()) {
			Block block = blockDeferredHolder.get();
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.SLABS.location() + " Block: " + blockDeferredHolder.getId());
			this.tag(BlockTags.SLABS).add(block);
		}

		for (DeferredHolder<Block, ? extends Block> blockDeferredHolder : ESPVerticalSlabs.BLOCKS.getEntries()) {
			Block block = blockDeferredHolder.get();
			ExtendedSlabs.LOGGER.info("Tag: " + ESPTags.Blocks.VERTICAL_SLABS.location() + " Block: " + blockDeferredHolder.getId());
			this.tag(ESPTags.Blocks.VERTICAL_SLABS).add(block);
		}

		for (DeferredHolder<Block, ? extends Block> blockDeferredHolder : ESPStairs.BLOCKS.getEntries()) {
			Block block = blockDeferredHolder.get();
			ExtendedSlabs.LOGGER.info("Tag: " + BlockTags.STAIRS.location() + " Block: " + blockDeferredHolder.getId());
			this.tag(BlockTags.STAIRS).add(block);
		}

		for (DeferredHolder<Block, ? extends Block> blockDeferredHolder : ESPCorners.BLOCKS.getEntries()) {
			Block block = blockDeferredHolder.get();
			ExtendedSlabs.LOGGER.info("Tag: " + ESPTags.Blocks.CORNERS.location() + " Block: " + blockDeferredHolder.getId());
			this.tag(ESPTags.Blocks.CORNERS).add(block);
		}
	}
}