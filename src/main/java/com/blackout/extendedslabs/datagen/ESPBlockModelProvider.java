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
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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
			if (currentBlock instanceof GlassSlabBlock) {
				this.espSlabTranslucent(blockName, texture, texture, texture);
				this.espSlabTopTranslucent(blockName, texture, texture, texture);
			} else {
				this.espSlab(blockName, texture, texture, texture);
				this.espSlabTop(blockName, texture, texture, texture);
			}
		}

		for (RegistryObject<Block> block : ESPVerticalSlabs.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_slab", "$1_planks")
					.replaceAll("vertical_|waxed_|smooth_|_slab", "");

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
					this.verticalSlab(blockName, texture, bottomTexture, topTexture);
					this.innerVerticalSlab(blockName, texture, bottomTexture, topTexture);
					this.outerVerticalSlab(blockName, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth_sandstone") || blockName.contains("smooth_red_sandstone")) {
					this.verticalSlab(blockName, topTexture, topTexture, topTexture);
					this.innerVerticalSlab(blockName, topTexture, topTexture, topTexture);
					this.outerVerticalSlab(blockName, topTexture, topTexture, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					this.verticalSlab(blockName, texture, cutTexture, cutTexture);
					this.innerVerticalSlab(blockName, texture, cutTexture, cutTexture);
					this.outerVerticalSlab(blockName, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("quartz")) {
				if (blockName.contains("smooth_quartz")) {
					this.verticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
					this.innerVerticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
					this.outerVerticalSlab(blockName, bottomTexture, bottomTexture, bottomTexture);
				} else {
					this.verticalSlab(blockName, sideTexture, topTexture, topTexture);
					this.innerVerticalSlab(blockName, sideTexture, topTexture, topTexture);
					this.outerVerticalSlab(blockName, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassVerticalSlabBlock) {
				this.verticalSlabTranslucent(blockName, texture, texture, texture);
				this.innerVerticalSlabTranslucent(blockName, texture, texture, texture);
				this.outerVerticalSlabTranslucent(blockName, texture, texture, texture);

			} else {
				this.verticalSlab(blockName, texture, texture, texture);
				this.innerVerticalSlab(blockName, texture, texture, texture);
				this.outerVerticalSlab(blockName, texture, texture, texture);
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
					this.stairs(blockName, texture, cutTexture, cutTexture);
					this.stairsInner(blockName, texture, cutTexture, cutTexture);
					this.stairsOuter(blockName, texture, cutTexture, cutTexture);
				}
			} else if (currentBlock instanceof GlassStairBlock) {
				this.stairsTranslucent(blockName, texture, texture, texture);
				this.stairsInnerTranslucent(blockName, texture, texture, texture);
				this.stairsOuterTranslucent(blockName, texture, texture, texture);

			} else {
				this.stairs(blockName, texture, texture, texture);
				this.stairsInner(blockName, texture, texture, texture);
				this.stairsOuter(blockName, texture, texture, texture);
			}
		}

		for (RegistryObject<Block> block : ESPCorners.BLOCKS.getEntries()) {
			Block currentBlock = block.get();
			String blockName = block.getId().getPath();
			String textureName = blockName.replaceAll("(oak|spruce|birch|jungle|acacia|dark_oak|mangrove|cherry|bamboo|crimson|warped)_corner", "$1_planks")
					.replaceAll("waxed_|smooth_|_corner", "");

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
					this.corner(blockName, texture, bottomTexture, topTexture);
				}
				if (blockName.contains("smooth_sandstone") || blockName.contains("smooth_red_sandstone")) {
					this.corner(blockName, topTexture, topTexture, topTexture);
				}
				if (textureName.equals("cut_sandstone") || textureName.equals("cut_red_sandstone")) {
					ResourceLocation cutTexture = mcRL(textureName.contains("red_") ? "red_sandstone_top" : "sandstone_top");
					this.corner(blockName, texture, cutTexture, cutTexture);
				}
			} else if (textureName.contains("quartz")) {
				if (blockName.contains("smooth_quartz")) {
					this.corner(blockName, bottomTexture, bottomTexture, bottomTexture);
				} else {
					this.corner(blockName, sideTexture, topTexture, topTexture);
				}
			} else if (currentBlock instanceof GlassCornerBlock) {
				this.cornerTranslucent(blockName, texture);
			} else {
				this.corner(blockName, texture);
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

	private void sideBottomTopTranslucent(String name, ResourceLocation parent, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		withExistingParent(name, parent)
				.renderType("translucent")
				.texture("side", side)
				.texture("bottom", bottom)
				.texture("top", top);
	}

	public ModelFile corner(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return withExistingParent(name, espRL("corner")).texture("side", side).texture("bottom", bottom).texture("top", top);
	}

	public ModelFile cornerTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		return withExistingParent(name, espRL("corner")).texture("side", side).texture("bottom", bottom).texture("top", top).renderType("translucent");
	}

	public ModelFile corner(String name, ResourceLocation texture) {
		return corner(name, texture, texture, texture);
	}

	public ModelFile cornerTranslucent(String name, ResourceLocation texture) {
		return cornerTranslucent(name, texture, texture, texture);
	}

	public void stairsTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name, mcRL("stairs"), side, bottom, top);
	}

	public void stairsOuterTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name, mcRL("outer_stairs"), side, bottom, top);
	}

	public void stairsInnerTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent(name, mcRL("inner_stairs"), side, bottom, top);
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
		sideBottomTopTranslucent(name, espRL("vertical_slab"), side, bottom, top);
	}

	public void innerVerticalSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent("inner_" + name, espRL("inner_vertical_slab"), side, bottom, top);
	}

	public void outerVerticalSlabTranslucent(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		sideBottomTopTranslucent("outer_" + name, espRL("outer_vertical_slab"), side, bottom, top);
	}

	private ResourceLocation mcRL(String location) {
		return new ResourceLocation("minecraft", BLOCK_FOLDER + "/" + location);
	}

	private ResourceLocation espRL(String location) {
		return new ResourceLocation("extendedslabs", BLOCK_FOLDER + "/" + location);
	}
}