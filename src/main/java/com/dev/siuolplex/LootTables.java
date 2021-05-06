package com.dev.siuolplex;

import com.dev.siuolplex.items.Items;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.*;
import net.minecraft.util.Identifier;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Lists;

public class LootTables {
    // Shoutouts to More Gems dev KWPUGH as I adapted some of their loot table code to fit my needs. :)
    // Should of included this earlier, but its found at https://github.com/kwpugh/MoreGems

    private static final List<LootTableInsert> INSERTS = Lists.newArrayList();

    public static void init() {

        {
            // Basic Kyanite and Ascension Kyanite
            FabricLootPoolBuilder TELAITE = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(1f,5f))
                    .with(ItemEntry.builder(Items.TELAITE))
                    .withCondition(RandomChanceLootCondition.builder(0.1F).build());
            insert(new LootTableInsert(TELAITE, new Identifier("minecraft", "chests/end_city_treasure")));

             FabricLootPoolBuilder KYANITE = FabricLootPoolBuilder.builder()
                     .rolls(UniformLootNumberProvider.create(1f,5f))
                    .with(ItemEntry.builder(Items.KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.1F).build());
            insert(new LootTableInsert(KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));
            
            FabricLootPoolBuilder REFINED_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(1f,2f))
                    .with(ItemEntry.builder(Items.REFINED_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.1F).build());
            insert(new LootTableInsert(REFINED_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLDEN_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLDEN_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.03F).build());
            insert(new LootTableInsert(GOLDEN_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.03F).build());
            insert(new LootTableInsert(IRON_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.03F).build());
            insert(new LootTableInsert(DIAMOND_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.03F).build());
            insert(new LootTableInsert(QUARTZ_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.007F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_ASCENSION_KYANITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_ASCENSION_KYANITE))
                    .withCondition(RandomChanceLootCondition.builder(0.002F).build());
            insert(new LootTableInsert(NETHERITE_ASCENSION_KYANITE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Kyanite Armor and Tools

            FabricLootPoolBuilder KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.02F).build());
            insert(new LootTableInsert(KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Golden Kyanite Armor and Tools

            FabricLootPoolBuilder GOLD_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.GOLD_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(GOLD_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Iron Kyanite Armor and Tools

            FabricLootPoolBuilder IRON_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.IRON_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(IRON_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Diamond Kyanite Armor and Tools

            FabricLootPoolBuilder DIAMOND_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.DIAMOND_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(DIAMOND_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Quartz Kyanite Armor and Tools

            FabricLootPoolBuilder QUARTZ_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.QUARTZ_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(QUARTZ_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Powered Quartz Kyanite Armor and Tools

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001f).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Netherite Kyanite Armor and Tools

            FabricLootPoolBuilder NETHERITE_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_SWORD))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_SWORD, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_PICKAXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_PICKAXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_AXE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_AXE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_SHOVEL))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_SHOVEL, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.NETHERITE_KYANITE_HOE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.00025F).build());
            insert(new LootTableInsert(NETHERITE_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            // Stronghold loot

            FabricLootPoolBuilder STRONGHOLD_KYANITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_HELMET))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_HELMET, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_CHESTPLATE))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_CHESTPLATE, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_LEGGINGS))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_LEGGINGS, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_BOOTS))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_BOOTS, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_SWORD = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_SWORD))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_SWORD, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_PICKAXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_PICKAXE))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_PICKAXE, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_AXE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_AXE))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_AXE, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_SHOVEL = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_SHOVEL))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_SHOVEL, new Identifier("minecraft", "chests/stronghold_corridor")));

            FabricLootPoolBuilder STRONGHOLD_KYANITE_HOE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1f))
                    .with(ItemEntry.builder(Items.KYANITE_HOE))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(STRONGHOLD_KYANITE_HOE, new Identifier("minecraft", "chests/end_city_treasure")));

            LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, identifier, supplier, lootTableSetter) -> INSERTS.forEach(i -> {
                        if (ArrayUtils.contains(i.tables, identifier)) {
                            i.insert(supplier);
                        }
                    }
            )));
        }
    }


    public static void insert(LootTableInsert insert) {
        INSERTS.add(insert);
    }

    public static class LootTableInsert {
        public final Identifier[] tables;
        public final FabricLootPoolBuilder lootPool;

        public LootTableInsert(FabricLootPoolBuilder lootPool, Identifier... tables) {
            this.tables = tables;
            this.lootPool = lootPool;
        }

        public void insert(FabricLootSupplierBuilder supplier) {
            supplier.pool(lootPool);
        }
    }
}
