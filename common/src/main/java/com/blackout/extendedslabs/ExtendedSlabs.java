package com.blackout.extendedslabs;

import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs +";
	public static final Logger LOGGER = LogManager.getLogger();

	private static boolean initialized;

	public static void init() {
		if (initialized) {
			return;
		}

		initialized = true;
		LOGGER.debug("Initializing " + MODNAME + " (" + MODID + ")");

		ESBlockDefinitions.init();
	}
}
