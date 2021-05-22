package cm.andreson.arkamod.biome;

import java.util.Random;

import cm.andreson.arkamod.blocks.BlockCreation;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeArka extends BiomeGenBase
{
	public BiomeArka(int p_i1971_1_) 
	{
		super(p_i1971_1_);
		this.topBlock = Blocks.diamond_block;
		this.waterColorMultiplier = 16718080;
	}

	 public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_)
	    {
		 this.fillerBlock = BlockCreation.slime_pad;
	    }
}
