package cm.andreson.arkamod.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodTest extends ItemFood {

	public static Object setCreativeTab;

	public ItemFoodTest(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	


@Override
public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
    entityPlayer.addPotionEffect(new PotionEffect(21, 180*20, 2));//coeur rouges; 22=id; 100=nombre de secondes*20; 2=augmentation de la puissance de l'éffet
    entityPlayer.addPotionEffect(new PotionEffect(21, 180*20, 2));//coeur jaune
    return super.onEaten(itemStack, world, entityPlayer);
}

}