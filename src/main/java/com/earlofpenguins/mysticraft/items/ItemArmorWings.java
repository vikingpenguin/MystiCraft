package com.earlofpenguins.mysticraft.items;

import com.earlofpenguins.mysticraft.init.ModItems;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorWings extends ItemMystiCraftArmor
{
    public ItemArmorWings(ItemArmor.ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName("wings");
    }

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
