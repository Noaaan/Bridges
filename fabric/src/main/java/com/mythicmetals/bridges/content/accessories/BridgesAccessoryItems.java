package com.mythicmetals.bridges.content.accessories;

import io.wispforest.accessories.api.core.AccessoryItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class BridgesAccessoryItems {

    public static final ResourceKey<Item> ITEM_KEY = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("bridges", "testcessory"));
    public static final Item TEST_ACCESSORY = new AccessoryItem(new Item.Properties().setId(ITEM_KEY));
    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, ITEM_KEY, TEST_ACCESSORY);
    }
}
