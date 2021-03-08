package cm.andreson.arkamod.items;

import cm.andreson.arkamod.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	
	 public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	 {
	 if(this == ItemCreation.casqueArmor)
	    {
		 player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 3600, 2));
	    }
	 
	 if(this == ItemCreation.plastronArmor)
	    {
		 player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 3600, 2));
	    }
	 }
}
