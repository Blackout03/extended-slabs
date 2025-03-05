package com.blackout.extendedslabs.mixin;

import com.blackout.extendedslabs.registry.ESPTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BubbleColumnBlock.class)
public class BubbleColumnBlockMixin {
	@Inject(method = "getColumnState", at = @At("HEAD"), cancellable = true)
	private static void getColumnState(BlockState state, CallbackInfoReturnable<BlockState> info) {
		if (state.is(ESPTags.Blocks.BUBBLE_COLUMN_DRAG_DOWN)) {
			info.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(BubbleColumnBlock.DRAG_DOWN, true));
		}
		if (state.is(ESPTags.Blocks.BUBBLE_COLUMN_DRAG_UP)) {
			info.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(BubbleColumnBlock.DRAG_DOWN, false));
		}
	}
}
