package cm.andreson.arkamod.items;

import cm.andreson.arkamod.Reference;
import cm.andreson.arkamod.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorTuto extends ItemArmor {

	public ItemArmorTuto(ArmorMaterial material, int p_i45325_3_) 
	{
		super(material, 0, p_i45325_3_);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ItemMod.pentalonArmor)
		{
			return Reference.MOD_ID + ":textures/models/armor/ark_arkadium_armor__layer_2.png";
		}
		
		else if(stack.getItem() == ItemMod.casqueArmor || stack.getItem() == ItemMod.plastronArmor || stack.getItem() == ItemMod.bootsArmor)
		{
			return Reference.MOD_ID + ":textures/models/armor/ark_arkadium_armor__layer_1.png";
		}
		return null;
	}
	
}
