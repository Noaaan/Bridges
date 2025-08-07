package com.mythicmetals.bridges.content.mythicmetals;

import com.dotnomi.fabricdependencyinjection.annotation.ModInject;
import com.mythicmetals.bridges.api.*;
import com.mythicmetals.bridges.api.Bridge;

public class MythicMetalsBridge implements Bridge {

    private final PlatformHelper helper;

    @ModInject
    public MythicMetalsBridge(PlatformHelper helper) {
        this.helper = helper;
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
        return helper.isModLoaded("mythicmetals");
    }
}
