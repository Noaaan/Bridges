package com.mythicmetals.bridges.content.spellbound_weapons;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class SpellboundTestItems {

    public static final ResourceKey<Item> SWORD_KEY = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("bridges", "spellbound_weapons/test_sword"));

    public static final Item TEST_SWORD = new Item(new Item.Properties().sword(ToolMaterial.DIAMOND, 99, 3.0f).setId(SWORD_KEY));

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, SWORD_KEY, TEST_SWORD);
    }
}
