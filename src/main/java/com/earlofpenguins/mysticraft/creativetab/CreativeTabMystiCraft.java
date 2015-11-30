package com.earlofpenguins.mysticraft.creativetab;

import com.earlofpenguins.mysticraft.init.ModItems;
import com.earlofpenguins.mysticraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMystiCraft
{
    public static final CreativeTabs MystiCraftTab = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            return ModItems.multiTool;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "MystiCraft";
        }
    };
}
