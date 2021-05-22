package cm.andreson.arkamod.mobs;

import cm.andreson.arkamod.ArkadiumMod;
import cm.andreson.arkamod.items.GhostMob;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ArkaMobs {
	
	public static void mainRegistry(){
		registerEntity();
}
	public static void registerEntity(){
		
		createEntity(GhostMob.class, "Arka_Mob", 0x0004FF, 0xFF00E1);

}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ArkadiumMod.instance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 2, 5, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
}
	public static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

}

}

