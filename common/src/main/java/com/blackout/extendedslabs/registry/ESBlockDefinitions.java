package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.PlatformRegistry;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

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
	private static RegistrySupplier<CreativeModeTab> extendedSlabsTab;
	private static boolean initialized;

	public static FamilyBuilder family(String name, Block originalBlock, TagKey<Block> tag) {
		return family(name, name, originalBlock, tag);
	}

	public static FamilyBuilder family(String idName, String textureName, Block originalBlock, TagKey<Block> tag) {
		return new FamilyBuilder(idName, textureName, originalBlock, List.of(tag));
	}

	private static BlockDefinition block(String id, Block originalBlock, BlockType type, List<TagKey<Block>> tags, String textureName, Supplier<Block> supplier) {
		RegistrySupplier<Block> block = BLOCKS.register(id, supplier);
		RegistrySupplier<Item> item = ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
		BlockDefinition definition = new BlockDefinition(id, originalBlock, type, tags, textureName, block, item);

		BLOCK_DEFINITIONS.add(definition);
		ORDERED_ITEMS.add(item);

		return definition;
	}

	private static RegistrySupplier<Block> existingBlock(String id, Block block) {
		return new RegistrySupplier<>() {
			@Override
			public String id() {
				return id;
			}

			@Override
			public Block get() {
				return block;
			}
		};
	}

	public static Collection<BlockDefinition> blocks() {
		init();
		return BLOCK_DEFINITIONS;
	}

	public static Collection<RegistrySupplier<Item>> orderedItems() {
		init();
		return ORDERED_ITEMS;
	}

	public static RegistrySupplier<CreativeModeTab> extendedSlabsTab() {
		init();
		return extendedSlabsTab;
	}

	public static void init() {
		if (initialized) {
			return;
		}

		initialized = true;
		ESBlockFamilies.init();
		ESSlabs.init();
		ESVerticalSlabs.init();
		ESStairs.init();
		ESCorners.init();
		ESWalls.init();
		ESButtons.init();
		registerCreativeTabs();
	}

	private static void registerCreativeTabs() {
		if (extendedSlabsTab != null) {
			return;
		}

		extendedSlabsTab = CREATIVE_MODE_TABS.register("extended_slabs", () -> CreativeModeTab.builder()
				.title(Component.translatable("itemGroup.extendedslabs"))
				.icon(() -> new ItemStack(ESSlabs.DIRT_SLAB.get()))
				.displayItems((featureFlagSet, output) -> ORDERED_ITEMS.stream().map(RegistrySupplier::get).forEach(output::accept))
				.build());
	}

	public enum BlockType {
		SLAB,
		VERTICAL_SLAB,
		STAIRS,
		CORNER,
		WALL,
		BUTTON
	}

	public record BlockFamily(Block originalBlock, List<TagKey<Block>> tags, RegistrySupplier<Block> slab, RegistrySupplier<Block> verticalSlab, RegistrySupplier<Block> stairs, RegistrySupplier<Block> corner, RegistrySupplier<Block> wall, RegistrySupplier<Block> button) {
	}

	public static class FamilyBuilder {
		private final String idName;
		private final String textureName;
		private final Block originalBlock;
		private final List<TagKey<Block>> tags;
		private final List<BlockDefinition> definitions = new ArrayList<>();
		private RegistrySupplier<Block> slab;
		private RegistrySupplier<Block> verticalSlab;
		private RegistrySupplier<Block> stairs;
		private RegistrySupplier<Block> corner;
		private RegistrySupplier<Block> wall;
		private RegistrySupplier<Block> button;

		private FamilyBuilder(String idName, String textureName, Block originalBlock, List<TagKey<Block>> tags) {
			this.idName = idName;
			this.textureName = textureName;
			this.originalBlock = originalBlock;
			this.tags = tags;
		}

		public FamilyBuilder slab() {
			BlockDefinition definition = block(idName + "_slab", originalBlock, BlockType.SLAB, tags, textureName, () -> new SlabBlock(BlockBehaviour.Properties.copy(originalBlock)));
			slab = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder slab(Block existingBlock) {
			return slab(idName + "_slab", existingBlock);
		}

		public FamilyBuilder slab(String id, Block existingBlock) {
			slab = existingBlock(id, existingBlock);
			return this;
		}

		public FamilyBuilder verticalSlab() {
			BlockDefinition definition = block("vertical_" + idName + "_slab", originalBlock, BlockType.VERTICAL_SLAB, tags, textureName, () -> new ESPVerticalSlabBlock(tags, originalBlock, slab != null ? slab.get() : originalBlock, BlockBehaviour.Properties.copy(originalBlock)));
			verticalSlab = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder stairs() {
			BlockDefinition definition = block(idName + "_stairs", originalBlock, BlockType.STAIRS, tags, textureName, () -> new StairBlock(originalBlock.defaultBlockState(), BlockBehaviour.Properties.copy(originalBlock)));
			stairs = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder stairs(Block existingBlock) {
			return stairs(idName + "_stairs", existingBlock);
		}

		public FamilyBuilder stairs(String id, Block existingBlock) {
			stairs = existingBlock(id, existingBlock);
			return this;
		}

		public FamilyBuilder corner() {
			BlockDefinition definition = block(idName + "_corner", originalBlock, BlockType.CORNER, tags, textureName, () -> new ESPCornerBlock(tags, originalBlock, stairs != null ? stairs.get() : originalBlock, BlockBehaviour.Properties.copy(originalBlock)));
			corner = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder wall() {
			BlockDefinition definition = block(idName + "_wall", originalBlock, BlockType.WALL, tags, textureName, () -> new WallBlock(BlockBehaviour.Properties.copy(originalBlock)));
			wall = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder wall(Block existingBlock) {
			return wall(idName + "_wall", existingBlock);
		}

		public FamilyBuilder wall(String id, Block existingBlock) {
			wall = existingBlock(id, existingBlock);
			return this;
		}

		public FamilyBuilder button() {
			BlockDefinition definition = block(idName + "_button", originalBlock, BlockType.BUTTON, tags, textureName, () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.copy(originalBlock).noCollission().strength(0.5F)));
			button = definition.block();
			definitions.add(definition);
			return this;
		}

		public FamilyBuilder button(Block existingBlock) {
			return button(idName + "_button", existingBlock);
		}

		public FamilyBuilder button(String id, Block existingBlock) {
			button = existingBlock(id, existingBlock);
			return this;
		}

		public BlockFamily build() {
			BlockFamily family = new BlockFamily(originalBlock, tags, slab, verticalSlab, stairs, corner, wall, button);

			for (BlockDefinition definition : definitions) {
				definition.bindFamily(family);
			}

			return family;
		}
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

		public RegistrySupplier<Block> wallVariant() {
			return family.wall();
		}

		public RegistrySupplier<Block> buttonVariant() {
			return family.button();
		}
	}
}
