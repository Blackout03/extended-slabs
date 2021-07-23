package com.blackout.extendedslabs.render.block;

import com.blackout.extendedslabs.init.ModSlabs;
import com.blackout.extendedslabs.init.ModVerticalSlabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenderLayer {

    public static void renderBlock() {
        ItemBlockRenderTypes.setRenderLayer(ModSlabs.GRASS_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModVerticalSlabs.GRASS_VERTICAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModSlabs.PATH_SLAB.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModVerticalSlabs.PATH_VERTICAL.get(), RenderType.cutoutMipped());
    }
}