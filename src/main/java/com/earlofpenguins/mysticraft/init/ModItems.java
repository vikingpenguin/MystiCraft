package com.earlofpenguins.mysticraft.init;

import com.earlofpenguins.mysticraft.items.ItemMultiTool;
import com.earlofpenguins.mysticraft.items.ItemMystiCraft;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemMystiCraft multiTool = new ItemMultiTool();

    public static void init()
    {
        GameRegistry.registerItem(multiTool, "multiTool");
    }
}
