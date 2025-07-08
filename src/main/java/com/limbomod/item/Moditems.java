package com.limbomod.item;

import com.limbomod.LimboMod;
import com.limbomod.item.custom.ACommand_Blockt;
import com.limbomod.item.custom.Limbo_light;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {

    public static final Item Limbo_Lightt = registerItem("limbo_lightt", new Item(new Item.Settings()));
    public static final Item ACommand_Blockk = registerItem("acommand_blockk", new Item(new Item.Settings()));

    public static Item Limbo_light = registerItem("limbo_light", new Item(new Item.Settings().fireproof().maxCount(1)));
    public static Item ACommand_Blockt = registerItem("acommand_blockt", new Item(new Item.Settings().fireproof().maxCount(1)));

    public static void setACommand_Block(Item ACommand_Block) {
        Moditems.ACommand_Blockt = ACommand_Blockt;
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LimboMod.MOD_ID, name ), item);
    }



    public static void registerModItems() {
        LimboMod.LOGGER.info("Registering Mod Items for " + LimboMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(Limbo_Lightt);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ACommand_Blockk);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ACommand_Blockt);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(Limbo_light);
        });

    }
}
