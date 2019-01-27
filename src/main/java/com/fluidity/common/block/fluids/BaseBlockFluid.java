package com.fluidity.common.block.fluids;

import com.fluidity.common.core.ModCreativeTab;
import com.fluidity.common.core.misc.IWaterEnergyUser;
import com.fluidity.common.lib.LibMod;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

enum Fluid_State {
    INERT, ACTIVE, ACTIVATING, NOT_ACTIVE
}
public class BaseBlockFluid  extends BlockFluidClassic implements IWaterEnergyUser {

    protected Fluid_State state;

    @Override
    public Fluid getFluid() {
        return fluid;
    }

    protected Fluid fluid;
    protected int totalWaterEnergy = 0;
    protected int activationEnergy = 0;

    private BaseBlockFluid(Fluid fluid, Material material) {
        super(fluid, material);
        state = Fluid_State.INERT;
    }

    public BaseBlockFluid(Fluid fluid, Material material, int totalWaterEnergy, int activationEnergy) {
        this(fluid, material);
        this.fluid = fluid;
        this.totalWaterEnergy = totalWaterEnergy;
        this.activationEnergy = activationEnergy;
        this.setDensity(fluid.getDensity());
        this.setCreativeTab(ModCreativeTab.instance);
    }



    @Override
    public void expendEnergyActive() {

    }

    @Override
    public void expendEnergyPassive() {

    }
}
