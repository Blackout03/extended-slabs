package com.blackout.extendedslabs.init.modded;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.google.common.base.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPStairs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// Biomes O' Plenty Woods
	public static RegistryObject<StairsBlock> CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> DEAD_WOOD_STAIRS = registerBlock("dead_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> FIR_WOOD_STAIRS = registerBlock("fir_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> HELLBARK_WOOD_STAIRS = registerBlock("hellbark_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> JACARANDA_WOOD_STAIRS = registerBlock("jacaranda_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> MAGIC_WOOD_STAIRS = registerBlock("magic_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> MAHOGANY_WOOD_STAIRS = registerBlock("mahogany_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> PALM_WOOD_STAIRS = registerBlock("palm_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> REDWOOD_WOOD_STAIRS = registerBlock("redwood_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> UMBRAN_WOOD_STAIRS = registerBlock("umbran_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<StairsBlock> WILLOW_WOOD_STAIRS = registerBlock("willow_wood_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
		RegistryObject<B> block = BOPStairs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
