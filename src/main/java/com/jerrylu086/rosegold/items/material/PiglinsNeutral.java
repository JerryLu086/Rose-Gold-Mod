package com.jerrylu086.rosegold.items.material;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class PiglinsNeutral extends ArmorItem
{
    public PiglinsNeutral(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties)
    {
        super(materialIn, slot, properties);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
    {
        return true;
    }
}