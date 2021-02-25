package cm.andreson.arkamod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cm.andreson.arkamod.ArkadiumMod;
import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.blocks.BlockCreation;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCreation extends Reference
{
	public static ArmorMaterial arkaAmor = EnumHelper.addArmorMaterial("ArkaAmor", 60, new int []{8, 13, 11, 8}, 50); 
	
	public static ArmorMaterial platiniumAmor = EnumHelper.addArmorMaterial("platiniumAmor", 40, new int []{3, 9, 7, 4}, 10);
	
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("titaniumAmor", 45, new int []{5, 9, 8, 5}, 20);

	public static ArmorMaterial vibraniumAmor = EnumHelper.addArmorMaterial("vibraniumAmor", 50, new int []{6, 10, 9, 6}, 30);

	public static ToolMaterial arkaMaterial = EnumHelper.addToolMaterial("arkaMaterial", 4, 2000, 12.0F, 4.0F, 30);
	
	public static ToolMaterial titaaMaterial = EnumHelper.addToolMaterial("arkaMaterial", 4, 2000, 12.0F, 4.0F, 30);
	
	public static ToolMaterial vibraMaterial = EnumHelper.addToolMaterial("arkaMaterial", 4, 2000, 12.0F, 4.0F, 30);
	
	public static ToolMaterial platMaterial = EnumHelper.addToolMaterial("arkaMaterial", 4, 2000, 12.0F, 4.0F, 30);
	
    public static final Item Item_test = new Item()
    		.setCreativeTab(ArkadiumMod.Arkatab)
    		.setTextureName(MOD_ID + ":item_test")
    		.setUnlocalizedName("item_test");
    
    public static final ItemArmor casqueArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 0)
    		.setTextureName(MOD_ID + ":casqueArmor")
    		.setUnlocalizedName("casqueArmor")
    		.setCreativeTab(ArkadiumMod.Arkatab);
    
    public static final ItemArmor plastronArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 1)
    		.setTextureName(MOD_ID + ":plastronArmor")
    		.setUnlocalizedName("plastronArmor")
    		.setCreativeTab(ArkadiumMod.Arkatab);
    
    public static final ItemArmor pentalonArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 2)
    		.setTextureName(MOD_ID + ":pentalonArmor")
    		.setUnlocalizedName("pentalonArmor")
    		.setCreativeTab(ArkadiumMod.Arkatab);
    
    public static final ItemArmor bootsArmor = (ItemArmor) new ItemArmorTuto(arkaAmor, 3)
    		.setTextureName(MOD_ID + ":bootsArmor")
    		.setUnlocalizedName("bootsArmor")
    		.setCreativeTab(ArkadiumMod.Arkatab);
    
	public static final ItemPickaxe ARKADIUM_PICKAXE = (ItemPickaxe) new ItemPickaxeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_pickaxe")
			.setUnlocalizedName("arkadium_pickaxe")
			.setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemSpade ARKADIUM_SPADE = (ItemSpade) new ItemSpadeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_shovel")
			.setUnlocalizedName("arkadium_shovel")
			.setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemHoe ARKADIUM_HOE = (ItemHoe) new ItemHoeTest(arkaMaterial) 
			.setTextureName(MOD_ID + ":arkadium_hoe")
			.setUnlocalizedName("arkadium_hoe")
			.setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemAxe ARKADIUM_AXE = (ItemAxe) new ItemAxeTest(arkaMaterial)
			.setTextureName(MOD_ID + ":arkadium_axe")
			.setUnlocalizedName("arkadium_axe")
			.setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemSword ARKADIUM_SWORD = (ItemSword) new ItemSwordTest(arkaMaterial)
			.setTextureName(MOD_ID + ":word1")
			.setUnlocalizedName("arkadium_sword")
			.setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemFood ARKADIUM_FOOD = (ItemFood) new ItemFoodTest(3, 0, false)
            .setAlwaysEdible()
            .setTextureName(MOD_ID + ":bonbon")
            .setUnlocalizedName("arkadium_food")
            .setCreativeTab(ArkadiumMod.Arkatab);
	
	public static final ItemIngot TITANIUM_INGOT = (ItemIngot) new ItemTitaniumIngot()
			.setCreativeTab(ArkadiumMod.Arkatab)
			.setTextureName(MOD_ID + ":ark_titanium_ingot")
			.setUnlocalizedName("titanium_ingot");
	
	public static final ItemIngot AMETHYST_CRYSTAL = (ItemIngot) new ItemAmethystCrystal()
			.setCreativeTab(ArkadiumMod.Arkatab)
			.setTextureName(MOD_ID + ":platinium_crystal")
			.setUnlocalizedName("amethyst_crystal");
	
	 public static final ItemArmor titaniumHelmet = (ItemArmor) new ItemArmorTuto(titaniumArmor, 0)
	    		.setTextureName(MOD_ID + ":ark_titanium_helmet")
	    		.setUnlocalizedName("titaniumHelmet")
	    		.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemArmor titaniumChestplate = (ItemArmor) new ItemArmorTuto(titaniumArmor, 1)
	    		.setTextureName(MOD_ID + ":ark_titanium_chestplate")
	    		.setUnlocalizedName("titaniumChestplate")
	    		.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemArmor titaniumLeggings = (ItemArmor) new ItemArmorTuto(titaniumArmor, 2)
	    		.setTextureName(MOD_ID + ":ark_titanium_leggings")
	    		.setUnlocalizedName("titaniumLeggings")
	    		.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemArmor titaniumBoots = (ItemArmor) new ItemArmorTuto(titaniumArmor, 3)
	    		.setTextureName(MOD_ID + ":ark_titanium_boots")
	    		.setUnlocalizedName("titaniumBoots")
	    		.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemPickaxe TITANIUM_PICKAXE = (ItemPickaxe) new ItemPickaxeTest(arkaMaterial)
				.setTextureName(MOD_ID + ":ark_titanium_picaxe")
				.setUnlocalizedName("titanium_pickaxe")
				.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemSpade TITANIUM_SPADE = (ItemSpade) new ItemSpadeTest(arkaMaterial)
				.setTextureName(MOD_ID + ":ark_titanium_shovel")
				.setUnlocalizedName("titanium_spade")
				.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemHoe TITANIUM_HOE = (ItemHoe) new ItemHoeTest(arkaMaterial)
				.setTextureName(MOD_ID + ":ark_titanium_hoe")
				.setUnlocalizedName("titanium_hoe")
				.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemAxe TITANIUM_AXE = (ItemAxe) new ItemAxeTest(arkaMaterial)
				.setTextureName(MOD_ID + ":ark_titanium_axe")
				.setUnlocalizedName("titanium_axe")
				.setCreativeTab(ArkadiumMod.Arkatab);
	 
	 public static final ItemSword TITANIUM_SWORD = (ItemSword) new ItemSwordTest(arkaMaterial)
				.setTextureName(MOD_ID + ":ark_titanium_sword")
				.setUnlocalizedName("titanium_sword")
				.setCreativeTab(ArkadiumMod.Arkatab);
	 public static final ItemBow Arkadium_bow = (ItemBow) new ItemBowTest()
			    .setUnlocalizedName("arkadium_bow")
			    .setTextureName("MOD_ID + :bow")
			    .setCreativeTab(ArkadiumMod.Arkatab);
    
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
        GameRegistry.registerItem(TITANIUM_INGOT, "titanium_ingot");
        GameRegistry.registerItem(AMETHYST_CRYSTAL, "amethyst_crystal");
        GameRegistry.registerItem(titaniumHelmet, "titanium_helmet");
        GameRegistry.registerItem(titaniumChestplate, "titanium_chestplate");
        GameRegistry.registerItem(titaniumLeggings, "titanium_leggings");
        GameRegistry.registerItem(titaniumBoots, "titanium_boots");
        GameRegistry.registerItem(TITANIUM_PICKAXE, "titanium_picaxe");
        GameRegistry.registerItem(TITANIUM_SPADE, "titanium_shovel");
        GameRegistry.registerItem(TITANIUM_HOE, "titanium_hoe");
        GameRegistry.registerItem(TITANIUM_AXE, "titanium_axe");
        GameRegistry.registerItem(TITANIUM_SWORD, "titanium_sword");
        GameRegistry.registerItem(Arkadium_bow, "arkadium_bow");
    }
    
}