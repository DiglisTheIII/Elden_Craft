package com.diglis.eldencraft.network;

import java.util.function.Supplier;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

public class InputMessage {
    
    private int key;

    public InputMessage(int key) {
        this.key = key;
    }

    public static void encode(InputMessage message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static InputMessage decode(InputMessage message, PacketBuffer buffer) {
        return new InputMessage(buffer.readInt());
    }

    public static void handle(InputMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            World world = player.getLevel();
            double x = player.getX();
            double y = player.getY();
            double z = player.getZ();
            if(!world.isClientSide()) {
                world.explode(player, x, y, z, 5.5f, Explosion.Mode.DESTROY);
            }
        });
        context.setPacketHandled(true);
    }

}
