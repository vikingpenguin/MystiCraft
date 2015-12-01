package com.earlofpenguins.mysticraft.items;

import com.earlofpenguins.mysticraft.creativetab.CreativeTabMystiCraft;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMystiCraftArmor extends ItemArmor {
    public ItemMystiCraftArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(CreativeTabMystiCraft.MystiCraftTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedNameOnly()
    {
        return getUnwrappedUnlocalizedName(super.getUnlocalizedName());
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
