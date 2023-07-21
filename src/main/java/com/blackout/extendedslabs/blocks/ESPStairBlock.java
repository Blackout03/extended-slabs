package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.registry.ESPStairs;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ESPStairBlock extends StairBlock implements IBlockCharacteristics {
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	public ESPStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties properties) {
		super(state, properties);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public ESPStairBlock(Block material, Supplier<Block> materialCorner, Supplier<BlockState> state, Properties properties) {
		this(IBlockCharacteristics.tag(), material, materialCorner, state, properties);
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

	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
		ItemStack itemStack = context.getItemInHand();
		if (!itemStack.canPerformAction(toolAction))
			return null;

		if (ToolActions.HOE_TILL == toolAction) {
			Block block = state.getBlock();
			if (block == ESPStairs.ROOTED_DIRT_STAIRS.get()) {
				if (!simulate && !context.getLevel().isClientSide) {
					Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
				}
				return ESPStairs.DIRT_STAIRS.get().withPropertiesOf(state);
			} else if ((block == ESPStairs.DIRT_STAIRS.get() || block == ESPStairs.COARSE_DIRT_STAIRS.get())
					&& context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
				return block == ESPStairs.COARSE_DIRT_STAIRS.get() ? ESPStairs.DIRT_STAIRS.get().withPropertiesOf(state) : null;
			}
		}
		return null;
	}
}
