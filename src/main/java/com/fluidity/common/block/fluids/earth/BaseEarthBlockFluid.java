package com.fluidity.common.block.fluids.earth;

import com.fluidity.common.block.fluids.BaseBlockFluid;
import com.fluidity.common.core.misc.IWaterEnergyUser;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class BaseEarthBlockFluid extends BaseBlockFluid implements IWaterEnergyUser {
    public BaseEarthBlockFluid(Fluid fluid, Material material, int totalWaterEnergy, int activationEnergy) {
        super(fluid, material, totalWaterEnergy, activationEnergy);
    }
}
