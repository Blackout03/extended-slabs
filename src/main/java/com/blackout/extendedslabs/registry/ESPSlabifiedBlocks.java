package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.slabified.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.function.Supplier;

public class ESPSlabifiedBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExtendedSlabs.MODID);

	public static DeferredBlock<Block> GRASS = registerBlock("grass_slabified", () -> new TallGrassBlockSlabified(Block.Properties.copy(Blocks.GRASS).dropsLike(Blocks.GRASS), Blocks.GRASS));
	public static DeferredBlock<Block> FERN = registerBlock("fern_slabified", () -> new TallGrassBlockSlabified(Block.Properties.copy(Blocks.FERN).dropsLike(Blocks.FERN), Blocks.FERN));
	public static DeferredBlock<Block> DEAD_BUSH = registerBlock("dead_bush_slabified", () -> new DeadBushBlockSlabified(Block.Properties.copy(Blocks.DEAD_BUSH).dropsLike(Blocks.DEAD_BUSH), Blocks.DEAD_BUSH));

	public static DeferredBlock<Block> TALL_GRASS = registerBlock("tall_grass_slabified", () -> new DoublePlantBlockSlabified(Block.Properties.copy(Blocks.TALL_GRASS).dropsLike(Blocks.TALL_GRASS), Blocks.TALL_GRASS));
	public static DeferredBlock<Block> LARGE_FERN = registerBlock("large_fern_slabified", () -> new DoublePlantBlockSlabified(Block.Properties.copy(Blocks.LARGE_FERN).dropsLike(Blocks.LARGE_FERN), Blocks.LARGE_FERN));

//	public static DeferredBlock<Block> BROWN_MUSHROOM = registerBlock("brown_mushroom_slabified", () -> new MushroomBlockSlabified(Block.Properties.copy(Blocks.BROWN_MUSHROOM).dropsLike(Blocks.BROWN_MUSHROOM), Blocks.BROWN_MUSHROOM));
//	public static DeferredBlock<Block> RED_MUSHROOM = registerBlock("red_mushroom_slabified", () -> new MushroomBlockSlabified(Block.Properties.copy(Blocks.RED_MUSHROOM).dropsLike(Blocks.RED_MUSHROOM), Blocks.RED_MUSHROOM));
//	public static DeferredBlock<Block> WARPED_FUNGUS = registerBlock("warped_fungus_slabified", () -> new FungusBlockSlabified(Block.Properties.copy(Blocks.WARPED_FUNGUS).dropsLike(Blocks.WARPED_FUNGUS), Blocks.WARPED_FUNGUS));
//	public static DeferredBlock<Block> CRIMSON_FUNGUS = registerBlock("crimson_fungus_slabified", () -> new FungusBlockSlabified(Block.Properties.copy(Blocks.CRIMSON_FUNGUS).dropsLike(Blocks.CRIMSON_FUNGUS), Blocks.CRIMSON_FUNGUS));

//	public static DeferredBlock<Block> WARPED_ROOTS = registerBlock("warped_roots_slabified", () -> new RootsBlockSlabified(Block.Properties.copy(Blocks.WARPED_ROOTS).dropsLike(Blocks.WARPED_ROOTS), Blocks.WARPED_ROOTS));
//	public static DeferredBlock<Block> CRIMSON_ROOTS = registerBlock("crimson_roots_slabified", () -> new RootsBlockSlabified(Block.Properties.copy(Blocks.CRIMSON_ROOTS).dropsLike(Blocks.CRIMSON_ROOTS), Blocks.CRIMSON_ROOTS));

