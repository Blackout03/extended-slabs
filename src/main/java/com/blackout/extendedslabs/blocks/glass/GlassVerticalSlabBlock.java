package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassVerticalSlabBlock extends VerticalSlabBlock {
    public GlassVerticalSlabBlock(Properties builder) {
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
