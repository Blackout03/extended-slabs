package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPStairBlock;
import com.blackout.extendedslabs.blocks.falling.FallingStairBlock;
import com.blackout.extendedslabs.blocks.glass.GlassStairBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassStairBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassStairBlock;
import com.blackout.extendedslabs.blocks.magma.MagmaStairBlock;
import com.blackout.extendedslabs.blocks.path.PathStairBlock;
import com.blackout.extendedslabs.blocks.soulsand.SoulSandStairBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.Collection;
import java.util.function.Supplier;

import static com.blackout.extendedslabs.blocks.IBlockCharacteristics.tag;

public class ESPStairs {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExtendedSlabs.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedSlabs.MODID);

	// DIRT
	public static final DeferredBlock<Block> GRASS_BLOCK_STAIRS = registerBlock("grass_block_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.GRASS_BLOCK, ESPCorners.DIRT_CORNER));
	public static final DeferredBlock<Block> DIRT_STAIRS = registerBlock("dirt_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.DIRT, ESPCorners.DIRT_CORNER));
	public static final DeferredBlock<Block> COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.COARSE_DIRT, ESPCorners.COARSE_DIRT_CORNER));
	public static final DeferredBlock<Block> ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.ROOTED_DIRT, ESPCorners.ROOTED_DIRT_CORNER));
	public static final DeferredBlock<Block> DIRT_PATH_STAIRS = registerBlock("dirt_path_stairs", () -> new PathStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.DIRT_PATH, ESPCorners.DIRT_CORNER));
	public static final DeferredBlock<Block> PODZOL_STAIRS = registerBlock("podzol_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.PODZOL, ESPCorners.DIRT_CORNER));
	public static final DeferredBlock<Block> MYCELIUM_STAIRS = registerBlock("mycelium_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MYCELIUM, ESPCorners.DIRT_CORNER));
	public static final DeferredBlock<Block> SAND_STAIRS = registerBlock("sand_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.SAND), Blocks.SAND, ESPCorners.SAND_CORNER));
	public static final DeferredBlock<Block> RED_SAND_STAIRS = registerBlock("red_sand_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.SAND), Blocks.RED_SAND, ESPCorners.RED_SAND_CORNER));
	public static final DeferredBlock<Block> GRAVEL_STAIRS = registerBlock("gravel_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAVEL, ESPCorners.GRAVEL_CORNER));

	// STONE
	public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_STONE, ESPCorners.SMOOTH_STONE_CORNER));
	public static final DeferredBlock<Block> TUFF_STAIRS = registerBlock("tuff_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TUFF, ESPCorners.TUFF_CORNER));
	public static final DeferredBlock<Block> CALCITE_STAIRS = registerBlock("calcite_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CALCITE, ESPCorners.CALCITE_CORNER));
	public static final DeferredBlock<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DRIPSTONE_BLOCK, ESPCorners.DRIPSTONE_CORNER));
	public static final DeferredBlock<Block> MUD_STAIRS = registerBlock("mud_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.MUD, ESPCorners.MUD_CORNER));
	public static final DeferredBlock<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PACKED_MUD, ESPCorners.PACKED_MUD_CORNER));

	// WOOL
	public static final DeferredBlock<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.WHITE_WOOL, ESPCorners.WHITE_WOOL_CORNER));
	public static final DeferredBlock<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.ORANGE_WOOL, ESPCorners.ORANGE_WOOL_CORNER));
	public static final DeferredBlock<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.MAGENTA_WOOL, ESPCorners.MAGENTA_WOOL_CORNER));
	public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.LIGHT_BLUE_WOOL, ESPCorners.LIGHT_BLUE_WOOL_CORNER));
	public static final DeferredBlock<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.YELLOW_WOOL, ESPCorners.YELLOW_WOOL_CORNER));
	public static final DeferredBlock<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.LIME_WOOL, ESPCorners.LIME_WOOL_CORNER));
	public static final DeferredBlock<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.PINK_WOOL, ESPCorners.PINK_WOOL_CORNER));
	public static final DeferredBlock<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.GRAY_WOOL, ESPCorners.GRAY_WOOL_CORNER));
	public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.LIGHT_GRAY_WOOL, ESPCorners.LIGHT_GRAY_WOOL_CORNER));
	public static final DeferredBlock<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.CYAN_WOOL, ESPCorners.CYAN_WOOL_CORNER));
	public static final DeferredBlock<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.PURPLE_WOOL, ESPCorners.PURPLE_WOOL_CORNER));
	public static final DeferredBlock<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.BLUE_WOOL, ESPCorners.BLUE_WOOL_CORNER));
	public static final DeferredBlock<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.BROWN_WOOL, ESPCorners.BROWN_WOOL_CORNER));
	public static final DeferredBlock<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.GREEN_WOOL, ESPCorners.GREEN_WOOL_CORNER));
	public static final DeferredBlock<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.RED_WOOL, ESPCorners.RED_WOOL_CORNER));
	public static final DeferredBlock<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", () -> new ESPStairBlock(tag(BlockTags.WOOL), Blocks.BLACK_WOOL, ESPCorners.BLACK_WOOL_CORNER));

	// CONCRETE_POWDER
	public static final DeferredBlock<Block> WHITE_CONCRETE_POWDER_STAIRS = registerBlock("white_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.WHITE_CONCRETE_POWDER, ESPCorners.WHITE_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_POWDER_STAIRS = registerBlock("orange_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ORANGE_CONCRETE_POWDER, ESPCorners.ORANGE_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_POWDER_STAIRS = registerBlock("magenta_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MAGENTA_CONCRETE_POWDER, ESPCorners.MAGENTA_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("light_blue_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_BLUE_CONCRETE_POWDER, ESPCorners.LIGHT_BLUE_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_POWDER_STAIRS = registerBlock("yellow_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.YELLOW_CONCRETE_POWDER, ESPCorners.YELLOW_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> LIME_CONCRETE_POWDER_STAIRS = registerBlock("lime_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIME_CONCRETE_POWDER, ESPCorners.LIME_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> PINK_CONCRETE_POWDER_STAIRS = registerBlock("pink_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PINK_CONCRETE_POWDER, ESPCorners.PINK_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> GRAY_CONCRETE_POWDER_STAIRS = registerBlock("gray_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAY_CONCRETE_POWDER, ESPCorners.GRAY_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("light_gray_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_GRAY_CONCRETE_POWDER, ESPCorners.LIGHT_GRAY_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> CYAN_CONCRETE_POWDER_STAIRS = registerBlock("cyan_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CYAN_CONCRETE_POWDER, ESPCorners.CYAN_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_POWDER_STAIRS = registerBlock("purple_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PURPLE_CONCRETE_POWDER, ESPCorners.PURPLE_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> BLUE_CONCRETE_POWDER_STAIRS = registerBlock("blue_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLUE_CONCRETE_POWDER, ESPCorners.BLUE_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> BROWN_CONCRETE_POWDER_STAIRS = registerBlock("brown_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BROWN_CONCRETE_POWDER, ESPCorners.BROWN_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> GREEN_CONCRETE_POWDER_STAIRS = registerBlock("green_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GREEN_CONCRETE_POWDER, ESPCorners.GREEN_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> RED_CONCRETE_POWDER_STAIRS = registerBlock("red_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_CONCRETE_POWDER, ESPCorners.RED_CONCRETE_POWDER_CORNER));
	public static final DeferredBlock<Block> BLACK_CONCRETE_POWDER_STAIRS = registerBlock("black_concrete_powder_stairs", () -> new FallingStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLACK_CONCRETE_POWDER, ESPCorners.BLACK_CONCRETE_POWDER_CORNER));

	// CONCRETE
	public static final DeferredBlock<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_CONCRETE, ESPCorners.WHITE_CONCRETE_CORNER));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_CONCRETE, ESPCorners.ORANGE_CONCRETE_CORNER));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_CONCRETE, ESPCorners.MAGENTA_CONCRETE_CORNER));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_CONCRETE, ESPCorners.LIGHT_BLUE_CONCRETE_CORNER));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_CONCRETE, ESPCorners.YELLOW_CONCRETE_CORNER));
	public static final DeferredBlock<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_CONCRETE, ESPCorners.LIME_CONCRETE_CORNER));
	public static final DeferredBlock<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_CONCRETE, ESPCorners.PINK_CONCRETE_CORNER));
	public static final DeferredBlock<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_CONCRETE, ESPCorners.GRAY_CONCRETE_CORNER));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_CONCRETE, ESPCorners.LIGHT_GRAY_CONCRETE_CORNER));
	public static final DeferredBlock<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_CONCRETE, ESPCorners.CYAN_CONCRETE_CORNER));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_CONCRETE, ESPCorners.PURPLE_CONCRETE_CORNER));
	public static final DeferredBlock<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_CONCRETE, ESPCorners.BLUE_CONCRETE_CORNER));
	public static final DeferredBlock<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_CONCRETE, ESPCorners.BROWN_CONCRETE_CORNER));
	public static final DeferredBlock<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_CONCRETE, ESPCorners.GREEN_CONCRETE_CORNER));
	public static final DeferredBlock<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_CONCRETE, ESPCorners.RED_CONCRETE_CORNER));
	public static final DeferredBlock<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_CONCRETE, ESPCorners.BLACK_CONCRETE_CORNER));

	// TERRACOTTA
	public static final DeferredBlock<Block> CLAY_STAIRS = registerBlock("clay_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CLAY, ESPCorners.CLAY_CORNER));
	public static final DeferredBlock<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.TERRACOTTA, ESPCorners.TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.WHITE_TERRACOTTA, ESPCorners.WHITE_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.ORANGE_TERRACOTTA, ESPCorners.ORANGE_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.MAGENTA_TERRACOTTA, ESPCorners.MAGENTA_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIGHT_BLUE_TERRACOTTA, ESPCorners.LIGHT_BLUE_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.YELLOW_TERRACOTTA, ESPCorners.YELLOW_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIME_TERRACOTTA, ESPCorners.LIME_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.PINK_TERRACOTTA, ESPCorners.PINK_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.GRAY_TERRACOTTA, ESPCorners.GRAY_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIGHT_GRAY_TERRACOTTA, ESPCorners.LIGHT_GRAY_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.CYAN_TERRACOTTA, ESPCorners.CYAN_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.PURPLE_TERRACOTTA, ESPCorners.PURPLE_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BLUE_TERRACOTTA, ESPCorners.BLUE_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BROWN_TERRACOTTA, ESPCorners.BROWN_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.GREEN_TERRACOTTA, ESPCorners.GREEN_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.RED_TERRACOTTA, ESPCorners.RED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BLACK_TERRACOTTA, ESPCorners.BLACK_TERRACOTTA_CORNER));

	// GLAZED TERRACOTTA
	public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_GLAZED_TERRACOTTA, ESPCorners.WHITE_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_GLAZED_TERRACOTTA, ESPCorners.ORANGE_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_GLAZED_TERRACOTTA, ESPCorners.MAGENTA_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ESPCorners.LIGHT_BLUE_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_GLAZED_TERRACOTTA, ESPCorners.YELLOW_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_GLAZED_TERRACOTTA, ESPCorners.LIME_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_GLAZED_TERRACOTTA, ESPCorners.PINK_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_GLAZED_TERRACOTTA, ESPCorners.GRAY_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ESPCorners.LIGHT_GRAY_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_GLAZED_TERRACOTTA, ESPCorners.CYAN_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_GLAZED_TERRACOTTA, ESPCorners.PURPLE_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_GLAZED_TERRACOTTA, ESPCorners.BLUE_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_GLAZED_TERRACOTTA, ESPCorners.BROWN_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_GLAZED_TERRACOTTA, ESPCorners.GREEN_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_GLAZED_TERRACOTTA, ESPCorners.RED_GLAZED_TERRACOTTA_CORNER));
	public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_GLAZED_TERRACOTTA, ESPCorners.BLACK_GLAZED_TERRACOTTA_CORNER));

	// GLASS
	public static final DeferredBlock<Block> GLASS_STAIRS = registerBlock("glass_stairs", () -> new GlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.GLASS, ESPCorners.GLASS_CORNER));
	public static final DeferredBlock<Block> TINTED_GLASS_STAIRS = registerBlock("tinted_glass_stairs", () -> new TintedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.TINTED_GLASS, ESPCorners.TINTED_GLASS_CORNER));
	public static final DeferredBlock<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.WHITE_STAINED_GLASS, ESPCorners.WHITE_STAINED_GLASS_CORNER, DyeColor.WHITE));
	public static final DeferredBlock<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.ORANGE_STAINED_GLASS, ESPCorners.ORANGE_STAINED_GLASS_CORNER, DyeColor.ORANGE));
	public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.MAGENTA_STAINED_GLASS, ESPCorners.MAGENTA_STAINED_GLASS_CORNER, DyeColor.MAGENTA));
	public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_BLUE_STAINED_GLASS, ESPCorners.LIGHT_BLUE_STAINED_GLASS_CORNER, DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.YELLOW_STAINED_GLASS, ESPCorners.YELLOW_STAINED_GLASS_CORNER, DyeColor.YELLOW));
	public static final DeferredBlock<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIME_STAINED_GLASS, ESPCorners.LIME_STAINED_GLASS_CORNER, DyeColor.LIME));
	public static final DeferredBlock<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.PINK_STAINED_GLASS, ESPCorners.PINK_STAINED_GLASS_CORNER, DyeColor.PINK));
	public static final DeferredBlock<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.GRAY_STAINED_GLASS, ESPCorners.GRAY_STAINED_GLASS_CORNER, DyeColor.GRAY));
	public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_GRAY_STAINED_GLASS, ESPCorners.LIGHT_GRAY_STAINED_GLASS_CORNER, DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.CYAN_STAINED_GLASS, ESPCorners.CYAN_STAINED_GLASS_CORNER, DyeColor.CYAN));
	public static final DeferredBlock<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.PURPLE_STAINED_GLASS, ESPCorners.PURPLE_STAINED_GLASS_CORNER, DyeColor.PURPLE));
	public static final DeferredBlock<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLUE_STAINED_GLASS, ESPCorners.BLUE_STAINED_GLASS_CORNER, DyeColor.BLUE));
	public static final DeferredBlock<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.BROWN_STAINED_GLASS, ESPCorners.BROWN_STAINED_GLASS_CORNER, DyeColor.BROWN));
	public static final DeferredBlock<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.GREEN_STAINED_GLASS, ESPCorners.GREEN_STAINED_GLASS_CORNER, DyeColor.GREEN));
	public static final DeferredBlock<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.RED_STAINED_GLASS, ESPCorners.RED_STAINED_GLASS_CORNER, DyeColor.RED));
	public static final DeferredBlock<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs", () -> new StainedGlassStairBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLACK_STAINED_GLASS, ESPCorners.BLACK_STAINED_GLASS_CORNER, DyeColor.BLACK));

	// SANDSTONE
	public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_SANDSTONE, ESPCorners.CUT_SANDSTONE_CORNER));
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_RED_SANDSTONE, ESPCorners.CUT_RED_SANDSTONE_CORNER));

	// WOOD
	public static final DeferredBlock<Block> OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_WOOD, ESPCorners.OAK_WOOD_CORNER));
	public static final DeferredBlock<Block> SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_WOOD, ESPCorners.SPRUCE_WOOD_CORNER));
	public static final DeferredBlock<Block> BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_WOOD, ESPCorners.BIRCH_WOOD_CORNER));
	public static final DeferredBlock<Block> JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_WOOD, ESPCorners.JUNGLE_WOOD_CORNER));
	public static final DeferredBlock<Block> ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_WOOD, ESPCorners.ACACIA_WOOD_CORNER));
	public static final DeferredBlock<Block> DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_WOOD, ESPCorners.DARK_OAK_WOOD_CORNER));
	public static final DeferredBlock<Block> MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_WOOD, ESPCorners.MANGROVE_WOOD_CORNER));
	public static final DeferredBlock<Block> CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_WOOD, ESPCorners.CHERRY_WOOD_CORNER));
	public static final DeferredBlock<Block> CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_HYPHAE, ESPCorners.CRIMSON_HYPHAE_CORNER));
	public static final DeferredBlock<Block> WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_HYPHAE, ESPCorners.WARPED_HYPHAE_CORNER));

	// STRIPPED WOOD
	public static final DeferredBlock<Block> STRIPPED_OAK_WOOD_STAIRS = registerBlock("stripped_oak_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_OAK_WOOD, ESPCorners.STRIPPED_OAK_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_SPRUCE_WOOD_STAIRS = registerBlock("stripped_spruce_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_SPRUCE_WOOD, ESPCorners.STRIPPED_SPRUCE_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_BIRCH_WOOD_STAIRS = registerBlock("stripped_birch_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_BIRCH_WOOD, ESPCorners.STRIPPED_BIRCH_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_JUNGLE_WOOD_STAIRS = registerBlock("stripped_jungle_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_JUNGLE_WOOD, ESPCorners.STRIPPED_JUNGLE_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_ACACIA_WOOD_STAIRS = registerBlock("stripped_acacia_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_ACACIA_WOOD, ESPCorners.STRIPPED_ACACIA_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = registerBlock("stripped_dark_oak_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_DARK_OAK_WOOD, ESPCorners.STRIPPED_DARK_OAK_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_MANGROVE_WOOD_STAIRS = registerBlock("stripped_mangrove_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_MANGROVE_WOOD, ESPCorners.STRIPPED_MANGROVE_WOOD_CORNER, Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
	public static final DeferredBlock<Block> STRIPPED_CHERRY_WOOD_STAIRS = registerBlock("stripped_cherry_wood_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CHERRY_WOOD, ESPCorners.STRIPPED_CHERRY_WOOD_CORNER));
	public static final DeferredBlock<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = registerBlock("stripped_crimson_hyphae_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CRIMSON_HYPHAE, ESPCorners.STRIPPED_CRIMSON_HYPHAE_CORNER));
	public static final DeferredBlock<Block> STRIPPED_WARPED_HYPHAE_STAIRS = registerBlock("stripped_warped_hyphae_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_WARPED_HYPHAE, ESPCorners.STRIPPED_WARPED_HYPHAE_CORNER));

	// NETHER
	public static final DeferredBlock<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHERRACK, ESPCorners.NETHERRACK_CORNER));
	public static final DeferredBlock<Block> CRIMSON_NYLIUM_STAIRS = registerBlock("crimson_nylium_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRIMSON_NYLIUM, ESPCorners.NETHERRACK_CORNER));
	public static final DeferredBlock<Block> WARPED_NYLIUM_STAIRS = registerBlock("warped_nylium_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WARPED_NYLIUM, ESPCorners.NETHERRACK_CORNER));
	public static final DeferredBlock<Block> SOUL_SAND_STAIRS = registerBlock("soul_sand_stairs", () -> new SoulSandStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_UP), Blocks.SOUL_SAND, ESPCorners.SOUL_SAND_CORNER));
	public static final DeferredBlock<Block> SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SOUL_SOIL, ESPCorners.SOUL_SOIL_CORNER));
	public static final DeferredBlock<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BRICKS, ESPCorners.QUARTZ_BRICK_CORNER));
	public static final DeferredBlock<Block> NETHER_WART_STAIRS = registerBlock("nether_wart_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.NETHER_WART_BLOCK, ESPCorners.NETHER_WART_CORNER));
	public static final DeferredBlock<Block> WARPED_WART_STAIRS = registerBlock("warped_wart_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.WARPED_WART_BLOCK, ESPCorners.WARPED_WART_CORNER));
	public static final DeferredBlock<Block> SHROOMLIGHT_STAIRS = registerBlock("shroomlight_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SHROOMLIGHT, ESPCorners.SHROOMLIGHT_CORNER));
	public static final DeferredBlock<Block> MAGMA_STAIRS = registerBlock("magma_stairs", () -> new MagmaStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_DOWN), Blocks.MAGMA_BLOCK, ESPCorners.MAGMA_CORNER));
	public static final DeferredBlock<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_BASALT, ESPCorners.SMOOTH_BASALT_CORNER));
	public static final DeferredBlock<Block> OBSIDIAN_STAIRS = registerBlock("obsidian_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.OBSIDIAN, ESPCorners.OBSIDIAN_CORNER));
	public static final DeferredBlock<Block> CRYING_OBSIDIAN_STAIRS = registerBlock("crying_obsidian_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRYING_OBSIDIAN, ESPCorners.CRYING_OBSIDIAN_CORNER));
	public static final DeferredBlock<Block> GLOWSTONE_STAIRS = registerBlock("glowstone_stairs", () -> new ESPStairBlock(tag(), Blocks.GLOWSTONE, ESPCorners.GLOWSTONE_CORNER));

	// END
	public static final DeferredBlock<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE, ESPCorners.END_STONE_CORNER));

	// PRISMARINE
	public static final DeferredBlock<Block> SEA_LANTERN_STAIRS = registerBlock("sea_lantern_stairs", () -> new ESPStairBlock(tag(), Blocks.SEA_LANTERN, ESPCorners.SEA_LANTERN_CORNER));

	// OTHER
	public static final DeferredBlock<Block> HAY_STAIRS = registerBlock("hay_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.HAY_BLOCK, ESPCorners.HAY_CORNER));
	public static final DeferredBlock<Block> BROWN_MUSHROOM_STAIRS = registerBlock("brown_mushroom_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BROWN_MUSHROOM_BLOCK, ESPCorners.BROWN_MUSHROOM_CORNER));
	public static final DeferredBlock<Block> RED_MUSHROOM_STAIRS = registerBlock("red_mushroom_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.RED_MUSHROOM_BLOCK, ESPCorners.RED_MUSHROOM_CORNER));
	public static final DeferredBlock<Block> MUSHROOM_STEM_STAIRS = registerBlock("mushroom_stem_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MUSHROOM_STEM, ESPCorners.MUSHROOM_STEM_CORNER));
	public static final DeferredBlock<Block> MOSS_STAIRS = registerBlock("moss_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.MOSS_BLOCK, ESPCorners.MOSS_CORNER));
	public static final DeferredBlock<Block> OCHRE_FROGLIGHT_STAIRS = registerBlock("ochre_froglight_stairs", () -> new ESPStairBlock(tag(), Blocks.OCHRE_FROGLIGHT, ESPCorners.OCHRE_FROGLIGHT_CORNER));
	public static final DeferredBlock<Block> VERDANT_FROGLIGHT_STAIRS = registerBlock("verdant_froglight_stairs", () -> new ESPStairBlock(tag(), Blocks.VERDANT_FROGLIGHT, ESPCorners.VERDANT_FROGLIGHT_CORNER));
	public static final DeferredBlock<Block> PEARLESCENT_FROGLIGHT_STAIRS = registerBlock("pearlescent_froglight_stairs", () -> new ESPStairBlock(tag(), Blocks.PEARLESCENT_FROGLIGHT, ESPCorners.PEARLESCENT_FROGLIGHT_CORNER));
	public static final DeferredBlock<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.AMETHYST_BLOCK, ESPCorners.AMETHYST_CORNER));
	public static final DeferredBlock<Block> SNOW_STAIRS = registerBlock("snow_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SNOW_BLOCK, ESPCorners.SNOW_CORNER));
	public static final DeferredBlock<Block> SCULK_STAIRS = registerBlock("sculk_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SCULK, ESPCorners.SCULK_CORNER));
	public static final DeferredBlock<Block> DRIED_KELP_STAIRS = registerBlock("dried_kelp_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.DRIED_KELP_BLOCK, ESPCorners.DRIED_KELP_CORNER));
	public static final DeferredBlock<Block> HONEYCOMB_STAIRS = registerBlock("honeycomb_stairs", () -> new ESPStairBlock(tag(), Blocks.HONEYCOMB_BLOCK, ESPCorners.HONEYCOMB_CORNER));
	public static final DeferredBlock<Block> RAW_COPPER_STAIRS = registerBlock("raw_copper_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_COPPER_BLOCK, ESPCorners.RAW_COPPER_CORNER));
	public static final DeferredBlock<Block> RAW_IRON_STAIRS = registerBlock("raw_iron_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_IRON_BLOCK, ESPCorners.RAW_IRON_CORNER));
	public static final DeferredBlock<Block> RAW_GOLD_STAIRS = registerBlock("raw_gold_stairs", () -> new ESPStairBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_GOLD_BLOCK, ESPCorners.RAW_GOLD_CORNER));

	public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> ret = BLOCKS.register(name, block);
		ITEMS.register(name, () -> new BlockItem(ret.value(), new Item.Properties()));
		return ret;
	}

	public static Collection<DeferredHolder<Item, ? extends Item>> orderedItems() {
		return ITEMS.getEntries();
	}
}
