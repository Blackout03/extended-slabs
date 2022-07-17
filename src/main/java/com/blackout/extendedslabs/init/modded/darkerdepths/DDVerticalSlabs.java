package com.blackout.extendedslabs.init.modded.darkerdepths;

import com.blackout.extendedslabs.ExtendedSlabs;
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
import net.orcinus.galosphere.init.GBlocks;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDVerticalSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// PLANKS
	public static final RegistryObject<VerticalSlabBlock> PETRIFIED_VERTICAL = registerBlock("vertical_petrified_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.PETRIFIED_SLAB.get())), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<VerticalSlabBlock> PETRIFIED_WOOD_VERTICAL = registerBlock("vertical_petrified_wood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.PETRIFIED_WOOD.get())), ExtendedSlabs.GROUP);

	// STONE
	public static final RegistryObject<VerticalSlabBlock> SHALE_VERTICAL = registerBlock("vertical_shale_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.SHALE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_SHALE_VERTICAL = registerBlock("vertical_polished_shale_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.POLISHED_SHALE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SHALE_BRICK_VERTICAL = registerBlock("vertical_shale_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.SHALE_BRICKS_SLAB.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<VerticalSlabBlock> ARIDROCK_VERTICAL = registerBlock("vertical_aridrock_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.ARIDROCK_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_ARIDROCK_VERTICAL = registerBlock("vertical_polished_aridrock_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.POLISHED_ARIDROCK_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ARIDROCK_BRICK_VERTICAL = registerBlock("vertical_aridrock_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.LIMESTONE_BRICKS_SLAB.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<VerticalSlabBlock> LIMESTONE_VERTICAL = registerBlock("vertical_limestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.LIMESTONE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_LIMESTONE_VERTICAL = registerBlock("vertical_polished_limestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.POLISHED_LIMESTONE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIMESTONE_BRICK_VERTICAL = registerBlock("vertical_limestone_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.LIMESTONE_BRICKS_SLAB.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<VerticalSlabBlock> GRIMESTONE_VERTICAL = registerBlock("vertical_grimestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.GRIMESTONE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_GRIMESTONE_VERTICAL = registerBlock("vertical_polished_grimestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.POLISHED_GRIMESTONE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRIMESTONE_BRICK_VERTICAL = registerBlock("vertical_grimestone_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(DDBlocks.GRIMESTONE_BRICKS_SLAB.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
