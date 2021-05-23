package com.jerrylu086.rosegold.utils;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public final class CustomItemTags
{
	public static final Tags.IOptionalNamedTag<Item> BRASS_INGOT = net.minecraft.tags.ItemTags.createOptional(new ResourceLocation("forge", "ingots/brass"));
	
	private CustomItemTags() {}
}