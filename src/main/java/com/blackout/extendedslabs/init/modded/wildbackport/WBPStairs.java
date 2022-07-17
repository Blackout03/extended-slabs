package com.blackout.extendedslabs.init.modded.wildbackport;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.cursedcauldron.wildbackport.init.WBBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WBPStairs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// MUD
	public static final RegistryObject<StairBlock> MUD_STAIRS = registerBlock("mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(WBBlocks.MUD.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.copy(WBBlocks.PACKED_MUD.get())), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<StairBlock> MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.copy(WBBlocks.MANGROVE_WOOD.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
