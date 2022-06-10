package com.blackout.extendedslabs.util;

import com.blackout.extendedslabs.init.ESPVerticalSlabs;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CopperStateMap {
	private static final Map<Block, Block> INCREASES = new HashMap<>();
	private static final Map<Block, Block> DECREASES = new HashMap<>();
	private static final Map<Block, Block> WAXED = new HashMap<>();
	private static final Map<Block, Block> UNWAXED = new HashMap<>();

	public static void put(Block block, @Nullable Block oxidized, Block waxed) {
		if (oxidized != null) {
			INCREASES.put(block, oxidized);
			DECREASES.put(oxidized, block);
		}
		WAXED.put(block, waxed);
		UNWAXED.put(waxed, block);
	}

	public static Optional<Block> getIncrease(Block block) {
		return Optional.ofNullable(INCREASES.get(block));
	}

	public static Optional<Block> getDecrease(Block block) {
		return Optional.ofNullable(DECREASES.get(block));
	}

	public static Optional<Block> getWaxed(Block block) {
		return Optional.ofNullable(WAXED.get(block));
	}

	public static Optional<Block> getUnwaxed(Block block) {
		return Optional.ofNullable(UNWAXED.get(block));
	}

	public static Block getOriginalStage(Block block) {
		var result = block;
		for (var block1 = getDecrease(block); block1.isPresent(); block1 = getDecrease(block1.get())) {
			result = block1.get();
		}
		return result;
	}

	static {
		put(ESPVerticalSlabs.CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_CUT_COPPER_VERTICAL.get());
		put(ESPVerticalSlabs.EXPOSED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_EXPOSED_CUT_COPPER_VERTICAL.get());
		put(ESPVerticalSlabs.WEATHERED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), ESPVerticalSlabs.WAXED_WEATHERED_CUT_COPPER_VERTICAL.get());
		put(ESPVerticalSlabs.OXIDIZED_CUT_COPPER_VERTICAL.get(), null, ESPVerticalSlabs.WAXED_OXIDIZED_CUT_COPPER_VERTICAL.get());
	}
}
