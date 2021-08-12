package com.akuno.dogeutils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(DogeUtils.MOD_ID)
public class DogeUtils
{
    public static final String MOD_ID = "dogeutils";
    public DogeUtils()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.register(modEventBus);
    }
    public static class Items
    {
        private static final    DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

        public  static final    RegistryObject<Item> KABOSU_CHAN =
                ITEMS.register("kabosu_chan", ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

        public  static void     register(IEventBus eventBus)
        {
            ITEMS.register(eventBus);
        }
    }
}
