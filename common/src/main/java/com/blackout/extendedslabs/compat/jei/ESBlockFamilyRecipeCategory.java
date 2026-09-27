package com.blackout.extendedslabs.compat.jei;

import com.blackout.extendedslabs.ExtendedSlabs;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.types.IRecipeType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.Nullable;

public class ESBlockFamilyRecipeCategory implements IRecipeCategory<ESBlockFamilyJeiRecipe> {
    private static final int WIDTH = 144;
    private static final int HEIGHT = 46;

    private final IDrawable icon;

    public ESBlockFamilyRecipeCategory(IGuiHelper guiHelper) {
        this.icon = guiHelper.createDrawableItemLike(ESBlockFamilyJeiRecipe.createAll().getFirst().originalBlock());
    }

    @Override
    public IRecipeType<ESBlockFamilyJeiRecipe> getRecipeType() {
        return ESJeiPlugin.BLOCK_FAMILY;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Extended Slab Families");
    }

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ESBlockFamilyJeiRecipe recipe, IFocusGroup focuses) {
        builder.addInputSlot(1, 15)
                .setStandardSlotBackground()
                .add(recipe.originalBlock());

        for (int i = 0; i < recipe.familyBlocks().size(); i++) {
            int x = 40 + (i % 5) * 20;
            int y = 5 + (i / 5) * 20;

            builder.addOutputSlot(x, y)
                    .setStandardSlotBackground()
                    .add(recipe.familyBlocks().get(i));
        }
    }

    @Override
    public @Nullable Identifier getIdentifier(ESBlockFamilyJeiRecipe recipe) {
        Identifier originalBlockId = BuiltInRegistries.BLOCK.getKey(recipe.originalBlock());

        if (originalBlockId == null) {
            return null;
        }

        return Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "block_family/" + originalBlockId.getPath());
    }
}