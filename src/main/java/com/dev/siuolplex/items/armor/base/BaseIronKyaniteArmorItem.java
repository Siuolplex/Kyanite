package com.dev.siuolplex.items.armor.base;

import com.dev.siuolplex.items.armor.materials.IronKyaniteArmorMaterials;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

import java.util.UUID;

public class BaseIronKyaniteArmorItem extends BaseKyaniteArmorItem {
    private static final UUID[] MODIFIERS = new UUID[]{UUID.fromString("2f34685f-b4b4-4594-961a-9a8376628147"), UUID.fromString("74d36e6d-49ed-4b03-8ff6-79031d85981e"), UUID.fromString("b4552dc6-3050-40f4-b349-0004d3911daf"), UUID.fromString("54d192e5-5fa6-4265-bffc-f7eb1ca97b44")};
    private static final UUID[] ADDITIONALMODIFIERS = new UUID[]{UUID.fromString("7cd69b0f-7d19-48ef-8799-41a0f8efefaa"), UUID.fromString("cb4dbdde-9441-4489-b5b0-8109679f83c4"), UUID.fromString("32da46db-c3e5-44da-919f-1aff193bae55"), UUID.fromString("56628437-d6bf-422d-9de2-1ca3745e30e8")};
    private final float armorPercentBoost;
    private final int protection;
    private final float toughness;

    public BaseIronKyaniteArmorMaterial type;
    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseIronKyaniteArmorItem(BaseIronKyaniteArmorMaterial material, EquipmentSlot slot, FabricItemSettings settings) {
        super(material, slot, settings);
        this.type = material;
        this.armorPercentBoost = material.getArmorPercentBoost();
        this.protection = material.getProtectionAmount(slot);
        this.toughness = material.getToughness();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];
        UUID uUIDEXTRA = ADDITIONALMODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor modifier", (double) this.protection, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uUID, "Armor toughness", (double) this.toughness, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUIDEXTRA, "Armor Percentage modifier", (double) this.armorPercentBoost, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        this.attributeModifiers = builder.build();

    }

    public BaseIronKyaniteArmorMaterial getMaterial() {
        return type;
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }
}
