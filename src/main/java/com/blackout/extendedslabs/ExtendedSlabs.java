package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.*;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.render.block.BlockRenderLayer;
import com.blackout.extendedslabs.util.CreativeTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExtendedSlabs.MODID)
public class ExtendedSlabs {
    public static final String MODID = "extendedslabs";
    public static final String MODNAME = "Extended Slabs";
    public static final String VERSION = "2.0.0";

    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final CreativeModeTab GROUP = new CreativeTab();

    public ExtendedSlabs() {
        LOGGER.debug(MODNAME + " Version is:" + VERSION);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::gatherData);

        ESPSlabs.ITEMS.register(eventBus);
        ESPSlabs.BLOCKS.register(eventBus);
        ESPStairs.ITEMS.register(eventBus);
        ESPStairs.BLOCKS.register(eventBus);
        ESPCorners.ITEMS.register(eventBus);
        ESPCorners.BLOCKS.register(eventBus);
        ESPVerticalSlabs.ITEMS.register(eventBus);
        ESPVerticalSlabs.BLOCKS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        final ExistingFileHelper existing = event.getExistingFileHelper();

        if (event.includeServer()) {
            dataGenerator.addProvider(new ESPLootTableProvider(dataGenerator));
            dataGenerator.addProvider(new ESPBlockModelProvider(dataGenerator, MODID, existing));
            dataGenerator.addProvider(new ESPItemModelGenerator(dataGenerator, existing));
            dataGenerator.addProvider(new ESPBlockStateProvider(dataGenerator, MODID, existing));
            dataGenerator.addProvider(new ESPBlockTagsProvider(dataGenerator, existing));
            dataGenerator.addProvider(new ESPStairRecipeProvider(dataGenerator));
            dataGenerator.addProvider(new ESPCornerRecipeProvider(dataGenerator));
            dataGenerator.addProvider(new ESPSlabRecipeProvider(dataGenerator));
            dataGenerator.addProvider(new ESPVerticalSlabRecipeProvider(dataGenerator));
        }
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BlockRenderLayer.renderBlock();
        LOGGER.info("renderBlock");
    }
}
