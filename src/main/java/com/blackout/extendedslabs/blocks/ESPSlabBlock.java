package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.blocks.slabified.ISlabified;
import com.blackout.extendedslabs.registry.ESPSlabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DeadBushBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.common.extensions.IForgeBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ESPSlabBlock extends SlabBlock implements IBlockCharacteristics, IForgeBlock {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialVerticalSlab;

	public ESPSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
		super(properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialVerticalSlab = materialVerticalSlab;
		this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
	}

	public ESPSlabBlock(Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
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
		BlockState plant = plantable.getPlant(world, pos.relative(facing));
		PlantType type = plantable.getPlantType(world, pos.relative(facing));
		if (state.getValue(SlabBlock.TYPE) == SlabType.TOP || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
			return super.canSustainPlant(state, world, pos, facing, plantable);
		} else if (state.is(BlockTags.DIRT)) {
			return plant.getBlock() instanceof ISlabified && (PlantType.PLAINS.equals(type) || PlantType.BEACH.equals(type));
		} else if (state.is(BlockTags.TERRACOTTA)) {
			return plant.getBlock() instanceof ISlabified && plant.getBlock() instanceof DeadBushBlock;
		}
		return false;
	}

	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
		ItemStack itemStack = context.getItemInHand();
		if (!itemStack.canPerformAction(toolAction))
			return null;

		if (ToolActions.SHOVEL_FLATTEN == toolAction) {
			if (this.equals(ESPSlabs.GRASS_BLOCK_SLAB.get())
					|| this.equals(ESPSlabs.DIRT_SLAB.get())
					|| this.equals(ESPSlabs.PODZOL_SLAB.get())
					|| this.equals(ESPSlabs.COARSE_DIRT_SLAB.get())
					|| this.equals(ESPSlabs.MYCELIUM_SLAB.get())
					|| this.equals(ESPSlabs.ROOTED_DIRT_SLAB.get())) {
				return ESPSlabs.DIRT_PATH_SLAB.get().withPropertiesOf(state);
			}
		} else if (ToolActions.HOE_TILL == toolAction) {
			Block block = state.getBlock();
			if (block == ESPSlabs.ROOTED_DIRT_SLAB.get()) {
				if (!simulate && !context.getLevel().isClientSide) {
					Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
				}
				return ESPSlabs.DIRT_SLAB.get().withPropertiesOf(state);
			} else if ((block == ESPSlabs.GRASS_BLOCK_SLAB.get() || block == ESPSlabs.DIRT_PATH_SLAB.get()
					|| block == ESPSlabs.DIRT_SLAB.get() || block == ESPSlabs.COARSE_DIRT_SLAB.get())
					&& context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
				return block == ESPSlabs.COARSE_DIRT_SLAB.get() ? ESPSlabs.DIRT_SLAB.get().withPropertiesOf(state) : null;
			}
		}
		return null;
	}
}
