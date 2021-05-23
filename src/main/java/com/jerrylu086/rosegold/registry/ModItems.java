package com.jerrylu086.rosegold.registry;

import com.jerrylu086.rosegold.RoseGold;
import com.jerrylu086.rosegold.items.material.ToolTiers;
import com.jerrylu086.rosegold.items.material.ArmorMaterial;
import com.jerrylu086.rosegold.items.material.PiglinsNeutral;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RoseGold.MOD_ID);

    // Materials
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CRUSHED_ROSE_GOLD = ITEMS.register("crushed_rose_gold",
            ()-> new Item(new Item.Properties().group(ModList.get().isLoaded("create") ? ItemGroup.MATERIALS : null)));

    // Tools
    public static final RegistryObject<SwordItem> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ToolTiers.ROSE_GOLD, 2, -2.2F,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<PickaxeItem> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ToolTiers.ROSE_GOLD, 1, -2.6F,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ToolTiers.ROSE_GOLD, 4.5F, -2.8F,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<ShovelItem> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ToolTiers.ROSE_GOLD, 1.5F, -2.9F,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ToolTiers.ROSE_GOLD,-3, 0,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    // public static final RegistryObject<Item> BRASS_CLEAVER = ITEMS.register("brass_cleaver", () -> new CleaverItem(ToolTiers.BRASS, 8f, -3.2F, new Item.Properties().group(ItemGroup.COMBAT)));

    // Armors
    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new PiglinsNeutral(ArmorMaterial.ROSE_GOLD, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new PiglinsNeutral(ArmorMaterial.ROSE_GOLD, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new PiglinsNeutral(ArmorMaterial.ROSE_GOLD, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new PiglinsNeutral(ArmorMaterial.ROSE_GOLD, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    // Blocks
    public static final RegistryObject<BlockItem> ROSE_GOLD_BLOCK = ITEMS.register("rose_gold_block",
            ()-> new BlockItem(ModBlocks.ROSE_GOLD_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}