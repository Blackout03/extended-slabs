package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.copper.WeatheringCopperVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.grass.GrassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPVerticalSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> GRASS_VERTICAL = registerBlock("vertical_grass_slab", () -> new GrassVerticalSlabBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIRT_VERTICAL = registerBlock("vertical_dirt_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PODZOL_VERTICAL = registerBlock("vertical_podzol_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PATH_VERTICAL = registerBlock("vertical_path_slab", () -> new PathVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT_PATH)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SAND_VERTICAL = registerBlock("vertical_sand_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SAND_VERTICAL = registerBlock("vertical_red_sand_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.RED_SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAVEL_VERTICAL = registerBlock("vertical_gravel_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.GRAVEL)), ExtendedSlabs.GROUP);

    // Stone
    public static final RegistryObject<Block> COBBLESTONE_VERTICAL = registerBlock("vertical_cobblestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_VERTICAL = registerBlock("vertical_stone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_BRICKS_VERTICAL = registerBlock("vertical_stone_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_STONE_VERTICAL = registerBlock("vertical_smooth_stone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL = registerBlock("vertical_mossy_cobblestone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_VERTICAL = registerBlock("vertical_mossy_stone_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MOSSY_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ANDESITE_VERTICAL = registerBlock("vertical_andesite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL = registerBlock("vertical_polished_andesite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIORITE_VERTICAL = registerBlock("vertical_diorite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL = registerBlock("vertical_polished_diorite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRANITE_VERTICAL = registerBlock("vertical_granite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL = registerBlock("vertical_polished_granite_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BRICK_VERTICAL = registerBlock("vertical_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

//    // WOOL
//    public static final RegistryObject<Block> WHITE_WOOL_VERTICAL = registerBlock("vertical_white_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.WHITE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_WOOL_VERTICAL = registerBlock("vertical_orange_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ORANGE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_WOOL_VERTICAL = registerBlock("vertical_magenta_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MAGENTA_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_VERTICAL = registerBlock("vertical_light_blue_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_WOOL_VERTICAL = registerBlock("vertical_yellow_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.YELLOW_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_WOOL_VERTICAL = registerBlock("vertical_lime_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIME_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_WOOL_VERTICAL = registerBlock("vertical_pink_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PINK_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_WOOL_VERTICAL = registerBlock("vertical_gray_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GRAY_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_VERTICAL = registerBlock("vertical_light_gray_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_WOOL_VERTICAL = registerBlock("vertical_cyan_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CYAN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_WOOL_VERTICAL = registerBlock("vertical_purple_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPLE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_WOOL_VERTICAL = registerBlock("vertical_blue_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLUE_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_WOOL_VERTICAL = registerBlock("vertical_brown_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BROWN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_WOOL_VERTICAL = registerBlock("vertical_green_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GREEN_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_WOOL_VERTICAL = registerBlock("vertical_red_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_WOOL)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_WOOL_VERTICAL = registerBlock("vertical_black_wool_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLACK_WOOL)), ExtendedSlabs.GROUP);
//
//    // CONCRETE_POWDER
//    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_white_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_orange_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_magenta_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_yellow_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_lime_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.LIME_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_pink_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.PINK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_cyan_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_purple_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_brown_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_green_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_red_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.RED_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_black_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
//
//    // CONCRETE
//    public static final RegistryObject<Block> WHITE_CONCRETE_VERTICAL = registerBlock("vertical_white_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_CONCRETE_VERTICAL = registerBlock("vertical_orange_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_CONCRETE_VERTICAL = registerBlock("vertical_magenta_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_VERTICAL = registerBlock("vertical_light_blue_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_CONCRETE_VERTICAL = registerBlock("vertical_yellow_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_CONCRETE_VERTICAL = registerBlock("vertical_lime_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIME_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_CONCRETE_VERTICAL = registerBlock("vertical_pink_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PINK_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_CONCRETE_VERTICAL = registerBlock("vertical_gray_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_VERTICAL = registerBlock("vertical_light_gray_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_CONCRETE_VERTICAL = registerBlock("vertical_cyan_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_CONCRETE_VERTICAL = registerBlock("vertical_purple_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_CONCRETE_VERTICAL = registerBlock("vertical_blue_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_CONCRETE_VERTICAL = registerBlock("vertical_brown_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_CONCRETE_VERTICAL = registerBlock("vertical_green_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_CONCRETE_VERTICAL = registerBlock("vertical_red_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_CONCRETE)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_CONCRETE_VERTICAL = registerBlock("vertical_black_concrete_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE)), ExtendedSlabs.GROUP);
//
//    // TERRACOTTA
//    public static final RegistryObject<Block> WHITE_TERRACOTTA_VERTICAL = registerBlock("vertical_white_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_TERRACOTTA_VERTICAL = registerBlock("vertical_green_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_TERRACOTTA_VERTICAL = registerBlock("vertical_black_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)), ExtendedSlabs.GROUP);
//
//    // GLAZED TERRACOTTA
//    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_white_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_green_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
//    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_black_glazed_terracotta_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);

    // Sandstone
    public static final RegistryObject<Block> SANDSTONE_VERTICAL = registerBlock("vertical_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_SANDSTONE_VERTICAL = registerBlock("vertical_cut_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL = registerBlock("vertical_red_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_red_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_VERTICAL = registerBlock("vertical_cut_red_sandstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CUT_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

    // Deepslate
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_VERTICAL = registerBlock("vertical_cobbled_deepslate_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.COBBLED_DEEPSLATE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_VERTICAL = registerBlock("vertical_polished_deepslate_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_DEEPSLATE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DEEPSLATE_BRICK_VERTICAL = registerBlock("vertical_deepslate_brick_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DEEPSLATE_TILE_VERTICAL = registerBlock("vertical_deepslate_tile_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DEEPSLATE_TILE_SLAB)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> BLACKSTONE_VERTICAL = registerBlock("vertical_blackstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL = registerBlock("vertical_polished_blackstone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_VERTICAL = registerBlock("vertical_polished_blackstone_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHERRACK_VERTICAL = registerBlock("vertical_netherrack_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHER_BRICKS_VERTICAL = registerBlock("vertical_nether_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_VERTICAL = registerBlock("vertical_red_nether_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> QUARTZ_VERTICAL = registerBlock("vertical_quartz_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.QUARTZ_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL = registerBlock("vertical_smooth_quartz_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SMOOTH_QUARTZ_SLAB)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_VERTICAL = registerBlock("vertical_end_stone_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> END_STONE_BRICKS_VERTICAL = registerBlock("vertical_end_stone_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPUR_VERTICAL = registerBlock("vertical_purpur_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

    // Water
    public static final RegistryObject<Block> PRISMARINE_VERTICAL = registerBlock("vertical_prismarine_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PRISMARINE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PRISMARINE_BRICKS_VERTICAL = registerBlock("vertical_prismarine_bricks_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PRISMARINE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL = registerBlock("vertical_dark_prismarine_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DARK_PRISMARINE_SLAB)), ExtendedSlabs.GROUP);

    // Woods
    public static final RegistryObject<Block> OAK_VERTICAL = registerBlock("vertical_oak_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_VERTICAL = registerBlock("vertical_birch_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.ACACIA_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_VERTICAL = registerBlock("vertical_warped_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PETRIFIED_OAK_VERTICAL = registerBlock("vertical_petrified_oak_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PETRIFIED_OAK_SLAB)), ExtendedSlabs.GROUP);

    // Copper
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_VERTICAL = registerBlock("vertical_oxidized_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_VERTICAL = registerBlock("vertical_weathered_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_VERTICAL = registerBlock("vertical_exposed_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_COPPER_VERTICAL = registerBlock("vertical_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_oxidized_cut_copper_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_weathered_cut_copper_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_exposed_cut_copper_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WAXED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_cut_copper_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).requiresCorrectToolForDrops()), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ESPVerticalSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}