package com.blackout.extendedslabs;

import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExtendedSlabs {
	public static final String MODID = "extendedslabs";
	public static final String MODNAME = "Extended Slabs +";
	public static final Logger LOGGER = LogManager.getLogger("ExtendedSlabs");
	public static final String MODVERSION = loadModVersion();

	private static boolean initialized;

	public static void init() {
		if (initialized) {
			return;
		}

		initialized = true;
		LOGGER.info("Initializing " + MODNAME + " (" + MODID + ")");
		LOGGER.info("Mod version: " + MODVERSION);

		ESBlockDefinitions.init();
	}

	private static String loadModVersion() {
		Properties properties = new Properties();

		try (InputStream stream = ExtendedSlabs.class.getResourceAsStream("/extendedslabs.properties")) {
			if (stream == null) {
				LOGGER.error("Could not find extendedslabs.properties");
				return "unknown";
			}

			properties.load(stream);
			return properties.getProperty("modVersion", "unknown");
		} catch (IOException exception) {
			LOGGER.error("Could not load the Extended Slabs version", exception);
			return "unknown";
		}
	}
}
