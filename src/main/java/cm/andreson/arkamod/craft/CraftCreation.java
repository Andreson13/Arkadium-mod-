package cm.andreson.arkamod.craft;

import cm.andreson.arkamod.blocks.BlockCreation;
import cm.andreson.arkamod.items.ItemCreation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
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
				 '#', BlockCreation.arkadium_block, 
				 'X', Items.stick});
		
		/**************/
		/*CRAFT ARMURE*/
		/**************/
		GameRegistry.addRecipe(new ItemStack(ItemCreation.casqueArmor, 1), new Object[]
				{"###",
				 "# #",
				 '#', ItemCreation.Item_test });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.plastronArmor, 1), new Object[]
				{"# #",
				 "###",
				 "###",
				 '#', ItemCreation.Item_test });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.pentalonArmor, 1), new Object[]
				{"###",
				 "# #",
				 "# #",
				 '#', ItemCreation.Item_test });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.bootsArmor, 1), new Object[]
				{"   ",
				 "# #",
				 "# #",
				 '#', ItemCreation.Item_test });

		// titnium armor
		
		GameRegistry.addRecipe(new ItemStack(ItemCreation.titaniumHelmet, 1), new Object[]
				{"###",
				 "# #",
				 '#', ItemCreation.TITANIUM_INGOT });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.titaniumChestplate, 1), new Object[]
				{"# #",
				 "###",
				 "###",
				 '#', ItemCreation.TITANIUM_INGOT });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.titaniumLeggings, 1), new Object[]
				{"###",
				 "# #",
				 "# #",
				 '#', ItemCreation.TITANIUM_INGOT });
		GameRegistry.addRecipe(new ItemStack(ItemCreation.titaniumBoots, 1), new Object[]
				{"   ",
				 "# #",
				 "# #",
				 '#', ItemCreation.TITANIUM_INGOT });
		
		/**************/
		/*CRAFT OUTILS*/
		/**************/
		GameRegistry.addRecipe(new ItemStack(ItemCreation.ARKADIUM_PICKAXE, 1), new Object[]
				{"###",
				 " X ",
				 " X ",
				 '#', ItemCreation.Item_test,  
				 'X', ItemCreation.arkadium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.ARKADIUM_HOE, 1), new Object[]
				{"##",
				 " X",
				 " X",
				 '#', ItemCreation.Item_test, 
				 'X', ItemCreation.arkadium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.ARKADIUM_SPADE, 1), new Object[]
				{" #",
				 " X",
				 " X",
				 '#', ItemCreation.Item_test, 
				 'X', ItemCreation.arkadium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.ARKADIUM_SWORD, 1), new Object[]
				{" #",
				 " #",
				 " X",
				 '#', ItemCreation.Item_test, 
				 'X', ItemCreation.arkadium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.ARKADIUM_AXE, 1), new Object[]
				{"##",
				 "#X",
				 " X",
				 '#', ItemCreation.Item_test, 
				 'X', ItemCreation.arkadium_stick});
		//stick
		GameRegistry.addRecipe(new ItemStack(ItemCreation.arkadium_stick, 1), new Object[]
				{"#",
				 "#",
				 '#', ItemCreation.Item_test});
		
		//titanium outils
		GameRegistry.addRecipe(new ItemStack(ItemCreation.TITANIUM_PICKAXE, 1), new Object[]
				{"###",
				 " X ",
				 " X ",
				 '#', ItemCreation.TITANIUM_INGOT,  
				 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.TITANIUM_HOE, 1), new Object[]
				{"##",
				 " X",
				 " X",
				 '#', ItemCreation.TITANIUM_INGOT, 
				 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.TITANIUM_SPADE, 1), new Object[]
				{" #",
				 " X",
				 " X",
				 '#', ItemCreation.TITANIUM_INGOT, 
				 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.TITANIUM_SWORD, 1), new Object[]
				{" #",
				 " #",
				 " X",
				 '#', ItemCreation.TITANIUM_INGOT, 
				 'X', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemCreation.TITANIUM_AXE, 1), new Object[]
				{"##",
				 "#X",
				 " X",
				 '#', ItemCreation.TITANIUM_INGOT, 
				 'X', Items.stick});
		
		/*************/
		/*CRAFT AUTRE*/
		/*************/


		/*****************/
		/*     SMELT     */
		/*****************/
		GameRegistry.addSmelting(BlockCreation.arkadium_ore, new ItemStack(ItemCreation.arkadium_fragment, 2), 1.0F);
		GameRegistry.addSmelting(BlockCreation.titanium_ore, new ItemStack(ItemCreation.TITANIUM_INGOT, 1), 1.0F);
		
	}
}

