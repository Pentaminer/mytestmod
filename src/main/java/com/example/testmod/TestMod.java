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

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Одиночный Item
    public static final Item COOKIE_ITEM = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(0.6f)
                    .build()
            )
    );

    @Override
    public void onInitialize() {
        // Регистрируем Item в классическом стиле
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cookie_item"), COOKIE_ITEM);

        LOGGER.info("Hello Fabric world!");
    }
}
