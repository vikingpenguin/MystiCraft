package com.earlofpenguins.mysticraft.client.handler;

import com.earlofpenguins.mysticraft.client.settings.Keybindings;
import com.earlofpenguins.mysticraft.reference.Key;
import com.earlofpenguins.mysticraft.utility.LogHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if(Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info("User has pressed this key: " + getPressedKeybinding());
    }
}
