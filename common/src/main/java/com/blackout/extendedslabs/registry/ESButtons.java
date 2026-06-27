package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESButtons {
	public static final RegistrySupplier<Block> PACKED_MUD_BUTTON = ESBlockFamilies.PACKED_MUD.button();
	public static final RegistrySupplier<Block> MUD_BRICK_BUTTON = ESBlockFamilies.MUD_BRICKS.button();

	public static void init() {
	}
}
