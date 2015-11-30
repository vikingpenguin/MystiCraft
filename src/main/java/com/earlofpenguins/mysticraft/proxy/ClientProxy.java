package com.earlofpenguins.mysticraft.proxy;

import com.earlofpenguins.mysticraft.client.render.blocks.BlockRenderRegister;
import com.earlofpenguins.mysticraft.client.render.items.ItemRenderRegister;
import com.earlofpenguins.mysticraft.client.settings.Keybindings;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
    @SideOnly(Side.CLIENT)
    @Override
    public void init(FMLInitializationEvent e) {
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
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
