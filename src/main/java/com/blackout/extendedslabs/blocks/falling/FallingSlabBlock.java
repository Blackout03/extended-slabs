package com.blackout.extendedslabs.blocks.falling;

import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import com.blackout.extendedslabs.blocks.slabified.ISlabified;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class FallingSlabBlock extends FallingBlock implements SimpleWaterloggedBlock, IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialVerticalSlab;
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public FallingSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
        super(properties);
        this.characteristics = characteristics;
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
    }

    public FallingSlabBlock(Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
        this(IBlockCharacteristics.tag(), material, materialVerticalSlab, properties);
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Supplier<Block> getMaterialVerticalSlab() {
        return materialVerticalSlab;
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (state.getValue(SlabBlock.TYPE) == SlabType.TOP || state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
            return super.canSustainPlant(state, world, pos, facing, plantable);
        } else if (state.is(BlockTags.SAND)) {
            return plant.getBlock() instanceof ISlabified && (PlantType.BEACH.equals(type) || PlantType.DESERT.equals(type) || plant.getBlock() instanceof DeadBushBlock);
        }
        return false;
    }

    public boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(TYPE) != SlabType.DOUBLE;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        SlabType slabtype = state.getValue(TYPE);
        return switch (slabtype) {
            case DOUBLE -> Shapes.block();
            case TOP -> TOP_SHAPE;
            default -> BOTTOM_SHAPE;
        };
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);
        if (blockstate.is(this)) {
            return blockstate.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, Boolean.FALSE);
        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
            Direction direction = context.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(TYPE, SlabType.TOP);
        }
    }

    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        ItemStack itemstack = useContext.getItemInHand();
        SlabType slabtype = state.getValue(TYPE);
        if (slabtype != SlabType.DOUBLE && itemstack.getItem() == this.asItem()) {
            if (useContext.replacingClickedOnBlock()) {
                boolean flag = useContext.getClickLocation().y - (double)useContext.getClickedPos().getY() > 0.5D;
                Direction direction = useContext.getClickedFace();
                if (slabtype == SlabType.BOTTOM) {
                    return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
                } else {
                    return direction == Direction.DOWN || !flag && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public boolean placeLiquid(@NotNull LevelAccessor worldIn, @NotNull BlockPos pos, BlockState state, @NotNull FluidState fluidStateIn) {
        return state.getValue(TYPE) != SlabType.DOUBLE && SimpleWaterloggedBlock.super.placeLiquid(worldIn, pos, state, fluidStateIn);
    }

    public boolean canPlaceLiquid(@NotNull BlockGetter worldIn, @NotNull BlockPos pos, BlockState state, @NotNull Fluid fluidIn) {
        return state.getValue(TYPE) != SlabType.DOUBLE && SimpleWaterloggedBlock.super.canPlaceLiquid(worldIn, pos, state, fluidIn);
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public @NotNull BlockState updateShape(BlockState stateIn, @NotNull Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor worldIn, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getFluidTicks().willTickThisTick(currentPos, Fluids.WATER);
        }

        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean isPathfindable(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull PathComputationType type) {
        if (type == PathComputationType.WATER) {
            return worldIn.getFluidState(pos).is(Fluids.WATER);
        }
        return false;
    }
}
