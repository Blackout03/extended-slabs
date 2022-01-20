package com.blackout.extendedslabs.blocks.copper;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class WeatheringCopperVerticalSlabBlock extends VerticalSlabBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public WeatheringCopperVerticalSlabBlock(WeatheringCopper.WeatherState weatherState, BlockBehaviour.Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    @SuppressWarnings("deprecation")
    public void randomTick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull Random random) {
        this.onRandomTick(blockState, serverLevel, blockPos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public WeatheringCopper.@NotNull WeatherState getAge() {
        return this.weatherState;
    }
}