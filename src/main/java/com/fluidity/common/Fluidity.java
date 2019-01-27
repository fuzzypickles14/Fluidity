package com.fluidity.common;

import com.fluidity.common.block.ModBlocks;
import com.fluidity.common.core.proxy.ISidedProxy;
import com.fluidity.common.fluid.ModFluids;
import com.fluidity.common.item.ModItems;
import com.fluidity.common.lib.LibMod;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LibMod.MOD_ID, name = LibMod.MOD_NAME, version = LibMod.MOD_VERSION)
public class Fluidity
{
    private static Logger logger;

    @SidedProxy(serverSide = LibMod.COMMON_PROXY, clientSide = LibMod.CLIENT_PROXY)
    public static ISidedProxy proxy;

    static {
        FluidRegistry.enableUniversalBucket();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        ModFluids.init();
        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)  {
        proxy.init(event);
    }
}
