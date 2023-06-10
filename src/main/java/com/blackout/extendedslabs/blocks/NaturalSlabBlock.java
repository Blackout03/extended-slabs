package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.blocks.slabified.TallGrassBlockSlabified;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.function.Supplier;

public class NaturalSlabBlock extends ESPSlabBlock implements SimpleWaterloggedBlock, IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialVerticalSlab;

	public NaturalSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
		super(characteristics, material, materialVerticalSlab, properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
		this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
	}

	public NaturalSlabBlock(Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
		this(IBlockCharacteristics.tag(), material, materialVerticalSlab, properties);
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
		this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
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

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
		return (state.getValue(SlabBlock.TYPE) == SlabType.TOP || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE)
				|| (state.getValue(SlabBlock.TYPE) == SlabType.BOTTOM && world.getBlockState(pos.above()).getBlock() instanceof TallGrassBlockSlabified);
	}
}
