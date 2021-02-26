package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKyaniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PoweredQuartzKyaniteToolMaterial implements BaseKyaniteToolMaterial {
    @Override
    public float getMaxHealth() {
        return 0;
    }

    @Override
    public float getArmor() {
        return 0;
    }

    @Override
    public float getAttackBoost() {
        return 0.25f;
    }

    @Override
    public float getMovementSpeed() {
        return 0.025f;
    }

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10f;
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
        return 6;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.POWERED_QUARTZ_ASCENSION_KYANITE);
    }
}
