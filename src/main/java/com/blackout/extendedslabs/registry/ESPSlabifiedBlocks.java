package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.slabified.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPSlabifiedBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);

	public static RegistryObject<Block> GRASS = registerBlock("grass_slabified", () -> new TallGrassBlockSlabified(Block.Properties.copy(Blocks.GRASS).dropsLike(Blocks.GRASS), Blocks.GRASS));
	public static RegistryObject<Block> FERN = registerBlock("fern_slabified", () -> new TallGrassBlockSlabified(Block.Properties.copy(Blocks.FERN).dropsLike(Blocks.FERN), Blocks.FERN));
	public static RegistryObject<Block> DEAD_BUSH = registerBlock("dead_bush_slabified", () -> new DeadBushBlockSlabified(Block.Properties.copy(Blocks.DEAD_BUSH).dropsLike(Blocks.DEAD_BUSH), Blocks.DEAD_BUSH));

	public static RegistryObject<Block> TALL_GRASS = registerBlock("tall_grass_slabified", () -> new DoublePlantBlockSlabified(Block.Properties.copy(Blocks.TALL_GRASS).dropsLike(Blocks.TALL_GRASS), Blocks.TALL_GRASS));
	public static RegistryObject<Block> LARGE_FERN = registerBlock("large_fern_slabified", () -> new DoublePlantBlockSlabified(Block.Properties.copy(Blocks.LARGE_FERN).dropsLike(Blocks.LARGE_FERN), Blocks.LARGE_FERN));

//	public static RegistryObject<Block> BROWN_MUSHROOM = registerBlock("brown_mushroom_slabified", () -> new MushroomBlockSlabified(Block.Properties.copy(Blocks.BROWN_MUSHROOM).dropsLike(Blocks.BROWN_MUSHROOM), "brown_mushroom"));
//	public static RegistryObject<Block> RED_MUSHROOM = registerBlock("red_mushroom_slabified", () -> new MushroomBlockSlabified(Block.Properties.copy(Blocks.RED_MUSHROOM).dropsLike(Blocks.RED_MUSHROOM), "red_mushroom"));
//	public static RegistryObject<Block> WARPED_FUNGUS = registerBlock("warped_fungus_slabified", () -> new FungusBlockSlabified(Block.Properties.copy(Blocks.WARPED_FUNGUS).dropsLike(Blocks.WARPED_FUNGUS), "warped_fungus"));
//	public static RegistryObject<Block> CRIMSON_FUNGUS = registerBlock("crimson_fungus_slabified", () -> new FungusBlockSlabified(Block.Properties.copy(Blocks.CRIMSON_FUNGUS).dropsLike(Blocks.CRIMSON_FUNGUS), "crimson_fungus"));

//	public static RegistryObject<Block> WARPED_ROOTS = registerBlock("warped_roots_slabified", () -> new RootsBlockSlabified(Block.Properties.copy(Blocks.WARPED_ROOTS).dropsLike(Blocks.WARPED_ROOTS), "warped_roots"));
//	public static RegistryObject<Block> CRIMSON_ROOTS = registerBlock("crimson_roots_slabified", () -> new RootsBlockSlabified(Block.Properties.copy(Blocks.CRIMSON_ROOTS).dropsLike(Blocks.CRIMSON_ROOTS), "crimson_roots"));

