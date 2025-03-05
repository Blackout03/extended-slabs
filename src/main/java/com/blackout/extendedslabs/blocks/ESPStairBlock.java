package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.registry.ESPStairs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.IPlantable;
import net.neoforged.neoforge.common.ToolAction;
import net.neoforged.neoforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ESPStairBlock extends StairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public ESPStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, Properties properties) {
		super(() -> Block.stateById(1), properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public ESPStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner) {
		this(characteristics, material, materialCorner, Block.Properties.copy(material));
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public ESPStairBlock(Block material, Supplier<Block> materialCorner) {
		this(IBlockCharacteristics.tag(), material, materialCorner, Block.Properties.copy(material));
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

	@Override
	public void animateTick(BlockState p_221789_, Level p_221790_, BlockPos p_221791_, RandomSource p_221792_) {
		super.animateTick(p_221789_, p_221790_, p_221791_, p_221792_);
		if (this.getMaterial() == Blocks.MYCELIUM) {
			if (p_221792_.nextInt(10) == 0) {
				p_221790_.addParticle(ParticleTypes.MYCELIUM, (double) p_221791_.getX() + p_221792_.nextDouble(), (double) p_221791_.getY() + 1.1D, (double) p_221791_.getZ() + p_221792_.nextDouble(), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
		if (state.getValue(HALF) == Half.TOP) {
			return super.canSustainPlant(state, world, pos, facing, plantable);
		}
		return false;
	}

	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
		ItemStack itemStack = context.getItemInHand();
		if (!itemStack.canPerformAction(toolAction))
			return null;

		if (ToolActions.SHOVEL_FLATTEN == toolAction) {
			if (this.equals(ESPStairs.GRASS_BLOCK_STAIRS.get())
					|| this.equals(ESPStairs.DIRT_STAIRS.get())
					|| this.equals(ESPStairs.PODZOL_STAIRS.get())
					|| this.equals(ESPStairs.COARSE_DIRT_STAIRS.get())
					|| this.equals(ESPStairs.MYCELIUM_STAIRS.get())
					|| this.equals(ESPStairs.ROOTED_DIRT_STAIRS.get())) {
				return ESPStairs.DIRT_PATH_STAIRS.get().withPropertiesOf(state);
			}
		} else if (ToolActions.HOE_TILL == toolAction) {
			Block block = state.getBlock();
			if (block == ESPStairs.ROOTED_DIRT_STAIRS.get()) {
				if (!simulate && !context.getLevel().isClientSide) {
					Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
				}
				return ESPStairs.DIRT_STAIRS.get().withPropertiesOf(state);
			} else if ((block == ESPStairs.GRASS_BLOCK_STAIRS.get() || block == ESPStairs.DIRT_PATH_STAIRS.get()
					|| block == ESPStairs.DIRT_STAIRS.get() || block == ESPStairs.COARSE_DIRT_STAIRS.get())
					&& context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
				return block == ESPStairs.COARSE_DIRT_STAIRS.get() ? ESPStairs.DIRT_STAIRS.get().withPropertiesOf(state) : null;
			}
		}
		return null;
	}
}
