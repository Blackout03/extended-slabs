package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.blocks.CornerBlock;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPCorners {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Stone
    public static final RegistryObject<Block> STONE_CORNER = registerBlock("stone_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> COBBLESTONE_CORNER = registerBlock("cobblestone_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_BRICK_CORNER = registerBlock("stone_brick_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ANDESITE_CORNER = registerBlock("andesite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_ANDESITE_CORNER = registerBlock("polished_andesite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIORITE_CORNER = registerBlock("diorite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DIORITE_CORNER = registerBlock("polished_diorite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRANITE_CORNER = registerBlock("granite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_GRANITE_CORNER = registerBlock("polished_granite_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_CORNER = registerBlock("netherrack_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHER_BRICK_CORNER = registerBlock("nether_brick_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_NETHER_BRICK_CORNER = registerBlock("red_nether_brick_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACKSTONE_CORNER = registerBlock("blackstone_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_CORNER = registerBlock("polished_blackstone_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_CORNER = registerBlock("polished_blackstone_brick_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_CORNER = registerBlock("end_stone_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> END_STONE_BRICK_CORNER = registerBlock("end_stone_brick_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPUR_CORNER = registerBlock("purpur_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

    // Woods
    public static final RegistryObject<Block> ACACIA_CORNER = registerBlock("acacia_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_CORNER = registerBlock("birch_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_CORNER = registerBlock("crimson_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_CORNER = registerBlock("jungle_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> OAK_CORNER = registerBlock("oak_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_CORNER = registerBlock("spruce_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_CORNER = registerBlock("warped_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ESPCorners.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}