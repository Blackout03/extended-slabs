package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtendedSlabs.MODID, bus =  Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockItemColors {
    public static final BlockColor GRASS_BLOCK_COLOR = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5, 1);

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        event.getBlockColors().register(GRASS_BLOCK_COLOR,
                ESPVerticalSlabs.GRASS_VERTICAL.get(), ESPSlabs.GRASS_SLAB.get());
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                ESPVerticalSlabs.GRASS_VERTICAL.get(), ESPSlabs.GRASS_SLAB.get());
    }
}
