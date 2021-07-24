package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.falling.BlockFallingSlab;
import com.blackout.extendedslabs.blocks.grass.BlockGrassSlab;
import com.blackout.extendedslabs.blocks.path.BlockPathSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> GRASS_SLAB = registerBlock("grass_slab",() -> new BlockGrassSlab(Block.Properties.copy(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PODZOL_SLAB = registerBlock("podzol_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PATH_SLAB = registerBlock("path_slab",() -> new BlockPathSlab(Block.Properties.copy(Blocks.DIRT_PATH)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SAND_SLAB = registerBlock("sand_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SAND_SLAB = registerBlock("red_sand_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.RED_SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAVEL_SLAB = registerBlock("gravel_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.GRAVEL)), ExtendedSlabs.GROUP);
    
//    // WOOL
//    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_WOOL)), ExtendedSlabs.GROUP);
//
//    // CONCRETE POWDER
//    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.LIME_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.PINK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.BROWN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.GREEN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.RED_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab",() -> new BlockFallingSlab(Block.Properties.copy(Blocks.BLACK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//
//    // CONCRETE
//    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE)), ExtendedSlabs.GROUP);
//
//    // TERRACOTTA
//    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)), ExtendedSlabs.GROUP);
//
//    // GLAZED TERRACOTTA
//    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ESPSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}