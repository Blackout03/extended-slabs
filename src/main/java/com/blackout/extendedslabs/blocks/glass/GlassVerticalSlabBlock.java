package com.blackout.extendedslabs.blocks.glass;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassVerticalSlabBlock extends VerticalSlabBlock {
    public GlassVerticalSlabBlock(Properties builder) {
        super(builder);
    }

    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState blockState, BlockGetter blockReader, BlockPos blockPos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState blockState, BlockGetter blockReader, BlockPos blockPos) {
        return true;
    }
}
