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
                        entries.add(ModBlocks.BRICKS_TILE);
                        entries.add(ModBlocks.BRICKS_THAT_IS_NOT_HOW_BRICKS_WORK);
                        entries.add(ModBlocks.BRICKS_TALL_WINDOW_BOTTOM);
                        entries.add(ModBlocks.BRICKS_TALL_WINDOW_MIDDLE);
                        entries.add(ModBlocks.BRICKS_TALL_WINDOW_TOP);
                        entries.add(ModBlocks.BRICKS_STRIPED);
                        entries.add(ModBlocks.BRICKS_STEP1);
                        entries.add(ModBlocks.BRICKS_SMALL_BIG_CONNECTION);
                        entries.add(ModBlocks.BRICKS_SIDEWAYS);
                        entries.add(ModBlocks.BRICKS_RAIL);
                        entries.add(ModBlocks.BRICKS_PLATE);
                        entries.add(ModBlocks.BRICKS_PIPES);
                        entries.add(ModBlocks.BRICKS_PATTERN3);
                        entries.add(ModBlocks.BRICKS_PATTERN2);
                        entries.add(ModBlocks.BRICKS_PATTERN1);
                        entries.add(ModBlocks.BRICKS_NOVEL);
                        entries.add(ModBlocks.BRICKS_GRATE_TINY);
                        entries.add(ModBlocks.BRICKS_GRATE_SMALL);
                        entries.add(ModBlocks.BRICKS_GRATE);
                        entries.add(ModBlocks.BRICKS_FLOOR2);
                        entries.add(ModBlocks.BRICKS_FLOOR1);
                        entries.add(ModBlocks.BRICKS_EXTENDO_EXTRA);
                        entries.add(ModBlocks.BRICKS_EXTENDO_BIG_CONNECTION);
                        entries.add(ModBlocks.BRICKS_EXTENDO);
                        entries.add(ModBlocks.BRICKS_DRAIN_BOTTOM_SMALL);
                        entries.add(ModBlocks.BRICKS_DRAIN_BOTTOM_ME);
                        entries.add(ModBlocks.BRICKS_BIG_WINDOW_SIDE2);
                        entries.add(ModBlocks.BRICKS_BIG_WINDOW_SIDE);
                        entries.add(ModBlocks.BRICKS_BIG_WINDOW_MIDDLE);
                        entries.add(ModBlocks.BRICKS_BIG_SMALL_CONNECTION);
                        entries.add(ModBlocks.BRICKS_BIG);
                        entries.add(ModBlocks.BRICKS_ARCH1);


                        entries.add(ModBlocks.CONCRETE_BEAM);
                        entries.add(ModBlocks.CONCRETE_BEAM_SIDE);
                        entries.add(ModBlocks.CONCRETE_PLATE);
                        entries.add(ModBlocks.CONCRETE_BLOCK);
                        entries.add(ModBlocks.CONCRETE_BLOCK1);
                        entries.add(ModBlocks.BRICK_MORTAR_FLOOR);


                        entries.add(ModBlocks.BEAM_RUSTED_VERTICAL);








                        entries.add(ModBlocks.DARK_BRICKS);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED1);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED2);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED3);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED4);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED5);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED6);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED7);
                        entries.add(ModBlocks.DARK_BRICKS_BIG);
                        entries.add(ModBlocks.DARK_BRICKS_SLABLIKE);
                        entries.add(ModBlocks.DARK_BRICKS_STRIPED);
                        entries.add(ModBlocks.DARK_BRICKS_TILE);
                        entries.add(ModBlocks.DARK_BRICKS_TILY);
                        entries.add(ModBlocks.DARK_BRICKS_ABANDONED8);
                        entries.add(ModBlocks.DARK_BRICKS_OVERGROWN);
                        entries.add(ModBlocks.DARK_BRICKS_SLABLIKE_ABANDONED);
                        entries.add(ModBlocks.DARK_BRICKS_TOP_ARCH);
                        entries.add(ModBlocks.DARK_BRICKS_TOP_ARCH_ABANDONED);
                        entries.add(ModBlocks.DARK_BRICKS_BIG_ABANDONED);
                        entries.add(ModBlocks.DARK_BRICKS19);
                        entries.add(ModBlocks.DARK_BRICKS20);
                        entries.add(ModBlocks.DARK_BRICKS21);
                        entries.add(ModBlocks.DARK_BRICKS22);
                        entries.add(ModBlocks.DARK_BRICKS23);
                        entries.add(ModBlocks.DARK_BRICKS24);
                        entries.add(ModBlocks.DARK_BRICKS25);
                        entries.add(ModBlocks.DARK_BRICKS26);
                        entries.add(ModBlocks.DARK_BRICKS27);
                        entries.add(ModBlocks.DARK_BRICKS28);
                        entries.add(ModBlocks.DARK_BRICKS29);
                        entries.add(ModBlocks.DARK_BRICKS30);


                        entries.add(ModBlocks.DARKEST_BRICKS);

















                        entries.add(ModBlocks.BRICKS_EXPANDED);
                        entries.add(ModBlocks.BRICKS_EXPANDED_RTT);
                        entries.add(ModBlocks.BRICKS_EXPANDED_C1);
                        entries.add(ModBlocks.BRICKS_EXPANDED_C2);
                        entries.add(ModBlocks.BRICKS_EXPANDED_C3);
                        entries.add(ModBlocks.BRICKS_EXPANDED_C4);
                    }).build());

    public static void registerItemGroups() {
        BricksAndMetalSticks.LOGGER.info("Registering Item Groups for " + BricksAndMetalSticks.MOD_ID);
    }
}
