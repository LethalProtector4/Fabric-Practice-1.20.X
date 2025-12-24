package net.everett.tutorialmod.item;

import net.everett.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.everett.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PRACTICE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "practice"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.practice"))
                    .icon(() -> new ItemStack(ModItems.PORCUPINE_SPAWN_EGG)).entries((displayContext, entries) -> {

                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}