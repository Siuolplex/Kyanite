package com.dev.siuolplex.armor;

import net.minecraft.item.ArmorMaterial;

public interface SiuolArmorMaterial extends ArmorMaterial {

    float getMaxHealth();

    float getAttackDamage();

    float getMovementSpeed();
}
