package com.example.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "test-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Item COOKIE_ITEM = new Item(new Item.Settings()
        .group(ItemGroup.FOOD)
        .food(new FoodComponent.Builder()
            .hunger(4)       // сколько сытости даёт
            .saturationModifier(0.6f) // насыщение
            .build()
        ));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("examplemod", "cookie_item"), COOKIE_ITEM);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
