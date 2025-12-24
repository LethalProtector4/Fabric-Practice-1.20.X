package net.everett.tutorialmod.datagen;

import net.everett.tutorialmod.block.ModBlocks;
import net.everett.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
//                .add(ModBlocks.RUBY_ORE)
//                .forceAddTag(BlockTags.DIAMOND_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//                .add(ModBlocks.RUBY_ORE)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));

        getOrCreateTagBuilder(BlockTags.FENCES);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES);

        getOrCreateTagBuilder(BlockTags.WALLS);

    }
}