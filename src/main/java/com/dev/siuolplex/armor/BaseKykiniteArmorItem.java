package com.dev.siuolplex.armor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;

import java.util.UUID;

public class BaseKykiniteArmorItem extends ArmorItem {
    private static final UUID[] MODIFIERS = new UUID[]{UUID.fromString("5261039c-c0a9-4d89-b430-41cb95e82e3c"), UUID.fromString("7fd4340a-3161-403f-8112-4103c1d8a006"), UUID.fromString("e76f4b30-920b-45dd-b7fa-2425dff56656"), UUID.fromString("9a626f28-7cfe-45ed-995d-ad24d3d2520e")};
    private final int protection;
    private final float toughness;
    private final float knockbackResistance;
    // You might ask? "But Siuol, why did ya implement these if they are already in the main one?" You see, they kinda just didnt work without reimplementation. So uh yeah. Kinda reminds me of that one time with MCPNP
    private final float maxHealth;
    private final float movementSpeed;
    private final float attackDamage;

    private final float attackSpeed;

    public BaseKykiniteArmorMaterial type;
    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseKykiniteArmorItem(BaseKykiniteArmorMaterial material, EquipmentSlot slot, FabricItemSettings settings) {
        super(material, slot, settings);
        this.type = material;
        this.protection = material.getProtectionAmount(slot);
        this.toughness = material.getToughness();
        this.knockbackResistance = material.getKnockbackResistance();
        this.maxHealth = material.getMaxHealth();
        this.attackDamage = material.getAttackDamage();
        this.movementSpeed = material.getMovementSpeed();
        this.attackSpeed = material.getAttackSpeed();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor modifier", (double)this.protection, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uUID, "Armor toughness", (double)this.toughness, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uUID, "Armor knockback resistance", (double)this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uUID, "Armor Health modifier", (double)this.maxHealth, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uUID, "Armor Attack modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uUID, "Armor Movement Speed modifier", (double)this.movementSpeed, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uUID, "Armor Attack Speed modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
         this.attributeModifiers = builder.build();

    }
    public BaseKykiniteArmorMaterial getMaterial() {
        return this.type;
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }

    public int getProtection() {return this.protection;}

    public float method_26353() {return this.toughness;}

    public float getMaxHealth() {
        return this.maxHealth;
    }

    public float getMovementSpeed() {
        return this.movementSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public float getKnockbackResistance(){
        return this.knockbackResistance;
    }

    public float getAttackSpeed(){
        return this.attackSpeed;
    }
}

