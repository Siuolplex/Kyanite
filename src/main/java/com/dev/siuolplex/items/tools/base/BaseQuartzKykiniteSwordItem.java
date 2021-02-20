package com.dev.siuolplex.items.tools.base;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

import java.util.UUID;

public class BaseQuartzKykiniteSwordItem extends BaseKykiniteSwordItem {
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {return super.getAttributeModifiers(EquipmentSlot.MAINHAND); }

    private final float attackBoost;
    private final float movementSpeed;

    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseQuartzKykiniteSwordItem(BaseQuartzKykiniteToolMaterial material, int attackDamage, FabricItemSettings settings) {
        super(material, attackDamage, settings);
        this.movementSpeed = material.getMovementSpeed();
        this.attackBoost = material.getAttackBoost();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Weapon Movement Speed modifier", (double)this.movementSpeed, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(UUID.fromString("743ce14d-2754-4d8c-9d17-a09a32f9536b"), "Weapon Percentage Attack Boost modifier", (double)this.attackBoost, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        this.attributeModifiers = builder.build();

    }
    public float getMovementSpeed() {
        return this.movementSpeed;
    }

    public float getAttackBoost() {return this.attackBoost;}
}
