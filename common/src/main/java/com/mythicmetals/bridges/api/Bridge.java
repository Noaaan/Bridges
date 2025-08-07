package com.mythicmetals.bridges.api;

/**
 * A Bridge is a service provider interface (SPI) which acts as an entrypoint into a module
 */
public interface Bridge {
    String getName();

    void initialize();

    boolean shouldInitialize(PlatformHelper helper);
}
