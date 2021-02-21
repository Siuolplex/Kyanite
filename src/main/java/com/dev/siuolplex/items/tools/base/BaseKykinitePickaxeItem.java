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

    private final float armor;
    private final float maxHealth;
    private final float attackDamage;
    private final float movementSpeed;
    private final float attackBoost;

    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseKykinitePickaxeItem(BaseKykiniteToolMaterial material, int attackDamage, FabricItemSettings settings) {
        super(material, attackDamage, -2.8f, settings);
        this.maxHealth = material.getMaxHealth();
        this.attackDamage = (float)attackDamage + material.getAttackDamage();
        this.armor = material.getArmor();
        this.movementSpeed = material.getMovementSpeed();
        this.attackBoost = material.getAttackBoost();        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Pickaxe Danage", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Pickaxe Speed", -2.8, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Pickaxe Health modifier", (double)this.maxHealth, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Pickaxe Armor modifier", (double)this.armor, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Pickaxe Movement Speed modifier", (double)this.movementSpeed, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(UUID.fromString("0aa9aa23-9536-426b-b806-0a45446be8a0"), "Pickaxe Percentage Attack Boost modifier", (double)this.attackBoost, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        this.attributeModifiers = builder.build();

    }

    public float getMaxHealth() {
        return this.maxHealth;
    }

    public float getArmor() {return this.armor;}

    public float getAttackDamage() {return this.attackDamage;}

    public float getMovementSpeed() {
        return this.movementSpeed;
    }

    public float getAttackBoost() {return this.attackBoost;}

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }
}


