package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPStairs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// STONE
	public static final RegistryObject<StairBlock> TUFF_STAIRS = registerBlock("tuff_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(Blocks.TUFF)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(Blocks.CALCITE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> MUD_STAIRS = registerBlock("mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(Blocks.MUD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<StairBlock> OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.SPRUCE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.BIRCH_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.JUNGLE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.ACACIA_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.DARK_OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.MANGROVE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.CRIMSON_HYPHAE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.WARPED_HYPHAE)), ExtendedSlabs.GROUP);

	// DIRT
	public static final RegistryObject<StairBlock> DIRT_STAIRS = registerBlock("dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.COARSE_DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.ROOTED_DIRT)), ExtendedSlabs.GROUP);

	// NETHER
	public static final RegistryObject<StairBlock> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

	// END
	public static final RegistryObject<StairBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = ESPStairs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}