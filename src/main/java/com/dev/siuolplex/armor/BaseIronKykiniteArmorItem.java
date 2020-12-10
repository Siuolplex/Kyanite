package com.dev.siuolplex.armor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import com.dev.siuolplex.armor.BaseKykiniteArmorItem;

import java.util.UUID;

public class BaseIronKykiniteArmorItem extends BaseKykiniteArmorItem {
    private static final UUID[] MODIFIERS = new UUID[]{UUID.fromString("2f34685f-b4b4-4594-961a-9a8376628147"), UUID.fromString("74d36e6d-49ed-4b03-8ff6-79031d85981e"), UUID.fromString("b4552dc6-3050-40f4-b349-0004d3911daf"), UUID.fromString("54d192e5-5fa6-4265-bffc-f7eb1ca97b44")};
    private final float armorPercentBoost;

    public BaseIronKykiniteArmorMaterial type;
    public Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public BaseIronKykiniteArmorItem(BaseIronKykiniteArmorMaterial material, EquipmentSlot slot, FabricItemSettings settings) {
        super(material, slot, settings);
        this.type = material;
        this.armorPercentBoost = material.getArmorPercentBoost();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor Percentage modifier", (double)this.armorPercentBoost, EntityAttributeModifier.Operation.MULTIPLY));
         this.attributeModifiers = builder.build();

    }
    public BaseIronKykiniteArmorMaterial getMaterial() {
        return this.type;
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }
   
        public float getArmorPercentBoost(){
    return this.armorPercentBoost;
    }
}
