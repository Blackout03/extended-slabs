package com.blackout.extendedslabs.init.modded.wildbackport;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import com.cursedcauldron.wildbackport.init.WBBlocks;
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
public class WBPCorners {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// MUD
	public static final RegistryObject<Block> MUD_CORNER = registerBlock("mud_corner",() -> new CornerBlock(Block.Properties.copy(WBBlocks.MUD.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> PACKED_MUD_CORNER = registerBlock("packed_mud_corner",() -> new CornerBlock(Block.Properties.copy(WBBlocks.PACKED_MUD.get()).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> MUD_BRICK_CORNER = registerBlock("mud_brick_corner",() -> new CornerBlock(Block.Properties.copy(WBBlocks.MUD_BRICK_SLAB.get()).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

	// PLANKS
	public static final RegistryObject<Block> MANGROVE_CORNER = registerBlock("mangrove_corner",() -> new CornerBlock(Block.Properties.copy(WBBlocks.MANGROVE_SLAB.get())), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<Block> MANGROVE_WOOD_CORNER = registerBlock("mangrove_wood_corner", () -> new CornerBlock(Block.Properties.copy(WBBlocks.MANGROVE_WOOD.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
