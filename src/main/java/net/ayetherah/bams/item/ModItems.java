package net.ayetherah.bams.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.ayetherah.bams.BricksAndMetalSticks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DROOP = registerItem("droop", new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DROOP);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BricksAndMetalSticks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BricksAndMetalSticks.LOGGER.info("Registering ModItems for " + BricksAndMetalSticks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
