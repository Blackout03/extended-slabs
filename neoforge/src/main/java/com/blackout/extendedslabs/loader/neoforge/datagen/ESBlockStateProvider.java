package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPCornerBlock;
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
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.Map;
import java.util.Optional;

public class ESBlockStateProvider extends ModelProvider {
	private static final ModelTemplate VERTICAL_SLAB = block("vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
	private static final ModelTemplate INNER_VERTICAL_SLAB = block("inner_vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
	private static final ModelTemplate OUTER_VERTICAL_SLAB = block("outer_vertical_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
	private static final ModelTemplate CORNER = block("corner", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);

	private static final Map<Block, Block> WAXED_TEXTURE_SOURCES = Map.of(
			Blocks.CUT_COPPER.waxed().unaffected(), Blocks.CUT_COPPER.weathering().unaffected(),
			Blocks.CUT_COPPER.waxed().exposed(), Blocks.CUT_COPPER.weathering().exposed(),
			Blocks.CUT_COPPER.waxed().weathered(), Blocks.CUT_COPPER.weathering().weathered(),
			Blocks.CUT_COPPER.waxed().oxidized(), Blocks.CUT_COPPER.weathering().oxidized()
	);

	public ESBlockStateProvider(PackOutput packOutput) {
		super(packOutput, ExtendedSlabs.MODID);
	}

	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			switch (definition.type()) {
				case SLAB -> createESSlab(blockModels, definition);
				case VERTICAL_SLAB -> createESVerticalSlab(blockModels, definition);
				case STAIRS -> createESStairs(blockModels, definition);
				case CORNER -> createESCorner(blockModels, definition);
				case WALL -> createESWall(blockModels, definition);
				case FENCE -> createESFence(blockModels, definition);
				case FENCE_GATE -> createESFenceGate(blockModels, definition);
				case BUTTON -> createESButton(blockModels, definition);
				case PRESSURE_PLATE -> createESPressurePlate(blockModels, definition);
				default -> {
				}
			}
		}
	}

	private static ModelTemplate block(String parent, TextureSlot... requiredTextureKeys) {
		return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
	}

	private Identifier modLoc(String entry) {
		return Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, entry);
	}

	private TextureMapping baseBlockTextures(Block block) {
		Block textureSource = WAXED_TEXTURE_SOURCES.getOrDefault(block, block);
		TexturedModel texturedModel = BlockModelGenerators.TEXTURED_MODELS.get(textureSource);
		TextureMapping originalTextures = texturedModel != null
				? texturedModel.getMapping()
				: TextureMapping.cube(textureSource);

		Material side = firstTexture(
				originalTextures,
				TextureSlot.SIDE,
				TextureSlot.WALL,
				TextureSlot.TEXTURE,
				TextureSlot.ALL
		);
		Material top = firstTexture(
				originalTextures,
				TextureSlot.TOP,
				TextureSlot.END,
				TextureSlot.ALL
		);
		Material bottom = firstTexture(
				originalTextures,
				TextureSlot.BOTTOM,
				TextureSlot.END,
				TextureSlot.ALL
		);

		if (top == null) {
			top = side;
		}

		if (bottom == null) {
			bottom = side;
		}

		return new TextureMapping()
				.put(TextureSlot.ALL, side)
				.put(TextureSlot.TEXTURE, side)
				.put(TextureSlot.PARTICLE, side)
				.put(TextureSlot.WALL, side)
				.put(TextureSlot.SIDE, side)
				.put(TextureSlot.TOP, top)
				.put(TextureSlot.BOTTOM, bottom)
				.put(TextureSlot.END, top);
	}

	private Material firstTexture(TextureMapping textures, TextureSlot... slots) {
		for (TextureSlot slot : slots) {
			try {
				return textures.get(slot);
			} catch (IllegalStateException ignored) {
			}
		}

		return null;
	}

	private BlockModelGenerators.BlockFamilyProvider familyWithBaseBlockTextures(
			BlockModelGenerators blockModels,
			Block originalBlock
	) {
		return blockModels.new BlockFamilyProvider(baseBlockTextures(originalBlock));
	}

	private void createESSlab(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		SlabBlock slab = (SlabBlock) definition.block().get();

		blockModels.familyWithExistingFullBlock(definition.originalBlock()).slab(slab);
	}

	private void createESStairs(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		StairBlock stairs = (StairBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).stairs(stairs);
	}

	private void createESWall(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		WallBlock wall = (WallBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).wall(wall);
	}

	private void createESFence(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		FenceBlock fence = (FenceBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).fence(fence);
	}

	private void createESFenceGate(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		FenceGateBlock fenceGate = (FenceGateBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).fenceGate(fenceGate);
	}

	private void createESButton(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		ButtonBlock button = (ButtonBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).button(button);
	}

	private void createESPressurePlate(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		PressurePlateBlock pressurePlate = (PressurePlateBlock) definition.block().get();

		familyWithBaseBlockTextures(blockModels, definition.originalBlock()).pressurePlate(pressurePlate);
	}

	private void createESVerticalSlab(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		Block block = definition.block().get();
		String name = definition.id();

		TextureMapping textures = baseBlockTextures(definition.originalBlock());

		Identifier verticalSlab = VERTICAL_SLAB.create(modLoc("block/" + name), textures, blockModels.modelOutput);
		Identifier verticalSlabInner = INNER_VERTICAL_SLAB.create(modLoc("block/inner_" + name), textures, blockModels.modelOutput);
		Identifier verticalSlabOuter = OUTER_VERTICAL_SLAB.create(modLoc("block/outer_" + name), textures, blockModels.modelOutput);

		blockModels.blockStateOutput.accept(createVerticalSlabBlockStates(block, verticalSlab, verticalSlabInner, verticalSlabOuter));
		blockModels.registerSimpleItemModel(block, verticalSlab);
	}

	private void createESCorner(BlockModelGenerators blockModels, ESBlockDefinitions.BlockDefinition definition) {
		Block block = definition.block().get();
		String name = definition.id();

		TextureMapping textures = baseBlockTextures(definition.originalBlock());

		Identifier corner = CORNER.create(modLoc("block/" + name), textures, blockModels.modelOutput);
		MultiVariant model = BlockModelGenerators.plainVariant(corner);

		blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block)
				.with(PropertyDispatch.initial(ESPCornerBlock.FACING)
						.select(Direction.NORTH, model)
						.select(Direction.EAST, rotate(model, 90))
						.select(Direction.SOUTH, rotate(model, 180))
						.select(Direction.WEST, rotate(model, 270))));
		blockModels.registerSimpleItemModel(block, corner);
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