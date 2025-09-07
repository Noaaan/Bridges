package com.mythicmetals.bridges.content.bridges;

import io.wispforest.endec.Endec;
import io.wispforest.endec.StructEndec;
import io.wispforest.endec.impl.StructEndecBuilder;

public record InsulationComponent(int color) {
    public static final StructEndec<InsulationComponent> ENDEC = StructEndecBuilder.of(
        Endec.INT.fieldOf("color", InsulationComponent::color),
        InsulationComponent::new
    );
}
