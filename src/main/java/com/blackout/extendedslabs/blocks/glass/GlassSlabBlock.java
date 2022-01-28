package com.blackout.extendedslabs.blocks.glass;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassSlabBlock extends SlabBlock {
    public GlassSlabBlock(Properties builder) {
        super(builder);
    }

    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState blockState, IBlockReader blockReader, BlockPos blockPos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState blockState, IBlockReader blockReader, BlockPos blockPos) {
        return true;
    }
}
