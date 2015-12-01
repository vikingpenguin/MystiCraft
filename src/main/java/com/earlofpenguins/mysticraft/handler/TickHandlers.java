package com.earlofpenguins.mysticraft.handler;

import com.earlofpenguins.mysticraft.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class TickHandlers
{
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        //Test if the player has wings on and if so grant flight. If he has no armor or different armor take away flight.
        event.player.capabilities.allowFlying = event.player.getCurrentArmor(2) != null && event.player.getCurrentArmor(2).getItem() == ModItems.wings;
    }
}
