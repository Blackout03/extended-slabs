package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.ESPCornerBlock;
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

public class GlassCornerBlock extends ESPCornerBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialSlab;

	public GlassCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialSlab) {
		super(material, materialSlab);
		this.characteristics = characteristics;
		this.material = material;
		this.materialSlab = materialSlab;
	}

	public GlassCornerBlock(Block material, Supplier<Block> materialSlab) {
		this(IBlockCharacteristics.tag(), material, materialSlab);
		this.material = material;
		this.materialSlab = materialSlab;
	}

	@Override
	public List<TagKey<Block>> getCharacteristics() {
		return characteristics;
	}

	public Block getMaterial() {
		return material;
	}

	public Block getMaterialSlab() {
		return materialSlab.get();
	}

	@OnlyIn(Dist.CLIENT)
	public float getShadeBrightness(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return 1.0F;
	}

	public boolean propagatesSkylightDown(@NotNull BlockState blockState, @NotNull BlockGetter blockReader, @NotNull BlockPos blockPos) {
		return true;
	}
}
