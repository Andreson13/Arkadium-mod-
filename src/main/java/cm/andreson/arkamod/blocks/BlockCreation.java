package cm.andreson.arkamod.blocks;

import cm.andreson.arkamod.ArkadiumMod;
import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.items.ItemCreation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockCreation 
{
	
	public static Block arkadium_block, arkadium_ore, titanium_block, amethyst_block, cave_block, random_block, titanium_ore, vibranium_ore, arkadium_stairs, arkadium_fence, slime_pad;
	
	public static void init()
	{
		arkadium_block = new BlockBasic(Material.rock)
				.setBlockName("arkadium_block")
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockTextureName(Reference.MOD_ID + ":arkadium_block");
		arkadium_ore = new BlockBasic(Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("arkadium_ore")
				.setBlockTextureName(Reference.MOD_ID + ":arkadium_ore_v2")
				.setResistance(5)
				.setHardness(10)
				.setLightLevel(60);
		titanium_block = new BlockBasic(Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("titanium_block")
				.setBlockTextureName(Reference.MOD_ID + ":titanium_block")
				.setResistance(5)
				.setHardness(10)
				.setLightLevel(60); // titanium_block
		amethyst_block = new BlockBasic(Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("amethyst_block")
				.setBlockTextureName(Reference.MOD_ID + ":amthyste_block")
				.setResistance(5)
				.setHardness(10)
				.setLightLevel(60);
		cave_block = new BlockBasic(Material.glass)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("cave_block")
				.setBlockTextureName(Reference.MOD_ID + ":cave_block")
				.setResistance(5)
				.setHardness(1)
				.setLightLevel(6);
		titanium_ore = new BlockBasic(Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("titanium_ore")
				.setBlockTextureName(Reference.MOD_ID + ":titanium_ore_2")
				.setResistance(5)
				.setHardness(10)
				.setLightLevel(60);
		vibranium_ore = new BlockBasic(Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("vibranium_ore")
				.setBlockTextureName(Reference.MOD_ID + ":vibranium_ore_2")
				.setResistance(5)
				.setHardness(10)
				.setLightLevel(60);	
		arkadium_stairs = new BlockStairMod(BlockCreation.arkadium_block, 0)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("arkadium_stairs")
				.setLightLevel(1.0F);
		arkadium_fence = new BlockFenceMod("arkadium_block", Material.rock)
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockName("arkadium_fence")
				.setLightLevel(1.0F);
		slime_pad = new BlockSlimePad()
				.setCreativeTab(ArkadiumMod.Arkatab)
				.setBlockTextureName(Reference.MOD_ID + ":slime_pad")
				.setBlockName("slime_pad");
		
		
	}
				
	public static void register()
    {
		GameRegistry.registerBlock(arkadium_block, arkadium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arkadium_ore, arkadium_ore.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(titanium_block, titanium_block.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(amethyst_block, amethyst_block.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(cave_block, cave_block.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(titanium_ore, titanium_ore.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(vibranium_ore, vibranium_ore.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(arkadium_stairs, arkadium_stairs.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(arkadium_fence, arkadium_fence.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(slime_pad, slime_pad.getUnlocalizedName().substring(5));
    }
}