package com.dev.siuolplex.items.armor.base;

import net.minecraft.item.ArmorMaterial;

public interface BaseKykiniteArmorMaterial extends ArmorMaterial {
    float getMaxHealth();

    float getAttackDamage();

    float getMovementSpeed();
}
