package com.fluidity.common.item;

import com.fluidity.common.item.tome.ItemTome;
import com.fluidity.common.lib.LibItemNames;
import com.fluidity.common.lib.LibMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public final class ModItems {
    private static ArrayList<Item> items = new ArrayList<>();
    public static Item igniTome = null;
    public static Item aquaTome = null;
    public static Item earthernTome = null;
    public static Item skyTome = null;
    public static Item shiningTome = null;
    public static Item shadowTome = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(igniTome, aquaTome, earthernTome, skyTome, shiningTome, shadowTome);
    }

    public static void init() {
        igniTome = new ItemTome(LibItemNames.FIRE_TOME_NAME);
        aquaTome = new ItemTome(LibItemNames.WATER_TOME_NAME);
        earthernTome = new ItemTome(LibItemNames.EARTH_TOME_NAME);
        skyTome = new ItemTome(LibItemNames.AIR_TOME_NAME);
        shiningTome = new ItemTome(LibItemNames.LIGHT_TOME_NAME);
        shadowTome = new ItemTome(LibItemNames.DARK_TOME_NAME);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(igniTome);
        registerRender(aquaTome);
        registerRender(earthernTome);
        registerRender(skyTome);
        registerRender(shiningTome);
        registerRender(shadowTome);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
