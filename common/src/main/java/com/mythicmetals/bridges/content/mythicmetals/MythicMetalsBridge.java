package com.mythicmetals.bridges.content.mythicmetals;

import com.dotnomi.fabricdependencyinjection.annotation.ModInject;
import com.mythicmetals.bridges.api.*;
import com.mythicmetals.bridges.api.Bridge;

public class MythicMetalsBridge implements Bridge {

    @ModInject
    public MythicMetalsBridge() {
    }

    @Override
    public String getName() {
        return "mythicmetals";
    }

    @Override
    public void initialize() {
        System.out.println("Mythic Metals is loaded!");
    }

    @Override
    public boolean shouldInitialize(PlatformHelper helper) {
        System.out.println("Attempting to load Bridge for " + getName());
        if (helper == null) return true; // TODO - Remove this
        return helper.isModLoaded("mythicmetals");
    }
}
