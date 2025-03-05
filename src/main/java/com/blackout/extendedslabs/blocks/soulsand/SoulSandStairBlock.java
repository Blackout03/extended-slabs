package com.blackout.extendedslabs.blocks.soulsand;

import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.IBlockCharacteristics;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SoulSandStairBlock extends ESPStairBlock implements IBlockCharacteristics {
	private static final int BUBBLE_COLUMN_CHECK_DELAY = 20;
	private final List<TagKey<Block>> characteristics;
	public Block material;
	public Supplier<Block> materialCorner;

	protected static final VoxelShape COLLISION_TOP_AABB = SoulSandSlabBlock.COLLISION_TOP_AABB;
	protected static final VoxelShape COLLISION_BOTTOM_AABB = SoulSandSlabBlock.COLLISION_BOTTOM_AABB;
	protected static final VoxelShape COLLISION_OCTET_NNN = Block.box(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
	protected static final VoxelShape COLLISION_OCTET_NNP = Block.box(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
	protected static final VoxelShape COLLISION_OCTET_NPN = Block.box(0.0, 8.0, 0.0, 8.0, 14.0, 8.0);
	protected static final VoxelShape COLLISION_OCTET_NPP = Block.box(0.0, 8.0, 8.0, 8.0, 14.0, 16.0);
	protected static final VoxelShape COLLISION_OCTET_PNN = Block.box(8.0, 0.0, 0.0, 16.0, 6.0, 8.0);
	protected static final VoxelShape COLLISION_OCTET_PNP = Block.box(8.0, 0.0, 8.0, 16.0, 6.0, 16.0);
	protected static final VoxelShape COLLISION_OCTET_PPN = Block.box(8.0, 8.0, 0.0, 16.0, 14.0, 8.0);
	protected static final VoxelShape COLLISION_OCTET_PPP = Block.box(8.0, 8.0, 8.0, 16.0, 14.0, 16.0);
	protected static final VoxelShape[] COLLISION_TOP_SHAPES = makeShapes(COLLISION_TOP_AABB, COLLISION_OCTET_NNN, COLLISION_OCTET_PNN, COLLISION_OCTET_NNP, COLLISION_OCTET_PNP);
	protected static final VoxelShape[] COLLISION_BOTTOM_SHAPES = makeShapes(COLLISION_BOTTOM_AABB, COLLISION_OCTET_NPN, COLLISION_OCTET_PPN, COLLISION_OCTET_NPP, COLLISION_OCTET_PPP);
	private static final int[] SHAPE_BY_STATE = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};

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

	public SoulSandStairBlock(List<TagKey<Block>> characteristics, Block material, Supplier<Block> materialCorner) {
		super(material, materialCorner);
		this.characteristics = characteristics;
		this.material = material;
		this.materialCorner = materialCorner;
	}

	public SoulSandStairBlock(Block material, Supplier<Block> materialCorner) {
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

	@Override
	public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return (pState.getValue(HALF) == Half.TOP ? COLLISION_TOP_SHAPES : COLLISION_BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(pState)]];
	}

	@Override
	public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pReader, BlockPos pPos) {
		return (pState.getValue(HALF) == Half.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(pState)]];
	}

	@Override
	public VoxelShape getVisualShape(BlockState pState, BlockGetter pReader, BlockPos pPos, CollisionContext pContext) {
		return (pState.getValue(HALF) == Half.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(pState)]];
	}

	private int getShapeIndex(BlockState pState) {
		return (pState.getValue(SHAPE)).ordinal() * 4 + (pState.getValue(FACING)).get2DDataValue();
	}

	@Override
	public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		BubbleColumnBlock.updateColumn(pLevel, pPos.above(), pState);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pFacing == Direction.UP && pFacingState.is(Blocks.WATER) || this.getFluidState(pState).is(Fluids.WATER)) {
			pLevel.scheduleTick(pCurrentPos, this, 20);
		}

		return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
		pLevel.scheduleTick(pPos, this, 20);
	}

	@Override
	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
		return false;
	}

	@Override
	public float getShadeBrightness(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return 0.2F;
	}
}
