package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKykiniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondKykiniteToolMaterial implements BaseKykiniteToolMaterial {
    @Override
    public float getMaxHealth() {
    return 0;
}

    @Override
    public float getArmor() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 2111;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11;
    }

    @Override
    public float getAttackDamage() {
        return 4f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND_ASCENSION_KYKINITE);
    }

    @Override
    public float getAttackBoost() {
        return 0;
    }

    @Override
    public float getMovementSpeed() {
        return 0;
    }

}
