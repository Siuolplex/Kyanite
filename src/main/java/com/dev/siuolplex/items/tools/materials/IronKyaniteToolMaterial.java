package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKyaniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronKyaniteToolMaterial implements BaseKyaniteToolMaterial {
    @Override
    public float getMaxHealth() {
        return 0;
    }

    @Override
    public float getArmor() {
        return 0.25f;
    }

    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_ASCENSION_KYANITE);
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