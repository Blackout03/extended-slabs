package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.glass.GlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.StainedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.glass.TintedGlassSlabBlock;
import com.blackout.extendedslabs.blocks.path.PathSlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPSlabs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// DIRT
	public static final RegistryObject<SlabBlock> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> DIRT_SLAB = registerBlock("dirt_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.ROOTED_DIRT)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PODZOL_SLAB = registerBlock("podzol_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.PODZOL).strength(0.5F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MYCELIUM_SLAB = registerBlock("mycelium_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_GRASS, MaterialColor.COLOR_PURPLE).randomTicks().strength(0.6F).sound(SoundType.GRASS)), ExtendedSlabs.GROUP);
	public static final RegistryObject<PathSlabBlock> DIRT_PATH_SLAB = registerBlock("dirt_path_slab",() -> new PathSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking(ESPSlabs::always).isSuffocating(ESPSlabs::always)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> SAND_SLAB = registerBlock("sand_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> RED_SAND_SLAB = registerBlock("red_sand_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, MaterialColor.COLOR_ORANGE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> GRAVEL_SLAB = registerBlock("gravel_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, MaterialColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);

	// STONE
	public static final RegistryObject<SlabBlock> TUFF_SLAB = registerBlock("tuff_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_GRAY).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_WHITE).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MUD_SLAB = registerBlock("mud_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.TERRACOTTA_CYAN).strength(0.5F).isValidSpawn(ESPSlabs::always).isRedstoneConductor(ESPSlabs::always).isViewBlocking(ESPSlabs::always).isSuffocating(ESPSlabs::always).sound(SoundType.MUD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_MUD, MaterialColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)), ExtendedSlabs.GROUP);

	// WOOL
	public static final RegistryObject<SlabBlock> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.SNOW).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_ORANGE).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_MAGENTA).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_LIGHT_BLUE).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_YELLOW).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_LIGHT_GREEN).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_PINK).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_GRAY).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_LIGHT_GRAY).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_CYAN).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_PURPLE).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_BLUE).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_BROWN).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_GREEN).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> RED_WOOL_SLAB = registerBlock("red_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_RED).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.WOOL, MaterialColor.COLOR_BLACK).strength(0.8F).sound(SoundType.WOOL)), ExtendedSlabs.GROUP);

	// CONCRETE POWDER
	public static final RegistryObject<FallingSlabBlock> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.WHITE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.ORANGE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.MAGENTA).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.LIGHT_BLUE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.YELLOW).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.LIME).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.PINK).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.GRAY).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.LIGHT_GRAY).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.CYAN).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.PURPLE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.BLUE).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.BROWN).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.GREEN).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.RED).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);
	public static final RegistryObject<FallingSlabBlock> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab",() -> new FallingSlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_SAND, DyeColor.BLACK).strength(0.5F).sound(SoundType.SAND)), ExtendedSlabs.GROUP);

	// CONCRETE
	public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.WHITE).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.ORANGE).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.MAGENTA).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIGHT_BLUE).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.YELLOW).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIME).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.PINK).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.GRAY).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIGHT_GRAY).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.CYAN).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.PURPLE).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BLUE).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BROWN).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.GREEN).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.RED).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BLACK).requiresCorrectToolForDrops().strength(1.8F)), ExtendedSlabs.GROUP);

	// TERRACOTTA
	public static final RegistryObject<SlabBlock> CLAY_SLAB = registerBlock("clay_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.SHOVEL_CLAY, MaterialColor.CLAY).strength(0.6F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_MAGENTA).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_YELLOW).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_LIGHT_GREEN).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_GRAY).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_CYAN).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_PURPLE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BLUE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BROWN).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_RED).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BLACK).requiresCorrectToolForDrops().strength(1.25F, 4.2F)), ExtendedSlabs.GROUP);

	// GLAZED TERRACOTTA
	public static final RegistryObject<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.WHITE).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.ORANGE).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.MAGENTA).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIGHT_BLUE).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.YELLOW).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIME).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.PINK).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.GRAY).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.LIGHT_GRAY).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.CYAN).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.PURPLE).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BLUE).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BROWN).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.GREEN).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.RED).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, DyeColor.BLACK).requiresCorrectToolForDrops().strength(1.4F)), ExtendedSlabs.GROUP);

	// GLASS
	public static final RegistryObject<GlassSlabBlock> GLASS_SLAB = registerBlock("glass_slab", () -> new GlassSlabBlock(Block.Properties.of(ESPMaterial.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<TintedGlassSlabBlock> TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab", () -> new TintedGlassSlabBlock(Block.Properties.of(ESPMaterial.GLASS, MaterialColor.COLOR_GRAY).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.WHITE, Block.Properties.of(ESPMaterial.GLASS, DyeColor.WHITE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.ORANGE, Block.Properties.of(ESPMaterial.GLASS, DyeColor.ORANGE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.MAGENTA, Block.Properties.of(ESPMaterial.GLASS, DyeColor.MAGENTA).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, Block.Properties.of(ESPMaterial.GLASS, DyeColor.LIGHT_BLUE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.YELLOW, Block.Properties.of(ESPMaterial.GLASS, DyeColor.YELLOW).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIME, Block.Properties.of(ESPMaterial.GLASS, DyeColor.LIME).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PINK, Block.Properties.of(ESPMaterial.GLASS, DyeColor.PINK).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GRAY, Block.Properties.of(ESPMaterial.GLASS, DyeColor.GRAY).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, Block.Properties.of(ESPMaterial.GLASS, DyeColor.LIGHT_GRAY).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.CYAN, Block.Properties.of(ESPMaterial.GLASS, DyeColor.CYAN).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PURPLE, Block.Properties.of(ESPMaterial.GLASS, DyeColor.PURPLE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLUE, Block.Properties.of(ESPMaterial.GLASS, DyeColor.BLUE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BROWN, Block.Properties.of(ESPMaterial.GLASS, DyeColor.BROWN).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GREEN, Block.Properties.of(ESPMaterial.GLASS, DyeColor.GREEN).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.RED, Block.Properties.of(ESPMaterial.GLASS, DyeColor.RED).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StainedGlassSlabBlock> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLACK, Block.Properties.of(ESPMaterial.GLASS, DyeColor.BLACK).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ESPSlabs::never).isRedstoneConductor(ESPSlabs::never).isSuffocating(ESPSlabs::never).isViewBlocking(ESPSlabs::never)), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<SlabBlock> OAK_WOOD_SLAB = registerBlock("oak_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.SAND).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.DIRT).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_BROWN).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_RED).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F).sound(SoundType.STEM)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F).sound(SoundType.STEM)), ExtendedSlabs.GROUP);

	// NETHER
	public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.CRIMSON_NYLIUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM).randomTicks()), ExtendedSlabs.GROUP);
	public static final RegistryObject<SlabBlock> WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab", () -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM).randomTicks()), ExtendedSlabs.GROUP);

	// END
	public static final RegistryObject<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",() -> new SlabBlock(Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 9.0F)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = ESPSlabs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}

	private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return true;
	}

	private static Boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
		return true;
	}

	private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return false;
	}

	private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
		return false;
	}
}