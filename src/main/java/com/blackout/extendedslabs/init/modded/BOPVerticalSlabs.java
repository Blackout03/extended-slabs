package com.blackout.extendedslabs.init.modded;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.ExtendedSlabs;
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
public class BOPVerticalSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Biomes O' Plenty Stone
    public static RegistryObject<Block> MUD_BRICK_VERTICAL = registerBlock("vertical_mud_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BRICK_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

    // Biomes O' Plenty Sandstone
    public static RegistryObject<Block> WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_white_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_orange_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_cut_black_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE_SLAB).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

    // Biomes O' Plenty Woods
    public static RegistryObject<Block> CHERRY_VERTICAL = registerBlock("vertical_cherry_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> DEAD_VERTICAL = registerBlock("vertical_dead_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> FIR_VERTICAL = registerBlock("vertical_fir_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> HELLBARK_VERTICAL = registerBlock("vertical_hellbark_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> JACARANDA_VERTICAL = registerBlock("vertical_jacaranda_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> MAGIC_VERTICAL = registerBlock("vertical_magic_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> MAHOGANY_VERTICAL = registerBlock("vertical_mahogany_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> PALM_VERTICAL = registerBlock("vertical_palm_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> REDWOOD_VERTICAL = registerBlock("vertical_redwood_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> UMBRAN_VERTICAL = registerBlock("vertical_umbran_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);
    public static RegistryObject<Block> WILLOW_VERTICAL = registerBlock("vertical_willow_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB).harvestTool(ToolType.AXE)), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = BOPVerticalSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}