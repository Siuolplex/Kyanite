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
    // BaseKykiniteArmorMaterial allows for usage of custom attributes within armor. Only for usage with specific sets.
    public static final ArmorMaterial KykiniteArmorMaterials = new KykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial QuartzKykiniteArmorMaterials = new QuartzKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial PoweredQuartzKykiniteArmorMaterials = new PoweredQuartzKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial GoldKykiniteArmorMaterials = new GoldKykiniteArmorMaterials();
    public static final DiamondKykiniteArmorMaterials DiamondKykiniteArmorMaterials = new DiamondKykiniteArmorMaterials();
    public static final NetheriteKykiniteArmorMaterials NetheriteKykiniteArmorMaterials = new NetheriteKykiniteArmorMaterials();
    public static final IronKykiniteArmorMaterials IronKykiniteArmorMaterials = new IronKykiniteArmorMaterials();

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
    public static final Item DIAMOND_ASCENSION_KYKINITE = register("diamond_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item NETHERITE_ASCENSION_KYKINITE = register("netherite_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).fireproof()));
    public static final Item IRON_ASCENSION_KYKINITE = register("iron_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));

    // Base(d) Kykinite
    public static final Item KYKINITE_HELMET = register("kykinite_helmet", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.HEAD, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_CHESTPLATE = register("kykinite_chestplate", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.CHEST, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_LEGGINGS = register("kykinite_leggings", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.LEGS, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_BOOTS = register("kykinite_boots", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.FEET, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    // Quartz Kykinite
    public static final Item QUARTZ_KYKINITE_HELMET = register("quartz_kykinite_helmet", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_CHESTPLATE = register("quartz_kykinite_chestplate", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_LEGGINGS = register("quartz_kykinite_leggings", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_BOOTS = register("quartz_kykinite_boots", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    // Powered Quartz Kykinite
    public static final Item POWERED_QUARTZ_KYKINITE_HELMET = register("powered_quartz_kykinite_helmet", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_CHESTPLATE = register("powered_quartz_kykinite_chestplate", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_LEGGINGS = register("powered_quartz_kykinite_leggings", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_BOOTS = register("powered_quartz_kykinite_boots", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    //Golden Kykinite
    public static final Item GOLD_KYKINITE_HELMET = register("golden_kykinite_helmet", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_CHESTPLATE = register("golden_kykinite_chestplate", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_LEGGINGS = register("golden_kykinite_leggings", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_BOOTS = register("golden_kykinite_boots", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    //Diamond Kykinite
    public static final Item DIAMOND_KYKINITE_HELMET = register("diamond_kykinite_helmet", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_CHESTPLATE = register("diamond_kykinite_chestplate", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_LEGGINGS = register("diamond_kykinite_leggings", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_BOOTS = register("diamond_kykinite_boots", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    //Netherite Kykinite
    public static final Item NETHERITE_KYKINITE_HELMET = register("netherite_kykinite_helmet", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_CHESTPLATE = register("netherite_kykinite_chestplate", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_LEGGINGS = register("netherite_kykinite_leggings", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_BOOTS = register("netherite_kykinite_boots", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    //Iron Kykinite
    public static final Item IRON_KYKINITE_HELMET = register("iron_kykinite_helmet", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_CHESTPLATE = register("iron_kykinite_chestplate", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_LEGGINGS = register("iron_kykinite_leggings", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_BOOTS = register("iron_kykinite_boots", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));


    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("kykinite", name), item);
        // Remember, the namespace is kykinite.

    }

    public static void init() {

    }
}
