package com.mythicmetals.bridges.content.mythicmetals;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class MythicMetalsItems {

    public static final ResourceKey<Item> TEST_ITEM_KEY = ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("bridges", "mythicmetals/test_item"));

    public static final Item TEST_ITEM = new Item(new Item.Properties().setId(TEST_ITEM_KEY).fireResistant());

    public static void register() {
        // FIXME - NeoForge uses deferred registry so this won't work
        Registry.register(BuiltInRegistries.ITEM, TEST_ITEM_KEY, TEST_ITEM);
    }
}
