package cm.andreson.arkamod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class worldRegister {
	public static void MainRegistry()
	{
		registerWorldGen(new worldGenTuto(), -1);
		registerWorldGen(new worldGenTuto(), 0);
		registerWorldGen(new worldGenTuto(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
	{
		GameRegistry.registerWorldGenerator(iGenerator, probability);
	}
}
