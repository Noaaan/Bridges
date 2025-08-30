package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import dev.yumi.mc.core.api.ModContainer;
import dev.yumi.mc.core.api.entrypoint.ModInitializer;

@ModMain
public class FabricMain implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        ModInjector.initialize(Common.MOD_ID, this);
        Common.init();
    }
}