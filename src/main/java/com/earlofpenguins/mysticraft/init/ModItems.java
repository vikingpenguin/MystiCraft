package com.earlofpenguins.mysticraft.init;

import com.earlofpenguins.mysticraft.items.*;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemMystiCraft multiTool = new ItemMultiTool();
    public static final ItemMystiCraftArmor wings = new ItemArmorWings(ItemMystiCraftMaterials.mystical, 1, 1);

    public static void init()
    {
        GameRegistry.registerItem(multiTool, "multiTool");
        GameRegistry.registerItem(wings, "wings");
    }
}
