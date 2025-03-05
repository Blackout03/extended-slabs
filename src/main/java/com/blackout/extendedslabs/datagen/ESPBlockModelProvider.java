package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.glass.GlassCornerBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassStairBlock;
import com.blackout.extendedslabs.blocks.glass.GlassVerticalSlabBlock;
import com.blackout.extendedslabs.registry.ESPCorners;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ESPBlockModelProvider extends BlockModelProvider {

	public ESPBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ExtendedSlabs.MODID, existingFileHelper);
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
	protected void registerModels() {
		for (DeferredHolder<Block, ? extends Block> block : ESPSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("smooth_(?!basalt)|_slab", "");

			if (textureName.contains("_wood")) {
				textureName = textureName.replaceAll("_wood", "_log");
			}

			if (textureName.contains("_hyphae")) {
				textureName = textureName.replaceAll("_hyphae", "_stem");
			}

			if (shouldSkipTextureName(textureName)) {
				continue;
			}

			ResourceLocation texture = mcRL(textureName.equals("moss") || textureName.contains("_mushroom") || textureName.contains("dripstone") || textureName.contains("wart") || textureName.contains("amethyst") || textureName.contains("honeycomb") || textureName.contains("raw_") ? textureName + "_block" : textureName.contains("brick") ? textureName + "s" : textureName);
			ResourceLocation sideTexture = mcRL(textureName.contains("hay") ? textureName + "_block_side" : textureName + "_side");
			ResourceLocation topTexture = mcRL(textureName.contains("hay") ? textureName + "_block_top" : textureName + "_top");
			ResourceLocation bottomTexture = mcRL(textureName.contains("dried_kelp") ? textureName + "_bottom" : textureName + "_top");
			if (textureName.contains("dried_kelp")) {
				espSlab(blockName, sideTexture, bottomTexture, topTexture);
				espSlabTop(blockName, sideTexture, bottomTexture, topTexture);
			} else if (textureName.contains("hay") || textureName.contains("froglight")) {
				espSlab(blockName, sideTexture, topTexture, topTexture);
				espSlabTop(blockName, sideTexture, topTexture, topTexture);
			} else if (currentBlock instanceof GlassSlabBlock) {
				espSlabTranslucent(blockName, texture, texture, texture);
				espSlabTopTranslucent(blockName, texture, texture, texture);
			} else {
				espSlab(blockName, texture, texture, texture);
				espSlabTop(blockName, texture, texture, texture);
			}
		}

		for (DeferredHolder<Block, ? extends Block> block : ESPVerticalSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_slab", "$1_planks")
					.replaceAll("vertical_|waxed_|smooth_(?!stone|basalt)|_slab", "");

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
				if (textureName.equals("sandstone") || textureName.equals("red_sandstone")) {
					verticalSlab(blockName, texture, bottomTexture, topTexture);
					innerVerticalSlab(blockName, texture, bottomTexture, topTexture);
					outerVerticalSlab(blockName, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth_sandstone") || blockName.contains("smooth_red_sandstone")) {
					verticalSlab(blockName, topTexture, topTexture, topTexture);
					innerVerticalSlab(blockName, topTexture, topTexture, topTexture);
					outerVerticalSlab(blockName, topTexture, topTexture, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					verticalSlab(blockName, texture, cutTexture, cutTexture);
					innerVerticalSlab(blockName, texture, cutTexture, cutTexture);
					outerVerticalSlab(blockName, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("dried_kelp")) {
				verticalSlab(blockName, sideTexture, bottomTexture, topTexture);
				innerVerticalSlab(blockName, sideTexture, bottomTexture, topTexture);
				outerVerticalSlab(blockName, sideTexture, bottomTexture, topTexture);
			} else if ((textureName.contains("quartz") && !textureName.contains("brick")) || textureName.contains("hay") || textureName.contains("froglight")) {
				if (blockName.contains("smooth_quartz")) {
					verticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
					innerVerticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
					outerVerticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
				} else {
					verticalSlab(blockName, sideTexture, topTexture, topTexture);
					innerVerticalSlab(blockName, sideTexture, topTexture, topTexture);
					outerVerticalSlab(blockName, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassVerticalSlabBlock) {
				verticalSlabTranslucent(blockName, texture, texture, texture);
				innerVerticalSlabTranslucent(blockName, texture, texture, texture);
				outerVerticalSlabTranslucent(blockName, texture, texture, texture);

			} else {
				verticalSlab(blockName, texture, texture, texture);
				innerVerticalSlab(blockName, texture, texture, texture);
				outerVerticalSlab(blockName, texture, texture, texture);
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
					stairs(blockName, texture, cutTexture, cutTexture);
					stairsInner(blockName, texture, cutTexture, cutTexture);
					stairsOuter(blockName, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("dried_kelp")) {
				stairs(blockName, sideTexture, bottomTexture, topTexture);
				stairsInner(blockName, sideTexture, bottomTexture, topTexture);
				stairsOuter(blockName, sideTexture, bottomTexture, topTexture);
			}  else if (textureName.contains("hay") || textureName.contains("froglight")) {
				stairs(blockName, sideTexture, topTexture, topTexture);
				stairsInner(blockName, sideTexture, topTexture, topTexture);
				stairsOuter(blockName, sideTexture, topTexture, topTexture);
			} else if (currentBlock instanceof GlassStairBlock) {
				stairsTranslucent(blockName, texture, texture, texture);
				stairsInnerTranslucent(blockName, texture, texture, texture);
				stairsOuterTranslucent(blockName, texture, texture, texture);

			} else {
				stairs(blockName, texture, texture, texture);
				stairsInner(blockName, texture, texture, texture);
				stairsOuter(blockName, texture, texture, texture);
			}
		}

		for (DeferredHolder<Block, ? extends Block> block : ESPCorners.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_corner", "$1_planks")
					.replaceAll("waxed_|smooth_(?!stone|basalt)|_corner", "");

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
				if (textureName.equals("sandstone") || textureName.equals("red_sandstone")) {
					corner(blockName, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth_sandstone") || blockName.contains("smooth_red_sandstone")) {
					corner(blockName, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					corner(blockName, texture, cutTexture, cutTexture);
				}
			} else if (blockName.contains("dried_kelp")) {
				corner(blockName, sideTexture, bottomTexture, topTexture);
			} else if ((textureName.contains("quartz") && !textureName.contains("brick")) || textureName.contains("hay") || textureName.contains("froglight")) {
				if (blockName.contains("smooth_quartz")) {
					corner(blockName, bottomTexture);
				} else {
					corner(blockName, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassCornerBlock) {
				cornerTranslucent(blockName, texture);
			} else {
				corner(blockName, texture);
			}
		}
	}

	public void cubeAllTranslucent(String name, ResourceLocation texture) {
		singleTexture(name, mcRL("cube_all"), "all", texture).renderType("translucent");
	}

	private void sideBottomTop(String name, ResourceLocation parent, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		withExistingParent(name, parent)
				.texture("side", side)
				.texture("bottom", bottom)
				.texture("top", top);
	}

	private ModelFile sideBottomTopTranslucent(String name, ResourceLocation parent, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return withExistingParent(name, parent)
				.renderType("translucent")
				.texture("side", side)
				.texture("bottom", bottom)
				.texture("top", top);
	}

	public ModelFile corner(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return withExistingParent(name, espRL("corner")).texture("side", side).texture("bottom", bottom).texture("top", top);
	}

	public ModelFile cornerTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return withExistingParent(name, espRL("glass_corner_base")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
	}

	public ModelFile corner(String name, ResourceLocation texture) {
		return corner(name, texture, texture, texture);
	}

	public ModelFile cornerTranslucent(String name, ResourceLocation texture) {
		return cornerTranslucent(name, texture, texture, texture);
	}

	public ModelFile stairsTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return sideBottomTopTranslucent(name, espRL("glass_stairs_base"), side, bottom, top);
	}

	public ModelFile stairsOuterTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return sideBottomTopTranslucent(name, espRL("glass_outer_stairs_base"), side, bottom, top);
	}

	public ModelFile stairsInnerTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return sideBottomTopTranslucent(name, espRL("glass_inner_stairs_base"), side, bottom, top);
	}

	public void espSlab(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTop(name, mcRL("slab"), side, bottom, top);
	}

	public void espSlabTop(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTop(name + "_top", mcRL("slab_top"), side, bottom, top);
	}

	public void espSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name, mcRL("slab"), side, bottom, top);
	}

	public void espSlabTopTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name + "_top", mcRL("slab_top"), side, bottom, top);
	}

	public void verticalSlab(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTop(name, espRL("vertical_slab"), side, bottom, top);
	}

	public void innerVerticalSlab(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTop("inner_" + name, espRL("inner_vertical_slab"), side, bottom, top);
	}

	public void outerVerticalSlab(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTop("outer_" + name, espRL("outer_vertical_slab"), side, bottom, top);
	}

	public void verticalSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name, espRL("vertical_glass_slab_base"), side, bottom, top);
	}

	public void innerVerticalSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent("inner_" + name, espRL("inner_vertical_glass_slab_base"), side, bottom, top);
	}

	public void outerVerticalSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent("outer_" + name, espRL("outer_vertical_glass_slab_base"), side, bottom, top);
	}

	private ResourceLocation mcRL(String location) {
		return new ResourceLocation("minecraft", BLOCK_FOLDER + "/" + location);
	}

	private ResourceLocation espRL(String location) {
		return new ResourceLocation("extendedslabs", BLOCK_FOLDER + "/" + location);
	}
}