package com.fluidity.common.block;

import com.fluidity.common.block.fluids.BaseBlockFluid;
import com.fluidity.common.block.fluids.water.BaseWaterBlockFluid;
import com.fluidity.common.fluid.water.BaseWaterFluid;
import com.fluidity.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public class ModBlocks {
    public static Block baseWater = null;

    private static List<Block> fluids;

    public static void init() {
        fluids = new ArrayList<>();
        baseWater = new BaseWaterBlockFluid();

        fluids.add(baseWater);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(baseWater);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : fluids) {
            Item item = Item.getItemFromBlock(block);
            FluidStateMapper mapper = new FluidStateMapper(((BaseBlockFluid)block).getFluid());
            ModelLoader.registerItemVariants(item);
            ModelLoader.setCustomMeshDefinition(item, mapper);
            ModelLoader.setCustomStateMapper(block, mapper);
        }
    }

    static class FluidStateMapper extends StateMapperBase implements ItemMeshDefinition
    {
        public final ModelResourceLocation location;

        public FluidStateMapper(Fluid fluid)
        {
            this.location = new ModelResourceLocation(LibMod.MOD_ID+":fluid_block", fluid.getName());
        }

        @Override
        protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
            return location;
        }


        @Override
        public ModelResourceLocation getModelLocation(ItemStack stack) {
            return location;
        }
    }
}
