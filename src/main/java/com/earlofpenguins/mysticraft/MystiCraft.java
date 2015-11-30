package com.earlofpenguins.mysticraft;

import com.earlofpenguins.mysticraft.client.render.items.ItemRenderRegister;
import com.earlofpenguins.mysticraft.handler.ConfigurationHandler;
import com.earlofpenguins.mysticraft.init.ModBlocks;
import com.earlofpenguins.mysticraft.init.ModItems;
import com.earlofpenguins.mysticraft.proxy.CommonProxy;
import com.earlofpenguins.mysticraft.proxy.IProxy;
import com.earlofpenguins.mysticraft.utility.LogHelper;
import com.sun.webpane.platform.graphics.Ref;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.earlofpenguins.mysticraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MystiCraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static MystiCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    //Preinitalization phase for initializing items and blocks, loading configurations, key binding, initialize network handling etc.
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre-initialization complete.");
    }
    //Initialization phase for gui handler, tile entities, event handlers, recipe registration
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        LogHelper.info("Initialization complete.");
    }
    //Postinitialization
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        LogHelper.info("Post-initialization complete.");
    }
}
