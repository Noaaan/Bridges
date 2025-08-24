package com.mythicmetals.bridges;

import dev.yumi.mc.core.api.ModContainer;
import dev.yumi.mc.core.api.entrypoint.ModInitializer;

public class FabricMain implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        Common.init();
    }
}