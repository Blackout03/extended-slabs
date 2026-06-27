package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESCorners {
	public static final RegistrySupplier<Block> DIRT_CORNER = ESBlockFamilies.DIRT.corner();
	public static final RegistrySupplier<Block> COARSE_DIRT_CORNER = ESBlockFamilies.COARSE_DIRT.corner();
	public static final RegistrySupplier<Block> ROOTED_DIRT_CORNER = ESBlockFamilies.ROOTED_DIRT.corner();
	public static final RegistrySupplier<Block> TUFF_CORNER = ESBlockFamilies.TUFF.corner();
	public static final RegistrySupplier<Block> CALCITE_CORNER = ESBlockFamilies.CALCITE.corner();
	public static final RegistrySupplier<Block> MUD_CORNER = ESBlockFamilies.MUD.corner();
	public static final RegistrySupplier<Block> PACKED_MUD_CORNER = ESBlockFamilies.PACKED_MUD.corner();
	public static final RegistrySupplier<Block> MUD_BRICK_CORNER = ESBlockFamilies.MUD_BRICKS.corner();

	public static void init() {
	}
}
