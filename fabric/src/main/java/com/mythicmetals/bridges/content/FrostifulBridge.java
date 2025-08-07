package com.mythicmetals.bridges.content;

import com.mythicmetals.bridges.api.Bridge;
import com.mythicmetals.bridges.api.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

public class FrostifulBridge implements Bridge {

    @Override
    public String getName() {
        return "frostiful";
    }

    @Override
    public void initialize() {
        System.out.println(getName() + " Bridge is now loaded!");
    }

    @Override
    public boolean shouldInitialize(PlatformHelper helper) {
        System.out.println("Attempting to load Bridge for " + getName());
        if (helper == null) return FabricLoader.getInstance().isModLoaded("frostiful"); // TODO - Remove this and use helper
        return helper.isModLoaded("frostiful");
    }
}
