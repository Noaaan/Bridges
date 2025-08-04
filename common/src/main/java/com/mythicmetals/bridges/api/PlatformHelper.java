package com.mythicmetals.bridges.api;

import java.util.List;

/**
 * Helper for various platform/loader specific functionality
 */
public interface PlatformHelper {

    boolean isModLoaded(String string);

    List<Bridge> getEntrypoints();
}
