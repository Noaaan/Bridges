package com.mythicmetals.bridges.content.bridges;

import com.dotnomi.fabricdependencyinjection.ModInjector;
import com.dotnomi.fabricdependencyinjection.annotation.ModInject;
import com.mythicmetals.bridges.Common;
import com.mythicmetals.bridges.api.CodecTransforms;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import java.util.function.UnaryOperator;

public class ExperimentComponents {

    @ModInject
    public static final CodecTransforms transforms = ModInjector.getInstanceOf(Common.MOD_ID, CodecTransforms.class);

    public static <T> DataComponentType<T> dataComponentType(String path, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            ResourceLocation.fromNamespaceAndPath(Common.MOD_ID, path),
            builderOperator.apply(DataComponentType.builder()).build()
        );
    }

    static {
       final DataComponentType<InsulationComponent> INSULATION = dataComponentType("insulation", builder ->
            builder
                .persistent(transforms.toCodec(InsulationComponent.ENDEC))
                .networkSynchronized(transforms.toStreamCodec(InsulationComponent.ENDEC))
        );
    }

    public static void init() {
        // no-op
    }
}
