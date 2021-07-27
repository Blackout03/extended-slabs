package com.blackout.extendedslabs.init.modded;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPCorners {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Biomes O' Plenty Woods
    public static RegistryObject<Block> CHERRY_CORNER = registerBlock("cherry_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> DEAD_CORNER = registerBlock("dead_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> FIR_CORNER = registerBlock("fir_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> HELLBARK_CORNER = registerBlock("hellbark_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> JACARANDA_CORNER = registerBlock("jacaranda_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> MAGIC_CORNER = registerBlock("magic_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> MAHOGANY_CORNER = registerBlock("mahogany_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> PALM_CORNER = registerBlock("palm_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> REDWOOD_CORNER = registerBlock("redwood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> UMBRAN_CORNER = registerBlock("umbran_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> WILLOW_CORNER = registerBlock("willow_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = BOPCorners.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}