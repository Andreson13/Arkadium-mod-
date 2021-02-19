package cm.andreson.arkamod.world;

import java.util.Random;

import cm.andreson.arkamod.init.BlockMod;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
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
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
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
		addOre(BlockMod.arkadium_ore, Blocks.netherrack, random, world, i, j, 20, 200, 5, 10, 60);
	}

	private void generateOverWorld(World world, int i, int j, Random random)
	{
<<<<<<< HEAD
		addOre(BlockMod.arkadium_ore, Blocks.stone, random, world, i, j, 20, 200, 5, 10, 60);
	}

	private void generateEnd(World world, int i, int j, Random random) 
	{
	
	}


}
=======
		addOre(BlockMod.arkadium_ore, Blocks.stone, random, world, i, j, 1, 5, 1, 1, 6);
	}

	private void generateEnd(World world, int i, int j, Random random) 
	{
	
	}


}
>>>>>>> branch 'master' of https://github.com/Andreson13/Arkadium-mod-.git
