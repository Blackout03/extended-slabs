package com.blackout.extendedslabs.init.modded.galosphere;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
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
public class GaloVerticalSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	public static final RegistryObject<VerticalSlabBlock> AMETHYST_VERTICAL = registerBlock("vertical_amethyst_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.AMETHYST_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ALLURITE_VERTICAL = registerBlock("vertical_allurite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.ALLURITE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LUMIERE_VERTICAL = registerBlock("vertical_lumiere_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.LUMIERE_SLAB.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<VerticalSlabBlock> SMOOTH_AMETHYST_VERTICAL = registerBlock("vertical_smooth_amethyst_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.SMOOTH_AMETHYST_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_ALLURITE_VERTICAL = registerBlock("vertical_smooth_allurite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.SMOOTH_ALLURITE_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_LUMIERE_VERTICAL = registerBlock("vertical_smooth_lumiere_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.SMOOTH_LUMIERE_SLAB.get())), ExtendedSlabs.GROUP);

	public static final RegistryObject<VerticalSlabBlock> AMETHYST_BRICK_VERTICAL = registerBlock("vertical_amethyst_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.AMETHYST_BRICK_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ALLURITE_BRICK_VERTICAL = registerBlock("vertical_allurite_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.ALLURITE_BRICK_SLAB.get())), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LUMIERE_BRICK_VERTICAL = registerBlock("vertical_lumiere_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(GBlocks.LUMIERE_BRICK_SLAB.get())), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
