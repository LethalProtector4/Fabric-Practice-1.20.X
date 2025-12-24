package net.everett.tutorialmod.block;

import net.everett.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.everett.tutorialmod.TutorialMod;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    // BASIC BLOCK
//    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
//            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
//    public static final Block RUBY_ORE = registerBlock("ruby_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));

    // CUSTOM BLOCK
//    public static final Block SOUND_BLOCK = registerBlock("sound_block",
//            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(ModSounds.SOUND_BLOCK_SOUNDS)));

    // DECORATION
//    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
//            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
//            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, false));

    // CROPS
//    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "tomato_crop"),
//            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // FLOWERS
//    public static final Block DAHLIA = registerBlock("dahlia",
//            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
//    public static final Block POTTED_DAHLIA = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "potted_dahlia"),
//            new FlowerPotBlock(DAHLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}