package com.fluidity.common.block.fluids.water;

import com.fluidity.common.block.fluids.BaseBlockFluid;
import com.fluidity.common.fluid.ModFluids;
import com.fluidity.common.lib.LibFluidConstants;
import com.fluidity.common.lib.LibItemNames;
import com.fluidity.common.lib.LibMod;
import net.minecraft.block.material.Material;

public class BaseWaterBlockFluid extends BaseBlockFluid{
    public BaseWaterBlockFluid() {
        super(ModFluids.baseWater, Material.WATER, LibFluidConstants.BASE_WATER_TOTAL_ENERGY, LibFluidConstants.BASE_WATER_ACTIVATION);
        this.setRegistryName(LibItemNames.BASE_WATER_FLUID_NAME);
        this.setUnlocalizedName(LibMod.MOD_ID + ".fluid." + LibItemNames.BASE_WATER_FLUID_NAME);
        getFluid().setBlock(this);
    }
}
