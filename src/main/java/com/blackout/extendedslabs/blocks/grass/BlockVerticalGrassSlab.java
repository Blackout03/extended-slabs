package com.blackout.extendedslabs.blocks.grass;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockVerticalGrassSlab extends BlockVerticalSlab {
    public BlockVerticalGrassSlab(BlockBehaviour.Properties builder) {
        super(builder);
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }

    @Override
    public boolean placeLiquid(LevelAccessor worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        return false;
    }
}
