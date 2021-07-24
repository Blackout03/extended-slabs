package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.ESPBlockTagsProvider;
import com.blackout.extendedslabs.datagen.ESPItemModelGenerator;
import com.blackout.extendedslabs.datagen.ESPLootTableProvider;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.render.block.BlockRenderLayer;
import com.blackout.extendedslabs.util.CreativeTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
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
    public static final String VERSION = "1.5.0";

    public static ExtendedSlabs INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final CreativeModeTab GROUP = new CreativeTab();

    public ExtendedSlabs() {
        INSTANCE = this;

        if (ModList.get().isLoaded("biomesoplenty")) ESPVerticalSlabs.registerBOPCompat();
        if (ModList.get().isLoaded("biomesoplenty")) ESPCorners.registerBOPCompat();
        if (ModList.get().isLoaded("biomesoplenty")) LOGGER.debug(ExtendedSlabs.MODID + ": Biomes O' Plenty Compat Loaded");
//        if (ModList.get().isLoaded("michrosia")) ESPVerticalSlabs.registerMichrosiaCompat();
//        if (ModList.get().isLoaded("michrosia")) ESPCorners.registerMichrosiaCompat();
//        if (ModList.get().isLoaded("michrosia")) LOGGER.debug(ExtendedSlabs.MODID + ": Michrosia Compat Loaded");

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::gatherData);

        ESPCorners.ITEMS.register(eventBus);
        ESPCorners.BLOCKS.register(eventBus);
        ESPSlabs.ITEMS.register(eventBus);
        ESPSlabs.BLOCKS.register(eventBus);
        ESPStairs.ITEMS.register(eventBus);
        ESPStairs.BLOCKS.register(eventBus);
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
            dataGenerator.addProvider(new ESPItemModelGenerator(dataGenerator, existing));
            dataGenerator.addProvider(new ESPBlockTagsProvider(dataGenerator, existing));
        }
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BlockRenderLayer.renderBlock();
        LOGGER.info("renderBlock");
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }
}
