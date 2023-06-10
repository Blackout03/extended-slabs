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

public class TintedGlassStairBlock extends GlassStairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public TintedGlassStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties builder) {
		super(material, materialCorner, state, builder);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public TintedGlassStairBlock(Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties builder) {
		this(IBlockCharacteristics.tag(), material, materialCorner, state, builder);
		this.material = material;
		this.materialCorner = materialCorner;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Supplier<Block> getMaterialCorner() {
		return materialCorner;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return false;
	}

	public int getLightBlock(@NotNull BlockState p_154828_, BlockGetter p_154829_, @NotNull BlockPos p_154830_) {
		return p_154829_.getMaxLightLevel();
	}
}
