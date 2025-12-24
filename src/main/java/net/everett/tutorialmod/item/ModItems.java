package net.everett.tutorialmod.item;

import net.everett.tutorialmod.block.ModBlocks;
import net.everett.tutorialmod.entity.ModEntities;
import net.everett.tutorialmod.item.custom.MetalDetectorItem;
import net.everett.tutorialmod.item.custom.ModArmorItem;
import net.everett.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.everett.tutorialmod.TutorialMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // BASIC ITEMS
//    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    // TOOLS
//    public static final Item METAL_DETECTOR = registerItem("metal_detector",
//            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

//    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
//            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));

    // ARMOR
//    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
//            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    // FOOD
//    public static final Item TOMATO = registerItem("tomato",
//            new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
//    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
//            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    // FUEL
//    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    // MUSIC
//    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
//            new MusicDiscItem(7, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));

    // MOBS
    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RUBY);
//        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}