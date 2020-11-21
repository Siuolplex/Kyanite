package com.dev.siuolplex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ArmorAugmentation implements ModInitializer {

	public static final ItemGroup ARMORAUGMENT = FabricItemGroupBuilder.build(new Identifier("kykinite","augmentedarmor"), () -> new ItemStack(Items.KYKINITE));

	private static final ConfiguredFeature<?, ?> KYKINITEOREGEN = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					com.dev.siuolplex.blocks.Blocks.KYKINITE_ORE.getDefaultState(),
					8))
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					64)))
			.spreadHorizontally()
			.repeat(1);

// God this is messy, I plan on putting these into separate classes. But until then lets deal with this.

	@Override
	public void onInitialize() {

		Items.init();
		com.dev.siuolplex.blocks.Blocks.init();

		RegistryKey<ConfiguredFeature<?, ?>> kykiniteoregen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("kykinite", "kykiniteoregen"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, kykiniteoregen.getValue(), KYKINITEOREGEN);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, kykiniteoregen);

		System.out.println("Kykinite has been initalized!");
	}
}
