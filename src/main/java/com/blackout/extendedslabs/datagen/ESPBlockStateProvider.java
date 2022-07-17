package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDCorners;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDSlabs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDStairs;
import com.blackout.extendedslabs.init.modded.darkerdepths.DDVerticalSlabs;
import com.blackout.extendedslabs.init.modded.galosphere.GaloCorners;
import com.blackout.extendedslabs.init.modded.galosphere.GaloVerticalSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPCorners;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPSlabs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPStairs;
import com.blackout.extendedslabs.init.modded.wildbackport.WBPVerticalSlabs;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.function.Function;

public class ESPBlockStateProvider extends BlockStateProvider {
    private final ESPBlockModelProvider espBlockModels;
    public ESPBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
        this.espBlockModels = new ESPBlockModelProvider(gen, modid, exFileHelper) {
            @Override protected void registerModels() {}
        };
    }

    @Override
    protected void registerStatesAndModels() {
        this.slabBlock(ESPSlabs.DIRT_SLAB.get(), mcRL("dirt"), mcRL("dirt"), mcRL("dirt"), mcRL("dirt"));
        this.slabBlock(ESPSlabs.COARSE_DIRT_SLAB.get(), mcRL("coarse_dirt"), mcRL("coarse_dirt"), mcRL("coarse_dirt"), mcRL("coarse_dirt"));
        this.slabBlock(ESPSlabs.ROOTED_DIRT_SLAB.get(), mcRL("rooted_dirt"), mcRL("rooted_dirt"), mcRL("rooted_dirt"), mcRL("rooted_dirt"));
        this.slabBlock(ESPSlabs.PODZOL_SLAB.get(), mcRL("podzol"), espRL("podzol_slab_top"), espRL("podzol_slab"));
        this.slabBlock(ESPSlabs.MYCELIUM_SLAB.get(), mcRL("mycelium"), espRL("mycelium_slab_top"), espRL("mycelium_slab"));
        this.slabBlock(ESPSlabs.TUFF_SLAB.get(), mcRL("tuff"), mcRL("tuff"), mcRL("tuff"), mcRL("tuff"));
        this.slabBlock(ESPSlabs.CALCITE_SLAB.get(), mcRL("calcite"), mcRL("calcite"), mcRL("calcite"), mcRL("calcite"));
        this.slabBlock(ESPSlabs.DRIPSTONE_SLAB.get(), mcRL("dripstone_block"), mcRL("dripstone_block"), mcRL("dripstone_block"), mcRL("dripstone_block"));
        this.fallingSlabBlock(ESPSlabs.SAND_SLAB.get(), mcRL("sand"), mcRL("sand"), mcRL("sand"), mcRL("sand"));
        this.fallingSlabBlock(ESPSlabs.RED_SAND_SLAB.get(), mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"));
        this.fallingSlabBlock(ESPSlabs.GRAVEL_SLAB.get(), mcRL("gravel"), mcRL("gravel"), mcRL("gravel"), mcRL("gravel"));
        this.slabBlock(ESPSlabs.OAK_WOOD_SLAB.get(), mcRL("oak_log"), mcRL("oak_log"), mcRL("oak_log"), mcRL("oak_log"));
        this.slabBlock(ESPSlabs.SPRUCE_WOOD_SLAB.get(), mcRL("spruce_log"), mcRL("spruce_log"), mcRL("spruce_log"), mcRL("spruce_log"));
        this.slabBlock(ESPSlabs.BIRCH_WOOD_SLAB.get(), mcRL("birch_log"), mcRL("birch_log"), mcRL("birch_log"), mcRL("birch_log"));
        this.slabBlock(ESPSlabs.JUNGLE_WOOD_SLAB.get(), mcRL("jungle_log"), mcRL("jungle_log"), mcRL("jungle_log"), mcRL("jungle_log"));
        this.slabBlock(ESPSlabs.ACACIA_WOOD_SLAB.get(), mcRL("acacia_log"), mcRL("acacia_log"), mcRL("acacia_log"), mcRL("acacia_log"));
        this.slabBlock(ESPSlabs.DARK_OAK_WOOD_SLAB.get(), mcRL("dark_oak_log"), mcRL("dark_oak_log"), mcRL("dark_oak_log"), mcRL("dark_oak_log"));
        this.slabBlock(ESPSlabs.CRIMSON_HYPHAE_SLAB.get(), mcRL("crimson_stem"), mcRL("crimson_stem"), mcRL("crimson_stem"), mcRL("crimson_stem"));
        this.slabBlock(ESPSlabs.WARPED_HYPHAE_SLAB.get(), mcRL("warped_stem"), mcRL("warped_stem"), mcRL("warped_stem"), mcRL("warped_stem"));
        this.slabBlock(ESPSlabs.WHITE_WOOL_SLAB.get(), mcRL("white_wool"), mcRL("white_wool"), mcRL("white_wool"), mcRL("white_wool"));
        this.slabBlock(ESPSlabs.ORANGE_WOOL_SLAB.get(), mcRL("orange_wool"), mcRL("orange_wool"), mcRL("orange_wool"), mcRL("orange_wool"));
        this.slabBlock(ESPSlabs.MAGENTA_WOOL_SLAB.get(), mcRL("magenta_wool"), mcRL("magenta_wool"), mcRL("magenta_wool"), mcRL("magenta_wool"));
        this.slabBlock(ESPSlabs.LIGHT_BLUE_WOOL_SLAB.get(), mcRL("light_blue_wool"), mcRL("light_blue_wool"), mcRL("light_blue_wool"), mcRL("light_blue_wool"));
        this.slabBlock(ESPSlabs.YELLOW_WOOL_SLAB.get(), mcRL("yellow_wool"), mcRL("yellow_wool"), mcRL("yellow_wool"), mcRL("yellow_wool"));
        this.slabBlock(ESPSlabs.LIME_WOOL_SLAB.get(), mcRL("lime_wool"), mcRL("lime_wool"), mcRL("lime_wool"), mcRL("lime_wool"));
        this.slabBlock(ESPSlabs.PINK_WOOL_SLAB.get(), mcRL("pink_wool"), mcRL("pink_wool"), mcRL("pink_wool"), mcRL("pink_wool"));
        this.slabBlock(ESPSlabs.GRAY_WOOL_SLAB.get(), mcRL("gray_wool"), mcRL("gray_wool"), mcRL("gray_wool"), mcRL("gray_wool"));
        this.slabBlock(ESPSlabs.LIGHT_GRAY_WOOL_SLAB.get(), mcRL("light_gray_wool"), mcRL("light_gray_wool"), mcRL("light_gray_wool"), mcRL("light_gray_wool"));
        this.slabBlock(ESPSlabs.CYAN_WOOL_SLAB.get(), mcRL("cyan_wool"), mcRL("cyan_wool"), mcRL("cyan_wool"), mcRL("cyan_wool"));
        this.slabBlock(ESPSlabs.PURPLE_WOOL_SLAB.get(), mcRL("purple_wool"), mcRL("purple_wool"), mcRL("purple_wool"), mcRL("purple_wool"));
        this.slabBlock(ESPSlabs.BLUE_WOOL_SLAB.get(), mcRL("blue_wool"), mcRL("blue_wool"), mcRL("blue_wool"), mcRL("blue_wool"));
        this.slabBlock(ESPSlabs.BROWN_WOOL_SLAB.get(), mcRL("brown_wool"), mcRL("brown_wool"), mcRL("brown_wool"), mcRL("brown_wool"));
        this.slabBlock(ESPSlabs.GREEN_WOOL_SLAB.get(), mcRL("green_wool"), mcRL("green_wool"), mcRL("green_wool"), mcRL("green_wool"));
        this.slabBlock(ESPSlabs.RED_WOOL_SLAB.get(), mcRL("red_wool"), mcRL("red_wool"), mcRL("red_wool"), mcRL("red_wool"));
        this.slabBlock(ESPSlabs.BLACK_WOOL_SLAB.get(), mcRL("black_wool"), mcRL("black_wool"), mcRL("black_wool"), mcRL("black_wool"));
        this.fallingSlabBlock(ESPSlabs.WHITE_CONCRETE_POWDER_SLAB.get(), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.ORANGE_CONCRETE_POWDER_SLAB.get(), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.MAGENTA_CONCRETE_POWDER_SLAB.get(), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.YELLOW_CONCRETE_POWDER_SLAB.get(), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.LIME_CONCRETE_POWDER_SLAB.get(), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.PINK_CONCRETE_POWDER_SLAB.get(), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.GRAY_CONCRETE_POWDER_SLAB.get(), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.CYAN_CONCRETE_POWDER_SLAB.get(), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.PURPLE_CONCRETE_POWDER_SLAB.get(), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.BLUE_CONCRETE_POWDER_SLAB.get(), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.BROWN_CONCRETE_POWDER_SLAB.get(), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.GREEN_CONCRETE_POWDER_SLAB.get(), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.RED_CONCRETE_POWDER_SLAB.get(), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"));
        this.fallingSlabBlock(ESPSlabs.BLACK_CONCRETE_POWDER_SLAB.get(), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"));
        this.slabBlock(ESPSlabs.WHITE_CONCRETE_SLAB.get(), mcRL("white_concrete"), mcRL("white_concrete"), mcRL("white_concrete"), mcRL("white_concrete"));
        this.slabBlock(ESPSlabs.ORANGE_CONCRETE_SLAB.get(), mcRL("orange_concrete"), mcRL("orange_concrete"), mcRL("orange_concrete"), mcRL("orange_concrete"));
        this.slabBlock(ESPSlabs.MAGENTA_CONCRETE_SLAB.get(), mcRL("magenta_concrete"), mcRL("magenta_concrete"), mcRL("magenta_concrete"), mcRL("magenta_concrete"));
        this.slabBlock(ESPSlabs.LIGHT_BLUE_CONCRETE_SLAB.get(), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"));
        this.slabBlock(ESPSlabs.YELLOW_CONCRETE_SLAB.get(), mcRL("yellow_concrete"), mcRL("yellow_concrete"), mcRL("yellow_concrete"), mcRL("yellow_concrete"));
        this.slabBlock(ESPSlabs.LIME_CONCRETE_SLAB.get(), mcRL("lime_concrete"), mcRL("lime_concrete"), mcRL("lime_concrete"), mcRL("lime_concrete"));
        this.slabBlock(ESPSlabs.PINK_CONCRETE_SLAB.get(), mcRL("pink_concrete"), mcRL("pink_concrete"), mcRL("pink_concrete"), mcRL("pink_concrete"));
        this.slabBlock(ESPSlabs.GRAY_CONCRETE_SLAB.get(), mcRL("gray_concrete"), mcRL("gray_concrete"), mcRL("gray_concrete"), mcRL("gray_concrete"));
        this.slabBlock(ESPSlabs.LIGHT_GRAY_CONCRETE_SLAB.get(), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"));
        this.slabBlock(ESPSlabs.CYAN_CONCRETE_SLAB.get(), mcRL("cyan_concrete"), mcRL("cyan_concrete"), mcRL("cyan_concrete"), mcRL("cyan_concrete"));
        this.slabBlock(ESPSlabs.PURPLE_CONCRETE_SLAB.get(), mcRL("purple_concrete"), mcRL("purple_concrete"), mcRL("purple_concrete"), mcRL("purple_concrete"));
        this.slabBlock(ESPSlabs.BLUE_CONCRETE_SLAB.get(), mcRL("blue_concrete"), mcRL("blue_concrete"), mcRL("blue_concrete"), mcRL("blue_concrete"));
        this.slabBlock(ESPSlabs.BROWN_CONCRETE_SLAB.get(), mcRL("brown_concrete"), mcRL("brown_concrete"), mcRL("brown_concrete"), mcRL("brown_concrete"));
        this.slabBlock(ESPSlabs.GREEN_CONCRETE_SLAB.get(), mcRL("green_concrete"), mcRL("green_concrete"), mcRL("green_concrete"), mcRL("green_concrete"));
        this.slabBlock(ESPSlabs.RED_CONCRETE_SLAB.get(), mcRL("red_concrete"), mcRL("red_concrete"), mcRL("red_concrete"), mcRL("red_concrete"));
        this.slabBlock(ESPSlabs.BLACK_CONCRETE_SLAB.get(), mcRL("black_concrete"), mcRL("black_concrete"), mcRL("black_concrete"), mcRL("black_concrete"));
        this.slabBlock(ESPSlabs.CLAY_SLAB.get(), mcRL("clay"), mcRL("clay"), mcRL("clay"), mcRL("clay"));
        this.slabBlock(ESPSlabs.TERRACOTTA_SLAB.get(), mcRL("terracotta"), mcRL("terracotta"), mcRL("terracotta"), mcRL("terracotta"));
        this.slabBlock(ESPSlabs.WHITE_TERRACOTTA_SLAB.get(), mcRL("white_terracotta"), mcRL("white_terracotta"), mcRL("white_terracotta"), mcRL("white_terracotta"));
        this.slabBlock(ESPSlabs.ORANGE_TERRACOTTA_SLAB.get(), mcRL("orange_terracotta"), mcRL("orange_terracotta"), mcRL("orange_terracotta"), mcRL("orange_terracotta"));
        this.slabBlock(ESPSlabs.MAGENTA_TERRACOTTA_SLAB.get(), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"));
        this.slabBlock(ESPSlabs.LIGHT_BLUE_TERRACOTTA_SLAB.get(), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"));
        this.slabBlock(ESPSlabs.YELLOW_TERRACOTTA_SLAB.get(), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"));
        this.slabBlock(ESPSlabs.LIME_TERRACOTTA_SLAB.get(), mcRL("lime_terracotta"), mcRL("lime_terracotta"), mcRL("lime_terracotta"), mcRL("lime_terracotta"));
        this.slabBlock(ESPSlabs.PINK_TERRACOTTA_SLAB.get(), mcRL("pink_terracotta"), mcRL("pink_terracotta"), mcRL("pink_terracotta"), mcRL("pink_terracotta"));
        this.slabBlock(ESPSlabs.GRAY_TERRACOTTA_SLAB.get(), mcRL("gray_terracotta"), mcRL("gray_terracotta"), mcRL("gray_terracotta"), mcRL("gray_terracotta"));
        this.slabBlock(ESPSlabs.LIGHT_GRAY_TERRACOTTA_SLAB.get(), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"));
        this.slabBlock(ESPSlabs.CYAN_TERRACOTTA_SLAB.get(), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"));
        this.slabBlock(ESPSlabs.PURPLE_TERRACOTTA_SLAB.get(), mcRL("purple_terracotta"), mcRL("purple_terracotta"), mcRL("purple_terracotta"), mcRL("purple_terracotta"));
        this.slabBlock(ESPSlabs.BLUE_TERRACOTTA_SLAB.get(), mcRL("blue_terracotta"), mcRL("blue_terracotta"), mcRL("blue_terracotta"), mcRL("blue_terracotta"));
        this.slabBlock(ESPSlabs.BROWN_TERRACOTTA_SLAB.get(), mcRL("brown_terracotta"), mcRL("brown_terracotta"), mcRL("brown_terracotta"), mcRL("brown_terracotta"));
        this.slabBlock(ESPSlabs.GREEN_TERRACOTTA_SLAB.get(), mcRL("green_terracotta"), mcRL("green_terracotta"), mcRL("green_terracotta"), mcRL("green_terracotta"));
        this.slabBlock(ESPSlabs.RED_TERRACOTTA_SLAB.get(), mcRL("red_terracotta"), mcRL("red_terracotta"), mcRL("red_terracotta"), mcRL("red_terracotta"));
        this.slabBlock(ESPSlabs.BLACK_TERRACOTTA_SLAB.get(), mcRL("black_terracotta"), mcRL("black_terracotta"), mcRL("black_terracotta"), mcRL("black_terracotta"));
        this.slabBlock(ESPSlabs.WHITE_GLAZED_TERRACOTTA_SLAB.get(), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"));
        this.slabBlock(ESPSlabs.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"));
        this.slabBlock(ESPSlabs.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"));
        this.slabBlock(ESPSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"));
        this.slabBlock(ESPSlabs.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"));
        this.slabBlock(ESPSlabs.LIME_GLAZED_TERRACOTTA_SLAB.get(), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"));
        this.slabBlock(ESPSlabs.PINK_GLAZED_TERRACOTTA_SLAB.get(), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"));
        this.slabBlock(ESPSlabs.GRAY_GLAZED_TERRACOTTA_SLAB.get(), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"));
        this.slabBlock(ESPSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"));
        this.slabBlock(ESPSlabs.CYAN_GLAZED_TERRACOTTA_SLAB.get(), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"));
        this.slabBlock(ESPSlabs.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"));
        this.slabBlock(ESPSlabs.BLUE_GLAZED_TERRACOTTA_SLAB.get(), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"));
        this.slabBlock(ESPSlabs.BROWN_GLAZED_TERRACOTTA_SLAB.get(), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"));
        this.slabBlock(ESPSlabs.GREEN_GLAZED_TERRACOTTA_SLAB.get(), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"));
        this.slabBlock(ESPSlabs.RED_GLAZED_TERRACOTTA_SLAB.get(), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"));
        this.slabBlock(ESPSlabs.BLACK_GLAZED_TERRACOTTA_SLAB.get(), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"));
        this.slabBlock(ESPSlabs.GLASS_SLAB.get(), mcRL("glass"), mcRL("glass"), mcRL("glass"), mcRL("glass"));
        this.slabBlock(ESPSlabs.WHITE_STAINED_GLASS_SLAB.get(), mcRL("white_stained_glass"), mcRL("white_stained_glass"), mcRL("white_stained_glass"), mcRL("white_stained_glass"));
        this.slabBlock(ESPSlabs.ORANGE_STAINED_GLASS_SLAB.get(), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"));
        this.slabBlock(ESPSlabs.MAGENTA_STAINED_GLASS_SLAB.get(), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"));
        this.slabBlock(ESPSlabs.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"));
        this.slabBlock(ESPSlabs.YELLOW_STAINED_GLASS_SLAB.get(), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"));
        this.slabBlock(ESPSlabs.LIME_STAINED_GLASS_SLAB.get(), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"));
        this.slabBlock(ESPSlabs.PINK_STAINED_GLASS_SLAB.get(), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"));
        this.slabBlock(ESPSlabs.GRAY_STAINED_GLASS_SLAB.get(), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"));
        this.slabBlock(ESPSlabs.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"));
        this.slabBlock(ESPSlabs.CYAN_STAINED_GLASS_SLAB.get(), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"));
        this.slabBlock(ESPSlabs.PURPLE_STAINED_GLASS_SLAB.get(), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"));
        this.slabBlock(ESPSlabs.BLUE_STAINED_GLASS_SLAB.get(), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"));
        this.slabBlock(ESPSlabs.BROWN_STAINED_GLASS_SLAB.get(), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"));
        this.slabBlock(ESPSlabs.GREEN_STAINED_GLASS_SLAB.get(), mcRL("green_stained_glass"), mcRL("green_stained_glass"), mcRL("green_stained_glass"), mcRL("green_stained_glass"));
        this.slabBlock(ESPSlabs.RED_STAINED_GLASS_SLAB.get(), mcRL("red_stained_glass"), mcRL("red_stained_glass"), mcRL("red_stained_glass"), mcRL("red_stained_glass"));
        this.slabBlock(ESPSlabs.BLACK_STAINED_GLASS_SLAB.get(), mcRL("black_stained_glass"), mcRL("black_stained_glass"), mcRL("black_stained_glass"), mcRL("black_stained_glass"));
        this.slabBlock(ESPSlabs.NETHERRACK_SLAB.get(), mcRL("netherrack"), mcRL("netherrack"), mcRL("netherrack"), mcRL("netherrack"));
        this.slabBlock(ESPSlabs.CRIMSON_NYLIUM_SLAB.get(), mcRL("crimson_nylium"), espRL("crimson_nylium_slab_top"), espRL("crimson_nylium_slab"));
        this.slabBlock(ESPSlabs.WARPED_NYLIUM_SLAB.get(), mcRL("warped_nylium"), espRL("warped_nylium_slab_top"), espRL("warped_nylium_slab"));
        this.slabBlock(ESPSlabs.END_STONE_SLAB.get(), mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.DIRT_VERTICAL.get(), mcRL("dirt"), mcRL("dirt"), mcRL("dirt"));
        this.verticalSlabBlock(ESPVerticalSlabs.COARSE_DIRT_VERTICAL.get(), mcRL("coarse_dirt"), mcRL("coarse_dirt"), mcRL("coarse_dirt"));
        this.verticalSlabBlock(ESPVerticalSlabs.ROOTED_DIRT_VERTICAL.get(), mcRL("rooted_dirt"), mcRL("rooted_dirt"), mcRL("rooted_dirt"));
        this.verticalSlabBlock(ESPVerticalSlabs.PODZOL_VERTICAL.get(), mcRL("podzol_side"), mcRL("dirt"), mcRL("podzol_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.MYCELIUM_VERTICAL.get(), mcRL("mycelium_side"), mcRL("dirt"), mcRL("mycelium_top"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.SAND_VERTICAL.get(), mcRL("sand"), mcRL("sand"), mcRL("sand"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.RED_SAND_VERTICAL.get(), mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GRAVEL_VERTICAL.get(), mcRL("gravel"), mcRL("gravel"), mcRL("gravel"));
        this.verticalSlabBlock(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get(), mcRL("cobblestone"), mcRL("cobblestone"), mcRL("cobblestone"));
        this.verticalSlabBlock(ESPVerticalSlabs.STONE_VERTICAL.get(), mcRL("stone"), mcRL("stone"), mcRL("stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.STONE_BRICK_VERTICAL.get(), mcRL("stone_bricks"), mcRL("stone_bricks"), mcRL("stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get(), mcRL("smooth_stone"), mcRL("smooth_stone"), mcRL("smooth_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get(), mcRL("mossy_cobblestone"), mcRL("mossy_cobblestone"), mcRL("mossy_cobblestone"));
        this.verticalSlabBlock(ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get(), mcRL("mossy_stone_bricks"), mcRL("mossy_stone_bricks"), mcRL("mossy_stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.ANDESITE_VERTICAL.get(), mcRL("andesite"), mcRL("andesite"), mcRL("andesite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(), mcRL("polished_andesite"), mcRL("andesite"), mcRL("andesite"));
        this.verticalSlabBlock(ESPVerticalSlabs.DIORITE_VERTICAL.get(), mcRL("diorite"), mcRL("diorite"), mcRL("diorite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(), mcRL("polished_diorite"), mcRL("polished_diorite"), mcRL("polished_diorite"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRANITE_VERTICAL.get(), mcRL("granite"), mcRL("granite"), mcRL("granite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(), mcRL("polished_granite"), mcRL("polished_granite"), mcRL("polished_granite"));
        this.verticalSlabBlock(ESPVerticalSlabs.BRICK_VERTICAL.get(), mcRL("bricks"), mcRL("bricks"), mcRL("bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.TUFF_VERTICAL.get(), mcRL("tuff"), mcRL("tuff"), mcRL("tuff"));
        this.verticalSlabBlock(ESPVerticalSlabs.CALCITE_VERTICAL.get(), mcRL("calcite"), mcRL("calcite"), mcRL("calcite"));
        this.verticalSlabBlock(ESPVerticalSlabs.DRIPSTONE_VERTICAL.get(), mcRL("dripstone_block"), mcRL("dripstone_block"), mcRL("dripstone_block"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(), mcRL("white_wool"), mcRL("white_wool"), mcRL("white_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(), mcRL("orange_wool"), mcRL("orange_wool"), mcRL("orange_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(), mcRL("magenta_wool"), mcRL("magenta_wool"), mcRL("magenta_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(), mcRL("light_blue_wool"), mcRL("light_blue_wool"), mcRL("light_blue_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), mcRL("yellow_wool"), mcRL("yellow_wool"), mcRL("yellow_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(), mcRL("lime_wool"), mcRL("lime_wool"), mcRL("lime_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), mcRL("pink_wool"), mcRL("pink_wool"), mcRL("pink_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(), mcRL("gray_wool"), mcRL("gray_wool"), mcRL("gray_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), mcRL("light_gray_wool"), mcRL("light_gray_wool"), mcRL("light_gray_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(), mcRL("cyan_wool"), mcRL("cyan_wool"), mcRL("cyan_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), mcRL("purple_wool"), mcRL("purple_wool"), mcRL("purple_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(), mcRL("blue_wool"), mcRL("blue_wool"), mcRL("blue_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(), mcRL("brown_wool"), mcRL("brown_wool"), mcRL("brown_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(), mcRL("green_wool"), mcRL("green_wool"), mcRL("green_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), mcRL("red_wool"), mcRL("red_wool"), mcRL("red_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get(), mcRL("black_wool"), mcRL("black_wool"), mcRL("black_wool"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get(), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get(), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get(), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get(), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get(), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get(), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get(), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get(), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get(), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get(), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get(), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get(), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get(), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get(), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get(), mcRL("white_concrete"), mcRL("white_concrete"), mcRL("white_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get(), mcRL("orange_concrete"), mcRL("orange_concrete"), mcRL("orange_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(), mcRL("magenta_concrete"), mcRL("magenta_concrete"), mcRL("magenta_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get(), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get(), mcRL("yellow_concrete"), mcRL("yellow_concrete"), mcRL("yellow_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get(), mcRL("lime_concrete"), mcRL("lime_concrete"), mcRL("lime_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), mcRL("pink_concrete"), mcRL("pink_concrete"), mcRL("pink_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get(), mcRL("gray_concrete"), mcRL("gray_concrete"), mcRL("gray_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get(), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get(), mcRL("cyan_concrete"), mcRL("cyan_concrete"), mcRL("cyan_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get(), mcRL("purple_concrete"), mcRL("purple_concrete"), mcRL("purple_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get(), mcRL("blue_concrete"), mcRL("blue_concrete"), mcRL("blue_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get(), mcRL("brown_concrete"), mcRL("brown_concrete"), mcRL("brown_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get(), mcRL("green_concrete"), mcRL("green_concrete"), mcRL("green_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get(), mcRL("red_concrete"), mcRL("red_concrete"), mcRL("red_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get(), mcRL("black_concrete"), mcRL("black_concrete"), mcRL("black_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.CLAY_VERTICAL.get(), mcRL("clay"), mcRL("clay"), mcRL("clay"));
        this.verticalSlabBlock(ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(), mcRL("terracotta"), mcRL("terracotta"), mcRL("terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(), mcRL("white_terracotta"), mcRL("white_terracotta"), mcRL("white_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(), mcRL("orange_terracotta"), mcRL("orange_terracotta"), mcRL("orange_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(), mcRL("lime_terracotta"), mcRL("lime_terracotta"), mcRL("lime_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(), mcRL("pink_terracotta"), mcRL("pink_terracotta"), mcRL("pink_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(), mcRL("gray_terracotta"), mcRL("gray_terracotta"), mcRL("gray_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(), mcRL("purple_terracotta"), mcRL("purple_terracotta"), mcRL("purple_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(), mcRL("blue_terracotta"), mcRL("blue_terracotta"), mcRL("blue_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(), mcRL("brown_terracotta"), mcRL("brown_terracotta"), mcRL("brown_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(), mcRL("green_terracotta"), mcRL("green_terracotta"), mcRL("green_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(), mcRL("red_terracotta"), mcRL("red_terracotta"), mcRL("red_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(), mcRL("black_terracotta"), mcRL("black_terracotta"), mcRL("black_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get(), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GLASS_VERTICAL.get(), mcRL("glass"), mcRL("glass"), mcRL("glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(), mcRL("white_stained_glass"), mcRL("white_stained_glass"), mcRL("white_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), mcRL("green_stained_glass"), mcRL("green_stained_glass"), mcRL("green_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), mcRL("red_stained_glass"), mcRL("red_stained_glass"), mcRL("red_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), mcRL("black_stained_glass"), mcRL("black_stained_glass"), mcRL("black_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.SANDSTONE_VERTICAL.get(), mcRL("sandstone"), mcRL("sandstone_bottom"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get(), mcRL("sandstone_top"), mcRL("sandstone_top"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), mcRL("cut_sandstone"), mcRL("sandstone_top"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get(), mcRL("red_sandstone"), mcRL("red_sandstone_bottom"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get(), mcRL("red_sandstone_top"), mcRL("red_sandstone_top"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(), mcRL("cut_red_sandstone"), mcRL("red_sandstone_top"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get(), mcRL("cobbled_deepslate"), mcRL("cobbled_deepslate"), mcRL("cobbled_deepslate"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get(), mcRL("polished_deepslate"), mcRL("polished_deepslate"), mcRL("polished_deepslate"));
        this.verticalSlabBlock(ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get(), mcRL("deepslate_bricks"), mcRL("deepslate_bricks"), mcRL("deepslate_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get(), mcRL("deepslate_tiles"), mcRL("deepslate_tiles"), mcRL("deepslate_tiles"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get(), mcRL("blackstone"), mcRL("blackstone"), mcRL("blackstone"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get(), mcRL("polished_blackstone"), mcRL("polished_blackstone"), mcRL("polished_blackstone"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get(), mcRL("polished_blackstone_bricks"), mcRL("polished_blackstone_bricks"), mcRL("polished_blackstone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.NETHERRACK_VERTICAL.get(), mcRL("netherrack"), mcRL("netherrack"), mcRL("netherrack"));
        this.verticalSlabBlock(ESPVerticalSlabs.CRIMSON_NYLIUM_VERTICAL.get(), mcRL("crimson_nylium_side"), mcRL("netherrack"), mcRL("crimson_nylium"));
        this.verticalSlabBlock(ESPVerticalSlabs.WARPED_NYLIUM_VERTICAL.get(), mcRL("warped_nylium_side"), mcRL("netherrack"), mcRL("warped_nylium"));
        this.verticalSlabBlock(ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get(), mcRL("nether_bricks"), mcRL("nether_bricks"), mcRL("nether_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get(), mcRL("red_nether_bricks"), mcRL("red_nether_bricks"), mcRL("red_nether_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.QUARTZ_VERTICAL.get(), mcRL("quartz_block_side"), mcRL("quartz_block_top"), mcRL("quartz_block_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get(), mcRL("quartz_block_bottom"), mcRL("quartz_block_bottom"), mcRL("quartz_block_bottom"));
        this.verticalSlabBlock(ESPVerticalSlabs.END_STONE_VERTICAL.get(), mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get(), mcRL("end_stone_bricks"), mcRL("end_stone_bricks"), mcRL("end_stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPUR_VERTICAL.get(), mcRL("purpur_block"), mcRL("purpur_block"), mcRL("purpur_block"));
        this.verticalSlabBlock(ESPVerticalSlabs.PRISMARINE_VERTICAL.get(), mcRL("prismarine"), mcRL("prismarine"), mcRL("prismarine"));
        this.verticalSlabBlock(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get(), mcRL("prismarine_bricks"), mcRL("prismarine_bricks"), mcRL("prismarine_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get(), mcRL("dark_prismarine"), mcRL("dark_prismarine"), mcRL("dark_prismarine"));
        this.verticalSlabBlock(ESPVerticalSlabs.OAK_VERTICAL.get(), mcRL("oak_planks"), mcRL("oak_planks"), mcRL("oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.SPRUCE_VERTICAL.get(), mcRL("spruce_planks"), mcRL("spruce_planks"), mcRL("spruce_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.BIRCH_VERTICAL.get(), mcRL("birch_planks"), mcRL("birch_planks"), mcRL("birch_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.JUNGLE_VERTICAL.get(), mcRL("jungle_planks"), mcRL("jungle_planks"), mcRL("jungle_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.ACACIA_VERTICAL.get(), mcRL("acacia_planks"), mcRL("acacia_planks"), mcRL("acacia_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DARK_OAK_VERTICAL.get(), mcRL("dark_oak_planks"), mcRL("dark_oak_planks"), mcRL("dark_oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.CRIMSON_VERTICAL.get(), mcRL("crimson_planks"), mcRL("crimson_planks"), mcRL("crimson_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.WARPED_VERTICAL.get(), mcRL("warped_planks"), mcRL("warped_planks"), mcRL("warped_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.OAK_WOOD_VERTICAL.get(), mcRL("oak_log"), mcRL("oak_log"), mcRL("oak_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.SPRUCE_WOOD_VERTICAL.get(), mcRL("spruce_log"), mcRL("spruce_log"), mcRL("spruce_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.BIRCH_WOOD_VERTICAL.get(), mcRL("birch_log"), mcRL("birch_log"), mcRL("birch_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.JUNGLE_WOOD_VERTICAL.get(), mcRL("jungle_log"), mcRL("jungle_log"), mcRL("jungle_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.ACACIA_WOOD_VERTICAL.get(), mcRL("acacia_log"), mcRL("acacia_log"), mcRL("acacia_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.DARK_OAK_WOOD_VERTICAL.get(), mcRL("dark_oak_log"), mcRL("dark_oak_log"), mcRL("dark_oak_log"));
        this.verticalSlabBlock(ESPVerticalSlabs.CRIMSON_HYPHAE_VERTICAL.get(), mcRL("crimson_stem"), mcRL("crimson_stem"), mcRL("crimson_stem"));
        this.verticalSlabBlock(ESPVerticalSlabs.WARPED_HYPHAE_VERTICAL.get(), mcRL("warped_stem"), mcRL("warped_stem"), mcRL("warped_stem"));
        this.verticalSlabBlock(ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get(), mcRL("oak_planks"), mcRL("oak_planks"), mcRL("oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(), mcRL("cut_copper"), mcRL("cut_copper"), mcRL("cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get(), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get(), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get(), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get(), mcRL("cut_copper"), mcRL("cut_copper"), mcRL("cut_copper"));
        this.stairsBlock(ESPStairs.TUFF_STAIRS.get(), mcRL("tuff"));
        this.stairsBlock(ESPStairs.CALCITE_STAIRS.get(), mcRL("calcite"));
        this.stairsBlock(ESPStairs.DRIPSTONE_STAIRS.get(), mcRL("dripstone_block"));
        this.stairsBlock(ESPStairs.DIRT_STAIRS.get(), mcRL("dirt"));
        this.stairsBlock(ESPStairs.COARSE_DIRT_STAIRS.get(), mcRL("coarse_dirt"));
        this.stairsBlock(ESPStairs.ROOTED_DIRT_STAIRS.get(), mcRL("rooted_dirt"));
        this.stairsBlock(ESPStairs.NETHERRACK_STAIRS.get(), mcRL("netherrack"));
        this.stairsBlock(ESPStairs.END_STONE_STAIRS.get(), mcRL("end_stone"));
        this.stairsBlock(ESPStairs.OAK_WOOD_STAIRS.get(), mcRL("oak_log"));
        this.stairsBlock(ESPStairs.SPRUCE_WOOD_STAIRS.get(), mcRL("spruce_log"));
        this.stairsBlock(ESPStairs.BIRCH_WOOD_STAIRS.get(), mcRL("birch_log"));
        this.stairsBlock(ESPStairs.JUNGLE_WOOD_STAIRS.get(), mcRL("jungle_log"));
        this.stairsBlock(ESPStairs.ACACIA_WOOD_STAIRS.get(), mcRL("acacia_log"));
        this.stairsBlock(ESPStairs.DARK_OAK_WOOD_STAIRS.get(), mcRL("dark_oak_log"));
        this.stairsBlock(ESPStairs.CRIMSON_HYPHAE_STAIRS.get(), mcRL("crimson_stem"));
        this.stairsBlock(ESPStairs.WARPED_HYPHAE_STAIRS.get(), mcRL("warped_stem"));
        this.cornerBlock(ESPCorners.STONE_CORNER.get(), mcRL("stone"));
        this.cornerBlock(ESPCorners.COBBLESTONE_CORNER.get(), mcRL("cobblestone"));
        this.cornerBlock(ESPCorners.STONE_BRICK_CORNER.get(), mcRL("stone_bricks"));
        this.cornerBlock(ESPCorners.ANDESITE_CORNER.get(), mcRL("andesite"));
        this.cornerBlock(ESPCorners.POLISHED_ANDESITE_CORNER.get(), mcRL("polished_andesite"));
        this.cornerBlock(ESPCorners.DIORITE_CORNER.get(), mcRL("diorite"));
        this.cornerBlock(ESPCorners.POLISHED_DIORITE_CORNER.get(), mcRL("polished_diorite"));
        this.cornerBlock(ESPCorners.GRANITE_CORNER.get(), mcRL("granite"));
        this.cornerBlock(ESPCorners.POLISHED_GRANITE_CORNER.get(), mcRL("polished_granite"));
        this.cornerBlock(ESPCorners.TUFF_CORNER.get(), mcRL("tuff"));
        this.cornerBlock(ESPCorners.CALCITE_CORNER.get(), mcRL("calcite"));
        this.cornerBlock(ESPCorners.DRIPSTONE_CORNER.get(), mcRL("dripstone_block"));
        this.cornerBlock(ESPCorners.ACACIA_CORNER.get(), mcRL("acacia_planks"));
        this.cornerBlock(ESPCorners.BIRCH_CORNER.get(), mcRL("birch_planks"));
        this.cornerBlock(ESPCorners.CRIMSON_CORNER.get(), mcRL("crimson_planks"));
        this.cornerBlock(ESPCorners.DARK_OAK_CORNER.get(), mcRL("dark_oak_planks"));
        this.cornerBlock(ESPCorners.JUNGLE_CORNER.get(), mcRL("jungle_planks"));
        this.cornerBlock(ESPCorners.OAK_CORNER.get(), mcRL("oak_planks"));
        this.cornerBlock(ESPCorners.SPRUCE_CORNER.get(), mcRL("spruce_planks"));
        this.cornerBlock(ESPCorners.WARPED_CORNER.get(), mcRL("warped_planks"));
        this.cornerBlock(ESPCorners.ACACIA_WOOD_CORNER.get(), mcRL("acacia_log"));
        this.cornerBlock(ESPCorners.BIRCH_WOOD_CORNER.get(), mcRL("birch_log"));
        this.cornerBlock(ESPCorners.CRIMSON_HYPHAE_CORNER.get(), mcRL("crimson_stem"));
        this.cornerBlock(ESPCorners.DARK_OAK_WOOD_CORNER.get(), mcRL("dark_oak_log"));
        this.cornerBlock(ESPCorners.JUNGLE_WOOD_CORNER.get(), mcRL("jungle_log"));
        this.cornerBlock(ESPCorners.OAK_WOOD_CORNER.get(), mcRL("oak_log"));
        this.cornerBlock(ESPCorners.SPRUCE_WOOD_CORNER.get(), mcRL("spruce_log"));
        this.cornerBlock(ESPCorners.WARPED_HYPHAE_CORNER.get(), mcRL("warped_stem"));
        this.cornerBlock(ESPCorners.NETHERRACK_CORNER.get(), mcRL("netherrack"));
        this.cornerBlock(ESPCorners.NETHER_BRICK_CORNER.get(), mcRL("nether_bricks"));
        this.cornerBlock(ESPCorners.RED_NETHER_BRICK_CORNER.get(), mcRL("red_nether_bricks"));
        this.cornerBlock(ESPCorners.BLACKSTONE_CORNER.get(), mcRL("blackstone"));
        this.cornerBlock(ESPCorners.POLISHED_BLACKSTONE_CORNER.get(), mcRL("polished_blackstone"));
        this.cornerBlock(ESPCorners.POLISHED_BLACKSTONE_BRICK_CORNER.get(), mcRL("polished_blackstone_bricks"));
        this.cornerBlock(ESPCorners.END_STONE_CORNER.get(), mcRL("end_stone"));
        this.cornerBlock(ESPCorners.END_STONE_BRICK_CORNER.get(), mcRL("end_stone_bricks"));
        this.cornerBlock(ESPCorners.PURPUR_CORNER.get(), mcRL("purpur_block"));

        this.slabBlock(WBPSlabs.MUD_SLAB.get(), wbpRL("mud"), wbpRL("mud"), wbpRL("mud"), wbpRL("mud"));
        this.slabBlock(WBPSlabs.PACKED_MUD_SLAB.get(), wbpRL("packed_mud"), wbpRL("packed_mud"), wbpRL("packed_mud"), wbpRL("packed_mud"));
        this.slabBlock(WBPSlabs.MANGROVE_WOOD_SLAB.get(), wbpRL("mangrove_log"), wbpRL("mangrove_log"), wbpRL("mangrove_log"), wbpRL("mangrove_log"));
        this.verticalSlabBlock(WBPVerticalSlabs.MUD_VERTICAL.get(), wbpRL("mud"), wbpRL("mud"), wbpRL("mud"));
        this.verticalSlabBlock(WBPVerticalSlabs.PACKED_MUD_VERTICAL.get(), wbpRL("packed_mud"), wbpRL("packed_mud"), wbpRL("packed_mud"));
        this.verticalSlabBlock(WBPVerticalSlabs.MUD_BRICK_VERTICAL.get(), wbpRL("mud_bricks"), wbpRL("mud_bricks"), wbpRL("mud_bricks"));
        this.verticalSlabBlock(WBPVerticalSlabs.MANGROVE_VERTICAL.get(), wbpRL("mangrove_planks"), wbpRL("mangrove_planks"), wbpRL("mangrove_planks"));
        this.verticalSlabBlock(WBPVerticalSlabs.MANGROVE_WOOD_VERTICAL.get(), wbpRL("mangrove_log"), wbpRL("mangrove_log"), wbpRL("mangrove_log"));
        this.stairsBlock(WBPStairs.MUD_STAIRS.get(), wbpRL("mud"));
        this.stairsBlock(WBPStairs.PACKED_MUD_STAIRS.get(), wbpRL("packed_mud"));
        this.stairsBlock(WBPStairs.MANGROVE_WOOD_STAIRS.get(), wbpRL("mangrove_log"));
        this.cornerBlock(WBPCorners.MUD_CORNER.get(), wbpRL("mud"));
        this.cornerBlock(WBPCorners.PACKED_MUD_CORNER.get(), wbpRL("packed_mud"));
        this.cornerBlock(WBPCorners.MUD_BRICK_CORNER.get(), wbpRL("mud_bricks"));
        this.cornerBlock(WBPCorners.MANGROVE_CORNER.get(), wbpRL("mangrove_planks"));
        this.cornerBlock(WBPCorners.MANGROVE_WOOD_CORNER.get(), wbpRL("mangrove_log"));

        this.verticalSlabBlock(GaloVerticalSlabs.AMETHYST_VERTICAL.get(), mcRL("amethyst_block"), mcRL("amethyst_block"), mcRL("amethyst_block"));
        this.verticalSlabBlock(GaloVerticalSlabs.ALLURITE_VERTICAL.get(), galoRL("allurite_block"), galoRL("allurite_block"), galoRL("allurite_block"));
        this.verticalSlabBlock(GaloVerticalSlabs.LUMIERE_VERTICAL.get(), galoRL("lumiere_block"), galoRL("lumiere_block"), galoRL("lumiere_block"));
        this.verticalSlabBlock(GaloVerticalSlabs.SMOOTH_AMETHYST_VERTICAL.get(), galoRL("smooth_amethyst"), galoRL("smooth_amethyst"), galoRL("smooth_amethyst"));
        this.verticalSlabBlock(GaloVerticalSlabs.SMOOTH_ALLURITE_VERTICAL.get(), galoRL("smooth_allurite"), galoRL("smooth_allurite"), galoRL("smooth_allurite"));
        this.verticalSlabBlock(GaloVerticalSlabs.SMOOTH_LUMIERE_VERTICAL.get(), galoRL("smooth_lumiere"), galoRL("smooth_lumiere"), galoRL("smooth_lumiere"));
        this.verticalSlabBlock(GaloVerticalSlabs.AMETHYST_BRICK_VERTICAL.get(), galoRL("amethyst_bricks"), galoRL("amethyst_bricks"), galoRL("amethyst_bricks"));
        this.verticalSlabBlock(GaloVerticalSlabs.ALLURITE_BRICK_VERTICAL.get(), galoRL("allurite_bricks"), galoRL("allurite_bricks"), galoRL("allurite_bricks"));
        this.verticalSlabBlock(GaloVerticalSlabs.LUMIERE_BRICK_VERTICAL.get(), galoRL("lumiere_bricks"), galoRL("lumiere_bricks"), galoRL("lumiere_bricks"));
        this.cornerBlock(GaloCorners.AMETHYST_CORNER.get(), mcRL("amethyst_block"));
        this.cornerBlock(GaloCorners.ALLURITE_CORNER.get(), galoRL("allurite_block"));
        this.cornerBlock(GaloCorners.LUMIERE_CORNER.get(), galoRL("lumiere_block"));
        this.cornerBlock(GaloCorners.SMOOTH_AMETHYST_CORNER.get(), galoRL("smooth_amethyst"));
        this.cornerBlock(GaloCorners.SMOOTH_ALLURITE_CORNER.get(), galoRL("smooth_allurite"));
        this.cornerBlock(GaloCorners.SMOOTH_LUMIERE_CORNER.get(), galoRL("smooth_lumiere"));
        this.cornerBlock(GaloCorners.AMETHYST_BRICK_CORNER.get(), galoRL("amethyst_bricks"));
        this.cornerBlock(GaloCorners.ALLURITE_BRICK_CORNER.get(), galoRL("allurite_bricks"));
        this.cornerBlock(GaloCorners.LUMIERE_BRICK_CORNER.get(), galoRL("lumiere_bricks"));

        this.slabBlock(DDSlabs.PETRIFIED_WOOD_SLAB.get(), ddRL("petrified_log"), ddRL("petrified_log"), ddRL("petrified_log"), ddRL("petrified_log"));
        this.verticalSlabBlock(DDVerticalSlabs.PETRIFIED_VERTICAL.get(), ddRL("petrified_planks"), ddRL("petrified_planks"), ddRL("petrified_planks"));
        this.verticalSlabBlock(DDVerticalSlabs.PETRIFIED_WOOD_VERTICAL.get(), ddRL("petrified_log"), ddRL("petrified_log"), ddRL("petrified_log"));
        this.verticalSlabBlock(DDVerticalSlabs.SHALE_VERTICAL.get(), ddRL("shale"), ddRL("shale"), ddRL("shale"));
        this.verticalSlabBlock(DDVerticalSlabs.POLISHED_SHALE_VERTICAL.get(), ddRL("polished_shale"), ddRL("polished_shale"), ddRL("polished_shale"));
        this.verticalSlabBlock(DDVerticalSlabs.SHALE_BRICK_VERTICAL.get(), ddRL("shale_bricks"), ddRL("shale_bricks"), ddRL("shale_bricks"));
        this.verticalSlabBlock(DDVerticalSlabs.ARIDROCK_VERTICAL.get(), ddRL("aridrock"), ddRL("aridrock"), ddRL("aridrock"));
        this.verticalSlabBlock(DDVerticalSlabs.POLISHED_ARIDROCK_VERTICAL.get(), ddRL("polished_aridrock"), ddRL("polished_aridrock"), ddRL("polished_aridrock"));
        this.verticalSlabBlock(DDVerticalSlabs.ARIDROCK_BRICK_VERTICAL.get(), ddRL("aridrock_bricks"), ddRL("aridrock_bricks"), ddRL("aridrock_bricks"));
        this.verticalSlabBlock(DDVerticalSlabs.LIMESTONE_VERTICAL.get(), ddRL("limestone"), ddRL("limestone"), ddRL("limestone"));
        this.verticalSlabBlock(DDVerticalSlabs.POLISHED_LIMESTONE_VERTICAL.get(), ddRL("polished_limestone"), ddRL("polished_limestone"), ddRL("polished_limestone"));
        this.verticalSlabBlock(DDVerticalSlabs.LIMESTONE_BRICK_VERTICAL.get(), ddRL("limestone_bricks"), ddRL("limestone_bricks"), ddRL("limestone_bricks"));
        this.verticalSlabBlock(DDVerticalSlabs.GRIMESTONE_VERTICAL.get(), ddRL("grimestone"), ddRL("grimestone"), ddRL("grimestone"));
        this.verticalSlabBlock(DDVerticalSlabs.POLISHED_GRIMESTONE_VERTICAL.get(), ddRL("polished_grimestone"), ddRL("polished_grimestone"), ddRL("polished_grimestone"));
        this.verticalSlabBlock(DDVerticalSlabs.GRIMESTONE_BRICK_VERTICAL.get(), ddRL("grimestone_bricks"), ddRL("grimestone_bricks"), ddRL("grimestone_bricks"));
        this.stairsBlock(DDStairs.PETRIFIED_WOOD_STAIRS.get(), ddRL("petrified_log"));
        this.cornerBlock(DDCorners.PETRIFIED_CORNER.get(), ddRL("petrified_planks"));
        this.cornerBlock(DDCorners.PETRIFIED_WOOD_CORNER.get(), ddRL("petrified_log"));
        this.cornerBlock(DDCorners.SHALE_CORNER.get(), ddRL("shale"));
        this.cornerBlock(DDCorners.POLISHED_SHALE_CORNER.get(), ddRL("polished_shale"));
        this.cornerBlock(DDCorners.SHALE_BRICK_CORNER.get(), ddRL("shale_bricks"));
        this.cornerBlock(DDCorners.ARIDROCK_CORNER.get(), ddRL("aridrock"));
        this.cornerBlock(DDCorners.POLISHED_ARIDROCK_CORNER.get(), ddRL("polished_aridrock"));
        this.cornerBlock(DDCorners.ARIDROCK_BRICK_CORNER.get(), ddRL("aridrock_bricks"));
        this.cornerBlock(DDCorners.LIMESTONE_CORNER.get(), ddRL("limestone"));
        this.cornerBlock(DDCorners.POLISHED_LIMESTONE_CORNER.get(), ddRL("polished_limestone"));
        this.cornerBlock(DDCorners.LIMESTONE_BRICK_CORNER.get(), ddRL("limestone_bricks"));
        this.cornerBlock(DDCorners.GRIMESTONE_CORNER.get(), ddRL("grimestone"));
        this.cornerBlock(DDCorners.POLISHED_GRIMESTONE_CORNER.get(), ddRL("polished_grimestone"));
        this.cornerBlock(DDCorners.GRIMESTONE_BRICK_CORNER.get(), ddRL("grimestone_bricks"));
    }

    public ESPBlockModelProvider models() {
        return espBlockModels;
    }

    public void slabBlock(SlabBlock block, ResourceLocation doubleslab, ResourceLocation slabTop, ResourceLocation slabBottom) {
        slabBlock(block, models().getExistingFile(slabBottom), models().getExistingFile(slabTop), models().getExistingFile(doubleslab));
    }

    public void cornerBlock(Block block, ResourceLocation texture) {
        cornerBlock(block, models().corner(name(block), texture));
    }

    public void cornerBlock(Block block, ModelFile model) {
        cornerBlock(block, $ -> model, 180);
    }

    public void cornerBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset) {
        getVariantBuilder(block)
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(modelFunc.apply(state))
                        .uvLock(true)
                        .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + angleOffset) % 360)
                        .build()
                );
    }

    private String name(Block block) {
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
    }

    public void fallingSlabBlock(FallingSlabBlock block, ResourceLocation doubleslab, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        fallingSlabBlock(block, models().slab(name(block), side, bottom, top), models().slabTop(name(block) + "_top", side, bottom, top), models().getExistingFile(doubleslab));
    }

    public void fallingSlabBlock(FallingSlabBlock block, ModelFile bottom, ModelFile top, ModelFile doubleslab) {
        getVariantBuilder(block)
                .partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(bottom))
                .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(top))
                .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(doubleslab));
    }

    public void verticalSlabBlock(VerticalSlabBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        verticalSlabBlockInternal(block, side, bottom, top);
    }

    private void verticalSlabBlockInternal(VerticalSlabBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        ModelFile verticalSlab = models().withExistingParent(name(block), espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabInner = models().withExistingParent("inner_" + name(block), espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabOuter = models().withExistingParent("outer_" + name(block), espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        verticalSlabBlock(block, verticalSlab, verticalSlabInner, verticalSlabOuter);
    }

    public void verticalSlabBlock(VerticalSlabBlock block, ModelFile verticalSlab, ModelFile verticalSlabInner, ModelFile verticalSlabOuter) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    Direction facing = state.getValue(VerticalSlabBlock.FACING);
                    VerticalSlabShape shape = state.getValue(VerticalSlabBlock.SHAPE);
                    int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
                    if (shape == VerticalSlabShape.INNER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    if (shape == VerticalSlabShape.OUTER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    yRot %= 360;
                    boolean uvlock = yRot != 0; // Don't set uvlock for states that have no rotation
                    return ConfiguredModel.builder()
                            .modelFile(shape == VerticalSlabShape.STRAIGHT ? verticalSlab : shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.INNER_RIGHT ? verticalSlabInner : verticalSlabOuter)
                            .rotationY(yRot)
                            .uvLock(uvlock)
                            .build();
                }, VerticalSlabBlock.WATERLOGGED);
    }

    public void fallingVerticalSlabBlock(FallingVerticalSlabBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        fallingVerticalSlabBlockInternal(block, side, bottom, top);
    }

    private void fallingVerticalSlabBlockInternal(FallingVerticalSlabBlock block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        ModelFile verticalSlab = models().withExistingParent(name(block), espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabInner = models().withExistingParent("inner_" + name(block), espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabOuter = models().withExistingParent("outer_" + name(block), espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        fallingVerticalSlabBlock(block, verticalSlab, verticalSlabInner, verticalSlabOuter);
    }

    public void fallingVerticalSlabBlock(FallingVerticalSlabBlock block, ModelFile verticalSlab, ModelFile verticalSlabInner, ModelFile verticalSlabOuter) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    Direction facing = state.getValue(FallingVerticalSlabBlock.FACING);
                    VerticalSlabShape shape = state.getValue(FallingVerticalSlabBlock.SHAPE);
                    int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
                    if (shape == VerticalSlabShape.INNER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    if (shape == VerticalSlabShape.OUTER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    yRot %= 360;
                    boolean uvlock = yRot != 0; // Don't set uvlock for states that have no rotation
                    return ConfiguredModel.builder()
                            .modelFile(shape == VerticalSlabShape.STRAIGHT ? verticalSlab : shape == VerticalSlabShape.INNER_LEFT || shape == VerticalSlabShape.INNER_RIGHT ? verticalSlabInner : verticalSlabOuter)
                            .rotationY(yRot)
                            .uvLock(uvlock)
                            .build();
                }, FallingVerticalSlabBlock.WATERLOGGED);
    }

    private ResourceLocation mcRL(String texture) {
        return new ResourceLocation("minecraft", "block/" + texture);
    }

    private ResourceLocation espRL(String texture) {
        return new ResourceLocation(ExtendedSlabs.MODID, "block" + "/" + texture);
    }

    private ResourceLocation wbpRL(String texture) {
        return new ResourceLocation("wildbackport", "block/" + texture);
    }

    private ResourceLocation galoRL(String texture) {
        return new ResourceLocation("galosphere", "block/" + texture);
    }

    private ResourceLocation ddRL(String texture) {
        return new ResourceLocation("darkerdepths", "block/" + texture);
    }
}