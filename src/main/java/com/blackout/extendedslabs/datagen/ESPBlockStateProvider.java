package com.blackout.extendedslabs.datagen;

import com.blackout.extendedslabs.blocks.VerticalSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingSlabBlock;
import com.blackout.extendedslabs.blocks.falling.FallingVerticalSlabBlock;
import com.blackout.extendedslabs.blocks.shapes.VerticalSlabShape;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ESPBlockStateProvider extends BlockStateProvider {
    public ESPBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.slabBlock(ESPSlabs.DIRT_SLAB.get(), mcRL("dirt"), mcRL("dirt"), mcRL("dirt"), mcRL("dirt"));
        this.fallingSlabBlock(ESPSlabs.SAND_SLAB.get(), mcRL("sand"), mcRL("sand"), mcRL("sand"), mcRL("sand"));
        this.fallingSlabBlock(ESPSlabs.RED_SAND_SLAB.get(), mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"));
        this.fallingSlabBlock(ESPSlabs.GRAVEL_SLAB.get(), mcRL("gravel"), mcRL("gravel"), mcRL("gravel"), mcRL("gravel"));
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
        this.slabBlock(ESPSlabs.END_STONE_SLAB.get(), mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.DIRT_VERTICAL.get(), "vertical_dirt_slab", mcRL("dirt"), mcRL("dirt"), mcRL("dirt"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.SAND_VERTICAL.get(), "vertical_sand_slab", mcRL("sand"), mcRL("sand"), mcRL("sand"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.RED_SAND_VERTICAL.get(), "vertical_red_sand_slab", mcRL("red_sand"), mcRL("red_sand"), mcRL("red_sand"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GRAVEL_VERTICAL.get(), "vertical_gravel_slab", mcRL("gravel"), mcRL("gravel"), mcRL("gravel"));
        this.verticalSlabBlock(ESPVerticalSlabs.COBBLESTONE_VERTICAL.get(), "vertical_cobblestone_slab", mcRL("cobblestone"), mcRL("cobblestone"), mcRL("cobblestone"));
        this.verticalSlabBlock(ESPVerticalSlabs.STONE_VERTICAL.get(), "vertical_stone_slab", mcRL("stone"), mcRL("stone"), mcRL("stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.STONE_BRICK_VERTICAL.get(), "vertical_stone_brick_slab", mcRL("stone_bricks"), mcRL("stone_bricks"), mcRL("stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_STONE_VERTICAL.get(), "vertical_smooth_stone_slab", mcRL("smooth_stone"), mcRL("smooth_stone"), mcRL("smooth_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.MOSSY_COBBLESTONE_VERTICAL.get(), "vertical_mossy_cobblestone_slab", mcRL("mossy_cobblestone"), mcRL("mossy_cobblestone"), mcRL("mossy_cobblestone"));
        this.verticalSlabBlock(ESPVerticalSlabs.MOSSY_STONE_BRICK_VERTICAL.get(), "vertical_mossy_stone_brick_slab", mcRL("mossy_stone_bricks"), mcRL("mossy_stone_bricks"), mcRL("mossy_stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.ANDESITE_VERTICAL.get(), "vertical_andesite_slab", mcRL("andesite"), mcRL("andesite"), mcRL("andesite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_ANDESITE_VERTICAL.get(), "vertical_polished_andesite_slab", mcRL("polished_andesite"), mcRL("andesite"), mcRL("andesite"));
        this.verticalSlabBlock(ESPVerticalSlabs.DIORITE_VERTICAL.get(), "vertical_diorite_slab", mcRL("diorite"), mcRL("diorite"), mcRL("diorite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_DIORITE_VERTICAL.get(), "vertical_polished_diorite_slab", mcRL("polished_diorite"), mcRL("polished_diorite"), mcRL("polished_diorite"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRANITE_VERTICAL.get(), "vertical_granite_slab", mcRL("granite"), mcRL("granite"), mcRL("granite"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_GRANITE_VERTICAL.get(), "vertical_polished_granite_slab", mcRL("polished_granite"), mcRL("polished_granite"), mcRL("polished_granite"));
        this.verticalSlabBlock(ESPVerticalSlabs.BRICK_VERTICAL.get(), "vertical_brick_slab", mcRL("bricks"), mcRL("bricks"), mcRL("bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_WOOL_VERTICAL.get(), "vertical_white_wool_slab", mcRL("white_wool"), mcRL("white_wool"), mcRL("white_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_WOOL_VERTICAL.get(), "vertical_orange_wool_slab", mcRL("orange_wool"), mcRL("orange_wool"), mcRL("orange_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_WOOL_VERTICAL.get(), "vertical_magenta_wool_slab", mcRL("magenta_wool"), mcRL("magenta_wool"), mcRL("magenta_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_WOOL_VERTICAL.get(), "vertical_light_blue_wool_slab", mcRL("light_blue_wool"), mcRL("light_blue_wool"), mcRL("light_blue_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_WOOL_VERTICAL.get(), "vertical_yellow_wool_slab", mcRL("yellow_wool"), mcRL("yellow_wool"), mcRL("yellow_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_WOOL_VERTICAL.get(), "vertical_lime_wool_slab", mcRL("lime_wool"), mcRL("lime_wool"), mcRL("lime_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_WOOL_VERTICAL.get(), "vertical_pink_wool_slab", mcRL("pink_wool"), mcRL("pink_wool"), mcRL("pink_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_WOOL_VERTICAL.get(), "vertical_gray_wool_slab", mcRL("gray_wool"), mcRL("gray_wool"), mcRL("gray_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_WOOL_VERTICAL.get(), "vertical_light_gray_wool_slab", mcRL("light_gray_wool"), mcRL("light_gray_wool"), mcRL("light_gray_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_WOOL_VERTICAL.get(), "vertical_cyan_wool_slab", mcRL("cyan_wool"), mcRL("cyan_wool"), mcRL("cyan_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_WOOL_VERTICAL.get(), "vertical_purple_wool_slab", mcRL("purple_wool"), mcRL("purple_wool"), mcRL("purple_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_WOOL_VERTICAL.get(), "vertical_blue_wool_slab", mcRL("blue_wool"), mcRL("blue_wool"), mcRL("blue_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_WOOL_VERTICAL.get(), "vertical_brown_wool_slab", mcRL("brown_wool"), mcRL("brown_wool"), mcRL("brown_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_WOOL_VERTICAL.get(), "vertical_green_wool_slab", mcRL("green_wool"), mcRL("green_wool"), mcRL("green_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_WOOL_VERTICAL.get(), "vertical_red_wool_slab", mcRL("red_wool"), mcRL("red_wool"), mcRL("red_wool"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_WOOL_VERTICAL.get(), "vertical_black_wool_slab", mcRL("black_wool"), mcRL("black_wool"), mcRL("black_wool"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.WHITE_CONCRETE_POWDER_VERTICAL.get(), "vertical_white_concrete_powder_slab", mcRL("white_concrete_powder"), mcRL("white_concrete_powder"), mcRL("white_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.ORANGE_CONCRETE_POWDER_VERTICAL.get(), "vertical_orange_concrete_powder_slab", mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"), mcRL("orange_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.MAGENTA_CONCRETE_POWDER_VERTICAL.get(), "vertical_magenta_concrete_powder_slab", mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"), mcRL("magenta_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_POWDER_VERTICAL.get(), "vertical_light_blue_concrete_powder_slab", mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"), mcRL("light_blue_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.YELLOW_CONCRETE_POWDER_VERTICAL.get(), "vertical_yellow_concrete_powder_slab", mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"), mcRL("yellow_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIME_CONCRETE_POWDER_VERTICAL.get(), "vertical_lime_concrete_powder_slab", mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"), mcRL("lime_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.PINK_CONCRETE_POWDER_VERTICAL.get(), "vertical_pink_concrete_powder_slab", mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"), mcRL("pink_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GRAY_CONCRETE_POWDER_VERTICAL.get(), "vertical_gray_concrete_powder_slab", mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"), mcRL("gray_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_POWDER_VERTICAL.get(), "vertical_light_gray_concrete_powder_slab", mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"), mcRL("light_gray_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.CYAN_CONCRETE_POWDER_VERTICAL.get(), "vertical_cyan_concrete_powder_slab", mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"), mcRL("cyan_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.PURPLE_CONCRETE_POWDER_VERTICAL.get(), "vertical_purple_concrete_powder_slab", mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"), mcRL("purple_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BLUE_CONCRETE_POWDER_VERTICAL.get(), "vertical_blue_concrete_powder_slab", mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"), mcRL("blue_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BROWN_CONCRETE_POWDER_VERTICAL.get(), "vertical_brown_concrete_powder_slab", mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"), mcRL("brown_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.GREEN_CONCRETE_POWDER_VERTICAL.get(), "vertical_green_concrete_powder_slab", mcRL("green_concrete_powder"), mcRL("green_concrete_powder"), mcRL("green_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.RED_CONCRETE_POWDER_VERTICAL.get(), "vertical_red_concrete_powder_slab", mcRL("red_concrete_powder"), mcRL("red_concrete_powder"), mcRL("red_concrete_powder"));
        this.fallingVerticalSlabBlock(ESPVerticalSlabs.BLACK_CONCRETE_POWDER_VERTICAL.get(), "vertical_black_concrete_powder_slab", mcRL("black_concrete_powder"), mcRL("black_concrete_powder"), mcRL("black_concrete_powder"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_CONCRETE_VERTICAL.get(), "vertical_white_concrete_slab", mcRL("white_concrete"), mcRL("white_concrete"), mcRL("white_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_CONCRETE_VERTICAL.get(), "vertical_orange_concrete_slab", mcRL("orange_concrete"), mcRL("orange_concrete"), mcRL("orange_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_CONCRETE_VERTICAL.get(), "vertical_magenta_concrete_slab", mcRL("magenta_concrete"), mcRL("magenta_concrete"), mcRL("magenta_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_CONCRETE_VERTICAL.get(), "vertical_light_blue_concrete_slab", mcRL("light_blue_concrete"), mcRL("light_blue_concrete"), mcRL("light_blue_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_CONCRETE_VERTICAL.get(), "vertical_yellow_concrete_slab", mcRL("yellow_concrete"), mcRL("yellow_concrete"), mcRL("yellow_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_CONCRETE_VERTICAL.get(), "vertical_lime_concrete_slab", mcRL("lime_concrete"), mcRL("lime_concrete"), mcRL("lime_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_CONCRETE_VERTICAL.get(), "vertical_pink_concrete_slab", mcRL("pink_concrete"), mcRL("pink_concrete"), mcRL("pink_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_CONCRETE_VERTICAL.get(), "vertical_gray_concrete_slab", mcRL("gray_concrete"), mcRL("gray_concrete"), mcRL("gray_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_CONCRETE_VERTICAL.get(), "vertical_light_gray_concrete_slab", mcRL("light_gray_concrete"), mcRL("light_gray_concrete"), mcRL("light_gray_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_CONCRETE_VERTICAL.get(), "vertical_cyan_concrete_slab", mcRL("cyan_concrete"), mcRL("cyan_concrete"), mcRL("cyan_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_CONCRETE_VERTICAL.get(), "vertical_purple_concrete_slab", mcRL("purple_concrete"), mcRL("purple_concrete"), mcRL("purple_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_CONCRETE_VERTICAL.get(), "vertical_blue_concrete_slab", mcRL("blue_concrete"), mcRL("blue_concrete"), mcRL("blue_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_CONCRETE_VERTICAL.get(), "vertical_brown_concrete_slab", mcRL("brown_concrete"), mcRL("brown_concrete"), mcRL("brown_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_CONCRETE_VERTICAL.get(), "vertical_green_concrete_slab", mcRL("green_concrete"), mcRL("green_concrete"), mcRL("green_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_CONCRETE_VERTICAL.get(), "vertical_red_concrete_slab", mcRL("red_concrete"), mcRL("red_concrete"), mcRL("red_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_CONCRETE_VERTICAL.get(), "vertical_black_concrete_slab", mcRL("black_concrete"), mcRL("black_concrete"), mcRL("black_concrete"));
        this.verticalSlabBlock(ESPVerticalSlabs.CLAY_VERTICAL.get(), "vertical_clay_slab", mcRL("clay"), mcRL("clay"), mcRL("clay"));
        this.verticalSlabBlock(ESPVerticalSlabs.TERRACOTTA_VERTICAL.get(), "vertical_terracotta_slab", mcRL("terracotta"), mcRL("terracotta"), mcRL("terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_TERRACOTTA_VERTICAL.get(), "vertical_white_terracotta_slab", mcRL("white_terracotta"), mcRL("white_terracotta"), mcRL("white_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_TERRACOTTA_VERTICAL.get(), "vertical_orange_terracotta_slab", mcRL("orange_terracotta"), mcRL("orange_terracotta"), mcRL("orange_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_TERRACOTTA_VERTICAL.get(), "vertical_magenta_terracotta_slab", mcRL("magenta_terracotta"), mcRL("magenta_terracotta"), mcRL("magenta_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_TERRACOTTA_VERTICAL.get(), "vertical_light_blue_terracotta_slab", mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"), mcRL("light_blue_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_TERRACOTTA_VERTICAL.get(), "vertical_yellow_terracotta_slab", mcRL("yellow_terracotta"), mcRL("yellow_terracotta"), mcRL("yellow_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_TERRACOTTA_VERTICAL.get(), "vertical_lime_terracotta_slab", mcRL("lime_terracotta"), mcRL("lime_terracotta"), mcRL("lime_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_TERRACOTTA_VERTICAL.get(), "vertical_pink_terracotta_slab", mcRL("pink_terracotta"), mcRL("pink_terracotta"), mcRL("pink_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_TERRACOTTA_VERTICAL.get(), "vertical_gray_terracotta_slab", mcRL("gray_terracotta"), mcRL("gray_terracotta"), mcRL("gray_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_TERRACOTTA_VERTICAL.get(), "vertical_light_gray_terracotta_slab", mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"), mcRL("light_gray_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_TERRACOTTA_VERTICAL.get(), "vertical_cyan_terracotta_slab", mcRL("cyan_terracotta"), mcRL("cyan_terracotta"), mcRL("cyan_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_TERRACOTTA_VERTICAL.get(), "vertical_purple_terracotta_slab", mcRL("purple_terracotta"), mcRL("purple_terracotta"), mcRL("purple_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_TERRACOTTA_VERTICAL.get(), "vertical_blue_terracotta_slab", mcRL("blue_terracotta"), mcRL("blue_terracotta"), mcRL("blue_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_TERRACOTTA_VERTICAL.get(), "vertical_brown_terracotta_slab", mcRL("brown_terracotta"), mcRL("brown_terracotta"), mcRL("brown_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_TERRACOTTA_VERTICAL.get(), "vertical_green_terracotta_slab", mcRL("green_terracotta"), mcRL("green_terracotta"), mcRL("green_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_TERRACOTTA_VERTICAL.get(), "vertical_red_terracotta_slab", mcRL("red_terracotta"), mcRL("red_terracotta"), mcRL("red_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_TERRACOTTA_VERTICAL.get(), "vertical_black_terracotta_slab", mcRL("black_terracotta"), mcRL("black_terracotta"), mcRL("black_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_white_glazed_terracotta_slab", mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"), mcRL("white_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_orange_glazed_terracotta_slab", mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"), mcRL("orange_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_magenta_glazed_terracotta_slab", mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"), mcRL("magenta_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_light_blue_glazed_terracotta_slab", mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"), mcRL("light_blue_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_yellow_glazed_terracotta_slab", mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"), mcRL("yellow_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_lime_glazed_terracotta_slab", mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"), mcRL("lime_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_pink_glazed_terracotta_slab", mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"), mcRL("pink_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_gray_glazed_terracotta_slab", mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"), mcRL("gray_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_light_gray_glazed_terracotta_slab", mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"), mcRL("light_gray_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_cyan_glazed_terracotta_slab", mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"), mcRL("cyan_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_purple_glazed_terracotta_slab", mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"), mcRL("purple_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_blue_glazed_terracotta_slab", mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"), mcRL("blue_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_brown_glazed_terracotta_slab", mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"), mcRL("brown_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_green_glazed_terracotta_slab", mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"), mcRL("green_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_red_glazed_terracotta_slab", mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"), mcRL("red_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_GLAZED_TERRACOTTA_VERTICAL.get(), "vertical_black_glazed_terracotta_slab", mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"), mcRL("black_glazed_terracotta"));
        this.verticalSlabBlock(ESPVerticalSlabs.GLASS_VERTICAL.get(), "vertical_glass_slab", mcRL("glass"), mcRL("glass"), mcRL("glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.WHITE_STAINED_GLASS_VERTICAL.get(), "vertical_white_stained_glass_slab", mcRL("white_stained_glass"), mcRL("white_stained_glass"), mcRL("white_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.ORANGE_STAINED_GLASS_VERTICAL.get(), "vertical_orange_stained_glass_slab", mcRL("orange_stained_glass"), mcRL("orange_stained_glass"), mcRL("orange_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.MAGENTA_STAINED_GLASS_VERTICAL.get(), "vertical_magenta_stained_glass_slab", mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"), mcRL("magenta_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_BLUE_STAINED_GLASS_VERTICAL.get(), "vertical_light_blue_stained_glass_slab", mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"), mcRL("light_blue_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.YELLOW_STAINED_GLASS_VERTICAL.get(), "vertical_yellow_stained_glass_slab", mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"), mcRL("yellow_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIME_STAINED_GLASS_VERTICAL.get(), "vertical_lime_stained_glass_slab", mcRL("lime_stained_glass"), mcRL("lime_stained_glass"), mcRL("lime_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.PINK_STAINED_GLASS_VERTICAL.get(), "vertical_pink_stained_glass_slab", mcRL("pink_stained_glass"), mcRL("pink_stained_glass"), mcRL("pink_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.GRAY_STAINED_GLASS_VERTICAL.get(), "vertical_gray_stained_glass_slab", mcRL("gray_stained_glass"), mcRL("gray_stained_glass"), mcRL("gray_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.LIGHT_GRAY_STAINED_GLASS_VERTICAL.get(), "vertical_light_gray_stained_glass_slab", mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"), mcRL("light_gray_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.CYAN_STAINED_GLASS_VERTICAL.get(), "vertical_cyan_stained_glass_slab", mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"), mcRL("cyan_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPLE_STAINED_GLASS_VERTICAL.get(), "vertical_purple_stained_glass_slab", mcRL("purple_stained_glass"), mcRL("purple_stained_glass"), mcRL("purple_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLUE_STAINED_GLASS_VERTICAL.get(), "vertical_blue_stained_glass_slab", mcRL("blue_stained_glass"), mcRL("blue_stained_glass"), mcRL("blue_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BROWN_STAINED_GLASS_VERTICAL.get(), "vertical_brown_stained_glass_slab", mcRL("brown_stained_glass"), mcRL("brown_stained_glass"), mcRL("brown_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.GREEN_STAINED_GLASS_VERTICAL.get(), "vertical_green_stained_glass_slab", mcRL("green_stained_glass"), mcRL("green_stained_glass"), mcRL("green_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_STAINED_GLASS_VERTICAL.get(), "vertical_red_stained_glass_slab", mcRL("red_stained_glass"), mcRL("red_stained_glass"), mcRL("red_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACK_STAINED_GLASS_VERTICAL.get(), "vertical_black_stained_glass_slab", mcRL("black_stained_glass"), mcRL("black_stained_glass"), mcRL("black_stained_glass"));
        this.verticalSlabBlock(ESPVerticalSlabs.SANDSTONE_VERTICAL.get(), "vertical_sandstone_slab", mcRL("sandstone"), mcRL("sandstone_bottom"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_SANDSTONE_VERTICAL.get(), "vertical_smooth_sandstone_slab", mcRL("sandstone_top"), mcRL("sandstone_top"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_SANDSTONE_VERTICAL.get(), "vertical_cut_sandstone_slab", mcRL("cut_sandstone"), mcRL("sandstone_top"), mcRL("sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_SANDSTONE_VERTICAL.get(), "vertical_red_sandstone_slab", mcRL("red_sandstone"), mcRL("red_sandstone_bottom"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_RED_SANDSTONE_VERTICAL.get(), "vertical_smooth_red_sandstone_slab", mcRL("red_sandstone_top"), mcRL("red_sandstone_top"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_RED_SANDSTONE_VERTICAL.get(), "vertical_cut_red_sandstone_slab", mcRL("cut_red_sandstone"), mcRL("red_sandstone_top"), mcRL("red_sandstone_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.COBBLED_DEEPSLATE_VERTICAL.get(), "vertical_cobbled_deepslate_slab", mcRL("cobbled_deepslate"), mcRL("cobbled_deepslate"), mcRL("cobbled_deepslate"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_DEEPSLATE_VERTICAL.get(), "vertical_polished_deepslate_slab", mcRL("polished_deepslate"), mcRL("polished_deepslate"), mcRL("polished_deepslate"));
        this.verticalSlabBlock(ESPVerticalSlabs.DEEPSLATE_BRICK_VERTICAL.get(), "vertical_deepslate_brick_slab", mcRL("deepslate_bricks"), mcRL("deepslate_bricks"), mcRL("deepslate_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DEEPSLATE_TILE_VERTICAL.get(), "vertical_deepslate_tile_slab", mcRL("deepslate_tiles"), mcRL("deepslate_tiles"), mcRL("deepslate_tiles"));
        this.verticalSlabBlock(ESPVerticalSlabs.BLACKSTONE_VERTICAL.get(), "vertical_blackstone_slab", mcRL("blackstone"), mcRL("blackstone"), mcRL("blackstone"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_BLACKSTONE_VERTICAL.get(), "vertical_polished_blackstone_slab", mcRL("polished_blackstone"), mcRL("polished_blackstone"), mcRL("polished_blackstone"));
        this.verticalSlabBlock(ESPVerticalSlabs.POLISHED_BLACKSTONE_BRICK_VERTICAL.get(), "vertical_polished_blackstone_brick_slab", mcRL("polished_blackstone_bricks"), mcRL("polished_blackstone_bricks"), mcRL("polished_blackstone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.NETHERRACK_VERTICAL.get(), "vertical_netherrack_slab", mcRL("netherrack"), mcRL("netherrack"), mcRL("netherrack"));
        this.verticalSlabBlock(ESPVerticalSlabs.NETHER_BRICK_VERTICAL.get(), "vertical_nether_brick_slab", mcRL("nether_bricks"), mcRL("nether_bricks"), mcRL("nether_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.RED_NETHER_BRICK_VERTICAL.get(), "vertical_red_nether_brick_slab", mcRL("red_nether_bricks"), mcRL("red_nether_bricks"), mcRL("red_nether_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.QUARTZ_VERTICAL.get(), "vertical_quartz_slab", mcRL("quartz_block_side"), mcRL("quartz_block_top"), mcRL("quartz_block_top"));
        this.verticalSlabBlock(ESPVerticalSlabs.SMOOTH_QUARTZ_VERTICAL.get(), "vertical_smooth_quartz_slab", mcRL("quartz_block_bottom"), mcRL("quartz_block_bottom"), mcRL("quartz_block_bottom"));
        this.verticalSlabBlock(ESPVerticalSlabs.END_STONE_VERTICAL.get(), "vertical_end_stone_slab", mcRL("end_stone"), mcRL("end_stone"), mcRL("end_stone"));
        this.verticalSlabBlock(ESPVerticalSlabs.END_STONE_BRICK_VERTICAL.get(), "vertical_end_stone_brick_slab", mcRL("end_stone_bricks"), mcRL("end_stone_bricks"), mcRL("end_stone_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.PURPUR_VERTICAL.get(), "vertical_purpur_slab", mcRL("purpur_block"), mcRL("purpur_block"), mcRL("purpur_block"));
        this.verticalSlabBlock(ESPVerticalSlabs.PRISMARINE_VERTICAL.get(), "vertical_prismarine_slab", mcRL("prismarine"), mcRL("prismarine"), mcRL("prismarine"));
        this.verticalSlabBlock(ESPVerticalSlabs.PRISMARINE_BRICK_VERTICAL.get(), "vertical_prismarine_brick_slab", mcRL("prismarine_bricks"), mcRL("prismarine_bricks"), mcRL("prismarine_bricks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DARK_PRISMARINE_VERTICAL.get(), "vertical_dark_prismarine_slab", mcRL("dark_prismarine"), mcRL("dark_prismarine"), mcRL("dark_prismarine"));
        this.verticalSlabBlock(ESPVerticalSlabs.OAK_VERTICAL.get(), "vertical_oak_slab", mcRL("oak_planks"), mcRL("oak_planks"), mcRL("oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.SPRUCE_VERTICAL.get(), "vertical_spruce_slab", mcRL("spruce_planks"), mcRL("spruce_planks"), mcRL("spruce_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.BIRCH_VERTICAL.get(), "vertical_birch_slab", mcRL("birch_planks"), mcRL("birch_planks"), mcRL("birch_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.JUNGLE_VERTICAL.get(), "vertical_jungle_slab", mcRL("jungle_planks"), mcRL("jungle_planks"), mcRL("jungle_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.ACACIA_VERTICAL.get(), "vertical_acacia_slab", mcRL("acacia_planks"), mcRL("acacia_planks"), mcRL("acacia_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.DARK_OAK_VERTICAL.get(), "vertical_dark_oak_slab", mcRL("dark_oak_planks"), mcRL("dark_oak_planks"), mcRL("dark_oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.CRIMSON_VERTICAL.get(), "vertical_crimson_slab", mcRL("crimson_planks"), mcRL("crimson_planks"), mcRL("crimson_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.WARPED_VERTICAL.get(), "vertical_warped_slab", mcRL("warped_planks"), mcRL("warped_planks"), mcRL("warped_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.PETRIFIED_OAK_VERTICAL.get(), "vertical_petrified_oak_slab", mcRL("oak_planks"), mcRL("oak_planks"), mcRL("oak_planks"));
        this.verticalSlabBlock(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), "vertical_oxidized_cut_copper_slab", mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), "vertical_weathered_cut_copper_slab", mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), "vertical_exposed_cut_copper_slab", mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(), "vertical_cut_copper_slab", mcRL("cut_copper"), mcRL("cut_copper"), mcRL("cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get(), "vertical_waxed_oxidized_cut_copper_slab", mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"), mcRL("oxidized_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get(), "vertical_waxed_weathered_cut_copper_slab", mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"), mcRL("weathered_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get(), "vertical_waxed_exposed_cut_copper_slab", mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"), mcRL("exposed_cut_copper"));
        this.verticalSlabBlock(ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get(), "vertical_waxed_cut_copper_slab", mcRL("cut_copper"), mcRL("cut_copper"), mcRL("cut_copper"));
    }

    private String name(Block block) {
        return Objects.requireNonNull(block.getRegistryName()).getPath();
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

    public void verticalSlabBlock(VerticalSlabBlock block, String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        verticalSlabBlockInternal(block, name, side, bottom, top);
    }

    private void verticalSlabBlockInternal(VerticalSlabBlock block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        ModelFile verticalSlab = models().withExistingParent(baseName, espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabInner = models().withExistingParent("inner_" + baseName, espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabOuter = models().withExistingParent("outer_" + baseName, espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
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

    public void fallingVerticalSlabBlock(FallingVerticalSlabBlock block, String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        fallingVerticalSlabBlockInternal(block, name, side, bottom, top);
    }

    private void fallingVerticalSlabBlockInternal(FallingVerticalSlabBlock block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        ModelFile verticalSlab = models().withExistingParent(baseName, espRL("vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabInner = models().withExistingParent("inner_" + baseName, espRL("inner_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
        ModelFile verticalSlabOuter = models().withExistingParent("outer_" + baseName, espRL("outer_vertical_slab")).texture("side", side).texture("bottom", bottom).texture("top", top);
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
        return new ResourceLocation("extendedslabs", "block" + "/" + texture);
    }
}