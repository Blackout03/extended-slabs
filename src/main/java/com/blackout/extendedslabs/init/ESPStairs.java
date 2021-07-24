package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.BlockCustomStairs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs",() -> new BlockCustomStairs(Block.stateById(1), Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",() -> new BlockCustomStairs(Block.stateById(1), Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",() -> new BlockCustomStairs(Block.stateById(1), Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, CreativeModeTab itemGroup) {
        RegistryObject<B> block = ESPStairs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}