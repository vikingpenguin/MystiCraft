package com.earlofpenguins.mysticraft.init;

import com.earlofpenguins.mysticraft.items.ItemMultiTool;
import com.earlofpenguins.mysticraft.items.ItemMystiCraft;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemMystiCraft multiTool = new ItemMultiTool();

    public static void init()
    {
        GameRegistry.registerItem(multiTool, "multiTool");
    }
}
