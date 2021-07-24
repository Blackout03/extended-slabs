package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenderLayer {

    public static void renderBlock() {
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.GRASS_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.GRASS_VERTICAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPSlabs.PATH_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ESPVerticalSlabs.PATH_VERTICAL.get(), RenderType.cutoutMipped());
    }
}