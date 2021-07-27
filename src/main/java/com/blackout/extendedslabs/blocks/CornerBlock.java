package com.blackout.extendedslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;

public class CornerBlock extends HorizontalBlock implements IWaterLoggable {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 16.0D, 0.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape EAST_SHAPE = Block.box(8.0D, 16.0D, 0.0D, 16.0D, 0.0D, 16.0D);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 16.0D, 16.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 16.0D, 0.0D, 8.0D, 0.0D, 16.0D);

    protected static final VoxelShape NORTH_OUTER_SHAPE = Block.box(0.0D, 16.0D, 0.0D, 8.0D, 0.0D, 8.0D);
    protected static final VoxelShape EAST_OUTER_SHAPE = Block.box(8.0D, 16.0D, 0.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape SOUTH_OUTER_SHAPE = Block.box(8.0D, 16.0D, 16.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape WEST_OUTER_SHAPE = Block.box(0.0D, 16.0D, 8.0D, 8.0D, 0.0D, 16.0D);

    public CornerBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getClickedFace();
        FluidState iFluidState = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, iFluidState.getType() == Fluids.WATER);
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH:
            default:
                return VoxelShapes.or(NORTH_SHAPE, WEST_OUTER_SHAPE);
            case SOUTH:
                return VoxelShapes.or(SOUTH_SHAPE, EAST_OUTER_SHAPE);
            case WEST:
                return VoxelShapes.or(WEST_SHAPE, SOUTH_OUTER_SHAPE);
            case EAST:
                return VoxelShapes.or(EAST_SHAPE, NORTH_OUTER_SHAPE);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPlaceLiquid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return IWaterLoggable.super.canPlaceLiquid(worldIn, pos, state, fluidIn);
    }

    @Override
    public boolean placeLiquid(IWorld worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        return IWaterLoggable.super.placeLiquid(worldIn, pos, state, fluidStateIn);
    }
}
