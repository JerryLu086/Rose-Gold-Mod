package com.jerrylu086.rosegold.items.specialtools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CleaverItem extends SwordItem {

    private final float attackDamage;
    private final float attackSpeed;

    public CleaverItem(IItemTier tier, float attackDamage, float attackSpeed, Properties properties) {
        super(tier, 6, attackSpeed, properties);
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (super.hitEntity(stack, target, attacker)) {
            target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 60, 3, false, false));
            return true;
        }
        return false;
    }

}
