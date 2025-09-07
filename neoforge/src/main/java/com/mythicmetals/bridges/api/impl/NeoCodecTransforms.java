package com.mythicmetals.bridges.api.impl;

import com.dotnomi.fabricdependencyinjection.annotation.ModScoped;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mythicmetals.bridges.api.CodecTransforms;
import io.wispforest.endec.Endec;
import io.wispforest.endec.StructEndec;
import io.wispforest.owo.serialization.CodecUtils;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

@ModScoped
public class NeoCodecTransforms implements CodecTransforms {

    @Override
    public <T> MapCodec<T> toMapCodec(StructEndec<T> structEndec) {
        return CodecUtils.toMapCodec(structEndec);
    }

    @Override
    public <T> Codec<T> toCodec(StructEndec<T> structEndec) {
        return CodecUtils.toCodec(structEndec);
    }

    @Override
    public <B extends RegistryFriendlyByteBuf, T> StreamCodec<B, T> toStreamCodec(Endec<T> endec) {
        return CodecUtils.toPacketCodec(endec);
    }
}
