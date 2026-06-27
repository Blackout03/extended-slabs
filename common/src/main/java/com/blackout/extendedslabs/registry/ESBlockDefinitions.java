package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.PlatformRegistry;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ESBlockDefinitions {
	public static final ModRegistry<Block> BLOCKS = PlatformRegistry.create(Registries.BLOCK);
	public static final ModRegistry<Item> ITEMS = PlatformRegistry.create(Registries.ITEM);
	public static final ModRegistry<CreativeModeTab> CREATIVE_MODE_TABS = PlatformRegistry.create(Registries.CREATIVE_MODE_TAB);
	private static final List<BlockDefinition> BLOCK_DEFINITIONS = new ArrayList<>();
	private static final List<RegistrySupplier<Item>> ORDERED_ITEMS = new ArrayList<>();

	private static final BlockFamily DIRT = family("dirt", Blocks.DIRT, BlockTags.MINEABLE_WITH_SHOVEL);
	private static final BlockFamily COARSE_DIRT = family("coarse_dirt", Blocks.COARSE_DIRT, BlockTags.MINEABLE_WITH_SHOVEL);
	private static final BlockFamily ROOTED_DIRT = family("rooted_dirt", Blocks.ROOTED_DIRT, BlockTags.MINEABLE_WITH_SHOVEL);
	private static final BlockFamily TUFF = family("tuff", Blocks.TUFF, BlockTags.MINEABLE_WITH_PICKAXE);
	private static final BlockFamily CALCITE = family("calcite", Blocks.CALCITE, BlockTags.MINEABLE_WITH_PICKAXE);
	private static final BlockFamily MUD = family("mud", Blocks.MUD, BlockTags.MINEABLE_WITH_SHOVEL);
	private static final BlockFamily PACKED_MUD = family("packed_mud", Blocks.PACKED_MUD, BlockTags.MINEABLE_WITH_PICKAXE);

	public static final RegistrySupplier<Block> DIRT_SLAB = DIRT.slab();
	public static final RegistrySupplier<Block> COARSE_DIRT_SLAB = COARSE_DIRT.slab();
	public static final RegistrySupplier<Block> ROOTED_DIRT_SLAB = ROOTED_DIRT.slab();
	public static final RegistrySupplier<Block> TUFF_SLAB = TUFF.slab();
	public static final RegistrySupplier<Block> CALCITE_SLAB = CALCITE.slab();
	public static final RegistrySupplier<Block> MUD_SLAB = MUD.slab();
	public static final RegistrySupplier<Block> PACKED_MUD_SLAB = PACKED_MUD.slab();

	public static final RegistrySupplier<Block> DIRT_VERTICAL = DIRT.verticalSlab();
	public static final RegistrySupplier<Block> COARSE_DIRT_VERTICAL = COARSE_DIRT.verticalSlab();
	public static final RegistrySupplier<Block> ROOTED_DIRT_VERTICAL = ROOTED_DIRT.verticalSlab();
	public static final RegistrySupplier<Block> TUFF_VERTICAL = TUFF.verticalSlab();
	public static final RegistrySupplier<Block> CALCITE_VERTICAL = CALCITE.verticalSlab();
	public static final RegistrySupplier<Block> MUD_VERTICAL = MUD.verticalSlab();
	public static final RegistrySupplier<Block> PACKED_MUD_VERTICAL = PACKED_MUD.verticalSlab();

	public static final RegistrySupplier<Block> DIRT_STAIRS = DIRT.stairs();
	public static final RegistrySupplier<Block> COARSE_DIRT_STAIRS = COARSE_DIRT.stairs();
	public static final RegistrySupplier<Block> ROOTED_DIRT_STAIRS = ROOTED_DIRT.stairs();
	public static final RegistrySupplier<Block> TUFF_STAIRS = TUFF.stairs();
	public static final RegistrySupplier<Block> CALCITE_STAIRS = CALCITE.stairs();
	public static final RegistrySupplier<Block> MUD_STAIRS = MUD.stairs();
	public static final RegistrySupplier<Block> PACKED_MUD_STAIRS = PACKED_MUD.stairs();

	public static final RegistrySupplier<Block> DIRT_CORNER = DIRT.corner();
	public static final RegistrySupplier<Block> COARSE_DIRT_CORNER = COARSE_DIRT.corner();
	public static final RegistrySupplier<Block> ROOTED_DIRT_CORNER = ROOTED_DIRT.corner();
	public static final RegistrySupplier<Block> TUFF_CORNER = TUFF.corner();
	public static final RegistrySupplier<Block> CALCITE_CORNER = CALCITE.corner();
	public static final RegistrySupplier<Block> MUD_CORNER = MUD.corner();
	public static final RegistrySupplier<Block> PACKED_MUD_CORNER = PACKED_MUD.corner();

	public static final RegistrySupplier<CreativeModeTab> EXTENDED_SLABS_TAB = CREATIVE_MODE_TABS.register("extended_slabs", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.extendedslabs"))
			.icon(() -> new ItemStack(DIRT_SLAB.get()))
			.displayItems((featureFlagSet, output) -> ORDERED_ITEMS.stream().map(RegistrySupplier::get).forEach(output::accept))
			.build());

	private static BlockFamily family(String name, Block originalBlock, TagKey<Block> tag) {
		List<TagKey<Block>> tags = List.of(tag);
		BlockDefinition slab = block(name + "_slab", originalBlock, BlockType.SLAB, tags, name, () -> new SlabBlock(BlockBehaviour.Properties.copy(originalBlock)));
		BlockDefinition verticalSlab = block("vertical_" + name + "_slab", originalBlock, BlockType.VERTICAL_SLAB, tags, name, () -> new ESPVerticalSlabBlock(tags, originalBlock, slab.block().get(), BlockBehaviour.Properties.copy(originalBlock)));
		BlockDefinition stairs = block(name + "_stairs", originalBlock, BlockType.STAIRS, tags, name, () -> new StairBlock(originalBlock.defaultBlockState(), BlockBehaviour.Properties.copy(originalBlock)));
		BlockDefinition corner = block(name + "_corner", originalBlock, BlockType.CORNER, tags, name, () -> new ESPCornerBlock(tags, originalBlock, stairs.block().get(), BlockBehaviour.Properties.copy(originalBlock)));
		BlockFamily family = new BlockFamily(originalBlock, tags, slab.block(), verticalSlab.block(), stairs.block(), corner.block());

		slab.bindFamily(family);
		verticalSlab.bindFamily(family);
		stairs.bindFamily(family);
		corner.bindFamily(family);

		return family;
	}

	private static BlockDefinition block(String id, Block originalBlock, BlockType type, List<TagKey<Block>> tags, String textureName, Supplier<Block> supplier) {
		RegistrySupplier<Block> block = BLOCKS.register(id, supplier);
		RegistrySupplier<Item> item = ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
		BlockDefinition definition = new BlockDefinition(id, originalBlock, type, tags, textureName, block, item);

		BLOCK_DEFINITIONS.add(definition);
		ORDERED_ITEMS.add(item);

		return definition;
	}

	public static Collection<BlockDefinition> blocks() {
		return BLOCK_DEFINITIONS;
	}

	public static Collection<RegistrySupplier<Item>> orderedItems() {
		return ORDERED_ITEMS;
	}

	public static void init() {
	}

	public enum BlockType {
		SLAB,
		VERTICAL_SLAB,
		STAIRS,
		CORNER
	}

	public record BlockFamily(Block originalBlock, List<TagKey<Block>> tags, RegistrySupplier<Block> slab, RegistrySupplier<Block> verticalSlab, RegistrySupplier<Block> stairs, RegistrySupplier<Block> corner) {
	}

	public static class BlockDefinition {
		private final String id;
		private final Block originalBlock;
		private final BlockType type;
		private final List<TagKey<Block>> tags;
		private final String textureName;
		private final RegistrySupplier<Block> block;
		private final RegistrySupplier<Item> item;
		private BlockFamily family;

		private BlockDefinition(String id, Block originalBlock, BlockType type, List<TagKey<Block>> tags, String textureName, RegistrySupplier<Block> block, RegistrySupplier<Item> item) {
			this.id = id;
			this.originalBlock = originalBlock;
			this.type = type;
			this.tags = tags;
			this.textureName = textureName;
			this.block = block;
			this.item = item;
		}

		private void bindFamily(BlockFamily family) {
			this.family = family;
		}

		public String id() {
			return id;
		}

		public Block source() {
			return originalBlock;
		}

		public Block originalBlock() {
			return originalBlock;
		}

		public BlockType type() {
			return type;
		}

		public List<TagKey<Block>> tags() {
			return tags;
		}

		public String textureName() {
			return textureName;
		}

		public RegistrySupplier<Block> block() {
			return block;
		}

		public RegistrySupplier<Item> item() {
			return item;
		}

		public RegistrySupplier<Block> slabVariant() {
			return family.slab();
		}

		public RegistrySupplier<Block> verticalSlabVariant() {
			return family.verticalSlab();
		}

		public RegistrySupplier<Block> stairVariant() {
			return family.stairs();
		}

		public RegistrySupplier<Block> cornerVariant() {
			return family.corner();
		}
	}
}
