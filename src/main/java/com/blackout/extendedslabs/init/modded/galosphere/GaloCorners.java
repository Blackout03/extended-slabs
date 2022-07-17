package com.blackout.extendedslabs.init.modded.galosphere;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
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
public class GaloCorners {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	public static final RegistryObject<Block> AMETHYST_CORNER = registerBlock("amethyst_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.AMETHYST_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> ALLURITE_CORNER = registerBlock("allurite_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.ALLURITE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> LUMIERE_CORNER = registerBlock("lumiere_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.LUMIERE_STAIRS.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<Block> SMOOTH_AMETHYST_CORNER = registerBlock("smooth_amethyst_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.SMOOTH_AMETHYST_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> SMOOTH_ALLURITE_CORNER = registerBlock("smooth_allurite_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.SMOOTH_ALLURITE_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> SMOOTH_LUMIERE_CORNER = registerBlock("smooth_lumiere_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.SMOOTH_LUMIERE_STAIRS.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<Block> AMETHYST_BRICK_CORNER = registerBlock("amethyst_brick_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.AMETHYST_BRICK_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> ALLURITE_BRICK_CORNER = registerBlock("allurite_brick_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.ALLURITE_BRICK_STAIRS.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<Block> LUMIERE_BRICK_CORNER = registerBlock("lumiere_brick_corner", () -> new CornerBlock(Block.Properties.copy(GBlocks.LUMIERE_BRICK_STAIRS.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
