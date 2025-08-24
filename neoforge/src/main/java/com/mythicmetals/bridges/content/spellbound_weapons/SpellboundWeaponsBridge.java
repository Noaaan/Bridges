package com.mythicmetals.bridges.content.spellbound_weapons;

import com.mythicmetals.bridges.api.Bridge;
import dev.yumi.mc.core.api.YumiMods;

public class SpellboundWeaponsBridge implements Bridge {

    // TODO - Remove once migrating away from service loader
    public SpellboundWeaponsBridge() {

    }

    @Override
    public String getName() {
        return "spellbound_weapons";
    }

    @Override
    public void initialize() {
        SpellboundTestItems.register();
    }

    @Override
    public boolean shouldInitialize() {
        return YumiMods.get().isModLoaded("spellbound_weapons_mr");
    }
}
