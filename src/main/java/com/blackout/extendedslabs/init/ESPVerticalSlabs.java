package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPVerticalSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// DIRT
	public static final RegistryObject<VerticalSlabBlock> GRASS_BLOCK_VERTICAL = registerBlock("vertical_grass_block_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> DIRT_VERTICAL = registerBlock("vertical_dirt_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> COARSE_DIRT_VERTICAL = registerBlock("vertical_coarse_dirt_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.COARSE_DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PODZOL_VERTICAL = registerBlock("vertical_podzol_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PODZOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<PathVerticalSlabBlock> GRASS_PATH_VERTICAL = registerBlock("vertical_grass_path_slab", () -> new PathVerticalSlabBlock(Properties.copy(Blocks.GRASS_PATH)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> SAND_VERTICAL = registerBlock("vertical_sand_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> RED_SAND_VERTICAL = registerBlock("vertical_red_sand_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.RED_SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> GRAVEL_VERTICAL = registerBlock("vertical_gravel_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.GRAVEL)), ExtendedSlabs.GROUP);

	// STONE
	public static final RegistryObject<VerticalSlabBlock> COBBLESTONE_VERTICAL = registerBlock("vertical_cobblestone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> STONE_VERTICAL = registerBlock("vertical_stone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.STONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> STONE_BRICK_VERTICAL = registerBlock("vertical_stone_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_STONE_VERTICAL = registerBlock("vertical_smooth_stone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SMOOTH_STONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MOSSY_COBBLESTONE_VERTICAL = registerBlock("vertical_mossy_cobblestone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MOSSY_STONE_BRICK_VERTICAL = registerBlock("vertical_mossy_stone_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MOSSY_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ANDESITE_VERTICAL = registerBlock("vertical_andesite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ANDESITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_ANDESITE_VERTICAL = registerBlock("vertical_polished_andesite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.POLISHED_ANDESITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> DIORITE_VERTICAL = registerBlock("vertical_diorite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.DIORITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_DIORITE_VERTICAL = registerBlock("vertical_polished_diorite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.POLISHED_DIORITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRANITE_VERTICAL = registerBlock("vertical_granite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRANITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_GRANITE_VERTICAL = registerBlock("vertical_polished_granite_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.POLISHED_GRANITE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BRICK_VERTICAL = registerBlock("vertical_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BRICK_SLAB)), ExtendedSlabs.GROUP);

	// WOOL
	public static final RegistryObject<VerticalSlabBlock> WHITE_WOOL_VERTICAL = registerBlock("vertical_white_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WHITE_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ORANGE_WOOL_VERTICAL = registerBlock("vertical_orange_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ORANGE_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MAGENTA_WOOL_VERTICAL = registerBlock("vertical_magenta_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MAGENTA_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_BLUE_WOOL_VERTICAL = registerBlock("vertical_light_blue_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> YELLOW_WOOL_VERTICAL = registerBlock("vertical_yellow_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.YELLOW_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIME_WOOL_VERTICAL = registerBlock("vertical_lime_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIME_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PINK_WOOL_VERTICAL = registerBlock("vertical_pink_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PINK_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRAY_WOOL_VERTICAL = registerBlock("vertical_gray_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRAY_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_GRAY_WOOL_VERTICAL = registerBlock("vertical_light_gray_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CYAN_WOOL_VERTICAL = registerBlock("vertical_cyan_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CYAN_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PURPLE_WOOL_VERTICAL = registerBlock("vertical_purple_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PURPLE_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLUE_WOOL_VERTICAL = registerBlock("vertical_blue_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLUE_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BROWN_WOOL_VERTICAL = registerBlock("vertical_brown_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BROWN_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GREEN_WOOL_VERTICAL = registerBlock("vertical_green_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GREEN_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_WOOL_VERTICAL = registerBlock("vertical_red_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLACK_WOOL_VERTICAL = registerBlock("vertical_black_wool_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLACK_WOOL)), ExtendedSlabs.GROUP);

	// CONCRETE_POWDER
	public static final RegistryObject<FallingVerticalSlabBlock> WHITE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_white_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.WHITE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> ORANGE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_orange_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> MAGENTA_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_magenta_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> LIGHT_BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> YELLOW_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_yellow_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> LIME_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_lime_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.LIME_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> PINK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_pink_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.PINK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> LIGHT_GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> CYAN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_cyan_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> PURPLE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_purple_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> BROWN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_brown_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.BROWN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> GREEN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_green_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.GREEN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> RED_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_red_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.RED_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingVerticalSlabBlock> BLACK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_black_concrete_powder_slab", () -> new FallingVerticalSlabBlock(Properties.copy(Blocks.BLACK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);

	// CONCRETE
	public static final RegistryObject<VerticalSlabBlock> WHITE_CONCRETE_VERTICAL = registerBlock("vertical_white_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ORANGE_CONCRETE_VERTICAL = registerBlock("vertical_orange_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ORANGE_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MAGENTA_CONCRETE_VERTICAL = registerBlock("vertical_magenta_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MAGENTA_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_BLUE_CONCRETE_VERTICAL = registerBlock("vertical_light_blue_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> YELLOW_CONCRETE_VERTICAL = registerBlock("vertical_yellow_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.YELLOW_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIME_CONCRETE_VERTICAL = registerBlock("vertical_lime_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIME_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PINK_CONCRETE_VERTICAL = registerBlock("vertical_pink_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PINK_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRAY_CONCRETE_VERTICAL = registerBlock("vertical_gray_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRAY_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_GRAY_CONCRETE_VERTICAL = registerBlock("vertical_light_gray_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CYAN_CONCRETE_VERTICAL = registerBlock("vertical_cyan_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CYAN_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PURPLE_CONCRETE_VERTICAL = registerBlock("vertical_purple_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PURPLE_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLUE_CONCRETE_VERTICAL = registerBlock("vertical_blue_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLUE_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BROWN_CONCRETE_VERTICAL = registerBlock("vertical_brown_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BROWN_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GREEN_CONCRETE_VERTICAL = registerBlock("vertical_green_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GREEN_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_CONCRETE_VERTICAL = registerBlock("vertical_red_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_CONCRETE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLACK_CONCRETE_VERTICAL = registerBlock("vertical_black_concrete_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLACK_CONCRETE)), ExtendedSlabs.GROUP);

	// TERRACOTTA
	public static final RegistryObject<VerticalSlabBlock> CLAY_VERTICAL = registerBlock("vertical_clay_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CLAY)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> TERRACOTTA_VERTICAL = registerBlock("vertical_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> WHITE_TERRACOTTA_VERTICAL = registerBlock("vertical_white_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WHITE_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ORANGE_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ORANGE_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MAGENTA_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> YELLOW_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.YELLOW_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIME_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIME_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PINK_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PINK_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CYAN_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CYAN_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PURPLE_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PURPLE_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BROWN_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BROWN_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GREEN_TERRACOTTA_VERTICAL = registerBlock("vertical_green_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GREEN_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLACK_TERRACOTTA_VERTICAL = registerBlock("vertical_black_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLACK_TERRACOTTA)), ExtendedSlabs.GROUP);

	// GLAZED TERRACOTTA
	public static final RegistryObject<VerticalSlabBlock> WHITE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_white_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ORANGE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> MAGENTA_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> YELLOW_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIME_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PINK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CYAN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PURPLE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BROWN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> GREEN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_green_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BLACK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_black_glazed_terracotta_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);

	// GLASS
	public static final RegistryObject<GlassVerticalSlabBlock> GLASS_VERTICAL = registerBlock("vertical_glass_slab", () -> new GlassVerticalSlabBlock(Properties.copy(Blocks.GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> WHITE_STAINED_GLASS_VERTICAL = registerBlock("vertical_white_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.WHITE, Properties.copy(Blocks.WHITE_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> ORANGE_STAINED_GLASS_VERTICAL = registerBlock("vertical_orange_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.ORANGE, Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> MAGENTA_STAINED_GLASS_VERTICAL = registerBlock("vertical_magenta_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.MAGENTA, Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> LIGHT_BLUE_STAINED_GLASS_VERTICAL = registerBlock("vertical_light_blue_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.LIGHT_BLUE, Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> YELLOW_STAINED_GLASS_VERTICAL = registerBlock("vertical_yellow_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.YELLOW, Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> LIME_STAINED_GLASS_VERTICAL = registerBlock("vertical_lime_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.LIME, Properties.copy(Blocks.LIME_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> PINK_STAINED_GLASS_VERTICAL = registerBlock("vertical_pink_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.PINK, Properties.copy(Blocks.PINK_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> GRAY_STAINED_GLASS_VERTICAL = registerBlock("vertical_gray_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.GRAY, Properties.copy(Blocks.GRAY_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> LIGHT_GRAY_STAINED_GLASS_VERTICAL = registerBlock("vertical_light_gray_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.LIGHT_GRAY, Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> CYAN_STAINED_GLASS_VERTICAL = registerBlock("vertical_cyan_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.CYAN, Properties.copy(Blocks.CYAN_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> PURPLE_STAINED_GLASS_VERTICAL = registerBlock("vertical_purple_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.PURPLE, Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> BLUE_STAINED_GLASS_VERTICAL = registerBlock("vertical_blue_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.BLUE, Properties.copy(Blocks.BLUE_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> BROWN_STAINED_GLASS_VERTICAL = registerBlock("vertical_brown_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.BROWN, Properties.copy(Blocks.BROWN_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> GREEN_STAINED_GLASS_VERTICAL = registerBlock("vertical_green_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.GREEN, Properties.copy(Blocks.GREEN_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> RED_STAINED_GLASS_VERTICAL = registerBlock("vertical_red_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.RED, Properties.copy(Blocks.RED_STAINED_GLASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassVerticalSlabBlock> BLACK_STAINED_GLASS_VERTICAL = registerBlock("vertical_black_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(DyeColor.BLACK, Properties.copy(Blocks.BLACK_STAINED_GLASS)), ExtendedSlabs.GROUP);

	// SANDSTONE
	public static final RegistryObject<VerticalSlabBlock> SANDSTONE_VERTICAL = registerBlock("vertical_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CUT_SANDSTONE_VERTICAL = registerBlock("vertical_cut_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CUT_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_SANDSTONE_VERTICAL = registerBlock("vertical_red_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_RED_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_red_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CUT_RED_SANDSTONE_VERTICAL = registerBlock("vertical_cut_red_sandstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CUT_RED_SANDSTONE_SLAB)), ExtendedSlabs.GROUP);

	// NETHER
	public static final RegistryObject<VerticalSlabBlock> BLACKSTONE_VERTICAL = registerBlock("vertical_blackstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_BLACKSTONE_VERTICAL = registerBlock("vertical_polished_blackstone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> POLISHED_BLACKSTONE_BRICK_VERTICAL = registerBlock("vertical_polished_blackstone_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> NETHERRACK_VERTICAL = registerBlock("vertical_netherrack_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> NETHER_BRICK_VERTICAL = registerBlock("vertical_nether_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> RED_NETHER_BRICK_VERTICAL = registerBlock("vertical_red_nether_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.RED_NETHER_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> QUARTZ_VERTICAL = registerBlock("vertical_quartz_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.QUARTZ_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SMOOTH_QUARTZ_VERTICAL = registerBlock("vertical_smooth_quartz_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SMOOTH_QUARTZ_SLAB)), ExtendedSlabs.GROUP);

	// END
	public static final RegistryObject<VerticalSlabBlock> END_STONE_VERTICAL = registerBlock("vertical_end_stone_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> END_STONE_BRICK_VERTICAL = registerBlock("vertical_end_stone_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.END_STONE_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PURPUR_VERTICAL = registerBlock("vertical_purpur_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PURPUR_SLAB)), ExtendedSlabs.GROUP);

	// PRISMARINE
	public static final RegistryObject<VerticalSlabBlock> PRISMARINE_VERTICAL = registerBlock("vertical_prismarine_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PRISMARINE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PRISMARINE_BRICK_VERTICAL = registerBlock("vertical_prismarine_brick_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PRISMARINE_BRICK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> DARK_PRISMARINE_VERTICAL = registerBlock("vertical_dark_prismarine_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.DARK_PRISMARINE_SLAB)), ExtendedSlabs.GROUP);

	// PLANKS
	public static final RegistryObject<VerticalSlabBlock> OAK_VERTICAL = registerBlock("vertical_oak_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.OAK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SPRUCE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BIRCH_VERTICAL = registerBlock("vertical_birch_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BIRCH_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.JUNGLE_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ACACIA_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.DARK_OAK_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CRIMSON_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> WARPED_VERTICAL = registerBlock("vertical_warped_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WARPED_SLAB)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> PETRIFIED_OAK_VERTICAL = registerBlock("vertical_petrified_oak_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.PETRIFIED_OAK_SLAB)), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<VerticalSlabBlock> OAK_WOOD_VERTICAL = registerBlock("vertical_oak_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> SPRUCE_WOOD_VERTICAL = registerBlock("vertical_spruce_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.SPRUCE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> BIRCH_WOOD_VERTICAL = registerBlock("vertical_birch_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.BIRCH_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> JUNGLE_WOOD_VERTICAL = registerBlock("vertical_jungle_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.JUNGLE_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> ACACIA_WOOD_VERTICAL = registerBlock("vertical_acacia_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.ACACIA_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> DARK_OAK_WOOD_VERTICAL = registerBlock("vertical_dark_oak_wood_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.DARK_OAK_WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> CRIMSON_HYPHAE_VERTICAL = registerBlock("vertical_crimson_hyphae_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.CRIMSON_HYPHAE)), ExtendedSlabs.GROUP);
	public static final RegistryObject<VerticalSlabBlock> WARPED_HYPHAE_VERTICAL = registerBlock("vertical_warped_hyphae_slab", () -> new VerticalSlabBlock(Properties.copy(Blocks.WARPED_HYPHAE)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
		RegistryObject<B> block = ESPVerticalSlabs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}