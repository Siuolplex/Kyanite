package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKykiniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteKykiniteToolMaterial implements BaseKykiniteToolMaterial {
    @Override
    public float getMaxHealth() {
        return 2;
    }

    @Override
    public float getArmor() {
        return 0;
    }

    @Override
    public float getAttackBoost() {
        return 0;
    }

    @Override
    public float getMovementSpeed() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 3056;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 6f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 21;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_ASCENSION_KYKINITE);
    }
}
