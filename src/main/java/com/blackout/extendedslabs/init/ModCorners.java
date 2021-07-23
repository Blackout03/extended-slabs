package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.blocks.BlockCorners;
import com.blackout.extendedslabs.ExtendedSlabs;
import cpw.mods.bootstraplauncher.BootstrapLauncher;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.DatagenModLoader;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.server.ServerMain;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCorners {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Stone
    public static final RegistryObject<Block> STONE_CORNER = registerBlock("stone_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> COBBLESTONE_CORNER = registerBlock("cobblestone_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_BRICKS_CORNER = registerBlock("stone_bricks_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ANDESITE_CORNER = registerBlock("andesite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_ANDESITE_CORNER = registerBlock("polished_andesite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIORITE_CORNER = registerBlock("diorite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DIORITE_CORNER = registerBlock("polished_diorite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRANITE_CORNER = registerBlock("granite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_GRANITE_CORNER = registerBlock("polished_granite_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_CORNER = registerBlock("netherrack_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHER_BRICKS_CORNER = registerBlock("nether_bricks_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_CORNER = registerBlock("red_nether_bricks_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACKSTONE_CORNER = registerBlock("blackstone_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_CORNER = registerBlock("polished_blackstone_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_CORNER = registerBlock("polished_blackstone_bricks_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_CORNER = registerBlock("end_stone_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> END_STONE_BRICKS_CORNER = registerBlock("end_stone_bricks_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPUR_CORNER = registerBlock("purpur_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

    // Woods
    public static final RegistryObject<Block> ACACIA_CORNER = registerBlock("acacia_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_CORNER = registerBlock("birch_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_CORNER = registerBlock("crimson_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_CORNER = registerBlock("jungle_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> OAK_CORNER = registerBlock("oak_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_CORNER = registerBlock("spruce_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_CORNER = registerBlock("warped_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);

    // Modded Woods
    public static RegistryObject<Block> CHERRY_CORNER = null;
    public static RegistryObject<Block> DEAD_CORNER = null;
    public static RegistryObject<Block> FIR_CORNER = null;
    public static RegistryObject<Block> HELLBARK_CORNER = null;
    public static RegistryObject<Block> JACARANDA_CORNER = null;
    public static RegistryObject<Block> MAGIC_CORNER = null;
    public static RegistryObject<Block> MAHOGANY_CORNER = null;
    public static RegistryObject<Block> PALM_CORNER = null;
    public static RegistryObject<Block> REDWOORD_CORNER = null;
    public static RegistryObject<Block> UMBRAN_CORNER = null;
    public static RegistryObject<Block> WILLOW_CORNER = null;
//    public static RegistryObject<Block> MICHROSIA_CORNER = null;

    // Modded Woods Compat
    public static final Block CHERRY_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cherry_slab"));
    public static final Block DEAD_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "dead_slab"));
    public static final Block FIR_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "fir_slab"));
    public static final Block HELLBARK_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "hellbark_slab"));
    public static final Block JACARANDA_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "jacaranda_slab"));
    public static final Block MAGIC_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "magic_slab"));
    public static final Block MAHOGANY_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "mahogany_slab"));
    public static final Block PALM_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "palm_slab"));
    public static final Block REDWOOD_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "redwood_slab"));
    public static final Block UMBRAN_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "umbran_slab"));
    public static final Block WILLOW_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "willow_slab"));
//    public static final Block MICHROSIA_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("michrosia", "michrosia_slab"));

    public static void registerBOPCompat() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            // Biomes O' Plenty Woods
            CHERRY_CORNER = registerBlock("cherry_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            DEAD_CORNER = registerBlock("dead_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            FIR_CORNER = registerBlock("fir_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            HELLBARK_CORNER = registerBlock("hellbark_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            JACARANDA_CORNER = registerBlock("jacaranda_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAGIC_CORNER = registerBlock("magic_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAHOGANY_CORNER = registerBlock("mahogany_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            PALM_CORNER = registerBlock("palm_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            REDWOORD_CORNER = registerBlock("redwood_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            UMBRAN_CORNER = registerBlock("umbran_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            WILLOW_CORNER = registerBlock("willow_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
        }
    }

//    public static void registerMichrosiaCompat() {
//        if (ModList.get().isLoaded("michrosia")) {
//            // Michrosia Woods
//            MICHROSIA_CORNER = registerBlock("michrosia_corner",() -> new BlockCorners(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
//        }
//    }

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ModCorners.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}