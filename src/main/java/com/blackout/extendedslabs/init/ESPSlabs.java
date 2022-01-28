package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
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
    public static final RegistryObject<SlabBlock> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> DIRT_SLAB = registerBlock("dirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PODZOL_SLAB = registerBlock("podzol_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PODZOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<PathSlabBlock> DIRT_PATH_SLAB = registerBlock("dirt_path_slab",() -> new PathSlabBlock(Block.Properties.copy(Blocks.DIRT_PATH)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> SAND_SLAB = registerBlock("sand_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> RED_SAND_SLAB = registerBlock("red_sand_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.RED_SAND)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> GRAVEL_SLAB = registerBlock("gravel_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.GRAVEL)), ExtendedSlabs.GROUP);
    
    // WOOL
    public static final RegistryObject<SlabBlock> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> RED_WOOL_SLAB = registerBlock("red_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_WOOL)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_WOOL)), ExtendedSlabs.GROUP);

    // CONCRETE POWDER
    public static final RegistryObject<FallingSlabBlock> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.LIME_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.PINK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.RED_CONCRETE_POWDER)), ExtendedSlabs.GROUP);
    public static final RegistryObject<FallingSlabBlock> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE_POWDER)), ExtendedSlabs.GROUP);

    // CONCRETE
    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_CONCRETE)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE)), ExtendedSlabs.GROUP);

    // TERRACOTTA
    public static final RegistryObject<SlabBlock> CLAY_SLAB = registerBlock("clay_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CLAY)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_TERRACOTTA)), ExtendedSlabs.GROUP);

    // GLAZED TERRACOTTA
    public static final RegistryObject<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);
    public static final RegistryObject<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)), ExtendedSlabs.GROUP);

    // GLASS
    public static final RegistryObject<GlassSlabBlock> GLASS_SLAB = registerBlock("glass_slab", () -> new GlassSlabBlock(Block.Properties.copy(Blocks.GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.WHITE, Block.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.ORANGE, Block.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.MAGENTA, Block.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, Block.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.YELLOW, Block.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIME, Block.Properties.copy(Blocks.LIME_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PINK, Block.Properties.copy(Blocks.PINK_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GRAY, Block.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, Block.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.CYAN, Block.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PURPLE, Block.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLUE, Block.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BROWN, Block.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GREEN, Block.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.RED, Block.Properties.copy(Blocks.RED_STAINED_GLASS)), ExtendedSlabs.GROUP);
    public static final RegistryObject<StainedGlassSlabBlock> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLACK, Block.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);

    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ESPSlabs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}