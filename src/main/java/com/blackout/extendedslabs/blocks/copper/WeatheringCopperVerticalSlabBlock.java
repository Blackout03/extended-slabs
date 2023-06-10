package com.blackout.extendedslabs.blocks.copper;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.util.CopperStateMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public class WeatheringCopperVerticalSlabBlock extends ESPVerticalSlabBlock implements WeatheringCopper, IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Block materialSlab;
    private WeatherState weatherState;

    public WeatheringCopperVerticalSlabBlock(List<TagKey<Block>> characteristics, Block material, Block materialSlab, Properties builder, WeatherState weatherState) {
        super(material, materialSlab, builder);
        this.characteristics = characteristics;
        this.material = material;
        this.materialSlab = materialSlab;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
    }

    public WeatheringCopperVerticalSlabBlock(Block material, Block materialSlab, Properties builder, WeatherState weatherState) {
        this(IBlockCharacteristics.tag(), material, materialSlab, builder, weatherState);
        this.material = material;
        this.materialSlab = materialSlab;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Block getMaterialSlab() {
        return materialSlab;
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

    @Override
    public void randomTick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull RandomSource random) {
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