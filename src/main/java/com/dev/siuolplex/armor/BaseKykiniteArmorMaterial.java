package com.dev.siuolplex.armor;

import net.minecraft.item.ArmorMaterial;

public interface BaseKykiniteArmorMaterial extends ArmorMaterial {
    float getMaxHealth();

    float getAttackDamage();

    float getMovementSpeed();

    float getArmorPercentBoost();
}
