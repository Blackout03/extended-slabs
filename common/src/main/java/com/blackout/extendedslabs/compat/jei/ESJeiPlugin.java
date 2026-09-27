package com.blackout.extendedslabs.compat.jei;

import com.blackout.extendedslabs.ExtendedSlabs;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.types.IRecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.Identifier;

@JeiPlugin
public class ESJeiPlugin implements IModPlugin {
    public static final IRecipeType<ESBlockFamilyJeiRecipe> BLOCK_FAMILY = IRecipeType.create(
            ExtendedSlabs.MODID,
            "block_family",
            ESBlockFamilyJeiRecipe.class
    );

    @Override
    public Identifier getPluginUid() {
        return Identifier.fromNamespaceAndPath(ExtendedSlabs.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ESBlockFamilyRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(BLOCK_FAMILY, ESBlockFamilyJeiRecipe.createAll());
    }
}