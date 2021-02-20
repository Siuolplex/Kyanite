package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKykiniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteKykiniteToolMaterial implements BaseKykiniteToolMaterial {
    @Override
    public float getMaxHealth() {
        return 4;
    }

    @Override
    public float getArmor() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 7f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_ASCENSION_KYKINITE);
    }
}
