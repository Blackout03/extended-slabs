package com.blackout.extendedslabs.init.modded;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPCorners {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Biomes O' Plenty Woods
    public static RegistryObject<CornerBlock> CHERRY_CORNER = registerBlock("cherry_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> DEAD_CORNER = registerBlock("dead_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> FIR_CORNER = registerBlock("fir_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> HELLBARK_CORNER = registerBlock("hellbark_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> JACARANDA_CORNER = registerBlock("jacaranda_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> MAGIC_CORNER = registerBlock("magic_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> MAHOGANY_CORNER = registerBlock("mahogany_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> PALM_CORNER = registerBlock("palm_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> REDWOOD_CORNER = registerBlock("redwood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> UMBRAN_CORNER = registerBlock("umbran_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> WILLOW_CORNER = registerBlock("willow_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

    public static RegistryObject<CornerBlock> CHERRY_WOOD_CORNER = registerBlock("cherry_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> DEAD_WOOD_CORNER = registerBlock("dead_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> FIR_WOOD_CORNER = registerBlock("fir_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> HELLBARK_WOOD_CORNER = registerBlock("hellbark_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> JACARANDA_WOOD_CORNER = registerBlock("jacaranda_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> MAGIC_WOOD_CORNER = registerBlock("magic_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> MAHOGANY_WOOD_CORNER = registerBlock("mahogany_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> PALM_WOOD_CORNER = registerBlock("palm_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> REDWOOD_WOOD_CORNER = registerBlock("redwood_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> UMBRAN_WOOD_CORNER = registerBlock("umbran_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<CornerBlock> WILLOW_WOOD_CORNER = registerBlock("willow_wood_corner",() -> new CornerBlock(Block.Properties.copy(Blocks.OAK_WOOD).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = BOPCorners.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}