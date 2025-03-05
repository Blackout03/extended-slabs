package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class GlassStairBlock extends ESPStairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public GlassStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner) {
		super(material, materialCorner);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public GlassStairBlock(Block material, Supplier<Block> materialCorner) {
		this(IBlockCharacteristics.tag(), material, materialCorner);
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

	public Block getMaterialCorner() {
		return materialCorner.get();
	}

	@OnlyIn(Dist.CLIENT)
	public float getShadeBrightness(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return 1.0F;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return true;
	}
}
