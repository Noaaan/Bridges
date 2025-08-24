package com.mythicmetals.bridges.content.mythicmetals;

import com.mythicmetals.bridges.api.Bridge;
import dev.yumi.mc.core.api.YumiMods;

public class MythicMetalsBridge implements Bridge {

    // TODO - Remove once migrating away from service loader
    public MythicMetalsBridge() {

    }

    @Override
    public String getName() {
        return "mythicmetals";
    }

    @Override
    public void initialize() {
        MythicMetalsItems.register();
        System.out.println("Mythic Metals is loaded!");
    }

    @Override
    public boolean shouldInitialize() {
        System.out.println("Attempting to load Bridge for " + getName());
        return YumiMods.get().isModLoaded("mythicmetals");
    }
}
