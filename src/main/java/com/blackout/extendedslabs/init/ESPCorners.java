package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.CornerBlock;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPCorners {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// STONE
	public static final RegistryObject<Block> COBBLESTONE_CORNER = registerBlock("cobblestone_corner",() -> new CornerBlock(Blocks.COBBLESTONE, Blocks.COBBLESTONE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> STONE_CORNER = registerBlock("stone_corner",() -> new CornerBlock(Blocks.STONE, Blocks.STONE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> STONE_BRICK_CORNER = registerBlock("stone_brick_corner",() -> new CornerBlock(Blocks.STONE_BRICKS, Blocks.STONE_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> ANDESITE_CORNER = registerBlock("andesite_corner",() -> new CornerBlock(Blocks.ANDESITE, Blocks.ANDESITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_ANDESITE_CORNER = registerBlock("polished_andesite_corner",() -> new CornerBlock(Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> DIORITE_CORNER = registerBlock("diorite_corner",() -> new CornerBlock(Blocks.DIORITE, Blocks.DIORITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_DIORITE_CORNER = registerBlock("polished_diorite_corner",() -> new CornerBlock(Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> GRANITE_CORNER = registerBlock("granite_corner",() -> new CornerBlock(Blocks.GRANITE, Blocks.GRANITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_GRANITE_CORNER = registerBlock("polished_granite_corner",() -> new CornerBlock(Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> TUFF_CORNER = registerBlock("tuff_corner",() -> new CornerBlock(Blocks.TUFF, ESPStairs.TUFF_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_GRAY).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> CALCITE_CORNER = registerBlock("calcite_corner",() -> new CornerBlock(Blocks.CALCITE, ESPStairs.CALCITE_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_WHITE).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
	public static final RegistryObject<Block> DRIPSTONE_CORNER = registerBlock("dripstone_corner",() -> new CornerBlock(Blocks.DRIPSTONE_BLOCK, ESPStairs.DRIPSTONE_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
	public static final RegistryObject<Block> MUD_CORNER = registerBlock("mud_corner",() -> new CornerBlock(Blocks.MUD, ESPStairs.MUD_STAIRS.get(), Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.TERRACOTTA_CYAN).strength(0.5F).sound(SoundType.MUD)));
	public static final RegistryObject<Block> PACKED_MUD_CORNER = registerBlock("packed_mud_corner",() -> new CornerBlock(Blocks.PACKED_MUD, ESPStairs.PACKED_MUD_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_MUD, MaterialColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
	public static final RegistryObject<Block> MUD_BRICK_CORNER = registerBlock("mud_brick_corner",() -> new CornerBlock(Blocks.MUD_BRICKS, Blocks.MUD_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));

	// PLANKS
	public static final RegistryObject<Block> OAK_CORNER = registerBlock("oak_corner",() -> new CornerBlock(Blocks.OAK_PLANKS, Blocks.OAK_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_CORNER = registerBlock("spruce_corner",() -> new CornerBlock(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.PODZOL).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_CORNER = registerBlock("birch_corner",() -> new CornerBlock(Blocks.BIRCH_PLANKS, Blocks.BIRCH_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_CORNER = registerBlock("jungle_corner",() -> new CornerBlock(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_CORNER = registerBlock("acacia_corner",() -> new CornerBlock(Blocks.ACACIA_PLANKS, Blocks.ACACIA_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner",() -> new CornerBlock(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_CORNER = registerBlock("mangrove_corner",() -> new CornerBlock(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_STAIRS, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BAMBOO_CORNER = registerBlock("bamboo_corner", () -> new CornerBlock(Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).requiredFeatures(FeatureFlags.UPDATE_1_20)));
	public static final RegistryObject<Block> BAMBOO_MOSAIC_CORNER = registerBlock("bamboo_mosaic_corner", () -> new CornerBlock(Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC_SLAB, Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).requiredFeatures(FeatureFlags.UPDATE_1_20)));
	public static final RegistryObject<Block> CRIMSON_CORNER = registerBlock("crimson_corner",() -> new CornerBlock(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STAIRS, Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.CRIMSON_STEM).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
	public static final RegistryObject<Block> WARPED_CORNER = registerBlock("warped_corner",() -> new CornerBlock(Blocks.WARPED_PLANKS, Blocks.WARPED_STAIRS, Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.WARPED_STEM).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

	// WOOD
	public static final RegistryObject<Block> OAK_WOOD_CORNER = registerBlock("oak_wood_corner", () -> new CornerBlock(Blocks.OAK_WOOD, ESPStairs.OAK_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_WOOD_CORNER = registerBlock("spruce_wood_corner", () -> new CornerBlock(Blocks.SPRUCE_WOOD, ESPStairs.SPRUCE_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_WOOD_CORNER = registerBlock("birch_wood_corner", () -> new CornerBlock(Blocks.BIRCH_WOOD, ESPStairs.BIRCH_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.SAND).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_WOOD_CORNER = registerBlock("jungle_wood_corner", () -> new CornerBlock(Blocks.JUNGLE_WOOD, ESPStairs.JUNGLE_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.DIRT).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_WOOD_CORNER = registerBlock("acacia_wood_corner", () -> new CornerBlock(Blocks.ACACIA_WOOD, ESPStairs.ACACIA_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_WOOD_CORNER = registerBlock("dark_oak_wood_corner", () -> new CornerBlock(Blocks.DARK_OAK_WOOD, ESPStairs.DARK_OAK_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_BROWN).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_WOOD_CORNER = registerBlock("mangrove_wood_corner", () -> new CornerBlock(Blocks.MANGROVE_WOOD, ESPStairs.MANGROVE_WOOD_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_RED).strength(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_HYPHAE_CORNER = registerBlock("crimson_hyphae_corner", () -> new CornerBlock(Blocks.CRIMSON_HYPHAE, ESPStairs.CRIMSON_HYPHAE_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F).sound(SoundType.STEM)));
	public static final RegistryObject<Block> WARPED_HYPHAE_CORNER = registerBlock("warped_hyphae_corner", () -> new CornerBlock(Blocks.WARPED_HYPHAE, ESPStairs.WARPED_HYPHAE_STAIRS.get(), Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F).sound(SoundType.STEM)));

	// NETHER
	public static final RegistryObject<Block> NETHERRACK_CORNER = registerBlock("netherrack_corner",() -> new CornerBlock(Blocks.NETHERRACK, ESPStairs.NETHERRACK_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
	public static final RegistryObject<Block> NETHER_BRICK_CORNER = registerBlock("nether_brick_corner",() -> new CornerBlock(Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
	public static final RegistryObject<Block> RED_NETHER_BRICK_CORNER = registerBlock("red_nether_brick_corner",() -> new CornerBlock(Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
	public static final RegistryObject<Block> BLACKSTONE_CORNER = registerBlock("blackstone_corner",() -> new CornerBlock(Blocks.BLACKSTONE, Blocks.BLACKSTONE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_CORNER = registerBlock("polished_blackstone_corner",() -> new CornerBlock(Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_CORNER = registerBlock("polished_blackstone_brick_corner",() -> new CornerBlock(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

	// END
	public static final RegistryObject<Block> END_STONE_CORNER = registerBlock("end_stone_corner",() -> new CornerBlock(Blocks.END_STONE, ESPStairs.END_STONE_STAIRS.get(), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
	public static final RegistryObject<Block> END_STONE_BRICK_CORNER = registerBlock("end_stone_brick_corner",() -> new CornerBlock(Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
	public static final RegistryObject<Block> PURPUR_CORNER = registerBlock("purpur_corner",() -> new CornerBlock(Blocks.PURPUR_BLOCK, Blocks.PURPUR_STAIRS, Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.COLOR_MAGENTA).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier) {
		RegistryObject<B> block = ESPCorners.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}

	public static Collection<RegistryObject<Item>> orderedItems() {
		return ITEMS.getEntries();
	}
}