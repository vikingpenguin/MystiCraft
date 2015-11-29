package com.earlofpenguins.mysticraft;

import com.earlofpenguins.mysticraft.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.earlofpenguins.mysticraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MystiCraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static MystiCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Preinitalization phase for initializing items and blocks, loading configurations, key binding, initialize network handling etc.
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    //Initialization phase for gui handler, tile entities, event handlers, recipe registration
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    //Postinitialization
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
