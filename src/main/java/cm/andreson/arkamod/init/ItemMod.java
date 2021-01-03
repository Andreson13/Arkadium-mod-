package cm.andreson.arkamod.init;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.items.ItemArmorTuto;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemMod extends Reference
{
	public static ArmorMaterial arkaAmor = EnumHelper.addArmorMaterial("ArkaAmor", 40, new int []{8, 13, 11, 8}, 50); 
	
	public static ArmorMaterial amethystAmor = EnumHelper.addArmorMaterial("amethystAmor", 40, new int []{3,9,7,4}, 10);
	public static ToolMaterial arkaMaterial = EnumHelper.addToolMaterial("arkaMaterial", 4, 2000, 12.0F, 4.0F, 30);
	
    public static final Item Item_test = new Item()
    		.setCreativeTab(CreativeTabs.tabDecorations)
    		.setTextureName(MOD_ID + ":item_test")
    		.setUnlocalizedName("item_test");
    
    public static final ItemArmor casqueArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 0)
    		.setTextureName(MOD_ID + ":casqueArmor")
    		.setUnlocalizedName("casqueArmor");
    
    public static final ItemArmor plastronArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 1)
    		.setTextureName(MOD_ID + ":plastronArmor")
    		.setUnlocalizedName("plastronArmor");
    
    public static final ItemArmor pentalonArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 2)
    		.setTextureName(MOD_ID + ":pentalonArmor")
    		.setUnlocalizedName("pentalonArmor");
    
    public static final ItemArmor bootsArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 3)
    		.setTextureName(MOD_ID + ":bootsArmor")
    		.setUnlocalizedName("bootsArmor");
    
	public static final ItemPickaxe ARKADIUM_PICKAXE = (ItemPickaxe) new ItemPickaxeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_pickaxe")
			.setUnlocalizedName("arkadium_pickaxe");
	
	public static final ItemSpade ARKADIUM_SPADE = (ItemSpade) new ItemSpadeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_shovel")
			.setUnlocalizedName("arkadium_shovel");
	
	public static final ItemHoe ARKADIUM_HOE = (ItemHoe) new ItemHoeTest(arkaMaterial) 
			.setTextureName(MOD_ID + ":arkadium_hoe")
			.setUnlocalizedName("arkadium_hoe");
	
	public static final ItemAxe ARKADIUM_AXE = (ItemAxe) new ItemAxeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_axe")
			.setUnlocalizedName("arkadium_axe");
	
	public static final ItemSword ARKADIUM_SWORD = (ItemSword) new ItemSwordTest(arkaMaterial)
			.setTextureName(MOD_ID + ":word1")
			.setUnlocalizedName("arkadium_sword");
	public static final ItemFood ARKADIUM_FOOD = (ItemFood) new ItemFoodTest(3, 0, false)
			.setTextureName(MOD_ID + ":bonbon")
			.setUnlocalizedName("arkadium_food");
    
    public static void init() 
    {
    }  
    
    public static void register() 
    {
        GameRegistry.registerItem(Item_test, "item_test");
        GameRegistry.registerItem(casqueArmor, "casqueArmor");
        GameRegistry.registerItem(plastronArmor, "plastronArmor");
        GameRegistry.registerItem(pentalonArmor, "pentalonArmor");
        GameRegistry.registerItem(bootsArmor, "bootsArmor");
        GameRegistry.registerItem(ARKADIUM_PICKAXE, "arkadium_pickaxe");
        GameRegistry.registerItem(ARKADIUM_SPADE, "arkadium_shovel");
        GameRegistry.registerItem(ARKADIUM_HOE, "arkadium_hoe");
        GameRegistry.registerItem(ARKADIUM_AXE, "arkadium_axe");
        GameRegistry.registerItem(ARKADIUM_SWORD, "arkadium_sword");
        GameRegistry.registerItem(ARKADIUM_FOOD, "arkadium_food");
    }
    
}