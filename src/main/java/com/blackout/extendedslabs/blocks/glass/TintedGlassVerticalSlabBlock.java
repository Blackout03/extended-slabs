package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TintedGlassVerticalSlabBlock extends GlassVerticalSlabBlock {
	public Block material;
	public Block materialSlab;

	public TintedGlassVerticalSlabBlock(Block material, Block materialSlab, Properties builder) {
		super(material, materialSlab, builder);
		this.material = material;
		this.materialSlab = materialSlab;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return false;
	}

	public int getLightBlock(BlockState p_154828_, BlockGetter p_154829_, BlockPos p_154830_) {
		return p_154829_.getMaxLightLevel();
	}
}
