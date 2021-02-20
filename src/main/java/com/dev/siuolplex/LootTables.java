package com.dev.siuolplex;

import com.dev.siuolplex.items.Items;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.*;
import net.minecraft.util.Identifier;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Lists;

public class LootTables {
    // Shoutouts to More Gems dev KWPUGH as I adapted some of their loot table code to fit my needs. :)
    private static final List<LootTableInsert> INSERTS = Lists.newArrayList();

    public static void init() {

        {
             FabricLootPoolBuilder KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootTableRange.between(1f,4f))
                    .with(ItemEntry.builder(Items.KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.25F).build());
            insert(new LootTableInsert(KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));
            
            FabricLootPoolBuilder REFINED_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.REFINED_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.25F).build());
            insert(new LootTableInsert(REFINED_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLDEN_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.GOLDEN_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.0625F).build());
            insert(new LootTableInsert(GOLDEN_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.IRON_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.0625F).build());
            insert(new LootTableInsert(IRON_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.DIAMOND_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.0625F).build());
            insert(new LootTableInsert(DIAMOND_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.QUARTZ_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.0625F).build());
            insert(new LootTableInsert(QUARTZ_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.015F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_ASCENSION_KYKINITE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.NETHERITE_ASCENSION_KYKINITE))
                    .withCondition(RandomChanceLootCondition.builder(0.005F).build());
            insert(new LootTableInsert(NETHERITE_ASCENSION_KYKINITE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.05F).build());
            insert(new LootTableInsert(KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.05F).build());
            insert(new LootTableInsert(KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.05F).build());
            insert(new LootTableInsert(KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.05F).build());
            insert(new LootTableInsert(KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.GOLD_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.GOLD_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.GOLD_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(GOLD_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder GOLD_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.GOLD_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(GOLD_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.IRON_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(IRON_KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.IRON_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(IRON_KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.IRON_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(IRON_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder IRON_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.IRON_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(IRON_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.DIAMOND_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(DIAMOND_KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.DIAMOND_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(DIAMOND_KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.DIAMOND_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(DIAMOND_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder DIAMOND_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.DIAMOND_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(DIAMOND_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.QUARTZ_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(QUARTZ_KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.QUARTZ_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(QUARTZ_KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.QUARTZ_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(QUARTZ_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder QUARTZ_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.QUARTZ_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.01F).build());
            insert(new LootTableInsert(QUARTZ_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.003F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.003F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.003F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder POWERED_QUARTZ_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.POWERED_QUARTZ_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.003F).build());
            insert(new LootTableInsert(POWERED_QUARTZ_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYKINITE_HELMET = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.NETHERITE_KYKINITE_HELMET))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(NETHERITE_KYKINITE_HELMET, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYKINITE_CHESTPLATE = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.NETHERITE_KYKINITE_CHESTPLATE))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(NETHERITE_KYKINITE_CHESTPLATE, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYKINITE_LEGGINGS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.NETHERITE_KYKINITE_LEGGINGS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(NETHERITE_KYKINITE_LEGGINGS, new Identifier("minecraft", "chests/end_city_treasure")));

            FabricLootPoolBuilder NETHERITE_KYKINITE_BOOTS = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(Items.NETHERITE_KYKINITE_BOOTS))
                    .withFunction(EnchantWithLevelsLootFunction.builder(UniformLootTableRange.between(20.0f, 39.0f)).allowTreasureEnchantments().build())
                    .withCondition(RandomChanceLootCondition.builder(0.001F).build());
            insert(new LootTableInsert(NETHERITE_KYKINITE_BOOTS, new Identifier("minecraft", "chests/end_city_treasure")));

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
