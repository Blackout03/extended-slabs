package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPStairs {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

	// DIRT
	public static final RegistryObject<StairBlock> DIRT_STAIRS = registerBlock("dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.SHOVEL_DIRT).strength(0.5F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.PODZOL).strength(0.5F).sound(SoundType.GRAVEL)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.SHOVEL_DIRT).strength(0.5F).sound(SoundType.ROOTED_DIRT)), ExtendedSlabs.GROUP);

	// STONE
	public static final RegistryObject<StairBlock> TUFF_STAIRS = registerBlock("tuff_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_GRAY).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_WHITE).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> MUD_STAIRS = registerBlock("mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.of(ESPMaterial.SHOVEL_DIRT, MaterialColor.TERRACOTTA_CYAN).strength(0.5F).sound(SoundType.MUD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", () -> new StairBlock(Block.stateById(1), BlockBehaviour.Properties.of(ESPMaterial.PICKAXE_MUD, MaterialColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)), ExtendedSlabs.GROUP);

	// WOOD
	public static final RegistryObject<StairBlock> OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.SAND).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.DIRT).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_BROWN).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_WOOD, MaterialColor.COLOR_RED).strength(2.0F).sound(SoundType.WOOD)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F).sound(SoundType.STEM)), ExtendedSlabs.GROUP);
	public static final RegistryObject<StairBlock> WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs", () -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.AXE_NETHER_WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F).sound(SoundType.STEM)), ExtendedSlabs.GROUP);

	// NETHER
	public static final RegistryObject<StairBlock> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)), ExtendedSlabs.GROUP);

	// END
	public static final RegistryObject<StairBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs",() -> new StairBlock(Block.stateById(1), Block.Properties.of(ESPMaterial.PICKAXE_STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 9.0F)), ExtendedSlabs.GROUP);

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
		RegistryObject<B> block = ESPStairs.BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
		return block;
	}
}
