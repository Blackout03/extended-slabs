package com.blackout.extendedslabs.init;

import com.blackout.extendedslabs.api.block.ModCorners;
import com.blackout.extendedslabs.api.block.ModSlabs;
import com.blackout.extendedslabs.api.block.ModStairs;
import com.blackout.extendedslabs.api.block.ModVerticalSlabs;
import com.blackout.extendedslabs.blocks.grass.BlockGrassStairs;
import com.blackout.extendedslabs.blocks.grass.BlockVerticalGrassSlab;
import com.blackout.extendedslabs.core.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.grass.BlockGrassSlab;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static Block VERTICAL_GRASS_SLAB;
    public static Block GRASS_STAIRS;
    public static Block GRASS_SLAB;

    @SubscribeEvent
    public static void RegisterModBlock(final RegistryEvent.Register<Block> event) {
        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

        VERTICAL_GRASS_SLAB = register("vertical_grass_slab", new BlockVerticalGrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK)));

        for (ModVerticalSlabs VerticalSlab : ModVerticalSlabs.VALUES) {
            register("vertical_" + VerticalSlab.getName() + "_slab", VerticalSlab.getVerticalSlab());
        }

        GRASS_SLAB = register("grass_slab", new BlockGrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK)));

        for (ModSlabs Slab : ModSlabs.VALUES) {
            register(Slab.getName() + "_slab", Slab.getSlab());
        }

        GRASS_STAIRS = register("grass_stairs", new BlockGrassStairs(Blocks.GRASS_BLOCK.getDefaultState() ,Block.Properties.from(Blocks.GRASS_BLOCK)));

        for (ModStairs Stairs : ModStairs.VALUES) {
            register(Stairs.getName() + "_stairs", Stairs.getStairs());
        }

        for (ModCorners Corners : ModCorners.VALUES) {
            register(Corners.getName() + "_corner", Corners.getCornerBlock());
        }
    }

    private static <T extends Block> T register(String name, T block) {
        BlockItem item = new BlockItem(block, new Item.Properties().group(ExtendedSlabs.GROUP));
        return register(name, block, item);
    }

    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
        ResourceLocation id = ExtendedSlabs.location(name);
        block.setRegistryName(id);
        ForgeRegistries.BLOCKS.register(block);
        if (item != null) {
            ModItems.BLOCKS_TO_REGISTER.put(name, item);
        }
        return block;
    }
}