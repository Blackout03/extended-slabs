package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class GlassStairBlock extends ESPStairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public GlassStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties builder) {
		super(material, materialCorner, state, builder);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public GlassStairBlock(Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties builder) {
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

	@OnlyIn(Dist.CLIENT)
	public float getShadeBrightness(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return 1.0F;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return true;
	}
}
