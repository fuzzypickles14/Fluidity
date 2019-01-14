package com.fluidity.common.core.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface ISidedProxy {

    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);
}
