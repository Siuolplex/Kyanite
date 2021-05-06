package com.dev.siuolplex;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static net.minecraft.world.gen.YOffset.aboveBottom;

// Using Noaaan's work around for modded biome ore gen they did.
// It was found in https://github.com/Noaaan/MythicMetals/tree/MASTER. Great job on the mod Noaan!

public class OreGen {
    private static final ConfiguredFeature<?, ?> KYANITEOREGEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    com.dev.siuolplex.blocks.Blocks.KYANITE_ORE.getDefaultState(),
                    12))
            .averageDepth(YOffset.fixed(50), (20))
            .spreadHorizontally()
            .repeat(1);

    private static final ConfiguredFeature<?, ?> TELAITEOREGEN = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    com.dev.siuolplex.blocks.Blocks.TELAITE_ORE.getDefaultState(),
                    2))
            .averageDepth(YOffset.fixed(60), (10))
            .spreadHorizontally()
            .repeat(1);

    public static void init() {
    RegistryKey<ConfiguredFeature<?, ?>> kyaniteoregen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
            new Identifier("kyanite", "kyaniteoregen"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, kyaniteoregen.getValue(), KYANITEOREGEN);
    BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, kyaniteoregen);

    RegistryKey<ConfiguredFeature<?, ?>> telaiteoregen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
            new Identifier("kyanite", "telaiteoregen"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, telaiteoregen.getValue(), TELAITEOREGEN);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, telaiteoregen);
   }

}
