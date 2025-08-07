package com.mythicmetals.bridges;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Common.MOD_ID)
public class NeoMain {

    public NeoMain(IEventBus modbus, ModContainer container) {
        Common.init();
    }
}
