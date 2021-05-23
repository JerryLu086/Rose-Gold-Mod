package com.jerrylu086.rosegold;

import com.jerrylu086.rosegold.registry.ModBlocks;
import com.jerrylu086.rosegold.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RoseGold.MOD_ID)
@Mod.EventBusSubscriber(modid = RoseGold.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoseGold
{

    public static final String MOD_ID = "rosegold";

    public RoseGold()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }

}