//	public static DeferredBlock<Block> NETHER_WART = registerBlock("nether_wart_slabified", () -> new NetherWartBlockPlantSlabified(Block.Properties.copy(Blocks.NETHER_WART).dropsLike(Blocks.NETHER_WART), Blocks.NETHER_WART));

	public static DeferredBlock<Block> DANDELION = registerBlock("dandelion_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.SATURATION, 7, Block.Properties.copy(Blocks.DANDELION).dropsLike(Blocks.DANDELION), Blocks.DANDELION));
	public static DeferredBlock<Block> POPPY = registerBlock("poppy_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.POPPY).dropsLike(Blocks.POPPY), Blocks.POPPY));
	public static DeferredBlock<Block> BLUE_ORCHID = registerBlock("blue_orchid_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.SATURATION, 7, Block.Properties.copy(Blocks.BLUE_ORCHID).dropsLike(Blocks.BLUE_ORCHID), Blocks.BLUE_ORCHID));
	public static DeferredBlock<Block> ALLIUM = registerBlock("allium_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.FIRE_RESISTANCE, 4, Block.Properties.copy(Blocks.ALLIUM).dropsLike(Blocks.ALLIUM), Blocks.ALLIUM));
	public static DeferredBlock<Block> AZURE_BLUET = registerBlock("azure_bluet_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.BLINDNESS, 8, Block.Properties.copy(Blocks.AZURE_BLUET).dropsLike(Blocks.AZURE_BLUET), Blocks.AZURE_BLUET));
	public static DeferredBlock<Block> RED_TULIP = registerBlock("red_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.RED_TULIP).dropsLike(Blocks.RED_TULIP), Blocks.RED_TULIP));
	public static DeferredBlock<Block> ORANGE_TULIP = registerBlock("orange_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.ORANGE_TULIP).dropsLike(Blocks.ORANGE_TULIP), Blocks.ORANGE_TULIP));
	public static DeferredBlock<Block> WHITE_TULIP = registerBlock("white_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.WHITE_TULIP).dropsLike(Blocks.WHITE_TULIP), Blocks.WHITE_TULIP));
	public static DeferredBlock<Block> PINK_TULIP = registerBlock("pink_tulip_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.WEAKNESS, 9, Block.Properties.copy(Blocks.PINK_TULIP).dropsLike(Blocks.PINK_TULIP), Blocks.PINK_TULIP));
	public static DeferredBlock<Block> OXEYE_DAISY = registerBlock("oxeye_daisy_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.REGENERATION, 8, Block.Properties.copy(Blocks.OXEYE_DAISY).dropsLike(Blocks.OXEYE_DAISY), Blocks.OXEYE_DAISY));
	public static DeferredBlock<Block> CORNFLOWER = registerBlock("cornflower_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.JUMP, 6, Block.Properties.copy(Blocks.CORNFLOWER).dropsLike(Blocks.CORNFLOWER), Blocks.CORNFLOWER));
	public static DeferredBlock<Block> LILY_OF_THE_VALLEY = registerBlock("lily_of_the_valley_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.POISON, 12, Block.Properties.copy(Blocks.LILY_OF_THE_VALLEY).dropsLike(Blocks.LILY_OF_THE_VALLEY), Blocks.LILY_OF_THE_VALLEY));
	public static DeferredBlock<Block> TORCHFLOWER = registerBlock("torchflower_slabified", () -> new FlowerBlockSlabified(() -> MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.TORCHFLOWER).dropsLike(Blocks.TORCHFLOWER), Blocks.TORCHFLOWER));
	public static DeferredBlock<Block> WITHER_ROSE = registerBlock("wither_rose_slabified", () -> new WitherRoseBlockSlabified(() -> MobEffects.WITHER, Block.Properties.copy(Blocks.WITHER_ROSE).dropsLike(Blocks.WITHER_ROSE), Blocks.WITHER_ROSE));

	public static DeferredBlock<Block> SUGAR_CANE = registerBlock("sugar_cane_slabified", () -> new SugarCaneBlockSlabified(Block.Properties.copy(Blocks.SUGAR_CANE).dropsLike(Blocks.SUGAR_CANE), Blocks.SUGAR_CANE));
	public static DeferredBlock<Block> CACTUS = registerBlock("cactus_slabified", () -> new CactusBlockSlabified(Block.Properties.copy(Blocks.CACTUS).dropsLike(Blocks.CACTUS), Blocks.CACTUS));

//	public static DeferredBlock<Block> SWEET_BERRY_BUSH = registerBlock("sweet_berry_bush_slabified", new SweetBerryBushBlockSlabified(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).dropsLike(Blocks.SWEET_BERRY_BUSH), Blocks.SWEET_BERRY_BUSH));

	public static <t extends Block> DeferredBlock<t> registerBlock(String name, Supplier<? extends t> supplier) {
		return BLOCKS.register(name, supplier);
	}
}
