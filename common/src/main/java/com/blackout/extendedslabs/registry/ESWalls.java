package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESWalls {
	public static final RegistrySupplier<Block> PACKED_MUD_WALL = ESBlockFamilies.PACKED_MUD.wall();
	public static final RegistrySupplier<Block> MUD_BRICK_WALL = ESBlockFamilies.MUD_BRICKS.wall();

	public static void init() {
	}
}
