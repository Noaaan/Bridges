package com.mythicmetals.bridges.content.mythicmetals;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.Bridge;
import dev.yumi.mc.core.api.YumiMods;

@ModScoped
public class MythicMetalsBridge implements Bridge {

    @Override
    public String getName() {
        return "mythicmetals";
    }

    @Override
    public void initialize() {
        MythicMetalsItems.register();
    }

    @Override
    public boolean shouldInitialize() {
        return YumiMods.get().isModLoaded("mythicmetals");
    }
}
