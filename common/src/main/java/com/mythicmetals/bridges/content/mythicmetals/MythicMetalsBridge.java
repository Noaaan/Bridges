package com.mythicmetals.bridges.content.mythicmetals;

import com.dotnomi.fabricdependencyinjection.annotation.ModInject;
import com.mythicmetals.bridges.api.*;
import com.mythicmetals.bridges.api.Bridge;

public class MythicMetalsBridge implements Bridge {

    private PlatformHelper platformHelper;

    // TODO - Remove once migrating away from service loader
    public MythicMetalsBridge() {

    }

    @ModInject
    public MythicMetalsBridge(PlatformHelper platformHelper) {
        this.platformHelper = platformHelper;
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
        if (platformHelper == null) {
            System.out.println("platformhelper not available");
            return true;
        }
        return platformHelper.isModLoaded("mythicmetals");
    }
}
