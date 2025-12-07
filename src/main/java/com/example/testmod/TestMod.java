package com.example.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Consumable;
import net.minecraft.item.FoodProperties;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Создаём FoodProperties для нашей печеньки
    public static final FoodProperties COOKIE_FOOD = new FoodProperties.Builder()
            .nutrition(4)             // сколько сытости даёт
            .saturationModifier(0.6f) // насыщение
            .build();

    // Создаём сам Item с этим FoodProperties
    public static final Item COOKIE_ITEM = new Item(new Item.Properties()
            .food(COOKIE_FOOD)
            .group(ItemGroup.FOOD)
    );

    @Override
    public void onInitialize() {
        // Регистрируем Item
        Registries.register(Registries.ITEM, new Identifier(MOD_ID, "cookie_item"), COOKIE_ITEM);

        LOGGER.info("Cookie item registered!");
    }
}
