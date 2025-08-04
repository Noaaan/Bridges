package com.mythicmetals.bridges.api;

/**
 * A Bridge is the main entrypoint for a module
 */
public interface Bridge {
    void initialize();

    boolean shouldInitialize(PlatformHelper helper);
}
