package com.dev.siuolplex.items;

import com.dev.siuolplex.ArmorAugmentation;
import com.dev.siuolplex.blocks.Blocks;
import com.dev.siuolplex.items.armor.base.BaseIronKyaniteArmorItem;
import com.dev.siuolplex.items.armor.base.BaseIronKyaniteArmorMaterial;
import com.dev.siuolplex.items.armor.base.BaseKyaniteArmorItem;
import com.dev.siuolplex.items.armor.base.BaseKyaniteArmorMaterial;
import com.dev.siuolplex.items.armor.materials.*;
import com.dev.siuolplex.items.tools.base.*;
import com.dev.siuolplex.items.tools.materials.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {

    // Registered Armor and Tool Materials
    public static final ArmorMaterial KyaniteArmorMaterials = new KyaniteArmorMaterials();
    public static final BaseKyaniteArmorMaterial QuartzKyaniteArmorMaterials = new QuartzKyaniteArmorMaterials();
    public static final BaseKyaniteArmorMaterial PoweredQuartzKyaniteArmorMaterials = new PoweredQuartzKyaniteArmorMaterials();
    public static final BaseKyaniteArmorMaterial GoldKyaniteArmorMaterials = new GoldKyaniteArmorMaterials();
    public static final BaseKyaniteArmorMaterial DiamondKyaniteArmorMaterials = new DiamondKyaniteArmorMaterials();
    public static final BaseKyaniteArmorMaterial NetheriteKyaniteArmorMaterials = new NetheriteKyaniteArmorMaterials();
    public static final BaseIronKyaniteArmorMaterial IronKyaniteArmorMaterials = new IronKyaniteArmorMaterials();

    public static final BaseKyaniteToolMaterial KyaniteToolMaterial = new KyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial GoldKyaniteToolMaterial = new GoldKyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial IronKyaniteToolMaterial = new IronKyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial DiamondKyaniteToolMaterial = new DiamondKyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial NetheriteKyaniteToolMaterial = new NetheriteKyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial QuartzKyaniteToolMaterial = new QuartzKyaniteToolMaterial();
    public static final BaseKyaniteToolMaterial PoweredQuartzKyaniteToolMaterial = new PoweredQuartzKyaniteToolMaterial();

// Item Registry. I perfer it this way for some reasons.

    // Blocks and Misc Items
    public static final Item KYANITE_ORE = register("kyanite_ore", new BlockItem(Blocks.KYANITE_ORE, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYANITE_BLOCK = register("kyanite_block", new BlockItem(Blocks.KYANITE_BLOCK, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYANITE = register("kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item REFINED_KYANITE = register("refined_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYANITE_SHARD = register("kyanite_shard", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item REVERSION_TELAITE = register("reversion_telaite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item TELAITE = register("telaite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item TELAITE_SHARD = register("telaite_shard", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item TELAITE_ORE = register("telaite_ore", new BlockItem(Blocks.TELAITE_ORE, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item TELAITE_BLOCK = register("telaite_block", new BlockItem(Blocks.TELAITE_BLOCK, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));

    // Ascension Items - These are the items used to upgrade your armor.
    public static final Item GOLDEN_ASCENSION_KYANITE = register("golden_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item POWERED_QUARTZ_ASCENSION_KYANITE = register("powered_quartz_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item QUARTZ_ASCENSION_KYANITE = register("quartz_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item DIAMOND_ASCENSION_KYANITE = register("diamond_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item IRON_ASCENSION_KYANITE = register("iron_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item NETHERITE_ASCENSION_KYANITE = register("netherite_ascension_kyanite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).fireproof()));

    // Base(d) Kyanite - The base Kyanite set, weakest of them all
    public static final Item KYANITE_HELMET = register("kyanite_helmet", new ArmorItem(KyaniteArmorMaterials, EquipmentSlot.HEAD, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_CHESTPLATE = register("kyanite_chestplate", new ArmorItem(KyaniteArmorMaterials, EquipmentSlot.CHEST, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_LEGGINGS = register("kyanite_leggings", new ArmorItem(KyaniteArmorMaterials, EquipmentSlot.LEGS, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_BOOTS = register("kyanite_boots", new ArmorItem(KyaniteArmorMaterials, EquipmentSlot.FEET, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_SWORD = register("kyanite_sword", new BaseKyaniteSwordItem(KyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_AXE = register("kyanite_axe", new BaseKyaniteAxeItem(KyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_PICKAXE = register("kyanite_pickaxe", new BaseKyanitePickaxeItem(KyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_SHOVEL = register("kyanite_shovel", new BaseKyaniteShovelItem(KyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYANITE_HOE = register("kyanite_hoe", new BaseKyaniteHoeItem(KyaniteToolMaterial, -0.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));

    // Quartz Kyanite - The Quartz Kyanite Set, Boosts attack by 10% per item
    public static final Item QUARTZ_KYANITE_HELMET = register("quartz_kyanite_helmet", new BaseKyaniteArmorItem(QuartzKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_CHESTPLATE = register("quartz_kyanite_chestplate", new BaseKyaniteArmorItem(QuartzKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_LEGGINGS = register("quartz_kyanite_leggings", new BaseKyaniteArmorItem(QuartzKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_BOOTS = register("quartz_kyanite_boots", new BaseKyaniteArmorItem(QuartzKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_SWORD = register("quartz_kyanite_sword", new BaseKyaniteSwordItem(QuartzKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_AXE = register("quartz_kyanite_axe", new BaseKyaniteAxeItem(QuartzKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_PICKAXE = register("quartz_kyanite_pickaxe", new BaseKyanitePickaxeItem(QuartzKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_SHOVEL = register("quartz_kyanite_shovel", new BaseKyaniteShovelItem(QuartzKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYANITE_HOE = register("quartz_kyanite_hoe", new BaseKyaniteHoeItem(QuartzKyaniteToolMaterial, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    // Powered Quartz Kyanite - The Powered Quartz Kyanite Set. Boosts attack by 10% and speed by 0.025 Minecraft speed unit per item
    public static final Item POWERED_QUARTZ_KYANITE_HELMET = register("powered_quartz_kyanite_helmet", new BaseKyaniteArmorItem(PoweredQuartzKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYANITE_CHESTPLATE = register("powered_quartz_kyanite_chestplate", new BaseKyaniteArmorItem(PoweredQuartzKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYANITE_LEGGINGS = register("powered_quartz_kyanite_leggings", new BaseKyaniteArmorItem(PoweredQuartzKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYANITE_BOOTS = register("powered_quartz_kyanite_boots", new BaseKyaniteArmorItem(PoweredQuartzKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYANITE_SWORD = register("powered_quartz_kyanite_sword", new BaseKyaniteSwordItem(PoweredQuartzKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYANITE_AXE = register("powered_quartz_kyanite_axe", new BaseKyaniteAxeItem(PoweredQuartzKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYANITE_PICKAXE = register("powered_quartz_kyanite_pickaxe", new BaseKyanitePickaxeItem(PoweredQuartzKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYANITE_SHOVEL = register("powered_quartz_kyanite_shovel", new BaseKyaniteShovelItem(PoweredQuartzKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYANITE_HOE = register("powered_quartz_kyanite_hoe", new BaseKyaniteHoeItem(PoweredQuartzKyaniteToolMaterial, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Golden Kyanite - The Golden Kyanite set. References in code swap between Gold and Golden due to my own stupidity. Boosts health by 2.5 hearts per item
    public static final Item GOLD_KYANITE_HELMET = register("golden_kyanite_helmet", new BaseKyaniteArmorItem(GoldKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_CHESTPLATE = register("golden_kyanite_chestplate", new BaseKyaniteArmorItem(GoldKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_LEGGINGS = register("golden_kyanite_leggings", new BaseKyaniteArmorItem(GoldKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_BOOTS = register("golden_kyanite_boots", new BaseKyaniteArmorItem(GoldKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_SWORD = register("golden_kyanite_sword", new BaseKyaniteSwordItem(GoldKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_AXE = register("golden_kyanite_axe", new BaseKyaniteAxeItem(GoldKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_PICKAXE = register("golden_kyanite_pickaxe", new BaseKyanitePickaxeItem(GoldKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_SHOVEL = register("golden_kyanite_shovel", new BaseKyaniteShovelItem(GoldKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYANITE_HOE = register("golden_kyanite_hoe", new BaseKyaniteHoeItem(GoldKyaniteToolMaterial, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Diamond Kyanite - The Diamond Kyanite set. General boost. Around Vanilla Netherite level.
    public static final Item DIAMOND_KYANITE_HELMET = register("diamond_kyanite_helmet", new BaseKyaniteArmorItem(DiamondKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_CHESTPLATE = register("diamond_kyanite_chestplate", new BaseKyaniteArmorItem(DiamondKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_LEGGINGS = register("diamond_kyanite_leggings", new BaseKyaniteArmorItem(DiamondKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_BOOTS = register("diamond_kyanite_boots", new BaseKyaniteArmorItem(DiamondKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_SWORD = register("diamond_kyanite_sword", new BaseKyaniteSwordItem(DiamondKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_AXE = register("diamond_kyanite_axe", new BaseKyaniteAxeItem(DiamondKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_PICKAXE = register("diamond_kyanite_pickaxe", new BaseKyanitePickaxeItem(DiamondKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_SHOVEL = register("diamond_kyanite_shovel", new BaseKyaniteShovelItem(DiamondKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYANITE_HOE = register("diamond_kyanite_hoe", new BaseKyaniteHoeItem(DiamondKyaniteToolMaterial, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Netherite Kyanite - The Netherite Kyanite set. Boosts more than Diamond Kyanite. Also gives 1 heart
    public static final Item NETHERITE_KYANITE_HELMET = register("netherite_kyanite_helmet", new BaseKyaniteArmorItem(NetheriteKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_CHESTPLATE = register("netherite_kyanite_chestplate", new BaseKyaniteArmorItem(NetheriteKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_LEGGINGS = register("netherite_kyanite_leggings", new BaseKyaniteArmorItem(NetheriteKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_BOOTS = register("netherite_kyanite_boots", new BaseKyaniteArmorItem(NetheriteKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_SWORD = register("netherite_kyanite_sword", new BaseKyaniteSwordItem(NetheriteKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_AXE = register("netherite_kyanite_axe", new BaseKyaniteAxeItem(NetheriteKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_PICKAXE = register("netherite_kyanite_pickaxe", new BaseKyanitePickaxeItem(NetheriteKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_SHOVEL = register("netherite_kyanite_shovel", new BaseKyaniteShovelItem(NetheriteKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYANITE_HOE = register("netherite_kyanite_hoe", new BaseKyaniteHoeItem(NetheriteKyaniteToolMaterial, 1f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));

    //Iron Kyanite - The Iron Kyanite set. Uses a special "BaseIronKyaniteArmor" which may be rectified in a future update. Boosts armor by 25%
    public static final Item IRON_KYANITE_HELMET = register("iron_kyanite_helmet", new BaseIronKyaniteArmorItem(IronKyaniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYANITE_CHESTPLATE = register("iron_kyanite_chestplate", new BaseIronKyaniteArmorItem(IronKyaniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYANITE_LEGGINGS = register("iron_kyanite_leggings", new BaseIronKyaniteArmorItem(IronKyaniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYANITE_BOOTS = register("iron_kyanite_boots", new BaseIronKyaniteArmorItem(IronKyaniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYANITE_SWORD = register("iron_kyanite_sword", new BaseKyaniteSwordItem(IronKyaniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYANITE_AXE = register("iron_kyanite_axe", new BaseKyaniteAxeItem(IronKyaniteToolMaterial, 6, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYANITE_PICKAXE = register("iron_kyanite_pickaxe", new BaseKyanitePickaxeItem(IronKyaniteToolMaterial, 2, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYANITE_SHOVEL = register("iron_kyanite_shovel", new BaseKyaniteShovelItem(IronKyaniteToolMaterial, 1.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYANITE_HOE = register("iron_kyanite_hoe", new BaseKyaniteHoeItem(IronKyaniteToolMaterial, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("kyanite", name), item);
        // Remember, the namespace is kyanite.
    }

    //Initialization method thingy.
    public static void init() {}
}
