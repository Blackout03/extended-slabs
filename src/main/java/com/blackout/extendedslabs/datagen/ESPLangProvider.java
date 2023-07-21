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
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class ESPLangProvider extends LanguageProvider {
	public ESPLangProvider(PackOutput output) {
		super(output, ExtendedSlabs.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		this.add(ESPCreativeTabs.EXTENDED_SLABS.get().getDisplayName().getString(), ExtendedSlabs.MODNAME);

		final Collection<RegistryObject<Block>> slabifiedBlocks = ESPSlabifiedBlocks.BLOCKS.getEntries();
		for (RegistryObject<Block> block : slabifiedBlocks) {
			Block currentBlock = block.get();
			if (currentBlock instanceof ISlabified slabifiedBlock) {
				this.add(currentBlock, slabifiedBlock.getBlockOf().getName().getString());
			}
		}
		final Collection<RegistryObject<Block>> cornerBlocks = ESPCorners.BLOCKS.getEntries();
		for (RegistryObject<Block> block : cornerBlocks) {
			if (block.get() instanceof ESPCornerBlock cornerBlock) {
				this.add(cornerBlock, cornerBlock.getMaterial().getName().getString() + " Corner");
			} else if (block.get() instanceof FallingCornerBlock cornerBlock) {
				this.add(cornerBlock, cornerBlock.getMaterial().getName().getString() + " Corner");
			}
		}
		final Collection<RegistryObject<Block>> slabBlocks = ESPSlabs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : slabBlocks) {
			if (block.get() instanceof ESPSlabBlock slabBlock) {
				this.add(slabBlock, slabBlock.getMaterial().getName().getString() + " Slab");
			} else if (block.get() instanceof FallingSlabBlock slabBlock) {
				this.add(slabBlock, slabBlock.getMaterial().getName().getString() + " Slab");
			}
		}
		final Collection<RegistryObject<Block>> stairBlocks = ESPStairs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : stairBlocks) {
			if (block.get() instanceof ESPStairBlock stairBlock) {
				this.add(stairBlock, stairBlock.getMaterial().getName().getString() + " Stairs");
			} else if (block.get() instanceof FallingStairBlock stairBlock) {
				this.add(stairBlock, stairBlock.getMaterial().getName().getString() + " Stairs");
			}
		}
		final Collection<RegistryObject<Block>> verticalSlabBlocks = ESPVerticalSlabs.BLOCKS.getEntries();
		for (RegistryObject<Block> block : verticalSlabBlocks) {
			if (block.get() instanceof ESPVerticalSlabBlock verticalSlabBlock) {
				this.add(verticalSlabBlock, "Vertical " + verticalSlabBlock.getMaterial().getName().getString() + " Slab");
			} else if (block.get() instanceof FallingVerticalSlabBlock verticalSlabBlock) {
				this.add(verticalSlabBlock, "Vertical " + verticalSlabBlock.getMaterial().getName().getString() + " Slab");
			}
		}
	}
}
