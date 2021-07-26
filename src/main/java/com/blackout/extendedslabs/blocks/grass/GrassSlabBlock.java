package com.blackout.extendedslabs.blocks.grass;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class GrassSlabBlock extends SlabBlock {
    public GrassSlabBlock(BlockBehaviour.Properties builder) {
        super(builder);
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
