package com.example.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.FoodComponents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
    public static final String MOD_ID = "test_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item COOKIE_ITEM = new Item(new Item.Settings()
        .group(ItemGroups.FOOD)
        .food(FoodComponents.COOKIE)
    );

    @Override
    public void onInitialize() {
        Registries.register(Registries.ITEM, new Identifier(MOD_ID, "cookie_item"), COOKIE_ITEM);
        LOGGER.info("Hello Fabric world!");
    }
}
