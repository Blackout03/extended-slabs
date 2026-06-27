package com.blackout.extendedslabs.registry;

import com.blackout.extendedslabs.platform.RegistrySupplier;
import net.minecraft.world.level.block.Block;

public class ESVerticalSlabs {
	public static final RegistrySupplier<Block> DIRT_VERTICAL = ESBlockFamilies.DIRT.verticalSlab();
	public static final RegistrySupplier<Block> COARSE_DIRT_VERTICAL = ESBlockFamilies.COARSE_DIRT.verticalSlab();
	public static final RegistrySupplier<Block> ROOTED_DIRT_VERTICAL = ESBlockFamilies.ROOTED_DIRT.verticalSlab();
	public static final RegistrySupplier<Block> TUFF_VERTICAL = ESBlockFamilies.TUFF.verticalSlab();
	public static final RegistrySupplier<Block> CALCITE_VERTICAL = ESBlockFamilies.CALCITE.verticalSlab();
	public static final RegistrySupplier<Block> MUD_VERTICAL = ESBlockFamilies.MUD.verticalSlab();
	public static final RegistrySupplier<Block> PACKED_MUD_VERTICAL = ESBlockFamilies.PACKED_MUD.verticalSlab();
	public static final RegistrySupplier<Block> MUD_BRICK_VERTICAL = ESBlockFamilies.MUD_BRICKS.verticalSlab();

	public static void init() {
	}
}
