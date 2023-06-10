package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class TintedGlassSlabBlock extends GlassSlabBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialVerticalSlab;

	public TintedGlassSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
		super(characteristics, material, materialVerticalSlab, properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
	}

	public TintedGlassSlabBlock(Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
		this(IBlockCharacteristics.tag(), material, materialVerticalSlab, properties);
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Supplier<Block> getMaterialVerticalSlab() {
		return materialVerticalSlab;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return false;
	}

	public int getLightBlock(@NotNull BlockState p_154828_, BlockGetter p_154829_, @NotNull BlockPos p_154830_) {
		return p_154829_.getMaxLightLevel();
	}
}
