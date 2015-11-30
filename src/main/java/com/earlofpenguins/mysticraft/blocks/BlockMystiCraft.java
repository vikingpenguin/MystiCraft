package com.earlofpenguins.mysticraft.blocks;

import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMystiCraft extends Block
{
    public BlockMystiCraft(Material material)
    {
        super(material);
    }

    public BlockMystiCraft()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
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
