package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ESBlockStateProvider extends BlockStateProvider {
	public ESBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ExtendedSlabs.MODID, existingFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			ResourceLocation texture = mcLoc("block/" + definition.textureName());

			switch (definition.type()) {
				case SLAB -> slabBlock((SlabBlock) definition.block().get(), texture, texture, texture);
				case VERTICAL_SLAB -> verticalSlabBlock(definition.block().get(), definition, texture, texture, texture);
				case STAIRS -> stairsBlock((StairBlock) definition.block().get(), texture);
				case CORNER -> cornerBlock(definition.block().get(), definition, texture, texture, texture);
			}
		}
	}

	private void verticalSlabBlock(Block block, ESBlockDefinitions.BlockDefinition definition, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		String name = definition.id();
		ModelFile verticalSlab = models().withExistingParent(name, modLoc("block/vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
		ModelFile verticalSlabInner = models().withExistingParent("inner_" + name, modLoc("block/inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
		ModelFile verticalSlabOuter = models().withExistingParent("outer_" + name, modLoc("block/outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);

		getVariantBuilder(block)
				.forAllStatesExcept(state -> {
					Direction facing = state.getValue(ESPVerticalSlabBlock.FACING);
					VerticalSlabShape shape = state.getValue(ESPVerticalSlabBlock.SHAPE);
					int yRot = (int) facing.getClockWise().toYRot();

					if (shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.OUTER_LEFT) {
						yRot += 270;
					}

					yRot %= 360;
					return ConfiguredModel.builder()
							.modelFile(shape == VerticalSlabShape.STRAIGHT ? verticalSlab : shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.INNER_RIGHT ? verticalSlabInner : verticalSlabOuter)
							.rotationY(yRot)
							.uvLock(yRot != 0)
							.build();
				}, ESPVerticalSlabBlock.WATERLOGGED);
	}

	private void cornerBlock(Block block, ESBlockDefinitions.BlockDefinition definition, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
		ModelFile corner = models().withExistingParent(definition.id(), modLoc("block/corner")).texture("side", side).texture("bottom", bottom).texture("top", top);

		getVariantBuilder(block)
				.forAllStatesExcept(state -> ConfiguredModel.builder()
						.modelFile(corner)
						.uvLock(true)
						.rotationY(((int) state.getValue(ESPCornerBlock.FACING).toYRot() + 180) % 360)
						.build(), ESPCornerBlock.WATERLOGGED);
	}
}
