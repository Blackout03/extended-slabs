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
import com.blackout.extendedslabs.registry.ESPCorners;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
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
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import java.util.Objects;
import java.util.function.Function;

public class ESPBlockStateProvider extends BlockStateProvider {
	private final ESPBlockModelProvider espBlockModels;

	public ESPBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, ExtendedSlabs.MODID, exFileHelper);
		espBlockModels = new ESPBlockModelProvider(output, exFileHelper) {
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
		for (DeferredHolder<Block, ? extends Block> block : ESPSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("smooth_(?!basalt)|_slab", "");
			String originalTextureName = textureName;

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.equals("moss") || textureName.contains("dripstone") || textureName.contains("wart") || textureName.contains("amethyst") || textureName.contains("honeycomb") || textureName.contains("raw_") || textureName.contains("snow") ? textureName + "_block" : textureName.contains("brick") ? textureName + "s" : textureName);
			ResourceLocation originalTexture = mcRL(originalTextureName);
			if (currentBlock instanceof FallingSlabBlock fallingBlock) {
				fallingSlabBlock(fallingBlock, texture, texture);
			} else {
				SlabBlock slabBlock = (SlabBlock) currentBlock;
				if (textureName.contains("podzol")
						|| textureName.contains("mycelium")
						|| textureName.contains("nylium")
						|| textureName.contains("froglight")) {
					ResourceLocation doubleSlab = mcRL(textureName);
					ResourceLocation topSlab = espRL(textureName + "_slab_top");
					ResourceLocation bottomSlab = espRL(textureName + "_slab");
					slabBlock(slabBlock, doubleSlab, topSlab, bottomSlab);
				} else if (textureName.contains("hay")
						|| textureName.contains("magma")
						|| textureName.contains("dried_kelp")) {
					String blockTextureName = textureName + "_block";
					ResourceLocation doubleSlab = mcRL(blockTextureName);
					ResourceLocation topSlab = espRL(textureName + "_slab_top");
					ResourceLocation bottomSlab = espRL(textureName + "_slab");
					slabBlock(slabBlock, doubleSlab, topSlab, bottomSlab);
				} else if (textureName.contains("mushroom")) {
					String doubleSlabTexture = textureName.contains("_mushroom") ? textureName + "_block" : textureName;
					slabBlock(slabBlock, mcRL(doubleSlabTexture + "_inventory"), mcRL(doubleSlabTexture));
				} else if (slabBlock instanceof GlassSlabBlock) {
					slabBlockTranslucent(slabBlock, texture);
				} else {
					slabBlock(slabBlock, textureName.contains("_log") || textureName.contains("_stem") ? originalTexture : texture, textureName.contains("snow") ? originalTexture : texture);
				}
			}
		}

		for (DeferredHolder<Block, ? extends Block> block : ESPVerticalSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_slab", "$1_planks")
					.replaceAll("vertical_|petrified_|waxed_|smooth_(?!stone|basalt)|_slab", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.equals("moss") || textureName.contains("_mushroom") || textureName.contains("purpur") || textureName.contains("dripstone") || textureName.contains("wart") || textureName.contains("amethyst") || textureName.contains("honeycomb") || textureName.contains("raw_") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL((textureName.contains("quartz") || textureName.contains("hay")) ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL((textureName.contains("quartz") || textureName.contains("hay")) ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("dried_kelp") ? textureName + "_bottom" : textureName.contains("quartz") ? textureName + "_block_bottom" : textureName + "_top");
			if (textureName.contains("sandstone")) {
				if ((textureName.equals("sandstone") || textureName.equals("red_sandstone")) && !blockName.contains("smooth")) {
					verticalSlabBlock(currentBlock, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth")) {
					verticalSlabBlock(currentBlock, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					verticalSlabBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (blockName.contains("dried_kelp")) {
				verticalSlabBlock(currentBlock, sideTexture, bottomTexture, topTexture);
			} else if ((textureName.contains("quartz") && !textureName.contains("brick")) || textureName.contains("hay") || textureName.contains("froglight")) {
				if (blockName.contains("smooth_quartz")) {
					verticalSlabBlock(currentBlock, bottomTexture);
				} else {
					verticalSlabBlock(currentBlock, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassVerticalSlabBlock) {
				verticalSlabBlockTranslucent(currentBlock, texture);
			} else {
				verticalSlabBlock(currentBlock, texture);
			}
		}

		for (DeferredHolder<Block, ? extends Block> block : ESPStairs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("smooth_(?!basalt)|_stairs", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.equals("moss") || textureName.contains("_mushroom") || textureName.contains("purpur") || textureName.contains("dripstone") || textureName.contains("wart") || textureName.contains("amethyst") || textureName.contains("honeycomb") || textureName.contains("raw_") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL(textureName.contains("hay") ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL(textureName.contains("hay") ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("dried_kelp") ? textureName + "_bottom" : textureName + "_top");
			if (textureName.contains("sandstone")) {
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					stairsBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("dried_kelp")) {
				stairsBlock(currentBlock, sideTexture, bottomTexture, topTexture);
			} else if (textureName.contains("hay") || textureName.contains("froglight")) {
				stairsBlock(currentBlock, sideTexture, topTexture, topTexture);
			} else if (currentBlock instanceof FallingStairBlock) {
				fallingStairsBlock(currentBlock, texture);
			} else if (currentBlock instanceof GlassStairBlock stairBlock) {
				stairBlockTranslucent(stairBlock, texture);
			} else {
				stairsBlock(currentBlock, texture);
			}
		}

		for (DeferredHolder<Block, ? extends Block> block : ESPCorners.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_corner", "$1_planks")
					.replaceAll("petrified_|waxed_|smooth_(?!stone|basalt)|_corner", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.equals("moss") || textureName.contains("_mushroom") || textureName.contains("purpur") || textureName.contains("dripstone") || textureName.contains("wart") || textureName.contains("amethyst") || textureName.contains("honeycomb") || textureName.contains("raw_") ? textureName + "_block" : textureName.contains("brick") || textureName.contains("tile") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL((textureName.contains("quartz") || textureName.contains("hay")) ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL((textureName.contains("quartz") || textureName.contains("hay")) ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("dried_kelp") ? textureName + "_bottom" : textureName.contains("quartz") ? textureName + "_block_bottom" : textureName + "_top");
			if (textureName.contains("sandstone")) {
				if ((textureName.equals("sandstone") || textureName.equals("red_sandstone")) && !blockName.contains("smooth")) {
					cornerBlock(currentBlock, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth")) {
					cornerBlock(currentBlock, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					cornerBlock(currentBlock, texture, cutTexture, cutTexture);
				}
			} else if (blockName.contains("dried_kelp")) {
				cornerBlock(currentBlock, sideTexture, bottomTexture, topTexture);
			} else if ((textureName.contains("quartz") && !textureName.contains("brick")) || textureName.contains("hay") || textureName.contains("froglight")) {
				if (blockName.contains("smooth_quartz")) {
					cornerBlock(currentBlock, bottomTexture);
				} else {
					cornerBlock(currentBlock, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassCornerBlock) {
				cornerBlockTranslucent(currentBlock, texture);
			} else {
				cornerBlock(currentBlock, texture);
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
		ModelFile doubleSlab = models().cubeBottomTop(name(block) + "_double", side, bottom, top).renderType("translucent");
		slabBlock(block, slab, slabTop, doubleSlab);
	}

	private void stairBlockTranslucent(StairBlock block, ResourceLocation texture) {
		stairBlockInternalTranslucent(block, texture, texture, texture);
	}

	private void stairBlockInternalTranslucent(StairBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		ModelFile stairs = models().stairsTranslucent(name(block), side, bottom, top);
		ModelFile stairsInner = models().stairsInnerTranslucent(name(block) + "_inner", side, bottom, top);
		ModelFile stairsOuter = models().stairsOuterTranslucent(name(block) + "_outer", side, bottom, top);
		stairsBlock(block, stairs, stairsInner, stairsOuter);
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
		return Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getPath();
	}

	public void fallingSlabBlock (FallingSlabBlock block, ResourceLocation doubleslab, ResourceLocation texture){
		fallingSlabBlock(block, doubleslab, texture, texture, texture);
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

	public void verticalSlabBlockTranslucent (Block block, ResourceLocation texture){
		verticalSlabBlockTranslucent(block, texture, texture, texture);
	}

	public void verticalSlabBlockTranslucent (Block block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		verticalSlabBlockInternalTranslucent(block, name(block), side, bottom, top);
	}

	private void verticalSlabBlockInternalTranslucent (Block block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
		ModelFile verticalSlab = models().withExistingParent(baseName, espRL("vertical_glass_slab_base")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
		ModelFile verticalSlabInner = models().withExistingParent("inner_" + baseName, espRL("inner_vertical_glass_slab_base")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
		ModelFile verticalSlabOuter = models().withExistingParent("outer_" + baseName, espRL("outer_vertical_glass_slab_base")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
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
		return BuiltInRegistries.BLOCK.getKey(block);
	}
}