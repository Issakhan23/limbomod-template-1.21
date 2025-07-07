package com.limbomod.item;

import com.limbomod.LimboMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {

    public static final Item Limbo_Light = registerItem("limbo_light", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LimboMod.MOD_ID, name ), item);
    }


    public static void registerModItems() {
        LimboMod.LOGGER.info("Registering Mod Items for " + LimboMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(Limbo_Light);
        });
    }
}
