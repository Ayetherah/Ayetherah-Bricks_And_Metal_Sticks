package net.ayetherah.bams.item;

import net.ayetherah.bams.BricksAndMetalSticks;
import net.ayetherah.bams.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DROOP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BricksAndMetalSticks.MOD_ID, "droop"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.droop"))
                    .icon(() -> new ItemStack(ModItems.DROOP)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DROOP);
                        entries.add(ModBlocks.FULL_GRATE);
                    }).build());

    public static void registerItemGroups() {
        BricksAndMetalSticks.LOGGER.info("Registering Item Groups for " + BricksAndMetalSticks.MOD_ID);
    }
}
