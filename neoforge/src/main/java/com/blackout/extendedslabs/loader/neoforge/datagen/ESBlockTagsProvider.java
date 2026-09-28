package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import com.blackout.extendedslabs.registry.ESBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaBlockTagsProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

public class ESBlockTagsProvider extends VanillaBlockTagsProvider {
	private static final Set<String> NEVER_COPIED_TAGS = Set.of(
			"ancient_city_replaceable",
			"azalea_root_replaceable",
			"base_stone_nether",
			"base_stone_overworld",
			"beneath_bamboo_podzol_replaceable",
			"beneath_tree_podzol_replaceable",
			"cannot_place_basalt_pillar_on",
			"cannot_replace_below_tree_trunk",
			"cannot_support_snow_layer",
			"deepslate_ore_replaceables",
			"dripstone_replaceable_blocks",
			"features_cannot_replace",
			"forest_rock_can_place_on",
			"geode_invalid_blocks",
			"height_specific_ore_replaceables",
			"huge_brown_mushroom_can_place_on",
			"huge_red_mushroom_can_place_on",
			"ice_spike_replaceable",
			"lava_pool_stone_cannot_replace",
			"lush_ground_replaceable",
			"moss_replaceable",
			"overworld_natural_logs",
			"replaceable",
			"replaceable_by_mushrooms",
			"replaceable_by_trees",
			"sculk_growth_inhibitors",
			"sculk_replaceable",
			"sculk_replaceable_world_gen",
			"stone_ore_replaceables",
			"substrate_overworld",
			"sulfur_spike_replaceable_blocks",
			"support_override_snow_layer",
			"trail_ruins_replaceable"
	);

