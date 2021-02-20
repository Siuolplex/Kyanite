package com.dev.siuolplex.items.tools.base;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.PickaxeItem;

import java.util.UUID;

public class BaseKykinitePickaxeItem extends PickaxeItem {

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {return super.getAttributeModifiers(EquipmentSlot.MAINHAND); }

    private final float armor;
    private final float maxHealth;

    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseKykinitePickaxeItem(BaseKykiniteToolMaterial material, int attackDamage, FabricItemSettings settings) {
        super(material, attackDamage, -2.8f, settings);
        this.maxHealth = material.getMaxHealth();
        this.armor = material.getArmor();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Armor Health modifier", (double)this.maxHealth, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Armor Attack modifier", (double)this.armor, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        this.attributeModifiers = builder.build();

    }
    public float getMaxHealth() {
        return this.maxHealth;
    }

    public float getArmor() {return this.armor;}
}
