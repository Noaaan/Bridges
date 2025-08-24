package com.mythicmetals.bridges;

import dev.yumi.mc.core.api.entrypoint.ModInitializer;

public class NeoMain implements ModInitializer {

    @Override
    public void onInitialize(dev.yumi.mc.core.api.ModContainer modContainer) {
        Common.init();
    }
}
