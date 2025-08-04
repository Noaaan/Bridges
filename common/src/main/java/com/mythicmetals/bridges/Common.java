package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import com.mythicmetals.bridges.api.PlatformHelper;

@ModMain
public class Common {

    public static final String MOD_ID = "bridges";
    public static void init(PlatformHelper platformHelper) {
        System.out.println("Hello from main mod init!");

        ModInjector.initialize(MOD_ID, Common.class);

        platformHelper.getEntrypoints().forEach(System.out::println);
        platformHelper.getEntrypoints().forEach(bridge -> {
            if (bridge.shouldInitialize(platformHelper)) {
                bridge.initialize();
            }
        });
    }
}
