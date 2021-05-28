package com.blackout.extendedslabs.api.block;

import com.blackout.extendedslabs.blocks.BlockVerticalSlab;
import com.blackout.extendedslabs.blocks.falling.BlockVerticalFallingSlab;
import com.blackout.extendedslabs.blocks.grass.BlockVerticalGrassSlab;
import com.blackout.extendedslabs.blocks.path.BlockVerticalPathSlab;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModVerticalSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> GRASS_VERTICAL = registerBlock("vertical_grass_slab",() -> new BlockVerticalGrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIRT_VERTICAL = registerBlock("vertical_dirt_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PODZOL_VERTICAL = registerBlock("vertical_podzol_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PATH_VERTICAL = registerBlock("vertical_path_slab",() -> new BlockVerticalPathSlab(Block.Properties.from(Blocks.GRASS_PATH)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SAND_VERTICAL = registerBlock("vertical_sand_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SAND_VERTICAL = registerBlock("vertical_red_sand_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.RED_SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAVEL_VERTICAL = registerBlock("vertical_gravel_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.GRAVEL)), ExtendedSlabs.GROUP);

    // Stone
    public static final RegistryObject<Block> COBBLESTONE_VERTICAL = registerBlock("vertical_cobblestone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_VERTICAL = registerBlock("vertical_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> STONE_BRICKS_VERTICAL = registerBlock("vertical_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_STONE_VERTICAL = registerBlock("vertical_smooth_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_STONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_VERTICAL = registerBlock("vertical_mossy_cobblestone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MOSSY_COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_VERTICAL = registerBlock("vertical_mossy_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MOSSY_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ANDESITE_VERTICAL = registerBlock("vertical_andesite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_ANDESITE_VERTICAL = registerBlock("vertical_polished_andesite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DIORITE_VERTICAL = registerBlock("vertical_diorite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_DIORITE_VERTICAL = registerBlock("vertical_polished_diorite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRANITE_VERTICAL = registerBlock("vertical_granite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_GRANITE_VERTICAL = registerBlock("vertical_polished_granite_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BRICK_VERTICAL = registerBlock("vertical_brick_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

    // WOOL
    public static final RegistryObject<Block> WHITE_WOOL_VERTICAL = registerBlock("vertical_white_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WHITE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ORANGE_WOOL_VERTICAL = registerBlock("vertical_orange_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ORANGE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MAGENTA_WOOL_VERTICAL = registerBlock("vertical_magenta_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MAGENTA_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_VERTICAL = registerBlock("vertical_light_blue_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_BLUE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> YELLOW_WOOL_VERTICAL = registerBlock("vertical_yellow_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.YELLOW_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIME_WOOL_VERTICAL = registerBlock("vertical_lime_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIME_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PINK_WOOL_VERTICAL = registerBlock("vertical_pink_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PINK_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAY_WOOL_VERTICAL = registerBlock("vertical_gray_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRAY_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_VERTICAL = registerBlock("vertical_light_gray_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_GRAY_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CYAN_WOOL_VERTICAL = registerBlock("vertical_cyan_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CYAN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPLE_WOOL_VERTICAL = registerBlock("vertical_purple_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPLE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLUE_WOOL_VERTICAL = registerBlock("vertical_blue_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLUE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BROWN_WOOL_VERTICAL = registerBlock("vertical_brown_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BROWN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GREEN_WOOL_VERTICAL = registerBlock("vertical_green_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GREEN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_WOOL_VERTICAL = registerBlock("vertical_red_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACK_WOOL_VERTICAL = registerBlock("vertical_black_wool_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACK_WOOL)), ExtendedSlabs.GROUP);

    // CONCRETE_POWDER
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_white_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.WHITE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_orange_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.ORANGE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_magenta_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.MAGENTA_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_blue_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_yellow_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.YELLOW_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_lime_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.LIME_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_pink_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.PINK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_gray_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_gray_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_cyan_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.CYAN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_purple_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.PURPLE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_blue_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_brown_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.BROWN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_green_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.GREEN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_red_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.RED_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_black_concrete_powder_slab",() -> new BlockVerticalFallingSlab(Block.Properties.from(Blocks.BLACK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);

    // CONCRETE
    public static final RegistryObject<Block> WHITE_CONCRETE_VERTICAL = registerBlock("vertical_white_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WHITE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ORANGE_CONCRETE_VERTICAL = registerBlock("vertical_orange_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ORANGE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_VERTICAL = registerBlock("vertical_magenta_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MAGENTA_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_VERTICAL = registerBlock("vertical_light_blue_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> YELLOW_CONCRETE_VERTICAL = registerBlock("vertical_yellow_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.YELLOW_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIME_CONCRETE_VERTICAL = registerBlock("vertical_lime_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIME_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PINK_CONCRETE_VERTICAL = registerBlock("vertical_pink_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PINK_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAY_CONCRETE_VERTICAL = registerBlock("vertical_gray_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRAY_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_VERTICAL = registerBlock("vertical_light_gray_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CYAN_CONCRETE_VERTICAL = registerBlock("vertical_cyan_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CYAN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPLE_CONCRETE_VERTICAL = registerBlock("vertical_purple_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPLE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLUE_CONCRETE_VERTICAL = registerBlock("vertical_blue_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLUE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BROWN_CONCRETE_VERTICAL = registerBlock("vertical_brown_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BROWN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GREEN_CONCRETE_VERTICAL = registerBlock("vertical_green_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GREEN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_CONCRETE_VERTICAL = registerBlock("vertical_red_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACK_CONCRETE_VERTICAL = registerBlock("vertical_black_concrete_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACK_CONCRETE)), ExtendedSlabs.GROUP);

    // TERRACOTTA
    public static final RegistryObject<Block> WHITE_TERRACOTTA_VERTICAL = registerBlock("vertical_white_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WHITE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ORANGE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MAGENTA_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.YELLOW_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIME_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIME_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PINK_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PINK_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CYAN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPLE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BROWN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_VERTICAL = registerBlock("vertical_green_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GREEN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_VERTICAL = registerBlock("vertical_black_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACK_TERRACOTTA)), ExtendedSlabs.GROUP);

    // GLAZED TERRACOTTA
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_white_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WHITE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ORANGE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.MAGENTA_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.YELLOW_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIME_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PINK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CYAN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPLE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BROWN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_green_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.GREEN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_black_glazed_terracotta_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);

    // Modded Stone
    public static RegistryObject<Block> MUD_BRICK_VERTICAL = null;

    // Modded Stone Compat
    public static final Block MUD_BRICK_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "mud_brick_slab"));

    // Sandstone
    public static final RegistryObject<Block> SANDSTONE_VERTICAL = registerBlock("vertical_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_SANDSTONE_VERTICAL = registerBlock("vertical_cut_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_SANDSTONE_VERTICAL = registerBlock("vertical_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_VERTICAL = registerBlock("vertical_cut_red_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

    // Modded Sandstone
    public static RegistryObject<Block> WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> BLACK_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL = null;
    public static RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL = null;

    // Modded Sandstone Compat
    public static final Block WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "white_sandstone_slab"));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_white_sandstone_slab"));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_white_sandstone_slab"));
    public static final Block ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "orange_sandstone_slab"));
    public static final Block SMOOTH_ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_orange_sandstone_slab"));
    public static final Block CUT_ORANGE_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_orange_sandstone_slab"));
    public static final Block BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "black_sandstone_slab"));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "smooth_black_sandstone_slab"));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("biomesoplenty", "cut_black_sandstone_slab"));

    // Nether
    public static final RegistryObject<Block> BLACKSTONE_VERTICAL = registerBlock("vertical_blackstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_VERTICAL = registerBlock("vertical_polished_blackstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_VERTICAL = registerBlock("vertical_polished_blackstone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHERRACK_VERTICAL = registerBlock("vertical_netherrack_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> NETHER_BRICKS_VERTICAL = registerBlock("vertical_nether_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_VERTICAL = registerBlock("vertical_red_nether_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> QUARTZ_VERTICAL = registerBlock("vertical_quartz_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.QUARTZ_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_VERTICAL = registerBlock("vertical_smooth_quartz_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_QUARTZ_SLAB)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_VERTICAL = registerBlock("vertical_end_stone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.END_STONE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> END_STONE_BRICKS_VERTICAL = registerBlock("vertical_end_stone_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PURPUR_VERTICAL = registerBlock("vertical_purpur_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

    // Water
    public static final RegistryObject<Block> PRISMARINE_VERTICAL = registerBlock("vertical_prismarine_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PRISMARINE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PRISMARINE_BRICKS_VERTICAL = registerBlock("vertical_prismarine_bricks_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PRISMARINE_BRICK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_PRISMARINE_VERTICAL = registerBlock("vertical_dark_prismarine_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DARK_PRISMARINE_SLAB)), ExtendedSlabs.GROUP);

    // Woods
    public static final RegistryObject<Block> OAK_VERTICAL = registerBlock("vertical_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> BIRCH_VERTICAL = registerBlock("vertical_birch_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.ACACIA_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> WARPED_VERTICAL = registerBlock("vertical_warped_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);
    public static final RegistryObject<Block> PETRIFIED_OAK_VERTICAL = registerBlock("vertical_petrified_oak_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.PETRIFIED_OAK_SLAB)), ExtendedSlabs.GROUP);

    // Modded Woods
    public static RegistryObject<Block> CHERRY_VERTICAL = null;
    public static RegistryObject<Block> DEAD_VERTICAL = null;
    public static RegistryObject<Block> FIR_VERTICAL = null;
    public static RegistryObject<Block> HELLBARK_VERTICAL = null;
    public static RegistryObject<Block> JACARANDA_VERTICAL = null;
    public static RegistryObject<Block> MAGIC_VERTICAL = null;
    public static RegistryObject<Block> MAHOGANY_VERTICAL = null;
    public static RegistryObject<Block> PALM_VERTICAL = null;
    public static RegistryObject<Block> REDWOORD_VERTICAL = null;
    public static RegistryObject<Block> UMBRAN_VERTICAL = null;
    public static RegistryObject<Block> WILLOW_VERTICAL = null;
    public static RegistryObject<Block> MICHROSIA_VERTICAL = null;

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
    public static final Block MICHROSIA_SLAB = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("michrosia", "michrosia_slab"));

    public static void registerBOPCompat() {
        if (ModList.get().isLoaded("biomesoplenty")) {
            // Biomes O' Plenty Stone
            MUD_BRICK_VERTICAL = registerBlock("vertical_mud_brick_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

            // Biomes O' Plenty Sandstone
            WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_WHITE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_white_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_ORANGE_SANDSTONE_VERTICAL = registerBlock("vertical_cut_orange_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            SMOOTH_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
            CUT_BLACK_SANDSTONE_VERTICAL = registerBlock("vertical_cut_black_sandstone_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

            // Biomes O' Plenty Woods
            CHERRY_VERTICAL = registerBlock("vertical_cherry_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            DEAD_VERTICAL = registerBlock("vertical_dead_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            FIR_VERTICAL = registerBlock("vertical_fir_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            HELLBARK_VERTICAL = registerBlock("vertical_hellbark_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            JACARANDA_VERTICAL = registerBlock("vertical_jacaranda_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAGIC_VERTICAL = registerBlock("vertical_magic_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            MAHOGANY_VERTICAL = registerBlock("vertical_mahogany_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            PALM_VERTICAL = registerBlock("vertical_palm_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            REDWOORD_VERTICAL = registerBlock("vertical_redwood_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            UMBRAN_VERTICAL = registerBlock("vertical_umbran_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
            WILLOW_VERTICAL = registerBlock("vertical_willow_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
        }
    }

    public static void registerMichrosiaCompat() {
        if (ModList.get().isLoaded("michrosia")) {
            // Michrosia Woods
            MICHROSIA_VERTICAL = registerBlock("vertical_michrosia_slab",() -> new BlockVerticalSlab(Block.Properties.from(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
        }
    }

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = ModVerticalSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}