package com.limbomod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ACommand_Blockt extends Item {
    public ACommand_Blockt(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            MinecraftServer server = user.getServer();
            if (server != null) {
                ServerCommandSource source = user.getCommandSource();

            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
