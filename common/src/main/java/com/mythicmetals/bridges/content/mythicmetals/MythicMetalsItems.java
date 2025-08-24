package com.mythicmetals.bridges.content.mythicmetals;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class MythicMetalsItems {

    public static final ResourceKey<Item> TEST_EGG_KEY = ResourceKey.create(
        BuiltInRegistries.ITEM.key(),
        ResourceLocation.fromNamespaceAndPath("bridges", "mythicmetals/test_egg")
    );

    public static final Item TEST_EGG = new Item(new Item.Properties().setId(TEST_EGG_KEY).component(DataComponents.MAX_STACK_SIZE, 12).fireResistant());

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, TEST_EGG_KEY, TEST_EGG);
    }
}
