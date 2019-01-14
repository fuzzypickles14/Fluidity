package com.fluidity.common.item;

import com.fluidity.common.core.ModCreativeTab;
import net.minecraft.item.Item;

public class BaseItem extends Item {

    public BaseItem(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTab.instance);
    }



//    @Override
//    @SideOnly(Side.CLIENT)
//    public void registerModel() {
//        ModelHandler.registerModel(this, 0);
//    }
}
