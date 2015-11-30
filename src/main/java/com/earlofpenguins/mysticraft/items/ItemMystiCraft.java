package com.earlofpenguins.mysticraft.items;

import com.earlofpenguins.mysticraft.creativetab.CreativeTabMystiCraft;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMystiCraft extends Item
{
    public ItemMystiCraft()
    {
        super();
        this.setMaxStackSize(1);
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
