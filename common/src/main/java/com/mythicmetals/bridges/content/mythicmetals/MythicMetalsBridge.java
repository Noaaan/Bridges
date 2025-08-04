package com.mythicmetals.bridges.content.mythicmetals;

import com.dotnomi.fabricdependencyinjection.annotation.ModInject;
import com.mythicmetals.bridges.api.Bridge;
import com.mythicmetals.bridges.api.PlatformHelper;

public class MythicMetalsBridge implements Bridge {

    @ModInject
    public MythicMetalsBridge() {
    }

    @Override
    public void initialize() {
        System.out.println("Mythic Metals is loaded!");
    }

    @Override
    public boolean shouldInitialize(PlatformHelper helper) {
        System.out.println("Hello from Mythic Metals Bridge!");
        return helper.isModLoaded("mythicmetals");
    }
}
