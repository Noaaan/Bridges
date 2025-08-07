package com.mythicmetals.bridges;

import net.fabricmc.api.ModInitializer;

public class FabricMain implements ModInitializer {

    @Override
    public void onInitialize() {
        Common.init();
    }
}