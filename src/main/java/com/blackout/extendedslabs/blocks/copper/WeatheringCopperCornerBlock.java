package com.blackout.extendedslabs.blocks.copper;

import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.util.CopperStateMap;
import net.minecraft.core.BlockPos;
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
import java.util.function.Supplier;

public class WeatheringCopperCornerBlock extends ESPCornerBlock implements WeatheringCopper, IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialSlab;
    private WeatherState weatherState;

    public WeatheringCopperCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialSlab, WeatherState weatherState) {
        super(material, materialSlab);
        this.characteristics = characteristics;
        this.material = material;
        this.materialSlab = materialSlab;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    public WeatheringCopperCornerBlock(Block material, Supplier<Block> materialSlab, Properties properties, WeatherState weatherState) {
        this(IBlockCharacteristics.tag(), material, materialSlab, weatherState);
        this.material = material;
        this.materialSlab = materialSlab;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Block getMaterialSlab() {
        return materialSlab.get();
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