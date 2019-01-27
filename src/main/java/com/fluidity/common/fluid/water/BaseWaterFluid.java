package com.fluidity.common.fluid.water;

import com.fluidity.common.fluid.BaseFluid;
import com.fluidity.common.lib.LibItemNames;
import com.fluidity.common.lib.LibMod;
import net.minecraft.util.ResourceLocation;

public class BaseWaterFluid extends BaseFluid {
    public BaseWaterFluid() {
        super(LibItemNames.BASE_WATER_FLUID_NAME, new ResourceLocation(LibMod.RESOURCE_LOCATION + "blocks/base_water_still"),
                new ResourceLocation(LibMod.RESOURCE_LOCATION + "blocks/base_water_flow"));
    }
}
