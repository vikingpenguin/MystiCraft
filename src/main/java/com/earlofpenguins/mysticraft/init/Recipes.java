package com.earlofpenguins.mysticraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.multiTool), "dld", " s ", " s ", 'd', new ItemStack(Items.diamond), 'l', new ItemStack(Blocks.leaves), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.mysticalWood), new ItemStack(Items.diamond),  new ItemStack(Items.diamond), "logWood"));
    }
}
