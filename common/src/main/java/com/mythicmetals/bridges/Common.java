package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.mythicmetals.bridges.api.Bridge;
import java.util.logging.Logger;

public class Common {

    public static final Logger LOGGER = Logger.getLogger("bridges");
    public static final String MOD_ID = "bridges";

    public static void init() {
        LOGGER.info("[BRIDGES] Hello from main mod init!");

        loadBridges();
    }

    private static void loadBridges() {
        final var bridges = ModInjector.getInstancesOf(MOD_ID, Bridge.class);
        if (bridges.isEmpty()) {
            LOGGER.warning("[BRIDGES] No bridges found!");
        }
        for (Bridge bridge : bridges) {
            LOGGER.info("[BRIDGES] Attempting to load Bridge: " + bridge.getName());
            if (bridge.shouldInitialize()) {
                LOGGER.info("[BRIDGES] Now loading Bridge: " + bridge.getName());
                bridge.initialize();
            } else {
                LOGGER.info("[BRIDGES] Bridge could not be loaded");
            }
        }
    }
}
