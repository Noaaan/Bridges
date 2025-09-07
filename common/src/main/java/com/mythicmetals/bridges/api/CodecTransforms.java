package com.mythicmetals.bridges.api;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.wispforest.endec.Endec;
import io.wispforest.endec.StructEndec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

public interface CodecTransforms {
    <T> MapCodec<T> toMapCodec(StructEndec<T> structEndec);
    <T> Codec<T> toCodec(StructEndec<T> structEndec);
    <B extends RegistryFriendlyByteBuf, T> StreamCodec<B, T> toStreamCodec(Endec<T> endec);
}