//	public static RegistryObject<Block> NETHER_WART = registerBlock("nether_wart_slabified", () -> new NetherWartBlockPlantSlabified(Block.Properties.copy(Blocks.NETHER_WART).dropsLike(Blocks.NETHER_WART), "nether_wart"));

	public static RegistryObject<Block> DANDELION = registerBlock("dandelion_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.SATURATION, 7, Block.Properties.copy(Blocks.DANDELION).dropsLike(Blocks.DANDELION), Blocks.DANDELION));
	public static RegistryObject<Block> POPPY = registerBlock("poppy_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.POPPY).dropsLike(Blocks.POPPY), Blocks.POPPY));
	public static RegistryObject<Block> BLUE_ORCHID = registerBlock("blue_orchid_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.SATURATION, 7, Block.Properties.copy(Blocks.BLUE_ORCHID).dropsLike(Blocks.BLUE_ORCHID), Blocks.BLUE_ORCHID));
	public static RegistryObject<Block> ALLIUM = registerBlock("allium_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.FIRE_RESISTANCE, 4, Block.Properties.copy(Blocks.ALLIUM).dropsLike(Blocks.ALLIUM), Blocks.ALLIUM));
	public static RegistryObject<Block> AZURE_BLUET = registerBlock("azure_bluet_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.BLINDNESS, 8, Block.Properties.copy(Blocks.AZURE_BLUET).dropsLike(Blocks.AZURE_BLUET), Blocks.AZURE_BLUET));
	public static RegistryObject<Block> RED_TULIP = registerBlock("red_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.RED_TULIP).dropsLike(Blocks.RED_TULIP), Blocks.RED_TULIP));
	public static RegistryObject<Block> ORANGE_TULIP = registerBlock("orange_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.ORANGE_TULIP).dropsLike(Blocks.ORANGE_TULIP), Blocks.ORANGE_TULIP));
	public static RegistryObject<Block> WHITE_TULIP = registerBlock("white_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.WHITE_TULIP).dropsLike(Blocks.WHITE_TULIP), Blocks.WHITE_TULIP));
	public static RegistryObject<Block> PINK_TULIP = registerBlock("pink_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.PINK_TULIP).dropsLike(Blocks.PINK_TULIP), Blocks.PINK_TULIP));
	public static RegistryObject<Block> OXEYE_DAISY = registerBlock("oxeye_daisy_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.REGENERATION, 8, Block.Properties.copy(Blocks.OXEYE_DAISY).dropsLike(Blocks.OXEYE_DAISY), Blocks.OXEYE_DAISY));
	public static RegistryObject<Block> CORNFLOWER = registerBlock("cornflower_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.JUMP, 6, Block.Properties.copy(Blocks.CORNFLOWER).dropsLike(Blocks.CORNFLOWER), Blocks.CORNFLOWER));
	public static RegistryObject<Block> LILY_OF_THE_VALLEY = registerBlock("lily_of_the_valley_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.POISON, 12, Block.Properties.copy(Blocks.LILY_OF_THE_VALLEY).dropsLike(Blocks.LILY_OF_THE_VALLEY), Blocks.LILY_OF_THE_VALLEY));
	public static RegistryObject<Block> TORCHFLOWER = registerBlock("torchflower_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.TORCHFLOWER).dropsLike(Blocks.TORCHFLOWER), Blocks.TORCHFLOWER));
	public static RegistryObject<Block> WITHER_ROSE = registerBlock("wither_rose_slabified", () -> new WitherRoseBlockSlabified(() -> MobEffects.WITHER, Block.Properties.copy(Blocks.WITHER_ROSE).dropsLike(Blocks.WITHER_ROSE), Blocks.WITHER_ROSE));

	public static RegistryObject<Block> SUGAR_CANE = registerBlock("sugar_cane_slabified", () -> new SugarCaneBlockSlabified(Block.Properties.copy(Blocks.SUGAR_CANE).dropsLike(Blocks.SUGAR_CANE), Blocks.SUGAR_CANE));
	public static RegistryObject<Block> CACTUS = registerBlock("cactus_slabified", () -> new CactusBlockSlabified(Block.Properties.copy(Blocks.CACTUS).dropsLike(Blocks.CACTUS), Blocks.CACTUS));

//	public static RegistryObject<Block> SWEET_BERRY_BUSH = registerBlock("sweet_berry_bush_slabified", new SweetBerryBushBlockSlabified(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).dropsLike(Blocks.SWEET_BERRY_BUSH), "sweet_berry_bush"));

	public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier) {
		return BLOCKS.register(name, supplier);
	}
}
