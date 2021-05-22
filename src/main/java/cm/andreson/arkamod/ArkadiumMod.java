package cm.andreson.arkamod;

import cm.andreson.arkamod.blocks.BlockCreation;
import cm.andreson.arkamod.init.BiomeMod;
import cm.andreson.arkamod.items.ItemCreation;
import cm.andreson.arkamod.proxy.CommonProxy;
import cm.andreson.arkamod.world.worldRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.version)

public class ArkadiumMod {
	
	@Instance(Reference.MOD_ID)
	public static ArkadiumMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVEUR_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs Arkatab = new CreativeTabs("arkadium")
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return ItemCreation.ARKADIUM_PICKAXE;
		}
	};

	public static Object instance1;

	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		proxy.preInit();
		BiomeMod.init();
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event)
	{	
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	} 
	
}