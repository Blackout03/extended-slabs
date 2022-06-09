package com.blackout.extendedslabs.init.modded;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.init.ModBlocks;
import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPVerticalSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// Biomes O' Plenty Stone
	public static RegistryObject<VerticalSlabBlock> MUD_BRICK_VERTICAL = registerBlock("vertical_mud_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BRICK_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

	// Biomes O' Plenty Sandstone
	public static RegistryObject<FallingVerticalSlabBlock> BLACK_SAND_VERTICAL = registerBlock("vertical_black_sand_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> SMOOTH_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> CUT_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_cut_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<FallingVerticalSlabBlock> ORANGE_SAND_VERTICAL = registerBlock("vertical_orange_sand_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> SMOOTH_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> CUT_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<FallingVerticalSlabBlock> WHITE_SAND_VERTICAL = registerBlock("vertical_white_sand_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> SMOOTH_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> CUT_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

	// Biomes O' Plenty Woods
	public static RegistryObject<VerticalSlabBlock> CHERRY_VERTICAL = registerBlock("vertical_cherry_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> DEAD_VERTICAL = registerBlock("vertical_dead_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> FIR_VERTICAL = registerBlock("vertical_fir_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> HELLBARK_VERTICAL = registerBlock("vertical_hellbark_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> JACARANDA_VERTICAL = registerBlock("vertical_jacaranda_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> MAGIC_VERTICAL = registerBlock("vertical_magic_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> MAHOGANY_VERTICAL = registerBlock("vertical_mahogany_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> PALM_VERTICAL = registerBlock("vertical_palm_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> REDWOOD_VERTICAL = registerBlock("vertical_redwood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> UMBRAN_VERTICAL = registerBlock("vertical_umbran_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> WILLOW_VERTICAL = registerBlock("vertical_willow_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

	public static RegistryObject<VerticalSlabBlock> CHERRY_WOOD_VERTICAL = registerBlock("vertical_cherry_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> DEAD_WOOD_VERTICAL = registerBlock("vertical_dead_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> FIR_WOOD_VERTICAL = registerBlock("vertical_fir_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> HELLBARK_WOOD_VERTICAL = registerBlock("vertical_hellbark_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> JACARANDA_WOOD_VERTICAL = registerBlock("vertical_jacaranda_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> MAGIC_WOOD_VERTICAL = registerBlock("vertical_magic_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> MAHOGANY_WOOD_VERTICAL = registerBlock("vertical_mahogany_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> PALM_WOOD_VERTICAL = registerBlock("vertical_palm_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> REDWOOD_WOOD_VERTICAL = registerBlock("vertical_redwood_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> UMBRAN_WOOD_VERTICAL = registerBlock("vertical_umbran_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<VerticalSlabBlock> WILLOW_WOOD_VERTICAL = registerBlock("vertical_willow_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
		RegistryObject<B> block = BOPVerticalSlabs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}