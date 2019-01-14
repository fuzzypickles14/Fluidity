package com.fluidity.common.core;

import com.fluidity.common.item.ModItems;
import com.fluidity.common.lib.LibMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab extends CreativeTabs {
    public static final ModCreativeTab instance = new ModCreativeTab();

    public ModCreativeTab() {
        super(LibMod.MOD_ID + ".tab");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.igniTome);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}

