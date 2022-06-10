package com.blackout.extendedslabs.blocks.copper;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.util.CopperStateMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Random;

public class WeatheringCopperVerticalSlabBlock extends VerticalSlabBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public WeatheringCopperVerticalSlabBlock(BlockBehaviour.Properties properties, WeatheringCopper.WeatherState weatherState) {
        super(properties);
        this.weatherState = weatherState;
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        var stack = player.getItemInHand(hand);
        if (stack.getItem() == Items.HONEYCOMB) {
            var block = CopperStateMap.getWaxed(state.getBlock());
            if (block.isPresent()) {
                level.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
                level.levelEvent(player, 3003, pos, 0);
                stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }


    @Override
    public @NotNull Optional<BlockState> getNext(BlockState state) {
        return CopperStateMap.getIncrease(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    @SuppressWarnings("deprecation")
    public void randomTick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull Random random) {
        this.onRandomTick(blockState, serverLevel, blockPos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return CopperStateMap.getIncrease(state.getBlock()).isPresent();
    }

    @Override
    public @NotNull WeatherState getAge() {
        return this.weatherState;
    }
}