package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import com.mythicmetals.bridges.api.Bridge;
import java.util.ServiceLoader;
import java.util.logging.Logger;

@ModMain
public class Common {

    public static final Logger LOGGER = Logger.getLogger("bridges");
    public static final String MOD_ID = "bridges";

    public static void init() {
        LOGGER.info("[BRIDGES] Hello from main mod init!");

        ModInjector.initialize(MOD_ID, Common.class);
        loadBridges();
    }

    private static void loadBridges() {
        var loader = ServiceLoader.load(Bridge.class);
        if (loader.findFirst().isEmpty()) {
            LOGGER.warning("[BRIDGES] No bridges found!");
        }
        for (Bridge bridge : loader) {
            System.out.println("[BRIDGES] Attempting to load Bridge: " + bridge.getName());
            if (bridge.shouldInitialize()) {
                System.out.println("[BRIDGES] Now loading Bridge: " + bridge.getName());
                bridge.initialize();
            } else {
                System.out.println("[BRIDGES] Bridge could not be loaded");
            }
        }
    }
}
