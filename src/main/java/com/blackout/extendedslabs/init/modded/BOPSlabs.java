package com.blackout.extendedslabs.init.modded;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// Biomes O' Plenty Woods
	public static RegistryObject<SlabBlock> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> DEAD_WOOD_SLAB = registerBlock("dead_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> FIR_WOOD_SLAB = registerBlock("fir_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> HELLBARK_WOOD_SLAB = registerBlock("hellbark_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> JACARANDA_WOOD_SLAB = registerBlock("jacaranda_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> MAGIC_WOOD_SLAB = registerBlock("magic_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> MAHOGANY_WOOD_SLAB = registerBlock("mahogany_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> PALM_WOOD_SLAB = registerBlock("palm_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> REDWOOD_WOOD_SLAB = registerBlock("redwood_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> UMBRAN_WOOD_SLAB = registerBlock("umbran_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
	public static RegistryObject<SlabBlock> WILLOW_WOOD_SLAB = registerBlock("willow_wood_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

	public static RegistryObject<FallingSlabBlock> BLACK_SAND_SLAB = registerBlock("black_sand_slab", () -> new FallingSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);
	public static RegistryObject<FallingSlabBlock> ORANGE_SAND_SLAB = registerBlock("orange_sand_slab", () -> new FallingSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);
	public static RegistryObject<FallingSlabBlock> WHITE_SAND_SLAB = registerBlock("white_sand_slab", () -> new FallingSlabBlock(Block.Properties.copy(Blocks.SAND).harvestTool(ToolType.SHOVEL)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
		RegistryObject<B> block = BOPSlabs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
