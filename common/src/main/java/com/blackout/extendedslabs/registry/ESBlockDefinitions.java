package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.ModRegistry;
import com.blackout.extendedslabs.platform.PlatformRegistry;
import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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

	public static final RegistrySupplier<Block> DIRT_SLAB = slab("dirt_slab", Blocks.DIRT);
	public static final RegistrySupplier<Block> COARSE_DIRT_SLAB = slab("coarse_dirt_slab", Blocks.COARSE_DIRT);
	public static final RegistrySupplier<Block> ROOTED_DIRT_SLAB = slab("rooted_dirt_slab", Blocks.ROOTED_DIRT);
	public static final RegistrySupplier<Block> TUFF_SLAB = slab("tuff_slab", Blocks.TUFF);
	public static final RegistrySupplier<Block> CALCITE_SLAB = slab("calcite_slab", Blocks.CALCITE);
	public static final RegistrySupplier<Block> MUD_SLAB = slab("mud_slab", Blocks.MUD);
	public static final RegistrySupplier<Block> PACKED_MUD_SLAB = slab("packed_mud_slab", Blocks.PACKED_MUD);

	public static final RegistrySupplier<Block> DIRT_STAIRS = stairs("dirt_stairs", Blocks.DIRT);
	public static final RegistrySupplier<Block> COARSE_DIRT_STAIRS = stairs("coarse_dirt_stairs", Blocks.COARSE_DIRT);
	public static final RegistrySupplier<Block> ROOTED_DIRT_STAIRS = stairs("rooted_dirt_stairs", Blocks.ROOTED_DIRT);
	public static final RegistrySupplier<Block> TUFF_STAIRS = stairs("tuff_stairs", Blocks.TUFF);
	public static final RegistrySupplier<Block> CALCITE_STAIRS = stairs("calcite_stairs", Blocks.CALCITE);
	public static final RegistrySupplier<Block> MUD_STAIRS = stairs("mud_stairs", Blocks.MUD);
	public static final RegistrySupplier<Block> PACKED_MUD_STAIRS = stairs("packed_mud_stairs", Blocks.PACKED_MUD);

	public static final RegistrySupplier<CreativeModeTab> EXTENDED_SLABS_TAB = CREATIVE_MODE_TABS.register("extended_slabs", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.extendedslabs"))
			.icon(() -> new ItemStack(DIRT_SLAB.get()))
			.displayItems((featureFlagSet, output) -> ORDERED_ITEMS.stream().map(RegistrySupplier::get).forEach(output::accept))
			.build());

	private static RegistrySupplier<Block> slab(String id, Block source) {
		return block(id, source, BlockType.SLAB, () -> new SlabBlock(BlockBehaviour.Properties.copy(source)));
	}

	private static RegistrySupplier<Block> stairs(String id, Block source) {
		return block(id, source, BlockType.STAIRS, () -> new StairBlock(source.defaultBlockState(), BlockBehaviour.Properties.copy(source)));
	}

	private static RegistrySupplier<Block> block(String id, Block source, BlockType type, Supplier<Block> supplier) {
		RegistrySupplier<Block> block = BLOCKS.register(id, supplier);
		RegistrySupplier<Item> item = ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
		BLOCK_DEFINITIONS.add(new BlockDefinition(id, source, type, block, item));
		ORDERED_ITEMS.add(item);
		return block;
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
		STAIRS
	}

	public record BlockDefinition(String id, Block source, BlockType type, RegistrySupplier<Block> block, RegistrySupplier<Item> item) {
		public String textureName() {
			return id.replaceAll("_(slab|stairs)$", "");
		}
	}
}
