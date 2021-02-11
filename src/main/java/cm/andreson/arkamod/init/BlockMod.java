package cm.andreson.arkamod.init;

import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.blocks.BlockBasic;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMod 
{
	
	public static Block arkadium_block, arkadium_ore;
	
	public static void init()
	{
		arkadium_block = new BlockBasic(Material.rock).setBlockName("arkadium_block").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(Reference.MOD_ID + ":arkadium_block");
		arkadium_ore = new BlockBasic(Material.rock)
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("arkadium_ore")
				.setBlockTextureName(Reference.MOD_ID + ":arkadium_ore_v2")
				.setResistance(50)
				.setHardness(10)
				.setLightLevel(60);
	}
				
	public static void register()
    {
		GameRegistry.registerBlock(arkadium_block, arkadium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arkadium_ore, arkadium_ore.getUnlocalizedName().substring(5));
	}
}