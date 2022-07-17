package com.blackout.extendedslabs.init.modded.darkerdepths;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.naterbobber.darkerdepths.init.DDBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDCorners {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// PLANKS
	public static final RegistryObject<Block> PETRIFIED_CORNER = registerBlock("petrified_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.PETRIFIED_STAIRS.get())), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<Block> PETRIFIED_WOOD_CORNER = registerBlock("petrified_wood_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.PETRIFIED_WOOD.get())), ExtendedSlabs.GROUP);

	// STONE
	public static final RegistryObject<Block> SHALE_CORNER = registerBlock("shale_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.SHALE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> POLISHED_SHALE_CORNER = registerBlock("polished_shale_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.POLISHED_SHALE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> SHALE_BRICK_CORNER = registerBlock("shale_brick_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.SHALE_BRICKS_STAIRS.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<Block> ARIDROCK_CORNER = registerBlock("aridrock_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.ARIDROCK_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> POLISHED_ARIDROCK_CORNER = registerBlock("polished_aridrock_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.POLISHED_ARIDROCK_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> ARIDROCK_BRICK_CORNER = registerBlock("aridrock_brick_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.LIMESTONE_BRICKS_STAIRS.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<Block> LIMESTONE_CORNER = registerBlock("limestone_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.LIMESTONE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_CORNER = registerBlock("polished_limestone_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.POLISHED_LIMESTONE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER = registerBlock("limestone_brick_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.LIMESTONE_BRICKS_STAIRS.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<Block> GRIMESTONE_CORNER = registerBlock("grimestone_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.GRIMESTONE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> POLISHED_GRIMESTONE_CORNER = registerBlock("polished_grimestone_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.POLISHED_GRIMESTONE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> GRIMESTONE_BRICK_CORNER = registerBlock("grimestone_brick_corner", () -> new CornerBlock(Block.Properties.copy(DDBlocks.GRIMESTONE_BRICKS_STAIRS.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
