package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.ESPSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.function.Supplier;

import static com.blackout.extendedslabs.blocks.IBlockCharacteristics.tag;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// DIRT
	public static final RegistryObject<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRASS_BLOCK, ESPVerticalSlabs.GRASS_BLOCK_VERTICAL, Block.Properties.copy(Blocks.GRASS_BLOCK)));
	public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT, ESPVerticalSlabs.DIRT_VERTICAL, Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.COARSE_DIRT, ESPVerticalSlabs.COARSE_DIRT_VERTICAL, Block.Properties.copy(Blocks.COARSE_DIRT)));
	public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ROOTED_DIRT, ESPVerticalSlabs.ROOTED_DIRT_VERTICAL, Block.Properties.copy(Blocks.ROOTED_DIRT)));
	public static final RegistryObject<Block> PODZOL_SLAB = registerBlock("podzol_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PODZOL, ESPVerticalSlabs.PODZOL_VERTICAL, Block.Properties.copy(Blocks.PODZOL)));
	public static final RegistryObject<Block> MYCELIUM_SLAB = registerBlock("mycelium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MYCELIUM, ESPVerticalSlabs.MYCELIUM_VERTICAL, Block.Properties.copy(Blocks.MYCELIUM)));
	public static final RegistryObject<PathSlabBlock> DIRT_PATH_SLAB = registerBlock("dirt_path_slab", () -> new PathSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.DIRT_PATH, ESPVerticalSlabs.DIRT_PATH_VERTICAL, Block.Properties.copy(Blocks.DIRT_PATH)));
	public static final RegistryObject<FallingSlabBlock> SAND_SLAB = registerBlock("sand_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.SAND, ESPVerticalSlabs.SAND_VERTICAL, Block.Properties.copy(Blocks.SAND)));
	public static final RegistryObject<FallingSlabBlock> RED_SAND_SLAB = registerBlock("red_sand_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_SAND, ESPVerticalSlabs.RED_SAND_VERTICAL, Block.Properties.copy(Blocks.RED_SAND)));
	public static final RegistryObject<FallingSlabBlock> GRAVEL_SLAB = registerBlock("gravel_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAVEL, ESPVerticalSlabs.GRAVEL_VERTICAL, Block.Properties.copy(Blocks.GRAVEL)));

	// STONE
	public static final RegistryObject<SlabBlock> TUFF_SLAB = registerBlock("tuff_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TUFF, ESPVerticalSlabs.TUFF_VERTICAL, Block.Properties.copy(Blocks.TUFF)));
	public static final RegistryObject<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CALCITE, ESPVerticalSlabs.CALCITE_VERTICAL, Block.Properties.copy(Blocks.CALCITE)));
	public static final RegistryObject<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.DRIPSTONE_BLOCK, ESPVerticalSlabs.DRIPSTONE_VERTICAL, Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
	public static final RegistryObject<SlabBlock> MUD_SLAB = registerBlock("mud_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MUD, ESPVerticalSlabs.MUD_VERTICAL, Block.Properties.copy(Blocks.MUD)));
	public static final RegistryObject<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PACKED_MUD, ESPVerticalSlabs.PACKED_MUD_VERTICAL, Block.Properties.copy(Blocks.PACKED_MUD)));

	// WOOL
	public static final RegistryObject<SlabBlock> WHITE_WOOL_SLAB = registerBlock("white_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.WHITE_WOOL, ESPVerticalSlabs.WHITE_WOOL_VERTICAL, Block.Properties.copy(Blocks.WHITE_WOOL)));
	public static final RegistryObject<SlabBlock> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.ORANGE_WOOL, ESPVerticalSlabs.ORANGE_WOOL_VERTICAL, Block.Properties.copy(Blocks.ORANGE_WOOL)));
	public static final RegistryObject<SlabBlock> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.MAGENTA_WOOL, ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL, Block.Properties.copy(Blocks.MAGENTA_WOOL)));
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_BLUE_WOOL, ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL, Block.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
	public static final RegistryObject<SlabBlock> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.YELLOW_WOOL, ESPVerticalSlabs.YELLOW_WOOL_VERTICAL, Block.Properties.copy(Blocks.YELLOW_WOOL)));
	public static final RegistryObject<SlabBlock> LIME_WOOL_SLAB = registerBlock("lime_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIME_WOOL, ESPVerticalSlabs.LIME_WOOL_VERTICAL, Block.Properties.copy(Blocks.LIME_WOOL)));
	public static final RegistryObject<SlabBlock> PINK_WOOL_SLAB = registerBlock("pink_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.PINK_WOOL, ESPVerticalSlabs.PINK_WOOL_VERTICAL, Block.Properties.copy(Blocks.PINK_WOOL)));
	public static final RegistryObject<SlabBlock> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.GRAY_WOOL, ESPVerticalSlabs.GRAY_WOOL_VERTICAL, Block.Properties.copy(Blocks.GRAY_WOOL)));
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.LIGHT_GRAY_WOOL, ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL, Block.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
	public static final RegistryObject<SlabBlock> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.CYAN_WOOL, ESPVerticalSlabs.CYAN_WOOL_VERTICAL, Block.Properties.copy(Blocks.CYAN_WOOL)));
	public static final RegistryObject<SlabBlock> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.PURPLE_WOOL, ESPVerticalSlabs.PURPLE_WOOL_VERTICAL, Block.Properties.copy(Blocks.PURPLE_WOOL)));
	public static final RegistryObject<SlabBlock> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BLUE_WOOL, ESPVerticalSlabs.BLUE_WOOL_VERTICAL, Block.Properties.copy(Blocks.BLUE_WOOL)));
	public static final RegistryObject<SlabBlock> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BROWN_WOOL, ESPVerticalSlabs.BROWN_WOOL_VERTICAL, Block.Properties.copy(Blocks.BROWN_WOOL)));
	public static final RegistryObject<SlabBlock> GREEN_WOOL_SLAB = registerBlock("green_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.GREEN_WOOL, ESPVerticalSlabs.GREEN_WOOL_VERTICAL, Block.Properties.copy(Blocks.GREEN_WOOL)));
	public static final RegistryObject<SlabBlock> RED_WOOL_SLAB = registerBlock("red_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.RED_WOOL, ESPVerticalSlabs.RED_WOOL_VERTICAL, Block.Properties.copy(Blocks.RED_WOOL)));
	public static final RegistryObject<SlabBlock> BLACK_WOOL_SLAB = registerBlock("black_wool_slab", () -> new ESPSlabBlock(tag(BlockTags.WOOL), Blocks.BLACK_WOOL, ESPVerticalSlabs.BLACK_WOOL_VERTICAL, Block.Properties.copy(Blocks.BLACK_WOOL)));

	// CONCRETE POWDER
	public static final RegistryObject<FallingSlabBlock> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.WHITE_CONCRETE_POWDER, ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.ORANGE_CONCRETE_POWDER, ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.MAGENTA_CONCRETE_POWDER, ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_BLUE_CONCRETE_POWDER, ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.YELLOW_CONCRETE_POWDER, ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIME_CONCRETE_POWDER, ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.LIME_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PINK_CONCRETE_POWDER, ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.PINK_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GRAY_CONCRETE_POWDER, ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.LIGHT_GRAY_CONCRETE_POWDER, ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CYAN_CONCRETE_POWDER, ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.PURPLE_CONCRETE_POWDER, ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLUE_CONCRETE_POWDER, ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.BLUE_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BROWN_CONCRETE_POWDER, ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.BROWN_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.GREEN_CONCRETE_POWDER, ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.GREEN_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.RED_CONCRETE_POWDER, ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.RED_CONCRETE_POWDER)));
	public static final RegistryObject<FallingSlabBlock> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab", () -> new FallingSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.BLACK_CONCRETE_POWDER, ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL, Block.Properties.copy(Blocks.BLACK_CONCRETE_POWDER)));

	// CONCRETE
	public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_CONCRETE, ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.WHITE_CONCRETE)));
	public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_CONCRETE, ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.ORANGE_CONCRETE)));
	public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_CONCRETE, ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.MAGENTA_CONCRETE)));
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_CONCRETE, ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
	public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_CONCRETE, ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.YELLOW_CONCRETE)));
	public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_CONCRETE, ESPVerticalSlabs.LIME_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.LIME_CONCRETE)));
	public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_CONCRETE, ESPVerticalSlabs.PINK_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.PINK_CONCRETE)));
	public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_CONCRETE, ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.GRAY_CONCRETE)));
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_CONCRETE, ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
	public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_CONCRETE, ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.CYAN_CONCRETE)));
	public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_CONCRETE, ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.PURPLE_CONCRETE)));
	public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_CONCRETE, ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.BLUE_CONCRETE)));
	public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_CONCRETE, ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.BROWN_CONCRETE)));
	public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_CONCRETE, ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.GREEN_CONCRETE)));
	public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_CONCRETE, ESPVerticalSlabs.RED_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.RED_CONCRETE)));
	public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_CONCRETE, ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL, Block.Properties.copy(Blocks.BLACK_CONCRETE)));

	// TERRACOTTA
	public static final RegistryObject<SlabBlock> CLAY_SLAB = registerBlock("clay_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_SHOVEL), Blocks.CLAY, ESPVerticalSlabs.CLAY_VERTICAL, Block.Properties.copy(Blocks.CLAY)));
	public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.TERRACOTTA, ESPVerticalSlabs.TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.TERRACOTTA)));
	public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_TERRACOTTA, ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_TERRACOTTA, ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_TERRACOTTA, ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_TERRACOTTA, ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_TERRACOTTA, ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_TERRACOTTA, ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_TERRACOTTA, ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_TERRACOTTA, ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_TERRACOTTA, ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_TERRACOTTA, ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_TERRACOTTA, ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_TERRACOTTA, ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_TERRACOTTA, ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_TERRACOTTA, ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_TERRACOTTA, ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.RED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_TERRACOTTA, ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));

	// GLAZED TERRACOTTA
	public static final RegistryObject<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WHITE_GLAZED_TERRACOTTA, ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.ORANGE_GLAZED_TERRACOTTA, ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.MAGENTA_GLAZED_TERRACOTTA, ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.YELLOW_GLAZED_TERRACOTTA, ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIME_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PINK_GLAZED_TERRACOTTA, ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GRAY_GLAZED_TERRACOTTA, ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CYAN_GLAZED_TERRACOTTA, ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.PURPLE_GLAZED_TERRACOTTA, ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLUE_GLAZED_TERRACOTTA, ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BROWN_GLAZED_TERRACOTTA, ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.GREEN_GLAZED_TERRACOTTA, ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.RED_GLAZED_TERRACOTTA, ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));
	public static final RegistryObject<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.BLACK_GLAZED_TERRACOTTA, ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL, Block.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

	// GLASS
	public static final RegistryObject<GlassSlabBlock> GLASS_SLAB = registerBlock("glass_slab", () -> new GlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GLASS, ESPVerticalSlabs.GLASS_VERTICAL, Block.Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<TintedGlassSlabBlock> TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab", () -> new TintedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.TINTED_GLASS, ESPVerticalSlabs.TINTED_GLASS_VERTICAL, Block.Properties.copy(Blocks.TINTED_GLASS)));
	public static final RegistryObject<StainedGlassSlabBlock> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.WHITE_STAINED_GLASS, ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL, DyeColor.WHITE, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.ORANGE_STAINED_GLASS, ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL, DyeColor.ORANGE, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.MAGENTA_STAINED_GLASS, ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL, DyeColor.MAGENTA, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_BLUE_STAINED_GLASS, ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL, DyeColor.LIGHT_BLUE, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.YELLOW_STAINED_GLASS, ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL, DyeColor.YELLOW, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIME_STAINED_GLASS, ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL, DyeColor.LIME, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PINK_STAINED_GLASS, ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL, DyeColor.PINK, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GRAY_STAINED_GLASS, ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL, DyeColor.GRAY, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.LIGHT_GRAY_STAINED_GLASS, ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL, DyeColor.LIGHT_GRAY, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.CYAN_STAINED_GLASS, ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL, DyeColor.CYAN, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.PURPLE_STAINED_GLASS, ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL, DyeColor.PURPLE, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLUE_STAINED_GLASS, ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL, DyeColor.BLUE, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BROWN_STAINED_GLASS, ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL, DyeColor.BROWN, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.GREEN_STAINED_GLASS, ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL, DyeColor.GREEN, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.RED_STAINED_GLASS, ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL, DyeColor.RED, Block.Properties.copy(Blocks.COBBLESTONE)));
	public static final RegistryObject<StainedGlassSlabBlock> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", () -> new StainedGlassSlabBlock(tag(BlockTags.IMPERMEABLE), Blocks.BLACK_STAINED_GLASS, ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL, DyeColor.BLACK, Block.Properties.copy(Blocks.COBBLESTONE)));

	// WOOD
	public static final RegistryObject<SlabBlock> OAK_WOOD_SLAB = registerBlock("oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.OAK_WOOD, ESPVerticalSlabs.OAK_WOOD_VERTICAL, Block.Properties.copy(Blocks.OAK_WOOD)));
	public static final RegistryObject<SlabBlock> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.SPRUCE_WOOD, ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL, Block.Properties.copy(Blocks.SPRUCE_WOOD)));
	public static final RegistryObject<SlabBlock> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.BIRCH_WOOD, ESPVerticalSlabs.BIRCH_WOOD_VERTICAL, Block.Properties.copy(Blocks.BIRCH_WOOD)));
	public static final RegistryObject<SlabBlock> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.JUNGLE_WOOD, ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL, Block.Properties.copy(Blocks.JUNGLE_WOOD)));
	public static final RegistryObject<SlabBlock> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.ACACIA_WOOD, ESPVerticalSlabs.ACACIA_WOOD_VERTICAL, Block.Properties.copy(Blocks.ACACIA_WOOD)));
	public static final RegistryObject<SlabBlock> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.DARK_OAK_WOOD, ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL, Block.Properties.copy(Blocks.DARK_OAK_WOOD)));
	public static final RegistryObject<SlabBlock> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.MANGROVE_WOOD, ESPVerticalSlabs.MANGROVE_WOOD_VERTICAL, Block.Properties.copy(Blocks.MANGROVE_WOOD)));
	public static final RegistryObject<SlabBlock> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CHERRY_WOOD, ESPVerticalSlabs.CHERRY_WOOD_VERTICAL, Block.Properties.copy(Blocks.CHERRY_WOOD)));
	public static final RegistryObject<SlabBlock> CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.CRIMSON_HYPHAE, ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL, Block.Properties.copy(Blocks.CRIMSON_HYPHAE)));
	public static final RegistryObject<SlabBlock> WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_AXE), Blocks.WARPED_HYPHAE, ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL, Block.Properties.copy(Blocks.WARPED_HYPHAE)));

	// NETHER
	public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.NETHERRACK, ESPVerticalSlabs.NETHERRACK_VERTICAL, Block.Properties.copy(Blocks.NETHERRACK)));
	public static final RegistryObject<SlabBlock> CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.CRIMSON_NYLIUM, ESPVerticalSlabs.CRIMSON_NYLIUM_VERTICAL, Block.Properties.copy(Blocks.CRIMSON_NYLIUM)));
	public static final RegistryObject<SlabBlock> WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.WARPED_NYLIUM, ESPVerticalSlabs.WARPED_NYLIUM_VERTICAL, Block.Properties.copy(Blocks.WARPED_NYLIUM)));

	// END
	public static final RegistryObject<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab", () -> new ESPSlabBlock(tag(BlockTags.MINEABLE_WITH_PICKAXE), Blocks.END_STONE, ESPVerticalSlabs.END_STONE_VERTICAL, Block.Properties.copy(Blocks.END_STONE)));

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}

	public static Collection<RegistryObject<Item>> orderedItems() {
		return ITEMS.getEntries();
	}

	private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return false;
	}

	private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
		return false;
	}
}