package com.earlofpenguins.mysticraft.proxy;

import com.earlofpenguins.mysticraft.client.render.blocks.BlockRenderRegister;
import com.earlofpenguins.mysticraft.client.render.items.ItemRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }
}
