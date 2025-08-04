package com.mythicmetals.bridges.platform;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.Bridge;
import com.mythicmetals.bridges.api.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import java.util.List;

@ModScoped
public class FabricPlatformHelper implements PlatformHelper {

    @Override
    public boolean isModLoaded(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    @Override
    public List<Bridge> getEntrypoints() {
        return FabricLoader.getInstance().getEntrypoints("bridges_module", Bridge.class);
    }
}
