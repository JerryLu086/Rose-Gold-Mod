package com.jerrylu086.rosegold.registry;

import com.jerrylu086.rosegold.RoseGold;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RoseGold.MOD_ID);

    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register("rose_gold_block",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(4.0F, 6.0F)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));
}