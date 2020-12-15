package cm.andreson.arkamod;

import cm.andreson.arkamod.init.BlockMod;
import cm.andreson.arkamod.init.ItemMod;
import cm.andreson.arkamod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.version)

public class ArkadiumMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVEUR_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ItemMod.init();
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event)
	{	
		proxy.registerRender();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	} 
}