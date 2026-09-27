package com.blackout.extendedslabs.loader.neoforge;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.loader.neoforge.datagen.NeoForgeDataGenerators;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(ExtendedSlabs.MODID)
public class NeoForgeEntrypoint {
	public NeoForgeEntrypoint(IEventBus modEventBus) {
		ExtendedSlabs.init();
		NeoForgeRegistryBridge.register(modEventBus);
		NeoForgeCreativeTabs.register(modEventBus);
	}
}
