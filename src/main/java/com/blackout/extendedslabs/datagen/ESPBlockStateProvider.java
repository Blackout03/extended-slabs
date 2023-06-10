package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingStairBlock;
import com.blackout.extendedslabs.blocks.glass.GlassCornerBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassStairBlock;
import com.blackout.extendedslabs.blocks.glass.GlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Function;

public class ESPBlockStateProvider extends BlockStateProvider {
	private final ESPBlockModelProvider espBlockModels;

	public ESPBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, ExtendedSlabs.MODID, exFileHelper);
		this.espBlockModels = new ESPBlockModelProvider(output, exFileHelper) {
			@Override
			protected void registerModels() {
			}
		};
	}

	private boolean shouldSkipTextureName(String textureName) {
		return textureName.contains("grass_block")
				|| textureName.contains("dirt_path")
				|| textureName.contains("podzol")
				|| textureName.contains("mycelium")
				|| textureName.contains("crimson_nylium")
				|| textureName.contains("warped_nylium");
	}

	@Override
	protected void registerStatesAndModels() {
		for (RegistryObject<Block> block : ESPSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("_slab", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.contains("dripstone") ? textureName + "_block" : textureName);
			if (currentBlock instanceof FallingSlabBlock fallingBlock) {
				this.fallingSlabBlock(fallingBlock, texture, texture, texture, texture);
			} else {
				SlabBlock slabBlock = (SlabBlock) currentBlock;
				if (textureName.contains("podzol")
						|| textureName.contains("mycelium")
						|| textureName.contains("nylium")) {
					ResourceLocation doubleSlab = mcRL(textureName);
					ResourceLocation topSlab = espRL(textureName + "_slab_top");
					ResourceLocation bottomSlab = espRL(textureName + "_slab");
					this.slabBlock(slabBlock, doubleSlab, topSlab, bottomSlab);
				} else if (slabBlock instanceof GlassSlabBlock) {
					slabBlockTranslucent(slabBlock, texture);
				} else {
					this.slabBlock(slabBlock, texture, texture, texture, texture);
				}
			}
		}

		for (RegistryObject<Block> block : ESPVerticalSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_slab", "$1_planks")
					.replaceAll("vertical_|petrified_|waxed_|smooth_|_slab", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.contains("purpur") || textureName.contains("dripstone") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_bottom" : textureName + "_top");
			if (textureName.contains("sandstone")) {
				if (textureName.equals("sandstone") || textureName.equals("red_sandstone")) {
					this.verticalSlabBlock(currentBlock, texture, bottomTexture, topTexture);
				}
				if (blockName.equals("smooth_sandstone") || blockName.equals("smooth_red_sandstone")) {
					this.verticalSlabBlock(currentBlock, topTexture, topTexture, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					this.verticalSlabBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("quartz")) {
				if (blockName.contains("smooth_quartz")) {
					this.verticalSlabBlock(currentBlock, bottomTexture, bottomTexture, bottomTexture);
				} else {
					this.verticalSlabBlock(currentBlock, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassVerticalSlabBlock) {
				this.verticalSlabBlockTranslucent(currentBlock, texture, texture, texture);
			} else {
				this.verticalSlabBlock(currentBlock, texture, texture, texture);
			}
		}

		for (RegistryObject<Block> block : ESPStairs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("_stairs", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.contains("purpur") || textureName.contains("dripstone") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			if (textureName.contains("sandstone")) {
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					this.stairsBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (currentBlock instanceof FallingStairBlock) {
				this.fallingStairsBlock(currentBlock, texture);
			} else if (currentBlock instanceof GlassStairBlock stairBlock) {
				this.stairsBlockWithRenderType(stairBlock, texture, texture, texture, "translucent");
			} else {
				this.stairsBlock(currentBlock, texture, texture, texture);
			}
		}

		for (RegistryObject<Block> block : ESPCorners.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_corner", "$1_planks")
					.replaceAll("petrified_|waxed_|smooth_|_corner", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.contains("purpur") || textureName.contains("dripstone") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("quartz") ? textureName + "_block_bottom" : textureName + "_top");
			if (textureName.contains("sandstone")) {
				if (textureName.equals("sandstone") || textureName.equals("red_sandstone")) {
					this.cornerBlock(currentBlock, texture, bottomTexture, topTexture);
				}
				if (blockName.equals("smooth_sandstone") || blockName.equals("smooth_red_sandstone")) {
					this.cornerBlock(currentBlock, topTexture, topTexture, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					this.cornerBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("quartz")) {
				if (blockName.contains("smooth_quartz")) {
					this.cornerBlock(currentBlock, bottomTexture, bottomTexture, bottomTexture);
				} else {
					this.cornerBlock(currentBlock, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassCornerBlock) {
				this.cornerBlockTranslucent(currentBlock, texture);
			} else {
				this.cornerBlock(currentBlock, texture);
			}
		}
	}

	public ESPBlockModelProvider models () {
		return espBlockModels;
	}

	public void slabBlock (SlabBlock block, ResourceLocation doubleslab, ResourceLocation slabTop, ResourceLocation slabBottom){
		slabBlock(block, models().getExistingFile(slabBottom), models().getExistingFile(slabTop), models().getExistingFile(doubleslab));
	}

	private void slabBlockTranslucent(SlabBlock block, ResourceLocation texture) {
		slabBlockInternalTranslucent(block, texture, texture, texture);
	}

	private void slabBlockInternalTranslucent(SlabBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		ModelFile slab = models().slab(name(block), side, bottom, top).renderType("translucent");
		ModelFile slabTop = models().slabTop(name(block) + "_top", side, bottom, top).renderType("translucent");
		ModelFile doubleSlab = models().getExistingFile(new ResourceLocation("minecraft", name(block).replaceAll("_slab", "")));
		slabBlock(block, slab, slabTop, doubleSlab);
	}

	public void stairsBlock (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		stairsBlock((StairBlock) block, side, bottom, top);
	}

	public void stairsBlock (Block block, ResourceLocation texture){
		stairsBlock((StairBlock) block, texture, texture, texture);
	}

	public void fallingStairsBlock (Block block, ResourceLocation texture){
		fallingStairsBlock((FallingStairBlock) block, texture, texture, texture);
	}

	public void fallingStairsBlock (FallingStairBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		fallingStairsBlockInternal(block, key(block).toString(), side, bottom, top);
	}

	private void fallingStairsBlockInternal (FallingStairBlock block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		ModelFile stairs = models().stairs(baseName, side, bottom, top);
		ModelFile stairsInner = models().stairsInner(baseName + "_inner", side, bottom, top);
		ModelFile stairsOuter = models().stairsOuter(baseName + "_outer", side, bottom, top);
		fallingStairsBlock(block, stairs, stairsInner, stairsOuter);
	}

	public void fallingStairsBlock (FallingStairBlock block, ModelFile stairs, ModelFile stairsInner, ModelFile stairsOuter){
		getVariantBuilder(block)
				.forAllStatesExcept(state -> {
					Direction facing = state.getValue(StairBlock.FACING);
					Half half = state.getValue(StairBlock.HALF);
					StairsShape shape = state.getValue(StairBlock.SHAPE);
					int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
					if (shape == StairsShape.INNER_LEFT || shape == StairsShape.OUTER_LEFT) {
						yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
					}
					if (shape != StairsShape.STRAIGHT && half == Half.TOP) {
						yRot += 90; // Top stairs are rotated 90 degrees clockwise
					}
					yRot %= 360;
					boolean uvlock = yRot != 0 || half == Half.TOP; // Don't set uvlock for states that have no rotation
					return ConfiguredModel.builder()
							.modelFile(shape == StairsShape.STRAIGHT ? stairs : shape == StairsShape.INNER_LEFT || shape == StairsShape.INNER_RIGHT ? stairsInner : stairsOuter)
							.rotationX(half == Half.BOTTOM ? 0 : 180)
							.rotationY(yRot)
							.uvLock(uvlock)
							.build();
				}, StairBlock.WATERLOGGED);
	}

	public void cornerBlock (Block block, ResourceLocation texture){
		cornerBlock(block, texture, texture, texture);
	}

	public void cornerBlock (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		cornerBlock(block, models().corner(name(block), side, bottom, top));
	}

	public void cornerBlockTranslucent (Block block, ResourceLocation texture){
		cornerBlockTranslucent(block, texture, texture, texture);
	}

	public void cornerBlockTranslucent (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		cornerBlock(block, models().cornerTranslucent(name(block), side, bottom, top));
	}

	public void cornerBlock (Block block, ModelFile model){
		cornerBlock(block, $ -> model, 180);
	}

	public void cornerBlock (Block block, Function < BlockState, ModelFile > modelFunc,int angleOffset){
		getVariantBuilder(block)
				.forAllStates(state -> ConfiguredModel.builder()
						.modelFile(modelFunc.apply(state))
						.uvLock(true)
						.rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + angleOffset) % 360)
						.build()
				);
	}

	private String name (Block block){
		return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
	}

	public void fallingSlabBlock (FallingSlabBlock block, ResourceLocation doubleslab, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		fallingSlabBlock(block, models().slab(name(block), side, bottom, top), models().slabTop(name(block) + "_top", side, bottom, top), models().getExistingFile(doubleslab));
	}

	public void fallingSlabBlock (FallingSlabBlock block, ModelFile bottom, ModelFile top, ModelFile doubleslab){
		getVariantBuilder(block)
				.partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(bottom))
				.partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(top))
				.partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(doubleslab));
	}

	public void verticalSlabBlock (Block block, ResourceLocation texture){
		verticalSlabBlock(block, texture, texture, texture);
	}

	public void verticalSlabBlock (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		verticalSlabBlockInternal(block, name(block), side, bottom, top);
	}

	private void verticalSlabBlockInternal (Block block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		ModelFile verticalSlab = models().withExistingParent(baseName, espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
		ModelFile verticalSlabInner = models().withExistingParent("inner_" + baseName, espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
		ModelFile verticalSlabOuter = models().withExistingParent("outer_" + baseName, espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
		verticalSlabBlock(block, verticalSlab, verticalSlabInner, verticalSlabOuter);
	}

	public void verticalSlabBlockTranslucent (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		verticalSlabBlockInternalTranslucent(block, name(block), side, bottom, top);
	}

	private void verticalSlabBlockInternalTranslucent (Block block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		ModelFile verticalSlab = models().withExistingParent(baseName, espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
		ModelFile verticalSlabInner = models().withExistingParent("inner_" + baseName, espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
		ModelFile verticalSlabOuter = models().withExistingParent("outer_" + baseName, espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
		verticalSlabBlock(block, verticalSlab, verticalSlabInner, verticalSlabOuter);
	}

	public void verticalSlabBlock (Block block, ModelFile verticalSlab, ModelFile verticalSlabInner, ModelFile verticalSlabOuter){
		getVariantBuilder(block)
				.forAllStatesExcept(state -> {
					Direction facing = state.getValue(ESPVerticalSlabBlock.FACING);
					VerticalSlabShape shape = state.getValue(ESPVerticalSlabBlock.SHAPE);
					int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
					if (shape == VerticalSlabShape.INNER_LEFT) {
						yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
					}
					if (shape == VerticalSlabShape.OUTER_LEFT) {
						yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
					}
					yRot %= 360;
					boolean uvlock = yRot != 0; // Don't set uvlock for states that have no rotation
					return ConfiguredModel.builder()
							.modelFile(shape == VerticalSlabShape.STRAIGHT ? verticalSlab : shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.INNER_RIGHT ? verticalSlabInner : verticalSlabOuter)
							.rotationY(yRot)
							.uvLock(uvlock)
							.build();
				}, ESPVerticalSlabBlock.WATERLOGGED);
	}

	private ResourceLocation mcRL (String texture){
		return new ResourceLocation("minecraft", "block/" + texture);
	}

	private ResourceLocation espRL (String texture){
		return new ResourceLocation("extendedslabs", "block" + "/" + texture);
	}

	private ResourceLocation key (Block block){
		return ForgeRegistries.BLOCKS.getKey(block);
	}
}