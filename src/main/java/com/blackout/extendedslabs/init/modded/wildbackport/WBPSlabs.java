package com.blackout.extendedslabs.init.modded.wildbackport;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.cursedcauldron.wildbackport.init.WBBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WBPSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// MUD
	public static final RegistryObject<SlabBlock> MUD_SLAB = registerBlock("mud_slab", () -> new SlabBlock(Block.Properties.copy(WBBlocks.MUD.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab", () -> new SlabBlock(Block.Properties.copy(WBBlocks.PACKED_MUD.get())), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<SlabBlock> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab", () -> new SlabBlock(Block.Properties.copy(WBBlocks.MANGROVE_WOOD.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
