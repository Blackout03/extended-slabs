package com.blackout.extendedslabs.blocks.path;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class PathVerticalSlabBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<VerticalSlabShape> SHAPE = EnumProperty.create("shape", VerticalSlabShape.class);

    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 8.0D);
    protected static final VoxelShape EAST_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 15.0D, 16.0D);

    protected static final VoxelShape NORTH_OUTER_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 15.0D, 8.0D);
    protected static final VoxelShape EAST_OUTER_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 15.0D, 8.0D);
    protected static final VoxelShape SOUTH_OUTER_SHAPE = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape WEST_OUTER_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 15.0D, 16.0D);

    public PathVerticalSlabBlock(BlockBehaviour.Properties builder) {
        super(builder);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE, VerticalSlabShape.STRAIGHT).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, SHAPE, WATERLOGGED);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        VerticalSlabShape verticalslabshape = state.getValue(SHAPE);
        Direction enumfacing = state.getValue(FACING);

        if (verticalslabshape != VerticalSlabShape.STRAIGHT) {
            return switch (verticalslabshape) {
                case OUTER_LEFT -> getOuterLeftFacingShapes(enumfacing);
                case OUTER_RIGHT -> getOuterRightFacingShapes(enumfacing);
                case INNER_LEFT -> getInnerLeftFacingShapes(enumfacing);
                case INNER_RIGHT -> getInnerRightFacingShapes(enumfacing);
                default -> getStraightFacingShapes(enumfacing);
            };
        } else {
            return getStraightFacingShapes(enumfacing);
        }
    }

    private static VoxelShape getStraightFacingShapes(Direction facing) {
        return switch (facing) {
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            default -> NORTH_SHAPE;
        };
    }

    private static VoxelShape getOuterLeftFacingShapes(Direction facing) {
        return switch (facing) {
            case WEST -> WEST_OUTER_SHAPE;
            case EAST -> EAST_OUTER_SHAPE;
            case SOUTH -> SOUTH_OUTER_SHAPE;
            default -> NORTH_OUTER_SHAPE;
        };
    }

    private static VoxelShape getInnerLeftFacingShapes(Direction facing) {
        return switch (facing) {
            case WEST -> Shapes.or(WEST_SHAPE, SOUTH_SHAPE);
            case EAST -> Shapes.or(EAST_SHAPE, NORTH_SHAPE);
            case SOUTH -> Shapes.or(SOUTH_SHAPE, EAST_SHAPE);
            default -> Shapes.or(NORTH_SHAPE, WEST_SHAPE);
        };
    }

    private static VoxelShape getOuterRightFacingShapes(Direction facing) {
        return switch (facing) {
            case WEST -> NORTH_OUTER_SHAPE;
            case EAST -> SOUTH_OUTER_SHAPE;
            case SOUTH -> WEST_OUTER_SHAPE;
            default -> EAST_OUTER_SHAPE;
        };
    }

    private static VoxelShape getInnerRightFacingShapes(Direction facing) {
        return switch (facing) {
            case WEST -> Shapes.or(WEST_SHAPE, NORTH_SHAPE);
            case EAST -> Shapes.or(EAST_SHAPE, SOUTH_SHAPE);
            case SOUTH -> Shapes.or(SOUTH_SHAPE, WEST_SHAPE);
            default -> Shapes.or(NORTH_SHAPE, EAST_SHAPE);
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockState iblockstate = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, ifluidstate.getType() == Fluids.WATER);
        return iblockstate.setValue(SHAPE, getSlabShape(iblockstate, context.getLevel(), context.getClickedPos()));
    }

    private static VerticalSlabShape getSlabShape(BlockState state, Level worldIn, BlockPos pos) {
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

    private static boolean isDifferentVerticalSlab(BlockState state, Level worldIn, BlockPos pos, Direction direction) {
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
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }

        /* First round of updatePostPlacement */
        return facing.getAxis().isHorizontal() ? stateIn.setValue(SHAPE, getSlabShape(stateIn, (Level) worldIn, currentPos)) : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return SimpleWaterloggedBlock.super.canPlaceLiquid(worldIn, pos, state, fluidIn);
    }

    @Override
    public boolean placeLiquid(LevelAccessor worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        return SimpleWaterloggedBlock.super.placeLiquid(worldIn, pos, state, fluidStateIn);
    }
}