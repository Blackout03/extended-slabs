package com.blackout.extendedslabs.blocks.path;

import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class PathSlabBlock extends ESPSlabBlock {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialVerticalSlab;
    protected static final VoxelShape DOUBLE_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
    protected static final VoxelShape TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);

    public PathSlabBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
        super(characteristics, material, materialVerticalSlab, properties);
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
        this.characteristics = characteristics;
    }

    public PathSlabBlock(Block material, Supplier<Block> materialVerticalSlab, Properties properties) {
        this(IBlockCharacteristics.tag(), material, materialVerticalSlab, properties);
        this.material = material;
        this.materialVerticalSlab = materialVerticalSlab;
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
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        SlabType slabtype = state.getValue(TYPE);
        return switch (slabtype) {
            case DOUBLE -> DOUBLE_SHAPE;
            case TOP -> TOP_SHAPE;
            default -> BOTTOM_SHAPE;
        };
    }
}
