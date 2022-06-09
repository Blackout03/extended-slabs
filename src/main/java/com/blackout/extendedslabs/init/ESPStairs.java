package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPStairs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// WOOD
	public static final RegistryObject<StairsBlock> OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.SPRUCE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.BIRCH_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.JUNGLE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.ACACIA_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.DARK_OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.CRIMSON_HYPHAE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.WARPED_HYPHAE)), ExtendedSlabs.GROUP);

	// DIRT
	public static final RegistryObject<StairsBlock> DIRT_STAIRS = registerBlock("dirt_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairsBlock> COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.COARSE_DIRT)), ExtendedSlabs.GROUP);

	// NETHER
	public static final RegistryObject<StairsBlock> NETHERRACK_STAIRS = registerBlock("netherrack_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

	// END
	public static final RegistryObject<StairsBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
		RegistryObject<B> block = ESPStairs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
