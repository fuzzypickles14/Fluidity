package com.fluidity.common.fluid;

import com.fluidity.common.fluid.water.BaseWaterFluid;
import com.fluidity.common.lib.LibMod;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public class ModFluids {
    public static Fluid baseWater = null;


    public static void init() {
        baseWater = new BaseWaterFluid();
        registerFluid(baseWater);
    }

    public static void registerFluid(Fluid... fluids) {
        for (Fluid fluid : fluids) {
            FluidRegistry.addBucketForFluid(fluid);
            FluidRegistry.registerFluid(fluid);
        }
    }
}
