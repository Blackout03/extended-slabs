package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenderLayer {

    public static void renderBlock() {
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.GRASS_BLOCK_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.DIRT_PATH_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.DIRT_PATH_VERTICAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.LIME_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.RED_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), RenderType.translucent());
    }
}