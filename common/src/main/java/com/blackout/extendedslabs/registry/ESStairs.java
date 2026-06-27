package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESStairs {
	public static final RegistrySupplier<Block> DIRT_STAIRS = ESBlockFamilies.DIRT.stairs();
	public static final RegistrySupplier<Block> COARSE_DIRT_STAIRS = ESBlockFamilies.COARSE_DIRT.stairs();
	public static final RegistrySupplier<Block> ROOTED_DIRT_STAIRS = ESBlockFamilies.ROOTED_DIRT.stairs();
	public static final RegistrySupplier<Block> TUFF_STAIRS = ESBlockFamilies.TUFF.stairs();
	public static final RegistrySupplier<Block> CALCITE_STAIRS = ESBlockFamilies.CALCITE.stairs();
	public static final RegistrySupplier<Block> MUD_STAIRS = ESBlockFamilies.MUD.stairs();
	public static final RegistrySupplier<Block> PACKED_MUD_STAIRS = ESBlockFamilies.PACKED_MUD.stairs();
	public static final RegistrySupplier<Block> MUD_BRICK_STAIRS = ESBlockFamilies.MUD_BRICKS.stairs();

	public static void init() {
	}
}
