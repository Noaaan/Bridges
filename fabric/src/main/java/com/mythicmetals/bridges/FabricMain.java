package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import com.mythicmetals.bridges.platform.FabricPlatformHelper;
import net.fabricmc.api.ModInitializer;

@ModMain
public class FabricMain implements ModInitializer {

    public static final String DEP_ID = Common.MOD_ID + "-fabric";

    @Override
    public void onInitialize() {
        ModInjector.initialize(DEP_ID, FabricMain.class);
        var platformHelper = ModInjector.getInstanceOf(DEP_ID, FabricPlatformHelper.class);
        Common.init(platformHelper);
    }
}