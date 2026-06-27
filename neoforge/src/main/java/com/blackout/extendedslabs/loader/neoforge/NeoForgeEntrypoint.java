package com.blackout.extendedslabs.loader.neoforge;

import com.blackout.extendedslabs.ExtendedSlabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ExtendedSlabs.MODID)
public class NeoForgeEntrypoint {
	public NeoForgeEntrypoint(IEventBus modEventBus) {
		ExtendedSlabs.init();
		NeoForgeRegistryBridge.register(modEventBus);
	}
}
