package com.akuno.dogeutils;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
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
        Blocks.register(modEventBus);
    }

    /**
     * ブロック追加用クラス
     */
    public static class Blocks
    {
        private static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

        public static void register(IEventBus eventBus)
        {
            BLOCKS.register(eventBus);
        }
    }

    /**
     * アイテム追加用クラス
     */
    public static class Items
    {
        private static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

        public static void register(IEventBus eventBus)
        {
            ITEMS.register(eventBus);
        }

        public static final RegistryObject<Item> KABOSU_CHAN =
                ITEMS.register("kabosu_chan", ()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    }
}
