package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import com.mythicmetals.bridges.api.Bridge;
import com.mythicmetals.bridges.api.PlatformHelper;
import java.util.*;

@ModMain
public class Common {

    public static final String MOD_ID = "bridges";
    public static void init() {
        System.out.println("Hello from main mod init!");

        ModInjector.initialize(MOD_ID, Common.class);

        // FIXME
        //var platformHelper = ModInjector.getInstanceOf(MOD_ID, PlatformHelper.class);
        loadBridges(null);
    }

    private static void loadBridges(PlatformHelper helper) {
        var loader = ServiceLoader.load(Bridge.class);
        for (Bridge bridge : loader) {
            if (bridge.shouldInitialize(helper)) {
                bridge.initialize();
            }

        }
    }
}
