package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModMain;
import dev.yumi.mc.core.api.ModContainer;
import dev.yumi.mc.core.api.entrypoint.ModInitializer;

@ModMain
public class NeoMain implements ModInitializer {

    @Override
    public void onInitialize(ModContainer modContainer) {
        ModInjector.initialize(Common.MOD_ID, Common.class);
        Common.init();
    }
}
