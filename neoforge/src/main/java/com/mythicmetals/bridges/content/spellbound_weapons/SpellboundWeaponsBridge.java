package com.mythicmetals.bridges.content.spellbound_weapons;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.Bridge;
import dev.yumi.mc.core.api.YumiMods;

@ModScoped
public class SpellboundWeaponsBridge implements Bridge {

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
