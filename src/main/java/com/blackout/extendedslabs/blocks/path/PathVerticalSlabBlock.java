package com.blackout.extendedslabs.blocks.path;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
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
import net.minecraft.state.EnumProperty;
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

public class PathVerticalSlabBlock extends Block implements IWaterLoggable {

    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<VerticalSlabShape> SHAPE = EnumProperty.create("shape", VerticalSlabShape.class);

    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 15.0D, 0.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape EAST_SHAPE = Block.box(8.0D, 15.0D, 0.0D, 16.0D, 0.0D, 16.0D);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 15.0D, 16.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 15.0D, 0.0D, 8.0D, 0.0D, 16.0D);

    protected static final VoxelShape NORTH_OUTER_SHAPE = Block.box(0.0D, 15.0D, 0.0D, 8.0D, 0.0D, 8.0D);
    protected static final VoxelShape EAST_OUTER_SHAPE = Block.box(8.0D, 15.0D, 0.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape SOUTH_OUTER_SHAPE = Block.box(8.0D, 15.0D, 16.0D, 16.0D, 0.0D, 8.0D);
    protected static final VoxelShape WEST_OUTER_SHAPE = Block.box(0.0D, 15.0D, 8.0D, 8.0D, 0.0D, 16.0D);

    public PathVerticalSlabBlock(Block.Properties builder) {
        super(builder);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, SHAPE, WATERLOGGED);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        VerticalSlabShape verticalslabshape = state.getValue(SHAPE);
        Direction enumfacing = state.getValue(FACING);

        if (verticalslabshape != VerticalSlabShape.STRAIGHT) {
            switch (verticalslabshape) {
                case OUTER_LEFT:
                    return getOuterLeftFacingShapes(enumfacing);
                case OUTER_RIGHT:
                    return getOuterRightFacingShapes(enumfacing);
                case INNER_LEFT:
                    return getInnerLeftFacingShapes(enumfacing);
                case INNER_RIGHT:
                    return getInnerRightFacingShapes(enumfacing);
                default:
                    return getStraightFacingShapes(enumfacing);
            }
        } else {
            return getStraightFacingShapes(enumfacing);
        }
    }

    private static VoxelShape getStraightFacingShapes(Direction facing) {
        switch (facing) {
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            default:
                return NORTH_SHAPE;
        }
    }

    private static VoxelShape getOuterLeftFacingShapes(Direction facing) {
        switch (facing) {
            case WEST:
                return WEST_OUTER_SHAPE;
            case EAST:
                return EAST_OUTER_SHAPE;
            case SOUTH:
                return SOUTH_OUTER_SHAPE;
            default:
                return NORTH_OUTER_SHAPE;
        }
    }

    private static VoxelShape getInnerLeftFacingShapes(Direction facing) {
        switch (facing) {
            case WEST:
                return VoxelShapes.or(WEST_SHAPE, SOUTH_SHAPE);
            case EAST:
                return VoxelShapes.or(EAST_SHAPE, NORTH_SHAPE);
            case SOUTH:
                return VoxelShapes.or(SOUTH_SHAPE, EAST_SHAPE);
            default:
                return VoxelShapes.or(NORTH_SHAPE, WEST_SHAPE);
        }
    }

    private static VoxelShape getOuterRightFacingShapes(Direction facing) {
        switch (facing) {
            case WEST:
                return NORTH_OUTER_SHAPE;
            case EAST:
                return SOUTH_OUTER_SHAPE;
            case SOUTH:
                return WEST_OUTER_SHAPE;
            default:
                return EAST_OUTER_SHAPE;
        }
    }

    private static VoxelShape getInnerRightFacingShapes(Direction facing) {
        switch (facing) {
            case WEST:
                return VoxelShapes.or(WEST_SHAPE, NORTH_SHAPE);
            case EAST:
                return VoxelShapes.or(EAST_SHAPE, SOUTH_SHAPE);
            case SOUTH:
                return VoxelShapes.or(SOUTH_SHAPE, WEST_SHAPE);
            default:
                return VoxelShapes.or(NORTH_SHAPE, EAST_SHAPE);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockState iblockstate = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, ifluidstate.getType() == Fluids.WATER);
        return iblockstate.setValue(SHAPE, getSlabShape(iblockstate, context.getLevel(), context.getClickedPos()));
    }

    private static VerticalSlabShape getSlabShape(BlockState state, IWorld worldIn, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockState iblockstate = worldIn.getBlockState(pos.relative(direction));
        if (isBlockVerticalSlab(iblockstate)) {
            Direction direction1 = iblockstate.getValue(FACING);
            if (direction1.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, worldIn, pos, direction1.getOpposite())) {
                if (direction1 == direction.getCounterClockWise()) {
                    return VerticalSlabShape.OUTER_LEFT;
                }
                return VerticalSlabShape.OUTER_RIGHT;
            }
        }
        BlockState iblockstate1 = worldIn.getBlockState(pos.relative(direction.getOpposite()));
        if (isBlockVerticalSlab(iblockstate1)) {
            Direction direction2 = iblockstate1.getValue(FACING);
            if (direction2.getAxis() != state.getValue(FACING).getAxis() && isDifferentVerticalSlab(state, worldIn, pos, direction2)) {
                if (direction2 == direction.getCounterClockWise()) {
                    return VerticalSlabShape.INNER_LEFT;
                }
                return VerticalSlabShape.INNER_RIGHT;
            }
        }
        return VerticalSlabShape.STRAIGHT;
    }

    private static boolean isDifferentVerticalSlab(BlockState state, IWorld worldIn, BlockPos pos, Direction direction) {
        BlockState iblockstate = worldIn.getBlockState(pos.relative(direction));
        return !isBlockVerticalSlab(iblockstate) || iblockstate.getValue(FACING) != state.getValue(FACING);
    }

    public static boolean isBlockVerticalSlab(BlockState state) {
        return state.getBlock() instanceof VerticalSlabBlock || state.getBlock() instanceof FallingVerticalSlabBlock || state.getBlock() instanceof PathVerticalSlabBlock;
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    @Override
    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().willTickThisTick(currentPos, Fluids.WATER);
        }
        return facing.getAxis().isHorizontal() ? stateIn.setValue(SHAPE, getSlabShape(stateIn, worldIn, currentPos)) : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
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