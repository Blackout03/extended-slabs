package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESSlabs {
	public static final RegistrySupplier<Block> DIRT_SLAB = ESBlockFamilies.DIRT.slab();
	public static final RegistrySupplier<Block> COARSE_DIRT_SLAB = ESBlockFamilies.COARSE_DIRT.slab();
	public static final RegistrySupplier<Block> ROOTED_DIRT_SLAB = ESBlockFamilies.ROOTED_DIRT.slab();
	public static final RegistrySupplier<Block> TUFF_SLAB = ESBlockFamilies.TUFF.slab();
	public static final RegistrySupplier<Block> CALCITE_SLAB = ESBlockFamilies.CALCITE.slab();
	public static final RegistrySupplier<Block> MUD_SLAB = ESBlockFamilies.MUD.slab();
	public static final RegistrySupplier<Block> PACKED_MUD_SLAB = ESBlockFamilies.PACKED_MUD.slab();
	public static final RegistrySupplier<Block> MUD_BRICK_SLAB = ESBlockFamilies.MUD_BRICKS.slab();

	public static void init() {
	}
}
