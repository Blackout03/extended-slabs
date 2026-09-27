package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;

import java.util.Optional;

public class ESBlockStateProvider extends ModelProvider {
	private static final ModelTemplate VERTICAL_SLAB = block("vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
	private static final ModelTemplate INNER_VERTICAL_SLAB = block("inner_vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
	private static final ModelTemplate OUTER_VERTICAL_SLAB = block("outer_vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);

	public ESBlockStateProvider(PackOutput packOutput) {
		super(packOutput, ExtendedSlabs.MODID);
	}

	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			switch (definition.type()) {
				case SLAB -> createESSlab(blockModels, definition);
				case VERTICAL_SLAB -> createESVerticalSlab(blockModels, definition);
				default -> {
				}
			}
		}
	}

	private static ModelTemplate block(String parent, TextureSlot... requiredTextureKeys) {
		return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
	}

	private Identifier mcLoc(String entry) {
		return Identifier.fromNamespaceAndPath("minecraft", entry);
	}

	private Identifier modLoc(String entry) {
		return Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, entry);
	}

	private void createESSlab(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		SlabBlock slab = (SlabBlock) definition.block().get();

		blockModels.familyWithExistingFullBlock(definition.originalBlock()).slab(slab);
	}

	private void createESVerticalSlab(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		Block block = definition.block().get();
		String name = definition.id();

		Material texture = new Material(mcLoc("block/" + definition.textureName()));
		TextureMapping textures = new TextureMapping()
				.put(TextureSlot.SIDE, texture)
				.put(TextureSlot.BOTTOM, texture)
				.put(TextureSlot.TOP, texture);

		Identifier verticalSlab = VERTICAL_SLAB.create(modLoc("block/" + name), textures, blockModels.modelOutput);
		Identifier verticalSlabInner = INNER_VERTICAL_SLAB.create(modLoc("block/inner_" + name), textures, blockModels.modelOutput);
		Identifier verticalSlabOuter = OUTER_VERTICAL_SLAB.create(modLoc("block/outer_" + name), textures, blockModels.modelOutput);

		blockModels.blockStateOutput.accept(createVerticalSlabBlockStates(block, verticalSlab, verticalSlabInner, verticalSlabOuter));
		blockModels.registerSimpleItemModel(block, verticalSlab);
	}

	private static BlockModelDefinitionGenerator createVerticalSlabBlockStates(Block block, Identifier verticalSlab, Identifier verticalSlabInner, Identifier verticalSlabOuter) {
		MultiVariant straight = BlockModelGenerators.plainVariant(verticalSlab);
		MultiVariant inner = BlockModelGenerators.plainVariant(verticalSlabInner);
		MultiVariant outer = BlockModelGenerators.plainVariant(verticalSlabOuter);

		return MultiVariantGenerator.dispatch(block)
				.with(PropertyDispatch.initial(ESPVerticalSlabBlock.FACING, ESPVerticalSlabBlock.SHAPE)
						.select(Direction.NORTH, VerticalSlabShape.STRAIGHT, variant(straight, Direction.NORTH, VerticalSlabShape.STRAIGHT))
						.select(Direction.EAST, VerticalSlabShape.STRAIGHT, variant(straight, Direction.EAST, VerticalSlabShape.STRAIGHT))
						.select(Direction.SOUTH, VerticalSlabShape.STRAIGHT, variant(straight, Direction.SOUTH, VerticalSlabShape.STRAIGHT))
						.select(Direction.WEST, VerticalSlabShape.STRAIGHT, variant(straight, Direction.WEST, VerticalSlabShape.STRAIGHT))

						.select(Direction.NORTH, VerticalSlabShape.INNER_LEFT, variant(inner, Direction.NORTH, VerticalSlabShape.INNER_LEFT))
						.select(Direction.EAST, VerticalSlabShape.INNER_LEFT, variant(inner, Direction.EAST, VerticalSlabShape.INNER_LEFT))
						.select(Direction.SOUTH, VerticalSlabShape.INNER_LEFT, variant(inner, Direction.SOUTH, VerticalSlabShape.INNER_LEFT))
						.select(Direction.WEST, VerticalSlabShape.INNER_LEFT, variant(inner, Direction.WEST, VerticalSlabShape.INNER_LEFT))

						.select(Direction.NORTH, VerticalSlabShape.INNER_RIGHT, variant(inner, Direction.NORTH, VerticalSlabShape.INNER_RIGHT))
						.select(Direction.EAST, VerticalSlabShape.INNER_RIGHT, variant(inner, Direction.EAST, VerticalSlabShape.INNER_RIGHT))
						.select(Direction.SOUTH, VerticalSlabShape.INNER_RIGHT, variant(inner, Direction.SOUTH, VerticalSlabShape.INNER_RIGHT))
						.select(Direction.WEST, VerticalSlabShape.INNER_RIGHT, variant(inner, Direction.WEST, VerticalSlabShape.INNER_RIGHT))

						.select(Direction.NORTH, VerticalSlabShape.OUTER_LEFT, variant(outer, Direction.NORTH, VerticalSlabShape.OUTER_LEFT))
						.select(Direction.EAST, VerticalSlabShape.OUTER_LEFT, variant(outer, Direction.EAST, VerticalSlabShape.OUTER_LEFT))
						.select(Direction.SOUTH, VerticalSlabShape.OUTER_LEFT, variant(outer, Direction.SOUTH, VerticalSlabShape.OUTER_LEFT))
						.select(Direction.WEST, VerticalSlabShape.OUTER_LEFT, variant(outer, Direction.WEST, VerticalSlabShape.OUTER_LEFT))

						.select(Direction.NORTH, VerticalSlabShape.OUTER_RIGHT, variant(outer, Direction.NORTH, VerticalSlabShape.OUTER_RIGHT))
						.select(Direction.EAST, VerticalSlabShape.OUTER_RIGHT, variant(outer, Direction.EAST, VerticalSlabShape.OUTER_RIGHT))
						.select(Direction.SOUTH, VerticalSlabShape.OUTER_RIGHT, variant(outer, Direction.SOUTH, VerticalSlabShape.OUTER_RIGHT))
						.select(Direction.WEST, VerticalSlabShape.OUTER_RIGHT, variant(outer, Direction.WEST, VerticalSlabShape.OUTER_RIGHT)));
	}

	private static MultiVariant variant(MultiVariant variant, Direction facing, VerticalSlabShape shape) {
		int yRot = (int) facing.getClockWise().toYRot();

		if (shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.OUTER_LEFT) {
			yRot += 270;
		}

		yRot %= 360;
		return rotate(variant, yRot);
	}

	private static MultiVariant rotate(MultiVariant variant, int yRot) {
		return switch (yRot) {
			case 90 -> variant.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90);
			case 180 -> variant.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180);
			case 270 -> variant.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270);
			default -> variant;
		};
	}
}