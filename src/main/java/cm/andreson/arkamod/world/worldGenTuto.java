package cm.andreson.arkamod.world;

import java.util.Random;

import cm.andreson.arkamod.init.BlockMod;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class worldGenTuto implements IWorldGenerator {


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, chunkX * 16, chunkZ * 16, random);
		
		break;
		
		 case 0:
		    generateOverWorld(world, chunkX * 16, chunkZ * 16, random);
		 
		    break;
		 
		 case 1:
			generateEnd(world, chunkX * 16, chunkZ * 16, random);
		 
			break; 
		}
		
	}
	private void addOre(Block block, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
	{
		for (int i = 0; i < spawnChance; i++) 
		{
			
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
	
			new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
		}
	}

	private void generateNether(World world, int i, int j, Random random) 
	{
		addOre(BlockMod.arkadium_ore, random, world, i, j, 64, 200, 64, 64, 50);
	}

	private void generateOverWorld(World world, int i, int j, Random random)
	{
		addOre(BlockMod.arkadium_ore, random, world, i, j, 64, 200, 64, 60, 50);
	}

	private void generateEnd(World world, int i, int j, Random random) 
	{
		addOre(BlockMod.arkadium_ore, random, world, i, j, 20, 200, 3, 6, 5);
	}


}
