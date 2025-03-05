package com.blackout.extendedslabs.blocks;

import com.blackout.extendedslabs.registry.ESPCorners;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.ToolAction;
import net.neoforged.neoforge.common.ToolActions;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ESPCornerBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock, IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialStair;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    protected static final VoxelShape EAST_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);

    protected static final VoxelShape NORTH_OUTER_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 8.0D);
    protected static final VoxelShape EAST_OUTER_SHAPE = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
    protected static final VoxelShape SOUTH_OUTER_SHAPE = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_OUTER_SHAPE = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 16.0D, 16.0D);

    public ESPCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialStair, Properties properties) {
        super(properties);
        this.characteristics = characteristics;
        this.material = material;
        this.materialStair = materialStair;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    public ESPCornerBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialStair) {
        this(characteristics, material, materialStair, Block.Properties.copy(material));
        this.material = material;
        this.materialStair = materialStair;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    public ESPCornerBlock(Block material, Supplier<Block> materialStair) {
        this(IBlockCharacteristics.tag(), material, materialStair, Block.Properties.copy(material));
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Block getMaterialStair() {
        return materialStair.get();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState iFluidState = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, iFluidState.getType() == Fluids.WATER);
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        Direction direction = state.getValue(FACING);
        return switch (direction) {
            case WEST -> Shapes.or(WEST_SHAPE, SOUTH_OUTER_SHAPE);
            case EAST -> Shapes.or(EAST_SHAPE, NORTH_OUTER_SHAPE);
            case SOUTH -> Shapes.or(SOUTH_SHAPE, EAST_OUTER_SHAPE);
            default -> Shapes.or(NORTH_SHAPE, WEST_OUTER_SHAPE);
        };
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull BlockState updateShape(BlockState stateIn, @NotNull Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor worldIn, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getFluidTicks().willTickThisTick(currentPos, Fluids.WATER);
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(@NotNull LevelAccessor worldIn, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull FluidState fluidStateIn) {
        return SimpleWaterloggedBlock.super.placeLiquid(worldIn, pos, state, fluidStateIn);
    }

    @Override
    public boolean canPlaceLiquid(@Nullable Player player, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Fluid fluidIn) {
        return SimpleWaterloggedBlock.super.canPlaceLiquid(player, worldIn, pos, state, fluidIn);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        ItemStack itemStack = context.getItemInHand();
        if (!itemStack.canPerformAction(toolAction))
            return null;

        if (ToolActions.HOE_TILL == toolAction) {
            Block block = state.getBlock();
            if (block == ESPCorners.ROOTED_DIRT_CORNER.get()) {
                if (!simulate && !context.getLevel().isClientSide) {
                    Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
                }
                return ESPCorners.DIRT_CORNER.get().withPropertiesOf(state);
            } else if ((block == ESPCorners.DIRT_CORNER.get() || block == ESPCorners.COARSE_DIRT_CORNER.get())
                    && context.getLevel().getBlockState(context.getClickedPos().above()).isAir()) {
                return block == ESPCorners.COARSE_DIRT_CORNER.get() ? ESPCorners.DIRT_CORNER.get().withPropertiesOf(state) : null;
            }
        }
        return null;
    }
}
