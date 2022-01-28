package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenderLayer {
    public static void renderBlock() {
        RenderTypeLookup.setRenderLayer(ESPSlabs.GRASS_BLOCK_SLAB.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPSlabs.GRASS_PATH_SLAB.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GRASS_PATH_VERTICAL.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPSlabs.GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.LIME_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.RED_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
    }
}