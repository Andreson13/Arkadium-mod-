package cm.andreson.arkamod.handlers;

import java.util.Random;

import cm.andreson.arkamod.ArkadiumMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler 
{
	public static void registerMonster(Class entityClass, String string)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long x = string.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 1658965;
		int subColor = random.nextInt() * 1658965;
		
		EntityRegistry.registerGlobalEntityID(entityClass, string, entityID);
		EntityRegistry.addSpawn(string, 40, 5, 10, EnumCreatureType.monster, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.desert);
		EntityRegistry.registerModEntity(entityClass, string, entityID, ArkadiumMod.instance, 64, 1, true);
	}
}
