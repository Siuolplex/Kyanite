package com.dev.siuolplex.items.armor.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.armor.base.BaseKyaniteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class NetheriteKyaniteArmorMaterials implements BaseKyaniteArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{5, 8, 12, 5};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 45;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_ASCENSION_KYANITE);
    }

    @Override
    public String getName() {
        return "netherite_kyanite";
    }

    @Override
    public float getToughness() {
        return 4;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1f;
    }

    @Override
    public float getMaxHealth() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public float getMovementSpeed() {
        return 0;
    }


}
