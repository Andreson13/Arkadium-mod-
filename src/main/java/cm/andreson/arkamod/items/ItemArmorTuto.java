package cm.andreson.arkamod.items;

import cm.andreson.arkamod.Reference;
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
		if (stack.getItem() == ItemCreation.pentalonArmor)
		{
			return Reference.MOD_ID + ":textures/models/armor/ark_arkadium_armor__layer_2.png";
		}
		
		else if(stack.getItem() == ItemCreation.casqueArmor || stack.getItem() == ItemCreation.plastronArmor || stack.getItem() == ItemCreation.bootsArmor)
		{
			return Reference.MOD_ID + ":textures/models/armor/ark_arkadium_armor__layer_1.png";
		}
		return null;
	}
	
}
