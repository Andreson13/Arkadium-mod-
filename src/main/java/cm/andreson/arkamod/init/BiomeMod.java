package cm.andreson.arkamod.init;

import cm.andreson.arkamod.biome.BiomeArka;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeMod 
{
	public static void init()
	{
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new BiomeArka(100), 100));
	}
}
