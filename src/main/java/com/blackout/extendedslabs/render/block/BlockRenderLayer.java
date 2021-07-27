package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenderLayer {

    public static void renderBlock() {
        RenderTypeLookup.setRenderLayer(ESPSlabs.GRASS_SLAB.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.GRASS_VERTICAL.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPSlabs.PATH_SLAB.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ESPVerticalSlabs.PATH_VERTICAL.get(), RenderType.cutoutMipped());
    }
}