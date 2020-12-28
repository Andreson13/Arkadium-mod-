package cm.andreson.arkamod.init;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.items.ItemArmorTuto;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemMod 
{
	public static ArmorMaterial ArkaAmor = EnumHelper.addArmorMaterial("ArkaAmor", 40, new int []{8, 13, 11, 8}, 50); 
	
    public static Item Item_test, casqueArmor, plastronArmor, pentalonArmor, bootsArmor;
    
    public static void init() 
    {
        Item_test = new Item().setUnlocalizedName("Item_test").setCreativeTab(CreativeTabs.tabDecorations).setTextureName(Reference.MOD_ID + ":item_test");
        casqueArmor = new ItemArmorTuto(ArkaAmor, 0).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":casqueArmor").setUnlocalizedName(":casqueArmor");
        plastronArmor = new ItemArmorTuto(ArkaAmor, 1).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":plastronArmor").setUnlocalizedName(":plastronArmor");
        pentalonArmor = new ItemArmorTuto(ArkaAmor, 2).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":pentalonArmor").setUnlocalizedName(":pentalonArmor");
        bootsArmor = new ItemArmorTuto(ArkaAmor, 3).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":bootsArmor").setUnlocalizedName(":bootsArmor");
    }  
    
    public static void register() 
    {
        GameRegistry.registerItem(Item_test, "item_test");
        GameRegistry.registerItem(casqueArmor, "casqueArmor");
        GameRegistry.registerItem(plastronArmor, "plastronArmor");
        GameRegistry.registerItem(pentalonArmor, "pentalonArmor");
        GameRegistry.registerItem(bootsArmor, "bootsArmor");
    }
    
}