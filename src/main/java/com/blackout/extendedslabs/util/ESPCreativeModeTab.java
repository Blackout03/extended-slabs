package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ESPCorners;
import com.blackout.extendedslabs.init.ESPSlabs;
import com.blackout.extendedslabs.init.ESPStairs;
import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import com.blackout.extendedslabs.ExtendedSlabs;
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
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ESPCreativeModeTab extends CreativeModeTab {
	public ESPCreativeModeTab() {
		super(ExtendedSlabs.MODID);
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		int nextIntMods = new Random().nextInt(4);
		int nextIntBlockTypes = new Random().nextInt(4);
		if (nextIntMods == 3) {
			if (ModList.get().isLoaded("darkerdepths")) {
				if (nextIntBlockTypes == 1) {
					return new ItemStack(DDCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(DDCorners.ITEMS.getEntries().size())).findAny().get().get());
				} else if (nextIntBlockTypes == 2) {
					return new ItemStack(DDSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(DDSlabs.ITEMS.getEntries().size())).findAny().get().get());
				} else if (nextIntBlockTypes == 3) {
					return new ItemStack(DDStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(DDStairs.ITEMS.getEntries().size())).findAny().get().get());
				} else {
					return new ItemStack(DDVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(DDVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
				}
			} else {
				makeIcon();
			}
		} else if (nextIntMods == 2) {
			if (ModList.get().isLoaded("galosphere")) {
				if (nextIntBlockTypes == 1) {
					return new ItemStack(GaloCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(GaloCorners.ITEMS.getEntries().size())).findAny().get().get());
				} else if (nextIntBlockTypes == 2) {
					return new ItemStack(GaloVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(GaloVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
				} else {
					makeIcon();
				}
			} else {
				makeIcon();
			}
		} else if (nextIntMods == 1) {
			if (ModList.get().isLoaded("wildbackport")) {
				if (nextIntBlockTypes == 1) {
					return new ItemStack(WBPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(WBPCorners.ITEMS.getEntries().size())).findAny().get().get());
				} else if (nextIntBlockTypes == 2) {
					return new ItemStack(WBPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(WBPSlabs.ITEMS.getEntries().size())).findAny().get().get());
				} else if (nextIntBlockTypes == 3) {
					return new ItemStack(WBPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(WBPStairs.ITEMS.getEntries().size())).findAny().get().get());
				} else {
					return new ItemStack(WBPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(WBPVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
				}
			} else {
				makeIcon();
			}
		} else {
			if (nextIntBlockTypes == 1) {
				return new ItemStack(ESPCorners.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPCorners.ITEMS.getEntries().size())).findAny().get().get());
			} else if (nextIntBlockTypes == 2) {
				return new ItemStack(ESPSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPSlabs.ITEMS.getEntries().size())).findAny().get().get());
			} else if (nextIntBlockTypes == 3) {
				return new ItemStack(ESPStairs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPStairs.ITEMS.getEntries().size())).findAny().get().get());
			} else {
				return new ItemStack(ESPVerticalSlabs.ITEMS.getEntries().stream().distinct().skip(new Random().nextInt(ESPVerticalSlabs.ITEMS.getEntries().size())).findAny().get().get());
			}
		}
		return new ItemStack(ESPVerticalSlabs.GRASS_BLOCK_VERTICAL.get());
	}
}
