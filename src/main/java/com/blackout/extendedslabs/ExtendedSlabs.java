package com.blackout.extendedslabs;

import com.blackout.extendedslabs.datagen.ESPItemModelGenerator;
import com.blackout.extendedslabs.init.ModCorners;
import com.blackout.extendedslabs.init.ModSlabs;
import com.blackout.extendedslabs.init.ModStairs;
import com.blackout.extendedslabs.init.ModVerticalSlabs;
import com.blackout.extendedslabs.render.block.BlockRenderLayer;
import com.blackout.extendedslabs.util.CreativeTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

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

        if (ModList.get().isLoaded("biomesoplenty")) ModVerticalSlabs.registerBOPCompat();
        if (ModList.get().isLoaded("biomesoplenty")) ModCorners.registerBOPCompat();
        if (ModList.get().isLoaded("biomesoplenty")) LOGGER.debug(ExtendedSlabs.MODID + ": Biomes O' Plenty Compat Loaded");
//        if (ModList.get().isLoaded("michrosia")) ModVerticalSlabs.registerMichrosiaCompat();
//        if (ModList.get().isLoaded("michrosia")) ModCorners.registerMichrosiaCompat();
//        if (ModList.get().isLoaded("michrosia")) LOGGER.debug(ExtendedSlabs.MODID + ": Michrosia Compat Loaded");

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::gatherData);

        ModCorners.ITEMS.register(eventBus);
        ModCorners.BLOCKS.register(eventBus);
        ModSlabs.ITEMS.register(eventBus);
        ModSlabs.BLOCKS.register(eventBus);
        ModStairs.ITEMS.register(eventBus);
        ModStairs.BLOCKS.register(eventBus);
        ModVerticalSlabs.ITEMS.register(eventBus);
        ModVerticalSlabs.BLOCKS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        final ExistingFileHelper existing = event.getExistingFileHelper();

        if (event.includeServer()) {
            dataGenerator.addProvider(new ESPItemModelGenerator(dataGenerator, existing));
        }
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BlockRenderLayer.renderBlock();
        LOGGER.info("renderBlock");
    }

    public static String getVersion(boolean correctInDev) {
        Optional<? extends ModContainer> o = ModList.get().getModContainerById(MODID);
        if (o.isPresent()) {
            String str = o.get().getModInfo().getVersion().toString();
            if (correctInDev && "NONE".equals(str))
                return VERSION;
            return str;
        }
        return "0.0.0";
    }

    public static boolean isDevBuild() {
        return "NONE".equals(getVersion(false));
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }
}
