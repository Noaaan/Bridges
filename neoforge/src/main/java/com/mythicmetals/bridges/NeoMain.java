package com.mythicmetals.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.mythicmetals.bridges.platform.NeoPlatformHelper;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Common.MOD_ID)
public class NeoMain {
    public static final String DEP_ID = Common.MOD_ID + "-neoforge";

    public NeoMain(IEventBus modbus, ModContainer container) {
        System.out.println("Hello from NeoForge mod " + container.getModId() + "!");
        ModInjector.initialize(DEP_ID, NeoMain.class);
        var helper = ModInjector.getInstanceOf(DEP_ID, NeoPlatformHelper.class);
        Common.init(helper);
    }
}
