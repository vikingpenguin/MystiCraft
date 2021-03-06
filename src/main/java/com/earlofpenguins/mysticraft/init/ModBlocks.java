package com.earlofpenguins.mysticraft.init;

import com.earlofpenguins.mysticraft.blocks.BlockMystiCraft;
import com.earlofpenguins.mysticraft.blocks.MysticalWood;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMystiCraft mysticalWood = new MysticalWood();

    public static void init()
    {
        GameRegistry.registerBlock(mysticalWood, "mysticalWood");
    }
}
