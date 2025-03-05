package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESPSlabifiedBlocks;
import com.blackout.extendedslabs.registry.ESPSlabs;
import com.blackout.extendedslabs.registry.ESPStairs;
import com.blackout.extendedslabs.registry.ESPVerticalSlabs;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus =  Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockItemColors {
    public static final BlockColor GRASS_BLOCK_COLOR = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5, 1);
    public static final BlockColor DOUBLE_PLANT_COLOR = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? pos.below() : pos) : GrassColor.getDefaultColor();
    public static final BlockColor SUGAR_CANE_COLOR = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : -1;

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register(GRASS_BLOCK_COLOR,
                ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(), ESPSlabs.GRASS_BLOCK_SLAB.get(), ESPStairs.GRASS_BLOCK_STAIRS.get(), ESPSlabifiedBlocks.GRASS.get(), ESPSlabifiedBlocks.FERN.get());
        event.register(DOUBLE_PLANT_COLOR,
                ESPSlabifiedBlocks.TALL_GRASS.get(), ESPSlabifiedBlocks.LARGE_FERN.get());
        event.register(SUGAR_CANE_COLOR,
                ESPSlabifiedBlocks.SUGAR_CANE.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(), ESPSlabs.GRASS_BLOCK_SLAB.get(), ESPStairs.GRASS_BLOCK_STAIRS.get());
    }
}
