package com.blackout.extendedslabs.blocks.slabified;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DoublePlantBlockSlabified extends DoublePlantBlock implements ISlabified {
    final Block blockOf;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    protected static final VoxelShape SHAPE = Block.box(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);

    public DoublePlantBlockSlabified(Properties properties, Block blockOf) {
        super(properties);
        this.blockOf = blockOf;
        this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER));
    }

    public Block getBlockOf() {
        return blockOf;
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        return !canSurvive(state, world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        if (blockState.getValue(HALF) != DoubleBlockHalf.UPPER) {
            return levelReader.getBlockState(blockPos.below()).is(BlockTags.SLABS)
                    && (levelReader.getBlockState(blockPos.below()).canSustainPlant(levelReader, blockPos, Direction.UP, this)
                    && levelReader.getBlockState(blockPos.below()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM);
        } else {
            BlockState belowPos = levelReader.getBlockState(blockPos.below());
            if (blockState.getBlock() != this) return super.canSurvive(blockState, levelReader, blockPos); //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return belowPos.is(this) && belowPos.getValue(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState) {
        return new ItemStack(blockOf.asItem());
    }
}
