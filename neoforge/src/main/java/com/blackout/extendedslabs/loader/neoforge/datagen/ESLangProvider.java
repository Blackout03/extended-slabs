package com.blackout.extendedslabs.loader.neoforge.datagen;

import com.blackout.extendedslabs.ExtendedSlabs;
import com.blackout.extendedslabs.registry.ESBlockDefinitions;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Locale;

public class ESLangProvider extends LanguageProvider {
	public ESLangProvider(PackOutput output) {
		super(output, ExtendedSlabs.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		add("itemGroup.extendedslabs", ExtendedSlabs.MODNAME);

		for (ESBlockDefinitions.BlockDefinition definition : ESBlockDefinitions.blocks()) {
			add(definition.block().get(), title(definition.id()));
		}
	}

	private String title(String id) {
		String[] parts = id.split("_");
		StringBuilder builder = new StringBuilder();

		for (String part : parts) {
			if (!builder.isEmpty()) {
				builder.append(' ');
			}

			builder.append(part.substring(0, 1).toUpperCase(Locale.ROOT));
			builder.append(part.substring(1));
		}

		return builder.toString();
	}
}
