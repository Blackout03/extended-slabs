package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.copper.WeatheringCopperVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.magma.MagmaVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.soulsand.SoulSandVerticalSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.Collection;
import java.util.function.Supplier;

import static com.blackout.extendedslabs.blocks.IBlockCharacteristics.tag;

public class ESPVerticalSlabs {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExtendedSlabs.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedSlabs.MODID);

	// DIRT
	public static final DeferredBlock<Block> GRASS_BLOCK_VERTICAL = registerBlock("vertical_grass_block_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRASS_BLOCK, ESPSlabs.GRASS_BLOCK_SLAB));
	public static final DeferredBlock<Block> DIRT_VERTICAL = registerBlock("vertical_dirt_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT, ESPSlabs.DIRT_SLAB));
	public static final DeferredBlock<Block> COARSE_DIRT_VERTICAL = registerBlock("vertical_coarse_dirt_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.COARSE_DIRT, ESPSlabs.COARSE_DIRT_SLAB));
	public static final DeferredBlock<Block> ROOTED_DIRT_VERTICAL = registerBlock("vertical_rooted_dirt_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ROOTED_DIRT, ESPSlabs.ROOTED_DIRT_SLAB));
	public static final DeferredBlock<Block> PODZOL_VERTICAL = registerBlock("vertical_podzol_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PODZOL, ESPSlabs.PODZOL_SLAB));
	public static final DeferredBlock<Block> MYCELIUM_VERTICAL = registerBlock("vertical_mycelium_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MYCELIUM, ESPSlabs.MYCELIUM_SLAB));
	public static final DeferredBlock<Block> DIRT_PATH_VERTICAL = registerBlock("vertical_dirt_path_slab", () -> new PathVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT_PATH, ESPSlabs.DIRT_PATH_SLAB));
	public static final DeferredBlock<Block> SAND_VERTICAL = registerBlock("vertical_sand_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SAND, ESPSlabs.SAND_SLAB));
	public static final DeferredBlock<Block> RED_SAND_VERTICAL = registerBlock("vertical_red_sand_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_SAND, ESPSlabs.RED_SAND_SLAB));
	public static final DeferredBlock<Block> GRAVEL_VERTICAL = registerBlock("vertical_gravel_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAVEL, ESPSlabs.GRAVEL_SLAB));

	// STONE
	public static final DeferredBlock<Block> COBBLESTONE_VERTICAL = registerBlock("vertical_cobblestone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.COBBLESTONE, () -> Blocks.COBBLESTONE_SLAB));
	public static final DeferredBlock<Block> STONE_VERTICAL = registerBlock("vertical_stone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.STONE, () -> Blocks.STONE_SLAB));
	public static final DeferredBlock<Block> STONE_BRICK_VERTICAL = registerBlock("vertical_stone_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.STONE_BRICKS, () -> Blocks.STONE_BRICK_SLAB));
	public static final DeferredBlock<Block> SMOOTH_STONE_VERTICAL = registerBlock("vertical_smooth_stone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_STONE, () -> Blocks.SMOOTH_STONE_SLAB));
	public static final DeferredBlock<Block> MOSSY_COBBLESTONE_VERTICAL = registerBlock("vertical_mossy_cobblestone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MOSSY_COBBLESTONE, () -> Blocks.MOSSY_COBBLESTONE_SLAB));
	public static final DeferredBlock<Block> MOSSY_STONE_BRICK_VERTICAL = registerBlock("vertical_mossy_stone_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MOSSY_STONE_BRICKS, () -> Blocks.MOSSY_STONE_BRICK_SLAB));
	public static final DeferredBlock<Block> ANDESITE_VERTICAL = registerBlock("vertical_andesite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ANDESITE, () -> Blocks.ANDESITE_SLAB));
	public static final DeferredBlock<Block> POLISHED_ANDESITE_VERTICAL = registerBlock("vertical_polished_andesite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_ANDESITE, () -> Blocks.POLISHED_ANDESITE_SLAB));
	public static final DeferredBlock<Block> DIORITE_VERTICAL = registerBlock("vertical_diorite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DIORITE, () -> Blocks.DIORITE_SLAB));
	public static final DeferredBlock<Block> POLISHED_DIORITE_VERTICAL = registerBlock("vertical_polished_diorite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_DIORITE, () -> Blocks.POLISHED_DIORITE_SLAB));
	public static final DeferredBlock<Block> GRANITE_VERTICAL = registerBlock("vertical_granite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRANITE, () -> Blocks.GRANITE_SLAB));
	public static final DeferredBlock<Block> POLISHED_GRANITE_VERTICAL = registerBlock("vertical_polished_granite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_GRANITE, () -> Blocks.POLISHED_GRANITE_SLAB));
	public static final DeferredBlock<Block> BRICK_VERTICAL = registerBlock("vertical_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BRICKS, () -> Blocks.BRICK_SLAB));
	public static final DeferredBlock<Block> TUFF_VERTICAL = registerBlock("vertical_tuff_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TUFF, ESPSlabs.TUFF_SLAB));
	public static final DeferredBlock<Block> CALCITE_VERTICAL = registerBlock("vertical_calcite_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CALCITE, ESPSlabs.CALCITE_SLAB));
	public static final DeferredBlock<Block> DRIPSTONE_VERTICAL = registerBlock("vertical_dripstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DRIPSTONE_BLOCK, ESPSlabs.DRIPSTONE_SLAB));
	public static final DeferredBlock<Block> MUD_VERTICAL = registerBlock("vertical_mud_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MUD, ESPSlabs.MUD_SLAB));
	public static final DeferredBlock<Block> PACKED_MUD_VERTICAL = registerBlock("vertical_packed_mud_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PACKED_MUD, ESPSlabs.PACKED_MUD_SLAB));
	public static final DeferredBlock<Block> MUD_BRICK_VERTICAL = registerBlock("vertical_mud_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MUD_BRICKS, () -> Blocks.MUD_BRICK_SLAB));

	// WOOL
	public static final DeferredBlock<Block> WHITE_WOOL_VERTICAL = registerBlock("vertical_white_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.WHITE_WOOL, ESPSlabs.WHITE_WOOL_SLAB));
	public static final DeferredBlock<Block> ORANGE_WOOL_VERTICAL = registerBlock("vertical_orange_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.ORANGE_WOOL, ESPSlabs.ORANGE_WOOL_SLAB));
	public static final DeferredBlock<Block> MAGENTA_WOOL_VERTICAL = registerBlock("vertical_magenta_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.MAGENTA_WOOL, ESPSlabs.MAGENTA_WOOL_SLAB));
	public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_VERTICAL = registerBlock("vertical_light_blue_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_BLUE_WOOL, ESPSlabs.LIGHT_BLUE_WOOL_SLAB));
	public static final DeferredBlock<Block> YELLOW_WOOL_VERTICAL = registerBlock("vertical_yellow_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.YELLOW_WOOL, ESPSlabs.YELLOW_WOOL_SLAB));
	public static final DeferredBlock<Block> LIME_WOOL_VERTICAL = registerBlock("vertical_lime_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.LIME_WOOL, ESPSlabs.LIME_WOOL_SLAB));
	public static final DeferredBlock<Block> PINK_WOOL_VERTICAL = registerBlock("vertical_pink_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.PINK_WOOL, ESPSlabs.PINK_WOOL_SLAB));
	public static final DeferredBlock<Block> GRAY_WOOL_VERTICAL = registerBlock("vertical_gray_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.GRAY_WOOL, ESPSlabs.GRAY_WOOL_SLAB));
	public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_VERTICAL = registerBlock("vertical_light_gray_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_GRAY_WOOL, ESPSlabs.LIGHT_GRAY_WOOL_SLAB));
	public static final DeferredBlock<Block> CYAN_WOOL_VERTICAL = registerBlock("vertical_cyan_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.CYAN_WOOL, ESPSlabs.CYAN_WOOL_SLAB));
	public static final DeferredBlock<Block> PURPLE_WOOL_VERTICAL = registerBlock("vertical_purple_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.PURPLE_WOOL, ESPSlabs.PURPLE_WOOL_SLAB));
	public static final DeferredBlock<Block> BLUE_WOOL_VERTICAL = registerBlock("vertical_blue_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.BLUE_WOOL, ESPSlabs.BLUE_WOOL_SLAB));
	public static final DeferredBlock<Block> BROWN_WOOL_VERTICAL = registerBlock("vertical_brown_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.BROWN_WOOL, ESPSlabs.BROWN_WOOL_SLAB));
	public static final DeferredBlock<Block> GREEN_WOOL_VERTICAL = registerBlock("vertical_green_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.GREEN_WOOL, ESPSlabs.GREEN_WOOL_SLAB));
	public static final DeferredBlock<Block> RED_WOOL_VERTICAL = registerBlock("vertical_red_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.RED_WOOL, ESPSlabs.RED_WOOL_SLAB));
	public static final DeferredBlock<Block> BLACK_WOOL_VERTICAL = registerBlock("vertical_black_wool_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.WOOL), Blocks.BLACK_WOOL, ESPSlabs.BLACK_WOOL_SLAB));

	// CONCRETE_POWDER
	public static final DeferredBlock<Block> WHITE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_white_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.WHITE_CONCRETE_POWDER, ESPSlabs.WHITE_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_orange_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ORANGE_CONCRETE_POWDER, ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_magenta_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MAGENTA_CONCRETE_POWDER, ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_BLUE_CONCRETE_POWDER, ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_yellow_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.YELLOW_CONCRETE_POWDER, ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> LIME_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_lime_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIME_CONCRETE_POWDER, ESPSlabs.LIME_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> PINK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_pink_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PINK_CONCRETE_POWDER, ESPSlabs.PINK_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAY_CONCRETE_POWDER, ESPSlabs.GRAY_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_light_gray_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_GRAY_CONCRETE_POWDER, ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> CYAN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_cyan_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CYAN_CONCRETE_POWDER, ESPSlabs.CYAN_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_purple_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PURPLE_CONCRETE_POWDER, ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> BLUE_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_blue_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLUE_CONCRETE_POWDER, ESPSlabs.BLUE_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> BROWN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_brown_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BROWN_CONCRETE_POWDER, ESPSlabs.BROWN_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> GREEN_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_green_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GREEN_CONCRETE_POWDER, ESPSlabs.GREEN_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> RED_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_red_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_CONCRETE_POWDER, ESPSlabs.RED_CONCRETE_POWDER_SLAB));
	public static final DeferredBlock<Block> BLACK_CONCRETE_POWDER_VERTICAL = registerBlock("vertical_black_concrete_powder_slab", () -> new FallingVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLACK_CONCRETE_POWDER, ESPSlabs.BLACK_CONCRETE_POWDER_SLAB));

	// CONCRETE
	public static final DeferredBlock<Block> WHITE_CONCRETE_VERTICAL = registerBlock("vertical_white_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_CONCRETE, ESPSlabs.WHITE_CONCRETE_SLAB));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_VERTICAL = registerBlock("vertical_orange_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_CONCRETE, ESPSlabs.ORANGE_CONCRETE_SLAB));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_VERTICAL = registerBlock("vertical_magenta_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_CONCRETE, ESPSlabs.MAGENTA_CONCRETE_SLAB));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_VERTICAL = registerBlock("vertical_light_blue_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_CONCRETE, ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_VERTICAL = registerBlock("vertical_yellow_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_CONCRETE, ESPSlabs.YELLOW_CONCRETE_SLAB));
	public static final DeferredBlock<Block> LIME_CONCRETE_VERTICAL = registerBlock("vertical_lime_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_CONCRETE, ESPSlabs.LIME_CONCRETE_SLAB));
	public static final DeferredBlock<Block> PINK_CONCRETE_VERTICAL = registerBlock("vertical_pink_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_CONCRETE, ESPSlabs.PINK_CONCRETE_SLAB));
	public static final DeferredBlock<Block> GRAY_CONCRETE_VERTICAL = registerBlock("vertical_gray_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_CONCRETE, ESPSlabs.GRAY_CONCRETE_SLAB));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_VERTICAL = registerBlock("vertical_light_gray_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_CONCRETE, ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB));
	public static final DeferredBlock<Block> CYAN_CONCRETE_VERTICAL = registerBlock("vertical_cyan_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_CONCRETE, ESPSlabs.CYAN_CONCRETE_SLAB));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_VERTICAL = registerBlock("vertical_purple_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_CONCRETE, ESPSlabs.PURPLE_CONCRETE_SLAB));
	public static final DeferredBlock<Block> BLUE_CONCRETE_VERTICAL = registerBlock("vertical_blue_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_CONCRETE, ESPSlabs.BLUE_CONCRETE_SLAB));
	public static final DeferredBlock<Block> BROWN_CONCRETE_VERTICAL = registerBlock("vertical_brown_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_CONCRETE, ESPSlabs.BROWN_CONCRETE_SLAB));
	public static final DeferredBlock<Block> GREEN_CONCRETE_VERTICAL = registerBlock("vertical_green_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_CONCRETE, ESPSlabs.GREEN_CONCRETE_SLAB));
	public static final DeferredBlock<Block> RED_CONCRETE_VERTICAL = registerBlock("vertical_red_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_CONCRETE, ESPSlabs.RED_CONCRETE_SLAB));
	public static final DeferredBlock<Block> BLACK_CONCRETE_VERTICAL = registerBlock("vertical_black_concrete_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_CONCRETE, ESPSlabs.BLACK_CONCRETE_SLAB));

	// TERRACOTTA
	public static final DeferredBlock<Block> CLAY_VERTICAL = registerBlock("vertical_clay_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CLAY, ESPSlabs.CLAY_SLAB));
	public static final DeferredBlock<Block> TERRACOTTA_VERTICAL = registerBlock("vertical_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TERRACOTTA, ESPSlabs.TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> WHITE_TERRACOTTA_VERTICAL = registerBlock("vertical_white_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_TERRACOTTA, ESPSlabs.WHITE_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> ORANGE_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_TERRACOTTA, ESPSlabs.ORANGE_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_TERRACOTTA, ESPSlabs.MAGENTA_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_TERRACOTTA, ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> YELLOW_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_TERRACOTTA, ESPSlabs.YELLOW_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIME_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_TERRACOTTA, ESPSlabs.LIME_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> PINK_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_TERRACOTTA, ESPSlabs.PINK_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_TERRACOTTA, ESPSlabs.GRAY_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_TERRACOTTA, ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> CYAN_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_TERRACOTTA, ESPSlabs.CYAN_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> PURPLE_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_TERRACOTTA, ESPSlabs.PURPLE_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BLUE_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_TERRACOTTA, ESPSlabs.BLUE_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BROWN_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_TERRACOTTA, ESPSlabs.BROWN_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> GREEN_TERRACOTTA_VERTICAL = registerBlock("vertical_green_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_TERRACOTTA, ESPSlabs.GREEN_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> RED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_TERRACOTTA, ESPSlabs.RED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BLACK_TERRACOTTA_VERTICAL = registerBlock("vertical_black_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_TERRACOTTA, ESPSlabs.BLACK_TERRACOTTA_SLAB));

	// GLAZED TERRACOTTA
	public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_white_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_GLAZED_TERRACOTTA, ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_orange_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_GLAZED_TERRACOTTA, ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_magenta_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_GLAZED_TERRACOTTA, ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_blue_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_yellow_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_GLAZED_TERRACOTTA, ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_lime_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_GLAZED_TERRACOTTA, ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_pink_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_GLAZED_TERRACOTTA, ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_gray_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_GLAZED_TERRACOTTA, ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_light_gray_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_cyan_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_GLAZED_TERRACOTTA, ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_purple_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_GLAZED_TERRACOTTA, ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_blue_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_GLAZED_TERRACOTTA, ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_brown_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_GLAZED_TERRACOTTA, ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_green_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_GLAZED_TERRACOTTA, ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_red_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_GLAZED_TERRACOTTA, ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB));
	public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_VERTICAL = registerBlock("vertical_black_glazed_terracotta_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_GLAZED_TERRACOTTA, ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB));

	// GLASS
	public static final DeferredBlock<Block> GLASS_VERTICAL = registerBlock("vertical_glass_slab", () -> new GlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GLASS, ESPSlabs.GLASS_SLAB));
	public static final DeferredBlock<Block> TINTED_GLASS_VERTICAL = registerBlock("vertical_tinted_glass_slab", () -> new TintedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.TINTED_GLASS, ESPSlabs.TINTED_GLASS_SLAB));
	public static final DeferredBlock<Block> WHITE_STAINED_GLASS_VERTICAL = registerBlock("vertical_white_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.WHITE_STAINED_GLASS, ESPSlabs.WHITE_STAINED_GLASS_SLAB, DyeColor.WHITE));
	public static final DeferredBlock<Block> ORANGE_STAINED_GLASS_VERTICAL = registerBlock("vertical_orange_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.ORANGE_STAINED_GLASS, ESPSlabs.ORANGE_STAINED_GLASS_SLAB, DyeColor.ORANGE));
	public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS_VERTICAL = registerBlock("vertical_magenta_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.MAGENTA_STAINED_GLASS, ESPSlabs.MAGENTA_STAINED_GLASS_SLAB, DyeColor.MAGENTA));
	public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS_VERTICAL = registerBlock("vertical_light_blue_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_BLUE_STAINED_GLASS, ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB, DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> YELLOW_STAINED_GLASS_VERTICAL = registerBlock("vertical_yellow_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.YELLOW_STAINED_GLASS, ESPSlabs.YELLOW_STAINED_GLASS_SLAB, DyeColor.YELLOW));
	public static final DeferredBlock<Block> LIME_STAINED_GLASS_VERTICAL = registerBlock("vertical_lime_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIME_STAINED_GLASS, ESPSlabs.LIME_STAINED_GLASS_SLAB, DyeColor.LIME));
	public static final DeferredBlock<Block> PINK_STAINED_GLASS_VERTICAL = registerBlock("vertical_pink_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PINK_STAINED_GLASS, ESPSlabs.PINK_STAINED_GLASS_SLAB, DyeColor.PINK));
	public static final DeferredBlock<Block> GRAY_STAINED_GLASS_VERTICAL = registerBlock("vertical_gray_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GRAY_STAINED_GLASS, ESPSlabs.GRAY_STAINED_GLASS_SLAB, DyeColor.GRAY));
	public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS_VERTICAL = registerBlock("vertical_light_gray_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_GRAY_STAINED_GLASS, ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB, DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> CYAN_STAINED_GLASS_VERTICAL = registerBlock("vertical_cyan_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.CYAN_STAINED_GLASS, ESPSlabs.CYAN_STAINED_GLASS_SLAB, DyeColor.CYAN));
	public static final DeferredBlock<Block> PURPLE_STAINED_GLASS_VERTICAL = registerBlock("vertical_purple_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PURPLE_STAINED_GLASS, ESPSlabs.PURPLE_STAINED_GLASS_SLAB, DyeColor.PURPLE));
	public static final DeferredBlock<Block> BLUE_STAINED_GLASS_VERTICAL = registerBlock("vertical_blue_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLUE_STAINED_GLASS, ESPSlabs.BLUE_STAINED_GLASS_SLAB, DyeColor.BLUE));
	public static final DeferredBlock<Block> BROWN_STAINED_GLASS_VERTICAL = registerBlock("vertical_brown_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BROWN_STAINED_GLASS, ESPSlabs.BROWN_STAINED_GLASS_SLAB, DyeColor.BROWN));
	public static final DeferredBlock<Block> GREEN_STAINED_GLASS_VERTICAL = registerBlock("vertical_green_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GREEN_STAINED_GLASS, ESPSlabs.GREEN_STAINED_GLASS_SLAB, DyeColor.GREEN));
	public static final DeferredBlock<Block> RED_STAINED_GLASS_VERTICAL = registerBlock("vertical_red_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.RED_STAINED_GLASS, ESPSlabs.RED_STAINED_GLASS_SLAB, DyeColor.RED));
	public static final DeferredBlock<Block> BLACK_STAINED_GLASS_VERTICAL = registerBlock("vertical_black_stained_glass_slab", () -> new StainedGlassVerticalSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLACK_STAINED_GLASS, ESPSlabs.BLACK_STAINED_GLASS_SLAB, DyeColor.BLACK));

	// SANDSTONE
	public static final DeferredBlock<Block> SANDSTONE_VERTICAL = registerBlock("vertical_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SANDSTONE, () -> Blocks.SANDSTONE_SLAB));
	public static final DeferredBlock<Block> SMOOTH_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_SANDSTONE, () -> Blocks.SMOOTH_SANDSTONE_SLAB));
	public static final DeferredBlock<Block> CUT_SANDSTONE_VERTICAL = registerBlock("vertical_cut_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_SANDSTONE, () -> Blocks.CUT_SANDSTONE_SLAB));
	public static final DeferredBlock<Block> RED_SANDSTONE_VERTICAL = registerBlock("vertical_red_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_SANDSTONE, () -> Blocks.RED_SANDSTONE_SLAB));
	public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_VERTICAL = registerBlock("vertical_smooth_red_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_RED_SANDSTONE, () -> Blocks.SMOOTH_RED_SANDSTONE_SLAB));
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_VERTICAL = registerBlock("vertical_cut_red_sandstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_RED_SANDSTONE, () -> Blocks.CUT_RED_SANDSTONE_SLAB));

	// DEEPSLATE
	public static final DeferredBlock<Block> COBBLED_DEEPSLATE_VERTICAL = registerBlock("vertical_cobbled_deepslate_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.COBBLED_DEEPSLATE, () -> Blocks.COBBLED_DEEPSLATE_SLAB));
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_VERTICAL = registerBlock("vertical_polished_deepslate_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_DEEPSLATE, () -> Blocks.POLISHED_DEEPSLATE_SLAB));
	public static final DeferredBlock<Block> DEEPSLATE_BRICK_VERTICAL = registerBlock("vertical_deepslate_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DEEPSLATE_BRICKS, () -> Blocks.DEEPSLATE_BRICK_SLAB));
	public static final DeferredBlock<Block> DEEPSLATE_TILE_VERTICAL = registerBlock("vertical_deepslate_tile_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DEEPSLATE_TILES, () -> Blocks.DEEPSLATE_TILE_SLAB));

	// NETHER
	public static final DeferredBlock<Block> BLACKSTONE_VERTICAL = registerBlock("vertical_blackstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACKSTONE, () -> Blocks.BLACKSTONE_SLAB));
	public static final DeferredBlock<Block> POLISHED_BLACKSTONE_VERTICAL = registerBlock("vertical_polished_blackstone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_BLACKSTONE, () -> Blocks.POLISHED_BLACKSTONE_SLAB));
	public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL = registerBlock("vertical_polished_blackstone_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_BLACKSTONE_BRICKS, () -> Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
	public static final DeferredBlock<Block> NETHERRACK_VERTICAL = registerBlock("vertical_netherrack_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHERRACK, ESPSlabs.NETHERRACK_SLAB));
	public static final DeferredBlock<Block> CRIMSON_NYLIUM_VERTICAL = registerBlock("vertical_crimson_nylium_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRIMSON_NYLIUM, ESPSlabs.CRIMSON_NYLIUM_SLAB));
	public static final DeferredBlock<Block> WARPED_NYLIUM_VERTICAL = registerBlock("vertical_warped_nylium_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WARPED_NYLIUM, ESPSlabs.WARPED_NYLIUM_SLAB));
	public static final DeferredBlock<Block> SOUL_SAND_VERTICAL = registerBlock("vertical_soul_sand_slab", () -> new SoulSandVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_UP), Blocks.SOUL_SAND, ESPSlabs.SOUL_SAND_SLAB));
	public static final DeferredBlock<Block> SOUL_SOIL_VERTICAL = registerBlock("vertical_soul_soil_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SOUL_SOIL, ESPSlabs.SOUL_SOIL_SLAB));
	public static final DeferredBlock<Block> NETHER_BRICK_VERTICAL = registerBlock("vertical_nether_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHER_BRICKS, () -> Blocks.NETHER_BRICK_SLAB));
	public static final DeferredBlock<Block> RED_NETHER_BRICK_VERTICAL = registerBlock("vertical_red_nether_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_NETHER_BRICKS, () -> Blocks.RED_NETHER_BRICK_SLAB));
	public static final DeferredBlock<Block> QUARTZ_VERTICAL = registerBlock("vertical_quartz_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BLOCK, () -> Blocks.QUARTZ_SLAB));
	public static final DeferredBlock<Block> QUARTZ_BRICK_VERTICAL = registerBlock("vertical_quartz_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BRICKS, ESPSlabs.QUARTZ_BRICK_SLAB));
	public static final DeferredBlock<Block> SMOOTH_QUARTZ_VERTICAL = registerBlock("vertical_smooth_quartz_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_QUARTZ, () -> Blocks.SMOOTH_QUARTZ_SLAB));
	public static final DeferredBlock<Block> NETHER_WART_VERTICAL = registerBlock("vertical_nether_wart_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.NETHER_WART_BLOCK, ESPSlabs.NETHER_WART_SLAB));
	public static final DeferredBlock<Block> WARPED_WART_VERTICAL = registerBlock("vertical_warped_wart_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.WARPED_WART_BLOCK, ESPSlabs.WARPED_WART_SLAB));
	public static final DeferredBlock<Block> SHROOMLIGHT_VERTICAL = registerBlock("vertical_shroomlight_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SHROOMLIGHT, ESPSlabs.SHROOMLIGHT_SLAB));
	public static final DeferredBlock<Block> MAGMA_VERTICAL = registerBlock("vertical_magma_slab", () -> new MagmaVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_DOWN), Blocks.MAGMA_BLOCK, ESPSlabs.MAGMA_SLAB));
	public static final DeferredBlock<Block> SMOOTH_BASALT_VERTICAL = registerBlock("vertical_smooth_basalt_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_BASALT, ESPSlabs.SMOOTH_BASALT_SLAB));
	public static final DeferredBlock<Block> OBSIDIAN_VERTICAL = registerBlock("vertical_obsidian_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.OBSIDIAN, ESPSlabs.OBSIDIAN_SLAB));
	public static final DeferredBlock<Block> CRYING_OBSIDIAN_VERTICAL = registerBlock("vertical_crying_obsidian_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRYING_OBSIDIAN, ESPSlabs.CRYING_OBSIDIAN_SLAB));
	public static final DeferredBlock<Block> GLOWSTONE_VERTICAL = registerBlock("vertical_glowstone_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.GLOWSTONE, ESPSlabs.GLOWSTONE_SLAB));

	// END
	public static final DeferredBlock<Block> END_STONE_VERTICAL = registerBlock("vertical_end_stone_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE, ESPSlabs.END_STONE_SLAB));
	public static final DeferredBlock<Block> END_STONE_BRICK_VERTICAL = registerBlock("vertical_end_stone_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE_BRICKS, () -> Blocks.END_STONE_BRICK_SLAB));
	public static final DeferredBlock<Block> PURPUR_VERTICAL = registerBlock("vertical_purpur_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPUR_BLOCK, () -> Blocks.PURPUR_SLAB));

	// PRISMARINE
	public static final DeferredBlock<Block> PRISMARINE_VERTICAL = registerBlock("vertical_prismarine_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PRISMARINE, () -> Blocks.PRISMARINE_SLAB));
	public static final DeferredBlock<Block> PRISMARINE_BRICK_VERTICAL = registerBlock("vertical_prismarine_brick_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PRISMARINE_BRICKS, () -> Blocks.PRISMARINE_BRICK_SLAB));
	public static final DeferredBlock<Block> DARK_PRISMARINE_VERTICAL = registerBlock("vertical_dark_prismarine_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DARK_PRISMARINE, () -> Blocks.DARK_PRISMARINE_SLAB));
	public static final DeferredBlock<Block> SEA_LANTERN_VERTICAL = registerBlock("vertical_sea_lantern_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.SEA_LANTERN, ESPSlabs.SEA_LANTERN_SLAB));

	// PLANKS
	public static final DeferredBlock<Block> OAK_VERTICAL = registerBlock("vertical_oak_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_PLANKS, () -> Blocks.OAK_SLAB));
	public static final DeferredBlock<Block> SPRUCE_VERTICAL = registerBlock("vertical_spruce_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_PLANKS, () -> Blocks.SPRUCE_SLAB));
	public static final DeferredBlock<Block> BIRCH_VERTICAL = registerBlock("vertical_birch_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_PLANKS, () -> Blocks.BIRCH_SLAB));
	public static final DeferredBlock<Block> JUNGLE_VERTICAL = registerBlock("vertical_jungle_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_PLANKS, () -> Blocks.JUNGLE_SLAB));
	public static final DeferredBlock<Block> ACACIA_VERTICAL = registerBlock("vertical_acacia_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_PLANKS, () -> Blocks.ACACIA_SLAB));
	public static final DeferredBlock<Block> DARK_OAK_VERTICAL = registerBlock("vertical_dark_oak_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_PLANKS, () -> Blocks.DARK_OAK_SLAB));
	public static final DeferredBlock<Block> MANGROVE_VERTICAL = registerBlock("vertical_mangrove_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_PLANKS, () -> Blocks.MANGROVE_SLAB));
	public static final DeferredBlock<Block> CHERRY_VERTICAL = registerBlock("vertical_cherry_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_PLANKS, () -> Blocks.CHERRY_SLAB));
	public static final DeferredBlock<Block> BAMBOO_VERTICAL = registerBlock("vertical_bamboo_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BAMBOO_PLANKS, () -> Blocks.BAMBOO_SLAB));
	public static final DeferredBlock<Block> BAMBOO_MOSAIC_VERTICAL = registerBlock("vertical_bamboo_mosaic_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BAMBOO_MOSAIC, () -> Blocks.BAMBOO_MOSAIC_SLAB));
	public static final DeferredBlock<Block> CRIMSON_VERTICAL = registerBlock("vertical_crimson_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_PLANKS, () -> Blocks.CRIMSON_SLAB));
	public static final DeferredBlock<Block> WARPED_VERTICAL = registerBlock("vertical_warped_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_PLANKS, () -> Blocks.WARPED_SLAB));

	// WOOD
	public static final DeferredBlock<Block> OAK_WOOD_VERTICAL = registerBlock("vertical_oak_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_WOOD, ESPSlabs.OAK_WOOD_SLAB));
	public static final DeferredBlock<Block> SPRUCE_WOOD_VERTICAL = registerBlock("vertical_spruce_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_WOOD, ESPSlabs.SPRUCE_WOOD_SLAB));
	public static final DeferredBlock<Block> BIRCH_WOOD_VERTICAL = registerBlock("vertical_birch_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_WOOD, ESPSlabs.BIRCH_WOOD_SLAB));
	public static final DeferredBlock<Block> JUNGLE_WOOD_VERTICAL = registerBlock("vertical_jungle_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_WOOD, ESPSlabs.JUNGLE_WOOD_SLAB));
	public static final DeferredBlock<Block> ACACIA_WOOD_VERTICAL = registerBlock("vertical_acacia_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_WOOD, ESPSlabs.ACACIA_WOOD_SLAB));
	public static final DeferredBlock<Block> DARK_OAK_WOOD_VERTICAL = registerBlock("vertical_dark_oak_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_WOOD, ESPSlabs.DARK_OAK_WOOD_SLAB));
	public static final DeferredBlock<Block> MANGROVE_WOOD_VERTICAL = registerBlock("vertical_mangrove_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_WOOD, ESPSlabs.MANGROVE_WOOD_SLAB));
	public static final DeferredBlock<Block> CHERRY_WOOD_VERTICAL = registerBlock("vertical_cherry_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_WOOD, ESPSlabs.CHERRY_WOOD_SLAB));
	public static final DeferredBlock<Block> CRIMSON_HYPHAE_VERTICAL = registerBlock("vertical_crimson_hyphae_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_HYPHAE, ESPSlabs.CRIMSON_HYPHAE_SLAB));
	public static final DeferredBlock<Block> WARPED_HYPHAE_VERTICAL = registerBlock("vertical_warped_hyphae_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_HYPHAE, ESPSlabs.WARPED_HYPHAE_SLAB));

	// STRIPPED WOOD
	public static final DeferredBlock<Block> STRIPPED_OAK_WOOD_VERTICAL = registerBlock("vertical_stripped_oak_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_OAK_WOOD, ESPSlabs.STRIPPED_OAK_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_SPRUCE_WOOD_VERTICAL = registerBlock("vertical_stripped_spruce_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_SPRUCE_WOOD, ESPSlabs.STRIPPED_SPRUCE_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_BIRCH_WOOD_VERTICAL = registerBlock("vertical_stripped_birch_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_BIRCH_WOOD, ESPSlabs.STRIPPED_BIRCH_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_JUNGLE_WOOD_VERTICAL = registerBlock("vertical_stripped_jungle_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_JUNGLE_WOOD, ESPSlabs.STRIPPED_JUNGLE_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_ACACIA_WOOD_VERTICAL = registerBlock("vertical_stripped_acacia_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_ACACIA_WOOD, ESPSlabs.STRIPPED_ACACIA_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_DARK_OAK_WOOD_VERTICAL = registerBlock("vertical_stripped_dark_oak_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_DARK_OAK_WOOD, ESPSlabs.STRIPPED_DARK_OAK_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_MANGROVE_WOOD_VERTICAL = registerBlock("vertical_stripped_mangrove_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_MANGROVE_WOOD, ESPSlabs.STRIPPED_MANGROVE_WOOD_SLAB, Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
	public static final DeferredBlock<Block> STRIPPED_CHERRY_WOOD_VERTICAL = registerBlock("vertical_stripped_cherry_wood_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CHERRY_WOOD, ESPSlabs.STRIPPED_CHERRY_WOOD_SLAB));
	public static final DeferredBlock<Block> STRIPPED_CRIMSON_HYPHAE_VERTICAL = registerBlock("vertical_stripped_crimson_hyphae_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CRIMSON_HYPHAE, ESPSlabs.STRIPPED_CRIMSON_HYPHAE_SLAB));
	public static final DeferredBlock<Block> STRIPPED_WARPED_HYPHAE_VERTICAL = registerBlock("vertical_stripped_warped_hyphae_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_WARPED_HYPHAE, ESPSlabs.STRIPPED_WARPED_HYPHAE_SLAB));

	// COPPER
	public static final DeferredBlock<Block> OXIDIZED_CUT_COPPER_VERTICAL = registerBlock("vertical_oxidized_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.OXIDIZED_CUT_COPPER, () -> Blocks.OXIDIZED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.OXIDIZED));
	public static final DeferredBlock<Block> WEATHERED_CUT_COPPER_VERTICAL = registerBlock("vertical_weathered_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WEATHERED_CUT_COPPER, () -> Blocks.WEATHERED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.WEATHERED));
	public static final DeferredBlock<Block> EXPOSED_CUT_COPPER_VERTICAL = registerBlock("vertical_exposed_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.EXPOSED_CUT_COPPER, () -> Blocks.EXPOSED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.EXPOSED));
	public static final DeferredBlock<Block> CUT_COPPER_VERTICAL = registerBlock("vertical_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.CUT_COPPER, () -> Blocks.CUT_COPPER_SLAB, WeatheringCopper.WeatherState.UNAFFECTED));
	public static final DeferredBlock<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_oxidized_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_OXIDIZED_CUT_COPPER, () -> Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.OXIDIZED));
	public static final DeferredBlock<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_weathered_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_WEATHERED_CUT_COPPER, () -> Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.WEATHERED));
	public static final DeferredBlock<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_exposed_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_EXPOSED_CUT_COPPER, () -> Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.EXPOSED));
	public static final DeferredBlock<Block> WAXED_CUT_COPPER_VERTICAL = registerBlock("vertical_waxed_cut_copper_slab", () -> new WeatheringCopperVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_CUT_COPPER, () -> Blocks.WAXED_CUT_COPPER_SLAB, WeatheringCopper.WeatherState.UNAFFECTED));

	// OTHER
	public static final DeferredBlock<Block> HAY_VERTICAL = registerBlock("vertical_hay_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.HAY_BLOCK, ESPSlabs.HAY_SLAB));
	public static final DeferredBlock<Block> BROWN_MUSHROOM_VERTICAL = registerBlock("vertical_brown_mushroom_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BROWN_MUSHROOM_BLOCK, ESPSlabs.BROWN_MUSHROOM_SLAB));
	public static final DeferredBlock<Block> RED_MUSHROOM_VERTICAL = registerBlock("vertical_red_mushroom_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.RED_MUSHROOM_BLOCK, ESPSlabs.RED_MUSHROOM_SLAB));
	public static final DeferredBlock<Block> MUSHROOM_STEM_VERTICAL = registerBlock("vertical_mushroom_stem_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MUSHROOM_STEM, ESPSlabs.MUSHROOM_STEM_SLAB));
	public static final DeferredBlock<Block> MOSS_VERTICAL = registerBlock("vertical_moss_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.MOSS_BLOCK, ESPSlabs.MOSS_SLAB));
	public static final DeferredBlock<Block> OCHRE_FROGLIGHT_VERTICAL = registerBlock("vertical_ochre_froglight_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.OCHRE_FROGLIGHT, ESPSlabs.OCHRE_FROGLIGHT_SLAB));
	public static final DeferredBlock<Block> VERDANT_FROGLIGHT_VERTICAL = registerBlock("vertical_verdant_froglight_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.VERDANT_FROGLIGHT, ESPSlabs.VERDANT_FROGLIGHT_SLAB));
	public static final DeferredBlock<Block> PEARLESCENT_FROGLIGHT_VERTICAL = registerBlock("vertical_pearlescent_froglight_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.PEARLESCENT_FROGLIGHT, ESPSlabs.PEARLESCENT_FROGLIGHT_SLAB));
	public static final DeferredBlock<Block> AMETHYST_VERTICAL = registerBlock("vertical_amethyst_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE) , Blocks.AMETHYST_BLOCK, ESPSlabs.AMETHYST_SLAB));
	public static final DeferredBlock<Block> SNOW_VERTICAL = registerBlock("vertical_snow_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SNOW_BLOCK, ESPSlabs.SNOW_SLAB));
	public static final DeferredBlock<Block> SCULK_VERTICAL = registerBlock("vertical_sculk_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SCULK, ESPSlabs.SCULK_SLAB));
	public static final DeferredBlock<Block> DRIED_KELP_VERTICAL = registerBlock("vertical_dried_kelp_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.DRIED_KELP_BLOCK, ESPSlabs.DRIED_KELP_SLAB));
	public static final DeferredBlock<Block> HONEYCOMB_VERTICAL = registerBlock("vertical_honeycomb_slab", () -> new ESPVerticalSlabBlock(tag(), Blocks.HONEYCOMB_BLOCK, ESPSlabs.HONEYCOMB_SLAB));
	public static final DeferredBlock<Block> RAW_COPPER_VERTICAL = registerBlock("vertical_raw_copper_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_COPPER_BLOCK, ESPSlabs.RAW_COPPER_SLAB));
	public static final DeferredBlock<Block> RAW_IRON_VERTICAL = registerBlock("vertical_raw_iron_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_IRON_BLOCK, ESPSlabs.RAW_IRON_SLAB));
	public static final DeferredBlock<Block> RAW_GOLD_VERTICAL = registerBlock("vertical_raw_gold_slab", () -> new ESPVerticalSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_GOLD_BLOCK, ESPSlabs.RAW_GOLD_SLAB));

	public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> ret = BLOCKS.register(name, block);
		ITEMS.register(name, () -> new BlockItem(ret.value(), new Item.Properties()));
		return ret;
	}

	public static Collection<DeferredHolder<Item, ? extends Item>> orderedItems() {
		return ITEMS.getEntries();
	}

	private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return false;
	}

	private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
		return false;
	}
}
