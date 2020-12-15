package cm.andreson.arkamod.init;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cm.andreson.arkamod.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemMod 
{
    public static Item Item_test; 
    
    public static void init() 
    {
        Item_test = new Item().setUnlocalizedName("Item_test").setCreativeTab(CreativeTabs.tabDecorations).setTextureName(Reference.MOD_ID + ":item_test");
    }
    
    public static void register() 
    {
        GameRegistry.registerItem(Item_test, "item_test");
    }
    
}