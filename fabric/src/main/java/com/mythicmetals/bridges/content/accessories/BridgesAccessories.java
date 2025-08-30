package com.mythicmetals.bridges.content.accessories;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.Bridge;
import dev.yumi.mc.core.api.YumiMods;

@ModScoped
public class BridgesAccessories implements Bridge {
    @Override
    public String getName() {
        return "accessories";
    }

    @Override
    public void initialize() {
        BridgesAccessoryItems.register();
    }

    @Override
    public boolean shouldInitialize() {
        return YumiMods.get().isModLoaded("accessories");
    }
}
