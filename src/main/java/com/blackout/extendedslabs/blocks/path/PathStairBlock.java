package com.blackout.extendedslabs.blocks.path;

import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PathStairBlock extends ESPStairBlock implements IBlockCharacteristics {
    private final List<TagKey<Block>> characteristics;
    public Block material;
    public Supplier<Block> materialCorner;
    protected static final VoxelShape TOP_AABB = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
    protected static final VoxelShape OCTET_NNN = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
    protected static final VoxelShape OCTET_NNP = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
    protected static final VoxelShape OCTET_NPN = Block.box(0.0D, 7.0D, 0.0D, 8.0D, 15.0D, 8.0D);
    protected static final VoxelShape OCTET_NPP = Block.box(0.0D, 7.0D, 8.0D, 8.0D, 15.0D, 16.0D);
    protected static final VoxelShape OCTET_PNN = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
    protected static final VoxelShape OCTET_PNP = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape OCTET_PPN = Block.box(8.0D, 7.0D, 0.0D, 16.0D, 15.0D, 8.0D);
    protected static final VoxelShape OCTET_PPP = Block.box(8.0D, 7.0D, 8.0D, 16.0D, 15.0D, 16.0D);
    protected static final VoxelShape[] TOP_SHAPES = makeShapes(TOP_AABB, OCTET_NNN, OCTET_PNN, OCTET_NNP, OCTET_PNP);
    protected static final VoxelShape[] BOTTOM_SHAPES = makeShapes(BOTTOM_AABB, OCTET_NPN, OCTET_PPN, OCTET_NPP, OCTET_PPP);
    private static final int[] SHAPE_BY_STATE = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};

    public PathStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner) {
        super(characteristics, material, materialCorner);
        this.material = material;
        this.materialCorner = materialCorner;
        this.characteristics = characteristics;
    }

    public PathStairBlock(Block material, Supplier<Block> materialCorner) {
        this(IBlockCharacteristics.tag(), material, materialCorner);
        this.material = material;
        this.materialCorner = materialCorner;
    }

    @Override
    public List<TagKey<Block>> getCharacteristics() {
        return characteristics;
    }

    public Block getMaterial() {
        return material;
    }

    public Block getMaterialCorner() {
        return materialCorner.get();
    }

    private static VoxelShape[] makeShapes(VoxelShape pSlabShape, VoxelShape pNwCorner, VoxelShape pNeCorner, VoxelShape pSwCorner, VoxelShape pSeCorner) {
        return IntStream.range(0, 16).mapToObj((p_56945_) -> {
            return makeStairShape(p_56945_, pSlabShape, pNwCorner, pNeCorner, pSwCorner, pSeCorner);
        }).toArray((p_56949_) -> {
            return new VoxelShape[p_56949_];
        });
    }

    private static VoxelShape makeStairShape(int pBitfield, VoxelShape pSlabShape, VoxelShape pNwCorner, VoxelShape pNeCorner, VoxelShape pSwCorner, VoxelShape pSeCorner) {
        VoxelShape voxelshape = pSlabShape;
        if ((pBitfield & 1) != 0) {
            voxelshape = Shapes.or(pSlabShape, pNwCorner);
        }

        if ((pBitfield & 2) != 0) {
            voxelshape = Shapes.or(voxelshape, pNeCorner);
        }

        if ((pBitfield & 4) != 0) {
            voxelshape = Shapes.or(voxelshape, pSwCorner);
        }

        if ((pBitfield & 8) != 0) {
            voxelshape = Shapes.or(voxelshape, pSeCorner);
        }

        return voxelshape;
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return (pState.getValue(HALF) == Half.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(pState)]];
    }

    private int getShapeIndex(BlockState pState) {
        return pState.getValue(SHAPE).ordinal() * 4 + pState.getValue(FACING).get2DDataValue();
    }
}
