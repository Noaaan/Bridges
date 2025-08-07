package com.mythicmetals.bridges.platform;

import com.mythicmetals.bridges.api.PlatformHelper;
import net.neoforged.fml.ModList;

public class NeoPlatformHelper implements PlatformHelper {
    @Override
    public boolean isModLoaded(String string) {
        return ModList.get().isLoaded(string);
    }

}
