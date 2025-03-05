package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPCornerBlock;
import com.blackout.extendedslabs.blocks.copper.WeatheringCopperCornerBlock;
import com.blackout.extendedslabs.blocks.falling.FallingCornerBlock;
import com.blackout.extendedslabs.blocks.glass.GlassCornerBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassCornerBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassCornerBlock;
import com.blackout.extendedslabs.blocks.magma.MagmaCornerBlock;
import com.blackout.extendedslabs.blocks.soulsand.SoulSandCornerBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.Collection;
import java.util.function.Supplier;

import static com.blackout.extendedslabs.blocks.IBlockCharacteristics.tag;

public class ESPCorners {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExtendedSlabs.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedSlabs.MODID);

	// DIRT
	public static final DeferredBlock<Block> DIRT_CORNER = registerBlock("dirt_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT, ESPStairs.DIRT_STAIRS));
	public static final DeferredBlock<Block> COARSE_DIRT_CORNER = registerBlock("coarse_dirt_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.COARSE_DIRT, ESPStairs.COARSE_DIRT_STAIRS));
	public static final DeferredBlock<Block> ROOTED_DIRT_CORNER = registerBlock("rooted_dirt_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ROOTED_DIRT, ESPStairs.ROOTED_DIRT_STAIRS));
	public static final DeferredBlock<Block> SAND_CORNER = registerBlock("sand_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SAND, ESPStairs.SAND_STAIRS));
	public static final DeferredBlock<Block> RED_SAND_CORNER = registerBlock("red_sand_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_SAND, ESPStairs.RED_SAND_STAIRS));
	public static final DeferredBlock<Block> GRAVEL_CORNER = registerBlock("gravel_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAVEL, ESPStairs.GRAVEL_STAIRS));

	// STONE
	public static final DeferredBlock<Block> COBBLESTONE_CORNER = registerBlock("cobblestone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.COBBLESTONE, () -> Blocks.COBBLESTONE_STAIRS));
	public static final DeferredBlock<Block> STONE_CORNER = registerBlock("stone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.STONE, () -> Blocks.STONE_STAIRS));
	public static final DeferredBlock<Block> STONE_BRICK_CORNER = registerBlock("stone_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.STONE_BRICKS, () -> Blocks.STONE_BRICK_STAIRS));
	public static final DeferredBlock<Block> SMOOTH_STONE_CORNER = registerBlock("smooth_stone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_STONE, ESPStairs.SMOOTH_STONE_STAIRS));
	public static final DeferredBlock<Block> MOSSY_COBBLESTONE_CORNER = registerBlock("mossy_cobblestone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MOSSY_COBBLESTONE, () -> Blocks.MOSSY_COBBLESTONE_STAIRS));
	public static final DeferredBlock<Block> MOSSY_STONE_BRICK_CORNER = registerBlock("mossy_stone_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MOSSY_STONE_BRICKS, () -> Blocks.MOSSY_STONE_BRICK_STAIRS));
	public static final DeferredBlock<Block> ANDESITE_CORNER = registerBlock("andesite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ANDESITE, () -> Blocks.ANDESITE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_ANDESITE_CORNER = registerBlock("polished_andesite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_ANDESITE, () -> Blocks.POLISHED_ANDESITE_STAIRS));
	public static final DeferredBlock<Block> DIORITE_CORNER = registerBlock("diorite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DIORITE, () -> Blocks.DIORITE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_DIORITE_CORNER = registerBlock("polished_diorite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_DIORITE, () -> Blocks.POLISHED_DIORITE_STAIRS));
	public static final DeferredBlock<Block> GRANITE_CORNER = registerBlock("granite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRANITE, () -> Blocks.GRANITE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_GRANITE_CORNER = registerBlock("polished_granite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_GRANITE, () -> Blocks.POLISHED_GRANITE_STAIRS));
	public static final DeferredBlock<Block> BRICK_CORNER = registerBlock("brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BRICKS, () -> Blocks.BRICK_STAIRS));
	public static final DeferredBlock<Block> TUFF_CORNER = registerBlock("tuff_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TUFF, ESPStairs.TUFF_STAIRS));
	public static final DeferredBlock<Block> CALCITE_CORNER = registerBlock("calcite_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CALCITE, ESPStairs.CALCITE_STAIRS));
	public static final DeferredBlock<Block> DRIPSTONE_CORNER = registerBlock("dripstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DRIPSTONE_BLOCK, ESPStairs.DRIPSTONE_STAIRS));
	public static final DeferredBlock<Block> MUD_CORNER = registerBlock("mud_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MUD, ESPStairs.MUD_STAIRS));
	public static final DeferredBlock<Block> PACKED_MUD_CORNER = registerBlock("packed_mud_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PACKED_MUD, ESPStairs.PACKED_MUD_STAIRS));
	public static final DeferredBlock<Block> MUD_BRICK_CORNER = registerBlock("mud_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MUD_BRICKS, () -> Blocks.MUD_BRICK_STAIRS));

	// WOOL
	public static final DeferredBlock<Block> WHITE_WOOL_CORNER = registerBlock("white_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.WHITE_WOOL, ESPStairs.WHITE_WOOL_STAIRS));
	public static final DeferredBlock<Block> ORANGE_WOOL_CORNER = registerBlock("orange_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.ORANGE_WOOL, ESPStairs.ORANGE_WOOL_STAIRS));
	public static final DeferredBlock<Block> MAGENTA_WOOL_CORNER = registerBlock("magenta_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.MAGENTA_WOOL, ESPStairs.MAGENTA_WOOL_STAIRS));
	public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_CORNER = registerBlock("light_blue_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.LIGHT_BLUE_WOOL, ESPStairs.LIGHT_BLUE_WOOL_STAIRS));
	public static final DeferredBlock<Block> YELLOW_WOOL_CORNER = registerBlock("yellow_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.YELLOW_WOOL, ESPStairs.YELLOW_WOOL_STAIRS));
	public static final DeferredBlock<Block> LIME_WOOL_CORNER = registerBlock("lime_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.LIME_WOOL, ESPStairs.LIME_WOOL_STAIRS));
	public static final DeferredBlock<Block> PINK_WOOL_CORNER = registerBlock("pink_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.PINK_WOOL, ESPStairs.PINK_WOOL_STAIRS));
	public static final DeferredBlock<Block> GRAY_WOOL_CORNER = registerBlock("gray_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.GRAY_WOOL, ESPStairs.GRAY_WOOL_STAIRS));
	public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_CORNER = registerBlock("light_gray_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.LIGHT_GRAY_WOOL, ESPStairs.LIGHT_GRAY_WOOL_STAIRS));
	public static final DeferredBlock<Block> CYAN_WOOL_CORNER = registerBlock("cyan_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.CYAN_WOOL, ESPStairs.CYAN_WOOL_STAIRS));
	public static final DeferredBlock<Block> PURPLE_WOOL_CORNER = registerBlock("purple_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.PURPLE_WOOL, ESPStairs.PURPLE_WOOL_STAIRS));
	public static final DeferredBlock<Block> BLUE_WOOL_CORNER = registerBlock("blue_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.BLUE_WOOL, ESPStairs.BLUE_WOOL_STAIRS));
	public static final DeferredBlock<Block> BROWN_WOOL_CORNER = registerBlock("brown_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.BROWN_WOOL, ESPStairs.BROWN_WOOL_STAIRS));
	public static final DeferredBlock<Block> GREEN_WOOL_CORNER = registerBlock("green_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.GREEN_WOOL, ESPStairs.GREEN_WOOL_STAIRS));
	public static final DeferredBlock<Block> RED_WOOL_CORNER = registerBlock("red_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.RED_WOOL, ESPStairs.RED_WOOL_STAIRS));
	public static final DeferredBlock<Block> BLACK_WOOL_CORNER = registerBlock("black_wool_corner", () -> new ESPCornerBlock(tag(BlockTags.WOOL), Blocks.BLACK_WOOL, ESPStairs.BLACK_WOOL_STAIRS));

	// CONCRETE_POWDER
	public static final DeferredBlock<Block> WHITE_CONCRETE_POWDER_CORNER = registerBlock("white_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.WHITE_CONCRETE_POWDER, ESPStairs.WHITE_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_POWDER_CORNER = registerBlock("orange_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ORANGE_CONCRETE_POWDER, ESPStairs.ORANGE_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_POWDER_CORNER = registerBlock("magenta_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MAGENTA_CONCRETE_POWDER, ESPStairs.MAGENTA_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_POWDER_CORNER = registerBlock("light_blue_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_BLUE_CONCRETE_POWDER, ESPStairs.LIGHT_BLUE_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_POWDER_CORNER = registerBlock("yellow_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.YELLOW_CONCRETE_POWDER, ESPStairs.YELLOW_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> LIME_CONCRETE_POWDER_CORNER = registerBlock("lime_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIME_CONCRETE_POWDER, ESPStairs.LIME_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> PINK_CONCRETE_POWDER_CORNER = registerBlock("pink_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PINK_CONCRETE_POWDER, ESPStairs.PINK_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> GRAY_CONCRETE_POWDER_CORNER = registerBlock("gray_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAY_CONCRETE_POWDER, ESPStairs.GRAY_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_POWDER_CORNER = registerBlock("light_gray_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_GRAY_CONCRETE_POWDER, ESPStairs.LIGHT_GRAY_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> CYAN_CONCRETE_POWDER_CORNER = registerBlock("cyan_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CYAN_CONCRETE_POWDER, ESPStairs.CYAN_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_POWDER_CORNER = registerBlock("purple_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PURPLE_CONCRETE_POWDER, ESPStairs.PURPLE_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> BLUE_CONCRETE_POWDER_CORNER = registerBlock("blue_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLUE_CONCRETE_POWDER, ESPStairs.BLUE_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> BROWN_CONCRETE_POWDER_CORNER = registerBlock("brown_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BROWN_CONCRETE_POWDER, ESPStairs.BROWN_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> GREEN_CONCRETE_POWDER_CORNER = registerBlock("green_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GREEN_CONCRETE_POWDER, ESPStairs.GREEN_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> RED_CONCRETE_POWDER_CORNER = registerBlock("red_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_CONCRETE_POWDER, ESPStairs.RED_CONCRETE_POWDER_STAIRS));
	public static final DeferredBlock<Block> BLACK_CONCRETE_POWDER_CORNER = registerBlock("black_concrete_powder_corner", () -> new FallingCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLACK_CONCRETE_POWDER, ESPStairs.BLACK_CONCRETE_POWDER_STAIRS));

	// CONCRETE
	public static final DeferredBlock<Block> WHITE_CONCRETE_CORNER = registerBlock("white_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_CONCRETE, ESPStairs.WHITE_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_CORNER = registerBlock("orange_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_CONCRETE, ESPStairs.ORANGE_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_CORNER = registerBlock("magenta_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_CONCRETE, ESPStairs.MAGENTA_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_CORNER = registerBlock("light_blue_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_CONCRETE, ESPStairs.LIGHT_BLUE_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_CORNER = registerBlock("yellow_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_CONCRETE, ESPStairs.YELLOW_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> LIME_CONCRETE_CORNER = registerBlock("lime_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_CONCRETE, ESPStairs.LIME_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> PINK_CONCRETE_CORNER = registerBlock("pink_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_CONCRETE, ESPStairs.PINK_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> GRAY_CONCRETE_CORNER = registerBlock("gray_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_CONCRETE, ESPStairs.GRAY_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_CORNER = registerBlock("light_gray_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_CONCRETE, ESPStairs.LIGHT_GRAY_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> CYAN_CONCRETE_CORNER = registerBlock("cyan_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_CONCRETE, ESPStairs.CYAN_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_CORNER = registerBlock("purple_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_CONCRETE, ESPStairs.PURPLE_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> BLUE_CONCRETE_CORNER = registerBlock("blue_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_CONCRETE, ESPStairs.BLUE_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> BROWN_CONCRETE_CORNER = registerBlock("brown_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_CONCRETE, ESPStairs.BROWN_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> GREEN_CONCRETE_CORNER = registerBlock("green_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_CONCRETE, ESPStairs.GREEN_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> RED_CONCRETE_CORNER = registerBlock("red_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_CONCRETE, ESPStairs.RED_CONCRETE_STAIRS));
	public static final DeferredBlock<Block> BLACK_CONCRETE_CORNER = registerBlock("black_concrete_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_CONCRETE, ESPStairs.BLACK_CONCRETE_STAIRS));

	// TERRACOTTA
	public static final DeferredBlock<Block> CLAY_CORNER = registerBlock("clay_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CLAY, ESPStairs.CLAY_STAIRS));
	public static final DeferredBlock<Block> TERRACOTTA_CORNER = registerBlock("terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TERRACOTTA, ESPStairs.TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> WHITE_TERRACOTTA_CORNER = registerBlock("white_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_TERRACOTTA, ESPStairs.WHITE_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> ORANGE_TERRACOTTA_CORNER = registerBlock("orange_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_TERRACOTTA, ESPStairs.ORANGE_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_CORNER = registerBlock("magenta_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_TERRACOTTA, ESPStairs.MAGENTA_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_CORNER = registerBlock("light_blue_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_TERRACOTTA, ESPStairs.LIGHT_BLUE_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> YELLOW_TERRACOTTA_CORNER = registerBlock("yellow_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_TERRACOTTA, ESPStairs.YELLOW_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIME_TERRACOTTA_CORNER = registerBlock("lime_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_TERRACOTTA, ESPStairs.LIME_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> PINK_TERRACOTTA_CORNER = registerBlock("pink_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_TERRACOTTA, ESPStairs.PINK_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> GRAY_TERRACOTTA_CORNER = registerBlock("gray_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_TERRACOTTA, ESPStairs.GRAY_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_CORNER = registerBlock("light_gray_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_TERRACOTTA, ESPStairs.LIGHT_GRAY_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> CYAN_TERRACOTTA_CORNER = registerBlock("cyan_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_TERRACOTTA, ESPStairs.CYAN_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> PURPLE_TERRACOTTA_CORNER = registerBlock("purple_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_TERRACOTTA, ESPStairs.PURPLE_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BLUE_TERRACOTTA_CORNER = registerBlock("blue_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_TERRACOTTA, ESPStairs.BLUE_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BROWN_TERRACOTTA_CORNER = registerBlock("brown_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_TERRACOTTA, ESPStairs.BROWN_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> GREEN_TERRACOTTA_CORNER = registerBlock("green_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_TERRACOTTA, ESPStairs.GREEN_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> RED_TERRACOTTA_CORNER = registerBlock("red_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_TERRACOTTA, ESPStairs.RED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BLACK_TERRACOTTA_CORNER = registerBlock("black_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_TERRACOTTA, ESPStairs.BLACK_TERRACOTTA_STAIRS));

	// GLAZED TERRACOTTA
	public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_CORNER = registerBlock("white_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_GLAZED_TERRACOTTA, ESPStairs.WHITE_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_CORNER = registerBlock("orange_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_GLAZED_TERRACOTTA, ESPStairs.ORANGE_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_CORNER = registerBlock("magenta_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_GLAZED_TERRACOTTA, ESPStairs.MAGENTA_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_CORNER = registerBlock("light_blue_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ESPStairs.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_CORNER = registerBlock("yellow_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_GLAZED_TERRACOTTA, ESPStairs.YELLOW_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_CORNER = registerBlock("lime_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_GLAZED_TERRACOTTA, ESPStairs.LIME_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_CORNER = registerBlock("pink_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_GLAZED_TERRACOTTA, ESPStairs.PINK_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_CORNER = registerBlock("gray_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_GLAZED_TERRACOTTA, ESPStairs.GRAY_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_CORNER = registerBlock("light_gray_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ESPStairs.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_CORNER = registerBlock("cyan_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_GLAZED_TERRACOTTA, ESPStairs.CYAN_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_CORNER = registerBlock("purple_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_GLAZED_TERRACOTTA, ESPStairs.PURPLE_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_CORNER = registerBlock("blue_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_GLAZED_TERRACOTTA, ESPStairs.BLUE_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_CORNER = registerBlock("brown_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_GLAZED_TERRACOTTA, ESPStairs.BROWN_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_CORNER = registerBlock("green_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_GLAZED_TERRACOTTA, ESPStairs.GREEN_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_CORNER = registerBlock("red_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_GLAZED_TERRACOTTA, ESPStairs.RED_GLAZED_TERRACOTTA_STAIRS));
	public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_CORNER = registerBlock("black_glazed_terracotta_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_GLAZED_TERRACOTTA, ESPStairs.BLACK_GLAZED_TERRACOTTA_STAIRS));

	// GLASS
	public static final DeferredBlock<Block> GLASS_CORNER = registerBlock("glass_corner", () -> new GlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.GLASS, ESPStairs.GLASS_STAIRS));
	public static final DeferredBlock<Block> TINTED_GLASS_CORNER = registerBlock("tinted_glass_corner", () -> new TintedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.TINTED_GLASS, ESPStairs.TINTED_GLASS_STAIRS));
	public static final DeferredBlock<Block> WHITE_STAINED_GLASS_CORNER = registerBlock("white_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.WHITE_STAINED_GLASS, ESPStairs.WHITE_STAINED_GLASS_STAIRS, DyeColor.WHITE));
	public static final DeferredBlock<Block> ORANGE_STAINED_GLASS_CORNER = registerBlock("orange_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.ORANGE_STAINED_GLASS, ESPStairs.ORANGE_STAINED_GLASS_STAIRS, DyeColor.ORANGE));
	public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS_CORNER = registerBlock("magenta_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.MAGENTA_STAINED_GLASS, ESPStairs.MAGENTA_STAINED_GLASS_STAIRS, DyeColor.MAGENTA));
	public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS_CORNER = registerBlock("light_blue_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_BLUE_STAINED_GLASS, ESPStairs.LIGHT_BLUE_STAINED_GLASS_STAIRS, DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> YELLOW_STAINED_GLASS_CORNER = registerBlock("yellow_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.YELLOW_STAINED_GLASS, ESPStairs.YELLOW_STAINED_GLASS_STAIRS, DyeColor.YELLOW));
	public static final DeferredBlock<Block> LIME_STAINED_GLASS_CORNER = registerBlock("lime_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIME_STAINED_GLASS, ESPStairs.LIME_STAINED_GLASS_STAIRS, DyeColor.LIME));
	public static final DeferredBlock<Block> PINK_STAINED_GLASS_CORNER = registerBlock("pink_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.PINK_STAINED_GLASS, ESPStairs.PINK_STAINED_GLASS_STAIRS, DyeColor.PINK));
	public static final DeferredBlock<Block> GRAY_STAINED_GLASS_CORNER = registerBlock("gray_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.GRAY_STAINED_GLASS, ESPStairs.GRAY_STAINED_GLASS_STAIRS, DyeColor.GRAY));
	public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS_CORNER = registerBlock("light_gray_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_GRAY_STAINED_GLASS, ESPStairs.LIGHT_GRAY_STAINED_GLASS_STAIRS, DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> CYAN_STAINED_GLASS_CORNER = registerBlock("cyan_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.CYAN_STAINED_GLASS, ESPStairs.CYAN_STAINED_GLASS_STAIRS, DyeColor.CYAN));
	public static final DeferredBlock<Block> PURPLE_STAINED_GLASS_CORNER = registerBlock("purple_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.PURPLE_STAINED_GLASS, ESPStairs.PURPLE_STAINED_GLASS_STAIRS, DyeColor.PURPLE));
	public static final DeferredBlock<Block> BLUE_STAINED_GLASS_CORNER = registerBlock("blue_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLUE_STAINED_GLASS, ESPStairs.BLUE_STAINED_GLASS_STAIRS, DyeColor.BLUE));
	public static final DeferredBlock<Block> BROWN_STAINED_GLASS_CORNER = registerBlock("brown_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.BROWN_STAINED_GLASS, ESPStairs.BROWN_STAINED_GLASS_STAIRS, DyeColor.BROWN));
	public static final DeferredBlock<Block> GREEN_STAINED_GLASS_CORNER = registerBlock("green_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.GREEN_STAINED_GLASS, ESPStairs.GREEN_STAINED_GLASS_STAIRS, DyeColor.GREEN));
	public static final DeferredBlock<Block> RED_STAINED_GLASS_CORNER = registerBlock("red_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.RED_STAINED_GLASS, ESPStairs.RED_STAINED_GLASS_STAIRS, DyeColor.RED));
	public static final DeferredBlock<Block> BLACK_STAINED_GLASS_CORNER = registerBlock("black_stained_glass_corner", () -> new StainedGlassCornerBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLACK_STAINED_GLASS, ESPStairs.BLACK_STAINED_GLASS_STAIRS, DyeColor.BLACK));

	// SANDSTONE
	public static final DeferredBlock<Block> SANDSTONE_CORNER = registerBlock("sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SANDSTONE, () -> Blocks.SANDSTONE_STAIRS));
	public static final DeferredBlock<Block> SMOOTH_SANDSTONE_CORNER = registerBlock("smooth_sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_SANDSTONE, () -> Blocks.SMOOTH_SANDSTONE_STAIRS));
	public static final DeferredBlock<Block> CUT_SANDSTONE_CORNER = registerBlock("cut_sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_SANDSTONE, ESPStairs.CUT_SANDSTONE_STAIRS));
	public static final DeferredBlock<Block> RED_SANDSTONE_CORNER = registerBlock("red_sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_SANDSTONE, () -> Blocks.RED_SANDSTONE_STAIRS));
	public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_CORNER = registerBlock("smooth_red_sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_RED_SANDSTONE, () -> Blocks.SMOOTH_RED_SANDSTONE_STAIRS));
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_CORNER = registerBlock("cut_red_sandstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CUT_RED_SANDSTONE, ESPStairs.CUT_RED_SANDSTONE_STAIRS));

	// DEEPSLATE
	public static final DeferredBlock<Block> COBBLED_DEEPSLATE_CORNER = registerBlock("cobbled_deepslate_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.COBBLED_DEEPSLATE, () -> Blocks.COBBLED_DEEPSLATE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_CORNER = registerBlock("polished_deepslate_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_DEEPSLATE, () -> Blocks.POLISHED_DEEPSLATE_STAIRS));
	public static final DeferredBlock<Block> DEEPSLATE_BRICK_CORNER = registerBlock("deepslate_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DEEPSLATE_BRICKS, () -> Blocks.DEEPSLATE_BRICK_STAIRS));
	public static final DeferredBlock<Block> DEEPSLATE_TILE_CORNER = registerBlock("deepslate_tile_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DEEPSLATE_TILES, () -> Blocks.DEEPSLATE_TILE_STAIRS));

	// NETHER
	public static final DeferredBlock<Block> BLACKSTONE_CORNER = registerBlock("blackstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACKSTONE, () -> Blocks.BLACKSTONE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_BLACKSTONE_CORNER = registerBlock("polished_blackstone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_BLACKSTONE, () -> Blocks.POLISHED_BLACKSTONE_STAIRS));
	public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICK_CORNER = registerBlock("polished_blackstone_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.POLISHED_BLACKSTONE_BRICKS, () -> Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS));
	public static final DeferredBlock<Block> NETHERRACK_CORNER = registerBlock("netherrack_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHERRACK, ESPStairs.NETHERRACK_STAIRS));
	public static final DeferredBlock<Block> SOUL_SAND_CORNER = registerBlock("soul_sand_corner", () -> new SoulSandCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_UP), Blocks.SOUL_SAND, ESPStairs.SOUL_SAND_STAIRS));
	public static final DeferredBlock<Block> SOUL_SOIL_CORNER = registerBlock("soul_soil_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SOUL_SOIL, ESPStairs.SOUL_SOIL_STAIRS));
	public static final DeferredBlock<Block> NETHER_BRICK_CORNER = registerBlock("nether_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHER_BRICKS, () -> Blocks.NETHER_BRICK_STAIRS));
	public static final DeferredBlock<Block> RED_NETHER_BRICK_CORNER = registerBlock("red_nether_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_NETHER_BRICKS, () -> Blocks.RED_NETHER_BRICK_STAIRS));
	public static final DeferredBlock<Block> QUARTZ_CORNER = registerBlock("quartz_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BLOCK, () -> Blocks.QUARTZ_STAIRS));
	public static final DeferredBlock<Block> QUARTZ_BRICK_CORNER = registerBlock("quartz_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BRICKS, ESPStairs.QUARTZ_BRICK_STAIRS));
	public static final DeferredBlock<Block> SMOOTH_QUARTZ_CORNER = registerBlock("smooth_quartz_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_QUARTZ, () -> Blocks.SMOOTH_QUARTZ_STAIRS));
	public static final DeferredBlock<Block> NETHER_WART_CORNER = registerBlock("nether_wart_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.NETHER_WART_BLOCK, ESPStairs.NETHER_WART_STAIRS));
	public static final DeferredBlock<Block> WARPED_WART_CORNER = registerBlock("warped_wart_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WARPED_WART_BLOCK, ESPStairs.WARPED_WART_STAIRS));
	public static final DeferredBlock<Block> SHROOMLIGHT_CORNER = registerBlock("shroomlight_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SHROOMLIGHT, ESPStairs.SHROOMLIGHT_STAIRS));
	public static final DeferredBlock<Block> MAGMA_CORNER = registerBlock("magma_corner", () -> new MagmaCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_DOWN), Blocks.MAGMA_BLOCK, ESPStairs.MAGMA_STAIRS));
	public static final DeferredBlock<Block> SMOOTH_BASALT_CORNER = registerBlock("smooth_basalt_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_BASALT, ESPStairs.SMOOTH_BASALT_STAIRS));
	public static final DeferredBlock<Block> OBSIDIAN_CORNER = registerBlock("obsidian_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.OBSIDIAN, ESPStairs.OBSIDIAN_STAIRS));
	public static final DeferredBlock<Block> CRYING_OBSIDIAN_CORNER = registerBlock("crying_obsidian_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRYING_OBSIDIAN, ESPStairs.CRYING_OBSIDIAN_STAIRS));
	public static final DeferredBlock<Block> GLOWSTONE_CORNER = registerBlock("glowstone_corner", () -> new ESPCornerBlock(tag(), Blocks.GLOWSTONE, ESPStairs.GLOWSTONE_STAIRS));

	// END
	public static final DeferredBlock<Block> END_STONE_CORNER = registerBlock("end_stone_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE, ESPStairs.END_STONE_STAIRS));
	public static final DeferredBlock<Block> END_STONE_BRICK_CORNER = registerBlock("end_stone_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE_BRICKS, () -> Blocks.END_STONE_BRICK_STAIRS));
	public static final DeferredBlock<Block> PURPUR_CORNER = registerBlock("purpur_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPUR_BLOCK, () -> Blocks.PURPUR_STAIRS));

	// PRISMARINE
	public static final DeferredBlock<Block> PRISMARINE_CORNER = registerBlock("prismarine_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PRISMARINE, () -> Blocks.PRISMARINE_STAIRS));
	public static final DeferredBlock<Block> PRISMARINE_BRICK_CORNER = registerBlock("prismarine_brick_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PRISMARINE_BRICKS, () -> Blocks.PRISMARINE_BRICK_STAIRS));
	public static final DeferredBlock<Block> DARK_PRISMARINE_CORNER = registerBlock("dark_prismarine_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DARK_PRISMARINE, () -> Blocks.DARK_PRISMARINE_STAIRS));
	public static final DeferredBlock<Block> SEA_LANTERN_CORNER = registerBlock("sea_lantern_corner", () -> new ESPCornerBlock(tag(), Blocks.SEA_LANTERN, ESPStairs.SEA_LANTERN_STAIRS));

	// PLANKS
	public static final DeferredBlock<Block> OAK_CORNER = registerBlock("oak_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_PLANKS, () -> Blocks.OAK_STAIRS));
	public static final DeferredBlock<Block> SPRUCE_CORNER = registerBlock("spruce_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_PLANKS, () -> Blocks.SPRUCE_STAIRS));
	public static final DeferredBlock<Block> BIRCH_CORNER = registerBlock("birch_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_PLANKS, () -> Blocks.BIRCH_STAIRS));
	public static final DeferredBlock<Block> JUNGLE_CORNER = registerBlock("jungle_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_PLANKS, () -> Blocks.JUNGLE_STAIRS));
	public static final DeferredBlock<Block> ACACIA_CORNER = registerBlock("acacia_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_PLANKS, () -> Blocks.ACACIA_STAIRS));
	public static final DeferredBlock<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_PLANKS, () -> Blocks.DARK_OAK_STAIRS));
	public static final DeferredBlock<Block> MANGROVE_CORNER = registerBlock("mangrove_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_PLANKS, () -> Blocks.MANGROVE_STAIRS));
	public static final DeferredBlock<Block> CHERRY_CORNER = registerBlock("cherry_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_PLANKS, () -> Blocks.CHERRY_STAIRS));
	public static final DeferredBlock<Block> BAMBOO_CORNER = registerBlock("bamboo_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BAMBOO_PLANKS, () -> Blocks.BAMBOO_STAIRS));
	public static final DeferredBlock<Block> BAMBOO_MOSAIC_CORNER = registerBlock("bamboo_mosaic_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BAMBOO_MOSAIC, () -> Blocks.BAMBOO_MOSAIC_STAIRS));
	public static final DeferredBlock<Block> CRIMSON_CORNER = registerBlock("crimson_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_PLANKS, () -> Blocks.CRIMSON_STAIRS));
	public static final DeferredBlock<Block> WARPED_CORNER = registerBlock("warped_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_PLANKS, () -> Blocks.WARPED_STAIRS));

	// WOOD
	public static final DeferredBlock<Block> OAK_WOOD_CORNER = registerBlock("oak_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_WOOD, ESPStairs.OAK_WOOD_STAIRS));
	public static final DeferredBlock<Block> SPRUCE_WOOD_CORNER = registerBlock("spruce_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_WOOD, ESPStairs.SPRUCE_WOOD_STAIRS));
	public static final DeferredBlock<Block> BIRCH_WOOD_CORNER = registerBlock("birch_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_WOOD, ESPStairs.BIRCH_WOOD_STAIRS));
	public static final DeferredBlock<Block> JUNGLE_WOOD_CORNER = registerBlock("jungle_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_WOOD, ESPStairs.JUNGLE_WOOD_STAIRS));
	public static final DeferredBlock<Block> ACACIA_WOOD_CORNER = registerBlock("acacia_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_WOOD, ESPStairs.ACACIA_WOOD_STAIRS));
	public static final DeferredBlock<Block> DARK_OAK_WOOD_CORNER = registerBlock("dark_oak_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_WOOD, ESPStairs.DARK_OAK_WOOD_STAIRS));
	public static final DeferredBlock<Block> MANGROVE_WOOD_CORNER = registerBlock("mangrove_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_WOOD, ESPStairs.MANGROVE_WOOD_STAIRS));
	public static final DeferredBlock<Block> CHERRY_WOOD_CORNER = registerBlock("cherry_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_WOOD, ESPStairs.CHERRY_WOOD_STAIRS));
	public static final DeferredBlock<Block> CRIMSON_HYPHAE_CORNER = registerBlock("crimson_hyphae_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_HYPHAE, ESPStairs.CRIMSON_HYPHAE_STAIRS));
	public static final DeferredBlock<Block> WARPED_HYPHAE_CORNER = registerBlock("warped_hyphae_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_HYPHAE, ESPStairs.WARPED_HYPHAE_STAIRS));

	// STRIPPED WOOD
	public static final DeferredBlock<Block> STRIPPED_OAK_WOOD_CORNER = registerBlock("stripped_oak_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_OAK_WOOD, ESPStairs.STRIPPED_OAK_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_SPRUCE_WOOD_CORNER = registerBlock("stripped_spruce_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_SPRUCE_WOOD, ESPStairs.STRIPPED_SPRUCE_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_BIRCH_WOOD_CORNER = registerBlock("stripped_birch_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_BIRCH_WOOD, ESPStairs.STRIPPED_BIRCH_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_JUNGLE_WOOD_CORNER = registerBlock("stripped_jungle_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_JUNGLE_WOOD, ESPStairs.STRIPPED_JUNGLE_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_ACACIA_WOOD_CORNER = registerBlock("stripped_acacia_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_ACACIA_WOOD, ESPStairs.STRIPPED_ACACIA_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_DARK_OAK_WOOD_CORNER = registerBlock("stripped_dark_oak_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_DARK_OAK_WOOD, ESPStairs.STRIPPED_DARK_OAK_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_MANGROVE_WOOD_CORNER = registerBlock("stripped_mangrove_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_MANGROVE_WOOD, ESPStairs.STRIPPED_MANGROVE_WOOD_STAIRS, Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
	public static final DeferredBlock<Block> STRIPPED_CHERRY_WOOD_CORNER = registerBlock("stripped_cherry_wood_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CHERRY_WOOD, ESPStairs.STRIPPED_CHERRY_WOOD_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_CRIMSON_HYPHAE_CORNER = registerBlock("stripped_crimson_hyphae_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CRIMSON_HYPHAE, ESPStairs.STRIPPED_CRIMSON_HYPHAE_STAIRS));
	public static final DeferredBlock<Block> STRIPPED_WARPED_HYPHAE_CORNER = registerBlock("stripped_warped_hyphae_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_WARPED_HYPHAE, ESPStairs.STRIPPED_WARPED_HYPHAE_STAIRS));

	// COPPER
	public static final DeferredBlock<Block> OXIDIZED_CUT_COPPER_CORNER = registerBlock("oxidized_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.OXIDIZED_CUT_COPPER, () -> Blocks.OXIDIZED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.OXIDIZED));
	public static final DeferredBlock<Block> WEATHERED_CUT_COPPER_CORNER = registerBlock("weathered_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WEATHERED_CUT_COPPER, () -> Blocks.WEATHERED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.WEATHERED));
	public static final DeferredBlock<Block> EXPOSED_CUT_COPPER_CORNER = registerBlock("exposed_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.EXPOSED_CUT_COPPER, () -> Blocks.EXPOSED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.EXPOSED));
	public static final DeferredBlock<Block> CUT_COPPER_CORNER = registerBlock("cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.CUT_COPPER, () -> Blocks.CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.UNAFFECTED));
	public static final DeferredBlock<Block> WAXED_OXIDIZED_CUT_COPPER_CORNER = registerBlock("waxed_oxidized_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_OXIDIZED_CUT_COPPER, () -> Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.OXIDIZED));
	public static final DeferredBlock<Block> WAXED_WEATHERED_CUT_COPPER_CORNER = registerBlock("waxed_weathered_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_WEATHERED_CUT_COPPER, () -> Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.WEATHERED));
	public static final DeferredBlock<Block> WAXED_EXPOSED_CUT_COPPER_CORNER = registerBlock("waxed_exposed_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_EXPOSED_CUT_COPPER, () -> Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.EXPOSED));
	public static final DeferredBlock<Block> WAXED_CUT_COPPER_CORNER = registerBlock("waxed_cut_copper_corner", () -> new WeatheringCopperCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.NEEDS_STONE_TOOL), Blocks.WAXED_CUT_COPPER, () -> Blocks.WAXED_CUT_COPPER_STAIRS, WeatheringCopper.WeatherState.UNAFFECTED));

	// OTHER
	public static final DeferredBlock<Block> HAY_CORNER = registerBlock("hay_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.HAY_BLOCK, ESPStairs.HAY_STAIRS));
	public static final DeferredBlock<Block> BROWN_MUSHROOM_CORNER = registerBlock("brown_mushroom_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BROWN_MUSHROOM_BLOCK, ESPStairs.BROWN_MUSHROOM_STAIRS));
	public static final DeferredBlock<Block> RED_MUSHROOM_CORNER = registerBlock("red_mushroom_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.RED_MUSHROOM_BLOCK, ESPStairs.RED_MUSHROOM_STAIRS));
	public static final DeferredBlock<Block> MUSHROOM_STEM_CORNER = registerBlock("mushroom_stem_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MUSHROOM_STEM, ESPStairs.MUSHROOM_STEM_STAIRS));
	public static final DeferredBlock<Block> MOSS_CORNER = registerBlock("moss_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.MOSS_BLOCK, ESPStairs.MOSS_STAIRS));
	public static final DeferredBlock<Block> OCHRE_FROGLIGHT_CORNER = registerBlock("ochre_froglight_corner", () -> new ESPCornerBlock(tag(), Blocks.OCHRE_FROGLIGHT, ESPStairs.OCHRE_FROGLIGHT_STAIRS));
	public static final DeferredBlock<Block> VERDANT_FROGLIGHT_CORNER = registerBlock("verdant_froglight_corner", () -> new ESPCornerBlock(tag(), Blocks.VERDANT_FROGLIGHT, ESPStairs.VERDANT_FROGLIGHT_STAIRS));
	public static final DeferredBlock<Block> PEARLESCENT_FROGLIGHT_CORNER = registerBlock("pearlescent_froglight_corner", () -> new ESPCornerBlock(tag(), Blocks.PEARLESCENT_FROGLIGHT, ESPStairs.PEARLESCENT_FROGLIGHT_STAIRS));
	public static final DeferredBlock<Block> AMETHYST_CORNER = registerBlock("amethyst_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.AMETHYST_BLOCK, ESPStairs.AMETHYST_STAIRS));
	public static final DeferredBlock<Block> SNOW_CORNER = registerBlock("snow_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SNOW_BLOCK, ESPStairs.SNOW_STAIRS));
	public static final DeferredBlock<Block> SCULK_CORNER = registerBlock("sculk_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SCULK, ESPStairs.SCULK_STAIRS));
	public static final DeferredBlock<Block> DRIED_KELP_CORNER = registerBlock("dried_kelp_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.DRIED_KELP_BLOCK, ESPStairs.DRIED_KELP_STAIRS));
	public static final DeferredBlock<Block> HONEYCOMB_CORNER = registerBlock("honeycomb_corner", () -> new ESPCornerBlock(tag(), Blocks.HONEYCOMB_BLOCK, ESPStairs.HONEYCOMB_STAIRS));
	public static final DeferredBlock<Block> RAW_COPPER_CORNER = registerBlock("raw_copper_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_COPPER_BLOCK, ESPStairs.RAW_COPPER_STAIRS));
	public static final DeferredBlock<Block> RAW_IRON_CORNER = registerBlock("raw_iron_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_IRON_BLOCK, ESPStairs.RAW_IRON_STAIRS));
	public static final DeferredBlock<Block> RAW_GOLD_CORNER = registerBlock("raw_gold_corner", () -> new ESPCornerBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_GOLD_BLOCK, ESPStairs.RAW_GOLD_STAIRS));

	public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> ret = BLOCKS.register(name, block);
		ITEMS.register(name, () -> new BlockItem(ret.value(), new Item.Properties()));
		return ret;
	}

	public static Collection<DeferredHolder<Item, ? extends Item>> orderedItems() {
		return ITEMS.getEntries();
	}
}