package cm.andreson.arkamod.proxy;

import cm.andreson.arkamod.blocks.BlockCreation;
import cm.andreson.arkamod.craft.CraftCreation;
import cm.andreson.arkamod.items.ItemCreation;
import cm.andreson.arkamod.world.worldRegister;

public class CommonProxy
{
    public void preInit()
    {
		ItemCreation.register();
		BlockCreation.init();
		BlockCreation.register();
		worldRegister.MainRegistry();
		CraftCreation.registerCraft();
    }
    
    public void init() {
	}
}    