	public ESBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider);
	}

	@Override
	protected void addTags(HolderLookup.Provider registries) {
		ExtendedSlabs.LOGGER.info("[Datagen/Block Tags] Starting block tag generation");

		super.addTags(registries);

		Map<Identifier, Set<Identifier>> vanillaTags = resolveVanillaTags();
		int generatedBlocks = 0;
		int generatedTagEntries = 0;
		builders.clear();

		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			Identifier sourceBlock = BuiltInRegistries.BLOCK.getKey(definition.originalBlock());
			ResourceKey<Block> generatedBlock = generatedBlockKey(definition);
			Set<String> addedTags = new TreeSet<>();

			copySourceTags(vanillaTags, sourceBlock, generatedBlock, definition.type(), addedTags);

			for (TagKey<Block> shapeTag : shapeTags(definition.type())) {
				tag(shapeTag).add(generatedBlock);
				addedTags.add(shapeTag.location().toString());
			}

			generatedBlocks++;
			generatedTagEntries += addedTags.size();

			ExtendedSlabs.LOGGER.info("[Datagen/Block Tags] {}", generatedBlock.identifier());

			for (String addedTag : addedTags) {
				ExtendedSlabs.LOGGER.info("[Datagen/Block Tags]   - {}", addedTag);
			}
		}

		ExtendedSlabs.LOGGER.info("[Datagen/Block Tags] Finished block tag generation for {} blocks with {} tag entries", generatedBlocks, generatedTagEntries);
	}

	private Map<Identifier, Set<Identifier>> resolveVanillaTags() {
		Map<Identifier, Set<Identifier>> resolvedTags = new HashMap<>();

		for (Identifier tagId : List.copyOf(builders.keySet())) {
			resolveVanillaTag(tagId, resolvedTags, new HashSet<>());
		}

		return resolvedTags;
	}

	private Set<Identifier> resolveVanillaTag(Identifier tagId, Map<Identifier, Set<Identifier>> resolvedTags, Set<Identifier> resolvingTags) {
		Set<Identifier> resolved = resolvedTags.get(tagId);

		if (resolved != null) {
			return resolved;
		}

		if (!resolvingTags.add(tagId)) {
			throw new IllegalStateException("Circular vanilla block tag reference involving " + tagId);
		}

		Set<Identifier> blocks = new HashSet<>();
		TagBuilder builder = builders.get(tagId);

		if (builder != null) {
			for (TagEntry entry : builder.build()) {
				if (entry.isTag()) {
					blocks.addAll(resolveVanillaTag(entry.getId(), resolvedTags, resolvingTags));
				} else {
					blocks.add(entry.getId());
				}
			}
		}

		resolvingTags.remove(tagId);
		resolvedTags.put(tagId, Set.copyOf(blocks));
		return resolvedTags.get(tagId);
	}

	private void copySourceTags(Map<Identifier, Set<Identifier>> vanillaTags, Identifier sourceBlock, ResourceKey<Block> generatedBlock, ESBlockDefinitions.BlockType blockType, Set<String> addedTags) {
		for (Map.Entry<Identifier, Set<Identifier>> entry : vanillaTags.entrySet()) {
			Identifier tagId = entry.getKey();
			Set<Identifier> tagBlocks = entry.getValue();

			if (!tagBlocks.contains(sourceBlock) || shouldNeverCopy(tagId)) {
				continue;
			}

			if (!ignoresBlockType(tagId) && !supportsBlockType(tagBlocks, blockType)) {
				continue;
			}

			TagKey<Block> sourceTag = TagKey.create(Registries.BLOCK, tagId);
			tag(sourceTag).add(generatedBlock);
			addedTags.add(sourceTag.location().toString());
		}
	}

	private static boolean shouldNeverCopy(Identifier tagId) {
		return tagId.getNamespace().equals("minecraft") && NEVER_COPIED_TAGS.contains(tagId.getPath());
	}

	private static boolean ignoresBlockType(Identifier tagId) {
		if (!tagId.getNamespace().equals("minecraft")) {
			return false;
		}

		String path = tagId.getPath();

		return path.startsWith("mineable/")
				|| path.startsWith("needs_")
				|| path.startsWith("incorrect_for_")
				|| path.contains("breaking_speed")
				|| path.equals("dampens_vibrations");
	}

	private static boolean supportsBlockType(Set<Identifier> tagBlocks, ESBlockDefinitions.BlockType blockType) {
		return tagBlocks.stream()
				.map(BuiltInRegistries.BLOCK::getValue)
				.anyMatch(block -> matchesBlockType(block, blockType));
	}

	private static boolean matchesBlockType(Block block, ESBlockDefinitions.BlockType blockType) {
		return switch (blockType) {
			case SLAB, VERTICAL_SLAB -> block instanceof SlabBlock;
			case STAIRS, CORNER -> block instanceof StairBlock;
			case WALL -> block instanceof WallBlock;
			case FENCE -> block instanceof FenceBlock;
			case FENCE_GATE -> block instanceof FenceGateBlock;
			case BUTTON -> block instanceof ButtonBlock;
			case PRESSURE_PLATE -> block instanceof PressurePlateBlock;
		};
	}

	private static ResourceKey<Block> generatedBlockKey(ESBlockDefinitions.BlockDefinition definition) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, definition.id()));
	}

	private static List<TagKey<Block>> shapeTags(ESBlockDefinitions.BlockType type) {
		return switch (type) {
			case SLAB -> List.of(BlockTags.SLABS);
			case VERTICAL_SLAB -> List.of(ESBlockTags.VERTICAL_SLABS);
			case STAIRS -> List.of(BlockTags.STAIRS);
			case CORNER -> List.of(ESBlockTags.CORNERS);
			case WALL -> List.of(BlockTags.WALLS);
			case FENCE -> List.of(BlockTags.FENCES);
			case FENCE_GATE -> List.of(BlockTags.FENCE_GATES);
			case BUTTON -> List.of(BlockTags.BUTTONS);
			case PRESSURE_PLATE -> List.of(BlockTags.PRESSURE_PLATES);
		};
	}
}