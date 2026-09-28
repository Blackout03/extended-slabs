package com.blackout.extendedslabs.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ESBlockFamilies {
	private static final List<BlockFamily.Variant> SUPPORTED_VARIANTS = List.of(
			BlockFamily.Variant.SLAB,
			BlockFamily.Variant.STAIRS,
			BlockFamily.Variant.WALL,
			BlockFamily.Variant.FENCE,
			BlockFamily.Variant.CUSTOM_FENCE,
			BlockFamily.Variant.FENCE_GATE,
			BlockFamily.Variant.CUSTOM_FENCE_GATE,
			BlockFamily.Variant.BUTTON,
			BlockFamily.Variant.PRESSURE_PLATE
	);

	private static final List<ExtraFamily> EXTRA_FAMILIES = List.of(
			new ExtraFamily("dirt", Blocks.DIRT, BlockTags.MINEABLE_WITH_SHOVEL),
			new ExtraFamily("coarse_dirt", Blocks.COARSE_DIRT, BlockTags.MINEABLE_WITH_SHOVEL),
			new ExtraFamily("rooted_dirt", Blocks.ROOTED_DIRT, BlockTags.MINEABLE_WITH_SHOVEL),
			new ExtraFamily("calcite", Blocks.CALCITE, BlockTags.MINEABLE_WITH_PICKAXE),
			new ExtraFamily("mud", Blocks.MUD, BlockTags.MINEABLE_WITH_SHOVEL),
			new ExtraFamily("packed_mud", Blocks.PACKED_MUD, BlockTags.MINEABLE_WITH_PICKAXE)
	);

	static {
		EXTRA_FAMILIES.forEach(ESBlockFamilies::registerExtraFamily);

		BlockFamilies.getAllFamilies()
				.filter(ESBlockFamilies::hasSupportedVariant)
				.filter(ESBlockFamilies::isNotExtraFamily)
				.sorted(Comparator.comparing(ESBlockFamilies::baseBlockId))
				.forEach(ESBlockFamilies::registerFamily);
	}

	private static void registerExtraFamily(ExtraFamily family) {
		ESBlockDefinitions.family(
						family.idName(),
						blockId(family.originalBlock()),
						family.originalBlock(),
						family.tag()
				)
				.complete()
				.build();
	}

	private static boolean isNotExtraFamily(BlockFamily family) {
		return EXTRA_FAMILIES.stream()
				.noneMatch(extraFamily -> extraFamily.originalBlock() == family.getBaseBlock());
	}

	private static boolean hasSupportedVariant(BlockFamily family) {
		return SUPPORTED_VARIANTS.stream().anyMatch(family.getVariants()::containsKey);
	}

	private static void registerFamily(BlockFamily family) {
		Block originalBlock = family.getBaseBlock();
		String textureName = blockId(originalBlock);
		String idName = familyId(family);

		ESBlockDefinitions.FamilyBuilder builder = ESBlockDefinitions.family(
				idName,
				textureName,
				originalBlock,
				List.of()
		);

		useExistingSlab(builder, family);
		useExistingStairs(builder, family);
		useExistingWall(builder, family);
		useExistingFence(builder, family);
		useExistingFenceGate(builder, family);
		useExistingButton(builder, family);
		useExistingPressurePlate(builder, family);

		builder.complete().build();
	}

	private static void useExistingSlab(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = family.get(BlockFamily.Variant.SLAB);

		if (block != null) {
			builder.slab(blockId(block), block);
		}
	}

	private static void useExistingStairs(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = family.get(BlockFamily.Variant.STAIRS);

		if (block != null) {
			builder.stairs(blockId(block), block);
		}
	}

	private static void useExistingWall(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = family.get(BlockFamily.Variant.WALL);

		if (block != null) {
			builder.wall(blockId(block), block);
		}
	}

	private static void useExistingFence(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = firstExisting(
				family,
				BlockFamily.Variant.FENCE,
				BlockFamily.Variant.CUSTOM_FENCE
		);

		if (block != null) {
			builder.fence(blockId(block), block);
		}
	}

	private static void useExistingFenceGate(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = firstExisting(
				family,
				BlockFamily.Variant.FENCE_GATE,
				BlockFamily.Variant.CUSTOM_FENCE_GATE
		);

		if (block != null) {
			builder.fenceGate(blockId(block), block);
		}
	}

	private static void useExistingButton(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = family.get(BlockFamily.Variant.BUTTON);

		if (block != null) {
			builder.button(blockId(block), block);
		}
	}

	private static void useExistingPressurePlate(ESBlockDefinitions.FamilyBuilder builder, BlockFamily family) {
		Block block = family.get(BlockFamily.Variant.PRESSURE_PLATE);

		if (block != null) {
			builder.pressurePlate(blockId(block), block);
		}
	}

	private static Block firstExisting(BlockFamily family, BlockFamily.Variant... variants) {
		Map<BlockFamily.Variant, Block> existingVariants = family.getVariants();

		for (BlockFamily.Variant variant : variants) {
			Block block = existingVariants.get(variant);

			if (block != null) {
				return block;
			}
		}

		return null;
	}

	private static String familyId(BlockFamily family) {
		for (BlockFamily.Variant variant : SUPPORTED_VARIANTS) {
			Block block = family.getVariants().get(variant);

			if (block != null) {
				return removeVariantSuffix(blockId(block), variant);
			}
		}

		return blockId(family.getBaseBlock());
	}

	private static String removeVariantSuffix(String id, BlockFamily.Variant variant) {
		String suffix = "_" + variant.getRecipeGroup();

		if (id.endsWith(suffix)) {
			return id.substring(0, id.length() - suffix.length());
		}

		return id;
	}

	private static String baseBlockId(BlockFamily family) {
		return blockId(family.getBaseBlock());
	}

	private static String blockId(Block block) {
		Identifier id = BuiltInRegistries.BLOCK.getKey(block);
		return id.getPath();
	}

	public static List<ESBlockDefinitions.BlockFamily> families() {
		return ESBlockDefinitions.families();
	}

	public static void init() {
	}

	private record ExtraFamily(
			String idName,
			Block originalBlock,
			TagKey<Block> tag
	) {
	}
}