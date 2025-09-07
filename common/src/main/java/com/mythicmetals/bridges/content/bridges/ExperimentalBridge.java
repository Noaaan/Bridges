package com.mythicmetals.bridges.content.bridges;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mythicmetals.bridges.api.Bridge;

@ModScoped
public class ExperimentalBridge implements Bridge {

    @Override
    public String getName() {
        return "experimental";
    }

    @Override
    public void initialize() {
        ExperimentComponents.init();
    }

    @Override
    public boolean shouldInitialize() {
        return true;
    }
}
