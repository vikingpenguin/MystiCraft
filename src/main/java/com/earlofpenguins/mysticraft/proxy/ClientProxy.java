package com.earlofpenguins.mysticraft.proxy;

import com.earlofpenguins.mysticraft.client.models.ArmorTest;
import com.earlofpenguins.mysticraft.client.render.blocks.BlockRenderRegister;
import com.earlofpenguins.mysticraft.client.render.items.ItemRenderRegister;
import com.earlofpenguins.mysticraft.client.settings.Keybindings;
import com.earlofpenguins.mysticraft.init.ModItems;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy
{
    public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

    @SideOnly(Side.CLIENT)
    @Override
    public void init(FMLInitializationEvent e) {
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();

        ArmorTest customArmor = new ArmorTest();

        armorModels.put(ModItems.wings, customArmor);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        //NOOP
    }

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
