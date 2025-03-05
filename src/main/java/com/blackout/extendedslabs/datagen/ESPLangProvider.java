package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.*;
import com.blackout.extendedslabs.blocks.falling.FallingCornerBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingStairBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.slabified.ISlabified;
import com.blackout.extendedslabs.registry.*;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collection;

public class ESPLangProvider extends LanguageProvider {
	public ESPLangProvider(PackOutput output) {
		super(output, ExtendedSlabs.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		this.add(ESPCreativeTabs.EXTENDED_SLABS.get().getDisplayName().getString(), ExtendedSlabs.MODNAME);

		final Collection<DeferredHolder<Block, ? extends Block>> slabifiedBlocks = ESPSlabifiedBlocks.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : slabifiedBlocks) {
			Block currentBlock = block.get();
			if (currentBlock instanceof ISlabified slabifiedBlock) {
				this.add(currentBlock, slabifiedBlock.getBlockOf().getName().getString());
			}
		}
		final Collection<DeferredHolder<Block, ? extends Block>> cornerBlocks = ESPCorners.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : cornerBlocks) {
			if (block.get() instanceof ESPCornerBlock cornerBlock) {
				String name = cornerBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(cornerBlock, newName + " Corner");
			} else if (block.get() instanceof FallingCornerBlock cornerBlock) {
				String name = cornerBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(cornerBlock, newName + " Corner");
			}
		}
		final Collection<DeferredHolder<Block, ? extends Block>> slabBlocks = ESPSlabs.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : slabBlocks) {
			if (block.get() instanceof ESPSlabBlock slabBlock) {
				String name = slabBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(slabBlock, newName + " Slab");
			} else if (block.get() instanceof FallingSlabBlock slabBlock) {
				String name = slabBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(slabBlock, newName + " Slab");
			}
		}
		final Collection<DeferredHolder<Block, ? extends Block>> stairBlocks = ESPStairs.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : stairBlocks) {
			if (block.get() instanceof ESPStairBlock stairBlock) {
				String name = stairBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(stairBlock, newName + " Stairs");
			} else if (block.get() instanceof FallingStairBlock stairBlock) {
				String name = stairBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(stairBlock, newName + " Stairs");
			}
		}
		final Collection<DeferredHolder<Block, ? extends Block>> verticalSlabBlocks = ESPVerticalSlabs.BLOCKS.getEntries();
		for (DeferredHolder<Block, ? extends Block> block : verticalSlabBlocks) {
			if (block.get() instanceof ESPVerticalSlabBlock verticalSlabBlock) {
				String name = verticalSlabBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(verticalSlabBlock, "Vertical " + newName + " Slab");
			} else if (block.get() instanceof FallingVerticalSlabBlock verticalSlabBlock) {
				String name = verticalSlabBlock.getMaterial().getName().getString();
				String newName = name.contains("Bricks") ? name.replaceAll("Bricks", "Brick") : name.contains("Block") && !(name.contains("Grass") || name.contains(" of ")) ? name.replaceAll(" Block", "") : name.contains("Block of") ? name.replaceAll("Block of ", "") : name;
				this.add(verticalSlabBlock, "Vertical " + newName + " Slab");
			}
		}
	}
}
