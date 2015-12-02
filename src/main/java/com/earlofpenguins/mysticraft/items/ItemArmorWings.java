package com.earlofpenguins.mysticraft.items;

import com.earlofpenguins.mysticraft.init.ModItems;
import com.earlofpenguins.mysticraft.proxy.ClientProxy;
import com.earlofpenguins.mysticraft.reference.Reference;
import com.earlofpenguins.mysticraft.utility.LogHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmorWings extends ItemMystiCraftArmor
{
    public ItemArmorWings(ItemArmor.ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName("wings");
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.wings)
        {
            return Reference.MOD_ID + ":/textures/models/armor/wings_layer_1.png";
        }
        else { System.out.println("Invalid Item");
            return null;
        }
    }
}
