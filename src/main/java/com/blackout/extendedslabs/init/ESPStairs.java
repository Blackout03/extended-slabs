package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.google.common.base.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESPStairs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSlabs.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSlabs.MODID);

    // Dirt
    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.DIRT)), ExtendedSlabs.GROUP);

    // Nether
    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.NETHERRACK)), ExtendedSlabs.GROUP);

    // End
    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs", () -> new StairsBlock(Block.stateById(1), Block.Properties.copy(Blocks.END_STONE)), ExtendedSlabs.GROUP);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = ESPStairs.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup)));
        return block;
    }
}