package com.earlofpenguins.mysticraft.client.render.blocks;

import com.earlofpenguins.mysticraft.blocks.BlockMystiCraft;
import com.earlofpenguins.mysticraft.init.ModBlocks;
import com.earlofpenguins.mysticraft.reference.Reference;
import com.earlofpenguins.mysticraft.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRenderRegister {
    @SideOnly(Side.CLIENT)
    public static void registerBlockRenderer()
    {
        registerModel(ModBlocks.mysticalWood);
    }

    public static void registerModel(BlockMystiCraft block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedNameOnly(), "inventory"));
        LogHelper.info(Reference.MOD_ID + ":" + block.getUnlocalizedNameOnly());
        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
