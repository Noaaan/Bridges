package com.mythicmetals.bridges.platform;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

@ModScoped
public class FabricPlatformHelper implements PlatformHelper {

    @Override
    public boolean isModLoaded(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

}
