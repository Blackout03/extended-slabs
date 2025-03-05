package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.magma.MagmaSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import com.blackout.extendedslabs.blocks.soulsand.SoulSandSlabBlock;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.Collection;
import java.util.function.Supplier;

import static com.blackout.extendedslabs.blocks.IBlockCharacteristics.tag;

public class ESPSlabs {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExtendedSlabs.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedSlabs.MODID);

	// DIRT
	public static final DeferredBlock<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.GRASS_BLOCK, ESPVerticalSlabs.GRASS_BLOCK_VERTICAL));
	public static final DeferredBlock<Block> DIRT_SLAB = registerBlock("dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.DIRT, ESPVerticalSlabs.DIRT_VERTICAL));
	public static final DeferredBlock<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.COARSE_DIRT, ESPVerticalSlabs.COARSE_DIRT_VERTICAL));
	public static final DeferredBlock<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.ROOTED_DIRT, ESPVerticalSlabs.ROOTED_DIRT_VERTICAL));
	public static final DeferredBlock<Block> PODZOL_SLAB = registerBlock("podzol_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.PODZOL, ESPVerticalSlabs.PODZOL_VERTICAL));
	public static final DeferredBlock<Block> MYCELIUM_SLAB = registerBlock("mycelium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.MYCELIUM, ESPVerticalSlabs.MYCELIUM_VERTICAL));
	public static final DeferredBlock<Block> DIRT_PATH_SLAB = registerBlock("dirt_path_slab", () -> new PathSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT_PATH, ESPVerticalSlabs.DIRT_PATH_VERTICAL));
	public static final DeferredBlock<Block> SAND_SLAB = registerBlock("sand_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.SAND), Blocks.SAND, ESPVerticalSlabs.SAND_VERTICAL));
	public static final DeferredBlock<Block> RED_SAND_SLAB = registerBlock("red_sand_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.SAND), Blocks.RED_SAND, ESPVerticalSlabs.RED_SAND_VERTICAL));
	public static final DeferredBlock<Block> GRAVEL_SLAB = registerBlock("gravel_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAVEL, ESPVerticalSlabs.GRAVEL_VERTICAL));

	// STONE
	public static final DeferredBlock<Block> TUFF_SLAB = registerBlock("tuff_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TUFF, ESPVerticalSlabs.TUFF_VERTICAL));
	public static final DeferredBlock<Block> CALCITE_SLAB = registerBlock("calcite_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CALCITE, ESPVerticalSlabs.CALCITE_VERTICAL));
	public static final DeferredBlock<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DRIPSTONE_BLOCK, ESPVerticalSlabs.DRIPSTONE_VERTICAL));
	public static final DeferredBlock<Block> MUD_SLAB = registerBlock("mud_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.DIRT), Blocks.MUD, ESPVerticalSlabs.MUD_VERTICAL));
	public static final DeferredBlock<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PACKED_MUD, ESPVerticalSlabs.PACKED_MUD_VERTICAL));

	// WOOL
	public static final DeferredBlock<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.WHITE_WOOL, ESPVerticalSlabs.WHITE_WOOL_VERTICAL));
	public static final DeferredBlock<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.ORANGE_WOOL, ESPVerticalSlabs.ORANGE_WOOL_VERTICAL));
	public static final DeferredBlock<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.MAGENTA_WOOL, ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_BLUE_WOOL, ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL));
	public static final DeferredBlock<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.YELLOW_WOOL, ESPVerticalSlabs.YELLOW_WOOL_VERTICAL));
	public static final DeferredBlock<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIME_WOOL, ESPVerticalSlabs.LIME_WOOL_VERTICAL));
	public static final DeferredBlock<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.PINK_WOOL, ESPVerticalSlabs.PINK_WOOL_VERTICAL));
	public static final DeferredBlock<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.GRAY_WOOL, ESPVerticalSlabs.GRAY_WOOL_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_GRAY_WOOL, ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL));
	public static final DeferredBlock<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.CYAN_WOOL, ESPVerticalSlabs.CYAN_WOOL_VERTICAL));
	public static final DeferredBlock<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.PURPLE_WOOL, ESPVerticalSlabs.PURPLE_WOOL_VERTICAL));
	public static final DeferredBlock<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BLUE_WOOL, ESPVerticalSlabs.BLUE_WOOL_VERTICAL));
	public static final DeferredBlock<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BROWN_WOOL, ESPVerticalSlabs.BROWN_WOOL_VERTICAL));
	public static final DeferredBlock<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.GREEN_WOOL, ESPVerticalSlabs.GREEN_WOOL_VERTICAL));
	public static final DeferredBlock<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.RED_WOOL, ESPVerticalSlabs.RED_WOOL_VERTICAL));
	public static final DeferredBlock<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BLACK_WOOL, ESPVerticalSlabs.BLACK_WOOL_VERTICAL));

	// CONCRETE POWDER
	public static final DeferredBlock<Block> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.WHITE_CONCRETE_POWDER, ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ORANGE_CONCRETE_POWDER, ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MAGENTA_CONCRETE_POWDER, ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_BLUE_CONCRETE_POWDER, ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.YELLOW_CONCRETE_POWDER, ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIME_CONCRETE_POWDER, ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PINK_CONCRETE_POWDER, ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAY_CONCRETE_POWDER, ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_GRAY_CONCRETE_POWDER, ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CYAN_CONCRETE_POWDER, ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PURPLE_CONCRETE_POWDER, ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLUE_CONCRETE_POWDER, ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BROWN_CONCRETE_POWDER, ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GREEN_CONCRETE_POWDER, ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_CONCRETE_POWDER, ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL));
	public static final DeferredBlock<Block> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLACK_CONCRETE_POWDER, ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL));

	// CONCRETE
	public static final DeferredBlock<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_CONCRETE, ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_CONCRETE, ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_CONCRETE, ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_CONCRETE, ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_CONCRETE, ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_CONCRETE, ESPVerticalSlabs.LIME_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_CONCRETE, ESPVerticalSlabs.PINK_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_CONCRETE, ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_CONCRETE, ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_CONCRETE, ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_CONCRETE, ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_CONCRETE, ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_CONCRETE, ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_CONCRETE, ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_CONCRETE, ESPVerticalSlabs.RED_CONCRETE_VERTICAL));
	public static final DeferredBlock<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_CONCRETE, ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL));

	// TERRACOTTA
	public static final DeferredBlock<Block> CLAY_SLAB = registerBlock("clay_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CLAY, ESPVerticalSlabs.CLAY_VERTICAL));
	public static final DeferredBlock<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.TERRACOTTA, ESPVerticalSlabs.TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.WHITE_TERRACOTTA, ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.ORANGE_TERRACOTTA, ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.MAGENTA_TERRACOTTA, ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIGHT_BLUE_TERRACOTTA, ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.YELLOW_TERRACOTTA, ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIME_TERRACOTTA, ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.PINK_TERRACOTTA, ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.GRAY_TERRACOTTA, ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.LIGHT_GRAY_TERRACOTTA, ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.CYAN_TERRACOTTA, ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.PURPLE_TERRACOTTA, ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BLUE_TERRACOTTA, ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BROWN_TERRACOTTA, ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.GREEN_TERRACOTTA, ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.RED_TERRACOTTA, ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.TERRACOTTA), Blocks.BLACK_TERRACOTTA, ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL));

	// GLAZED TERRACOTTA
	public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_GLAZED_TERRACOTTA, ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_GLAZED_TERRACOTTA, ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_GLAZED_TERRACOTTA, ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_GLAZED_TERRACOTTA, ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_GLAZED_TERRACOTTA, ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_GLAZED_TERRACOTTA, ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_GLAZED_TERRACOTTA, ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_GLAZED_TERRACOTTA, ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_GLAZED_TERRACOTTA, ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_GLAZED_TERRACOTTA, ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_GLAZED_TERRACOTTA, ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_GLAZED_TERRACOTTA, ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL));
	public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_GLAZED_TERRACOTTA, ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL));

	// GLASS
	public static final DeferredBlock<Block> GLASS_SLAB = registerBlock("glass_slab", () -> new GlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GLASS, ESPVerticalSlabs.GLASS_VERTICAL));
	public static final DeferredBlock<Block> TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab", () -> new TintedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.TINTED_GLASS, ESPVerticalSlabs.TINTED_GLASS_VERTICAL));
	public static final DeferredBlock<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.WHITE_STAINED_GLASS, ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL, DyeColor.WHITE));
	public static final DeferredBlock<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.ORANGE_STAINED_GLASS, ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL, DyeColor.ORANGE));
	public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.MAGENTA_STAINED_GLASS, ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL, DyeColor.MAGENTA));
	public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_BLUE_STAINED_GLASS, ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL, DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.YELLOW_STAINED_GLASS, ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL, DyeColor.YELLOW));
	public static final DeferredBlock<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIME_STAINED_GLASS, ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL, DyeColor.LIME));
	public static final DeferredBlock<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PINK_STAINED_GLASS, ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL, DyeColor.PINK));
	public static final DeferredBlock<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GRAY_STAINED_GLASS, ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL, DyeColor.GRAY));
	public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_GRAY_STAINED_GLASS, ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL, DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.CYAN_STAINED_GLASS, ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL, DyeColor.CYAN));
	public static final DeferredBlock<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PURPLE_STAINED_GLASS, ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL, DyeColor.PURPLE));
	public static final DeferredBlock<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLUE_STAINED_GLASS, ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL, DyeColor.BLUE));
	public static final DeferredBlock<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BROWN_STAINED_GLASS, ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL, DyeColor.BROWN));
	public static final DeferredBlock<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GREEN_STAINED_GLASS, ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL, DyeColor.GREEN));
	public static final DeferredBlock<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.RED_STAINED_GLASS, ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL, DyeColor.RED));
	public static final DeferredBlock<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLACK_STAINED_GLASS, ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL, DyeColor.BLACK));

	// WOOD
	public static final DeferredBlock<Block> OAK_WOOD_SLAB = registerBlock("oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_WOOD, ESPVerticalSlabs.OAK_WOOD_VERTICAL));
	public static final DeferredBlock<Block> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_WOOD, ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL));
	public static final DeferredBlock<Block> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_WOOD, ESPVerticalSlabs.BIRCH_WOOD_VERTICAL));
	public static final DeferredBlock<Block> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_WOOD, ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL));
	public static final DeferredBlock<Block> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_WOOD, ESPVerticalSlabs.ACACIA_WOOD_VERTICAL));
	public static final DeferredBlock<Block> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_WOOD, ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL));
	public static final DeferredBlock<Block> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_WOOD, ESPVerticalSlabs.MANGROVE_WOOD_VERTICAL));
	public static final DeferredBlock<Block> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_WOOD, ESPVerticalSlabs.CHERRY_WOOD_VERTICAL));
	public static final DeferredBlock<Block> CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_HYPHAE, ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL));
	public static final DeferredBlock<Block> WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_HYPHAE, ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL));

	// STRIPPED WOOD
	public static final DeferredBlock<Block> STRIPPED_OAK_WOOD_SLAB = registerBlock("stripped_oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_OAK_WOOD, ESPVerticalSlabs.STRIPPED_OAK_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_SPRUCE_WOOD_SLAB = registerBlock("stripped_spruce_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_SPRUCE_WOOD, ESPVerticalSlabs.STRIPPED_SPRUCE_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_BIRCH_WOOD_SLAB = registerBlock("stripped_birch_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_BIRCH_WOOD, ESPVerticalSlabs.STRIPPED_BIRCH_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_JUNGLE_WOOD_SLAB = registerBlock("stripped_jungle_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_JUNGLE_WOOD, ESPVerticalSlabs.STRIPPED_JUNGLE_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_ACACIA_WOOD_SLAB = registerBlock("stripped_acacia_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_ACACIA_WOOD, ESPVerticalSlabs.STRIPPED_ACACIA_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_DARK_OAK_WOOD_SLAB = registerBlock("stripped_dark_oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_DARK_OAK_WOOD, ESPVerticalSlabs.STRIPPED_DARK_OAK_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_MANGROVE_WOOD_SLAB = registerBlock("stripped_mangrove_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_MANGROVE_WOOD, ESPVerticalSlabs.STRIPPED_MANGROVE_WOOD_VERTICAL, Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
	public static final DeferredBlock<Block> STRIPPED_CHERRY_WOOD_SLAB = registerBlock("stripped_cherry_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CHERRY_WOOD, ESPVerticalSlabs.STRIPPED_CHERRY_WOOD_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = registerBlock("stripped_crimson_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_CRIMSON_HYPHAE, ESPVerticalSlabs.STRIPPED_CRIMSON_HYPHAE_VERTICAL));
	public static final DeferredBlock<Block> STRIPPED_WARPED_HYPHAE_SLAB = registerBlock("stripped_warped_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.STRIPPED_WARPED_HYPHAE, ESPVerticalSlabs.STRIPPED_WARPED_HYPHAE_VERTICAL));

	// NETHER
	public static final DeferredBlock<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHERRACK, ESPVerticalSlabs.NETHERRACK_VERTICAL));
	public static final DeferredBlock<Block> CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRIMSON_NYLIUM, ESPVerticalSlabs.CRIMSON_NYLIUM_VERTICAL));
	public static final DeferredBlock<Block> WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WARPED_NYLIUM, ESPVerticalSlabs.WARPED_NYLIUM_VERTICAL));
	public static final DeferredBlock<Block> SOUL_SAND_SLAB = registerBlock("soul_sand_slab", () -> new SoulSandSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_UP), Blocks.SOUL_SAND, ESPVerticalSlabs.SOUL_SAND_VERTICAL));
	public static final DeferredBlock<Block> SOUL_SOIL_SLAB = registerBlock("soul_soil_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SOUL_SOIL, ESPVerticalSlabs.SOUL_SOIL_VERTICAL));
	public static final DeferredBlock<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.QUARTZ_BRICKS, ESPVerticalSlabs.QUARTZ_BRICK_VERTICAL));
	public static final DeferredBlock<Block> NETHER_WART_SLAB = registerBlock("nether_wart_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.NETHER_WART_BLOCK, ESPVerticalSlabs.NETHER_WART_VERTICAL));
	public static final DeferredBlock<Block> WARPED_WART_SLAB = registerBlock("warped_wart_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.WARPED_WART_BLOCK, ESPVerticalSlabs.WARPED_WART_VERTICAL));
	public static final DeferredBlock<Block> SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SHROOMLIGHT, ESPVerticalSlabs.SHROOMLIGHT_VERTICAL));
	public static final DeferredBlock<Block> MAGMA_SLAB = registerBlock("magma_slab", () -> new MagmaSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE, ESPTags.Blocks.BUBBLE_COLUMN_DRAG_DOWN), Blocks.MAGMA_BLOCK, ESPVerticalSlabs.MAGMA_VERTICAL));
	public static final DeferredBlock<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.SMOOTH_BASALT, ESPVerticalSlabs.SMOOTH_BASALT_VERTICAL));
	public static final DeferredBlock<Block> OBSIDIAN_SLAB = registerBlock("obsidian_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.OBSIDIAN, ESPVerticalSlabs.OBSIDIAN_VERTICAL));
	public static final DeferredBlock<Block> CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRYING_OBSIDIAN, ESPVerticalSlabs.CRYING_OBSIDIAN_VERTICAL));
	public static final DeferredBlock<Block> GLOWSTONE_SLAB = registerBlock("glowstone_slab", () -> new ESPSlabBlock(tag(), Blocks.GLOWSTONE, ESPVerticalSlabs.GLOWSTONE_VERTICAL));

	// END
	public static final DeferredBlock<Block> END_STONE_SLAB = registerBlock("end_stone_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE, ESPVerticalSlabs.END_STONE_VERTICAL));

	// PRISMARINE
	public static final DeferredBlock<Block> SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab", () -> new ESPSlabBlock(tag(), Blocks.SEA_LANTERN, ESPVerticalSlabs.SEA_LANTERN_VERTICAL));

	// OTHER
	public static final DeferredBlock<Block> HAY_SLAB = registerBlock("hay_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.HAY_BLOCK, ESPVerticalSlabs.HAY_VERTICAL));
	public static final DeferredBlock<Block> BROWN_MUSHROOM_SLAB = registerBlock("brown_mushroom_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BROWN_MUSHROOM_BLOCK, ESPVerticalSlabs.BROWN_MUSHROOM_VERTICAL));
	public static final DeferredBlock<Block> RED_MUSHROOM_SLAB = registerBlock("red_mushroom_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.RED_MUSHROOM_BLOCK, ESPVerticalSlabs.RED_MUSHROOM_VERTICAL));
	public static final DeferredBlock<Block> MUSHROOM_STEM_SLAB = registerBlock("mushroom_stem_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MUSHROOM_STEM, ESPVerticalSlabs.MUSHROOM_STEM_VERTICAL));
	public static final DeferredBlock<Block> MOSS_SLAB = registerBlock("moss_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.MOSS_BLOCK, ESPVerticalSlabs.MOSS_VERTICAL));
	public static final DeferredBlock<Block> OCHRE_FROGLIGHT_SLAB = registerBlock("ochre_froglight_slab", () -> new ESPSlabBlock(tag(), Blocks.OCHRE_FROGLIGHT, ESPVerticalSlabs.OCHRE_FROGLIGHT_VERTICAL));
	public static final DeferredBlock<Block> VERDANT_FROGLIGHT_SLAB = registerBlock("verdant_froglight_slab", () -> new ESPSlabBlock(tag(), Blocks.VERDANT_FROGLIGHT, ESPVerticalSlabs.VERDANT_FROGLIGHT_VERTICAL));
	public static final DeferredBlock<Block> PEARLESCENT_FROGLIGHT_SLAB = registerBlock("pearlescent_froglight_slab", () -> new ESPSlabBlock(tag(), Blocks.PEARLESCENT_FROGLIGHT, ESPVerticalSlabs.PEARLESCENT_FROGLIGHT_VERTICAL));
	public static final DeferredBlock<Block> AMETHYST_SLAB = registerBlock("amethyst_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.AMETHYST_BLOCK, ESPVerticalSlabs.AMETHYST_VERTICAL));
	public static final DeferredBlock<Block> SNOW_SLAB = registerBlock("snow_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SNOW_BLOCK, ESPVerticalSlabs.SNOW_VERTICAL));
	public static final DeferredBlock<Block> SCULK_SLAB = registerBlock("sculk_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.SCULK, ESPVerticalSlabs.SCULK_VERTICAL));
	public static final DeferredBlock<Block> DRIED_KELP_SLAB = registerBlock("dried_kelp_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_HOE), Blocks.DRIED_KELP_BLOCK, ESPVerticalSlabs.DRIED_KELP_VERTICAL));
	public static final DeferredBlock<Block> HONEYCOMB_SLAB = registerBlock("honeycomb_slab", () -> new ESPSlabBlock(tag(), Blocks.HONEYCOMB_BLOCK, ESPVerticalSlabs.HONEYCOMB_VERTICAL));
	public static final DeferredBlock<Block> RAW_COPPER_SLAB = registerBlock("raw_copper_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_COPPER_BLOCK, ESPVerticalSlabs.RAW_COPPER_VERTICAL));
	public static final DeferredBlock<Block> RAW_IRON_SLAB = registerBlock("raw_iron_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_IRON_BLOCK, ESPVerticalSlabs.RAW_IRON_VERTICAL));
	public static final DeferredBlock<Block> RAW_GOLD_SLAB = registerBlock("raw_gold_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RAW_GOLD_BLOCK, ESPVerticalSlabs.RAW_GOLD_VERTICAL));

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