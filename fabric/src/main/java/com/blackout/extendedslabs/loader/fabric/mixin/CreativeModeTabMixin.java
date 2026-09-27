package com.blackout.extendedslabs.loader.fabric.mixin;

import com.blackout.extendedslabs.loader.fabric.FabricCreativeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CreativeModeTab.class)
public class CreativeModeTabMixin {
	@Inject(method = "getIconItem", at = @At("HEAD"), cancellable = true)
	private void extendedslabs$useCyclingIcon(CallbackInfoReturnable<ItemStack> callback) {
		if ((Object) this == FabricCreativeTabs.EXTENDED_SLABS) {
			callback.setReturnValue(FabricCreativeTabs.icon());
		}
	}
}