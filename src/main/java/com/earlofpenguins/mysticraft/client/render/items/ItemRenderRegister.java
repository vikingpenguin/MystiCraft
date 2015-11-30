package com.earlofpenguins.mysticraft.client.render.items;

import com.earlofpenguins.mysticraft.init.ModItems;
import com.earlofpenguins.mysticraft.items.ItemMystiCraft;
import com.earlofpenguins.mysticraft.reference.Reference;
import com.earlofpenguins.mysticraft.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ItemRenderRegister {

    @SideOnly(Side.CLIENT)
    public static void registerItemRenderer() {
        registerModel(ModItems.multiTool);
    }

    public static void registerModel(ItemMystiCraft item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedNameOnly(), "inventory"));
    }
}
