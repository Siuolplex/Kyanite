package com.dev.siuolplex;

import com.dev.siuolplex.armor.*;
import com.dev.siuolplex.blocks.Blocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {

     // Kykinite Armor Materials
    // SiuolArmorMaterial allows for usage of custom attributes within armor. Only for usage with specific sets.
    public static final ArmorMaterial KykiniteArmorMaterials = new KykiniteArmorMaterials();
    public static final SiuolArmorMaterial QuartzKykiniteArmorMaterials = new QuartzKykiniteArmorMaterials();
    public static final SiuolArmorMaterial PoweredQuartzKykiniteArmorMaterials = new PoweredQuartzKykiniteArmorMaterials();
    public static final SiuolArmorMaterial GoldKykiniteArmorMaterials = new GoldKykiniteArmorMaterials();

    // Kykinite Tool Materials
        // Currently not in existence.

    // Blocks and Misc Items
    public static final Item KYKINITE_ORE = register("kykinite_ore", new BlockItem(Blocks.KYKINITE_ORE, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE_BLOCK = register("kykinite_block", new BlockItem(Blocks.KYKINITE_BLOCK, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE = register("kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item REFINED_KYKINITE = register("refined_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE_SHARD = register("kykinite_shard", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));

    // Ascension Items
    public static final Item GOLDEN_ASCENSION_KYKINITE = register("golden_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item POWERED_QUARTZ_ASCENSION_KYKINITE = register("powered_quartz_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item QUARTZ_ASCENSION_KYKINITE = register("quartz_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));


    // Base(d) Kykinite
    public static final Item KYKINITE_HELMET = register("kykinite_helmet", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.HEAD, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_CHESTPLATE = register("kykinite_chestplate", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.CHEST, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_LEGGINGS = register("kykinite_leggings", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.LEGS, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_BOOTS = register("kykinite_boots", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.FEET, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    // Quartz Kykinite
    public static final Item QUARTZ_KYKINITE_HELMET = register("quartz_kykinite_helmet", new SiuolArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_CHESTPLATE = register("quartz_kykinite_chestplate", new SiuolArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_LEGGINGS = register("quartz_kykinite_leggings", new SiuolArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_BOOTS = register("quartz_kykinite_boots", new SiuolArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    // Powered Quartz Kykinite
    public static final Item POWERED_QUARTZ_KYKINITE_HELMET = register("powered_quartz_kykinite_helmet", new SiuolArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_CHESTPLATE = register("powered_quartz_kykinite_chestplate", new SiuolArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_LEGGINGS = register("powered_quartz_kykinite_leggings", new SiuolArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_BOOTS = register("powered_quartz_kykinite_boots", new SiuolArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    //Golden Kykinite
    public static final Item GOLD_KYKINITE_HELMET = register("golden_kykinite_helmet", new SiuolArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_CHESTPLATE = register("golden_kykinite_chestplate", new SiuolArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_LEGGINGS = register("golden_kykinite_leggings", new SiuolArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_BOOTS = register("golden_kykinite_boots", new SiuolArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));


    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("kykinite", name), item);
        // Remember, the namespace is kykinite.

    }

    public static void init() {

    }
}