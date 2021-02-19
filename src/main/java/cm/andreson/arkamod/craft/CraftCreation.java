package cm.andreson.arkamod.craft;

import cm.andreson.arkamod.blocks.BlockCreation;
import cm.andreson.arkamod.items.ItemCreation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class CraftCreation {

	public static void registerCraft() {
		/******************/
		/*     CRAFTS     */
		/******************/

		
		/********************/
		/*CRAFT BLOCK/LINGOT*/
		/********************/
		//block d'amethyst
		GameRegistry.addRecipe(new ItemStack(BlockCreation.amethyst_block, 1), new Object[]
				{"###",
				 "###",
				 "###",
				 '#', ItemCreation.AMETHYST_CRYSTAL });
		//block de titanium
		GameRegistry.addRecipe(new ItemStack(BlockCreation.titanium_block, 1), new Object[]
				{"###",
				 "###",
				 "###",
				 '#', ItemCreation.TITANIUM_INGOT });
		
		//block d'arkadium
		GameRegistry.addRecipe(new ItemStack(BlockCreation.arkadium_block, 1), new Object[]
				{"###",
				 "###",
				 "###",
				 '#', ItemCreation.Item_test });
		//Item_test
		GameRegistry.addRecipe(new ItemStack(ItemCreation.Item_test, 9), new Object[]
				{"#",
				 '#', BlockCreation.arkadium_block });
		
		/**************/
		/*CRAFT ARMURE*/
		/**************/
		
		
		
		/**************/
		/*CRAFT OUTILS*/
		/**************/
	  
		
		
		/*************/
		/*CRAFT AUTRE*/
		/*************/


		/*****************/
		/*     SMELT     */
		/*****************/
		
		
	}
}

