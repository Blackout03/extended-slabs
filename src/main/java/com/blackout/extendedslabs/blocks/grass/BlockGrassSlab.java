package com.blackout.extendedslabs.blocks.grass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockGrassSlab extends SlabBlock {
    public BlockGrassSlab(Block.Properties builder) {
        super(builder);
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
