package cm.andreson.arkamod.init;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSpadeTest extends ItemSpade {

	public ItemSpadeTest(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack itemStack, World world, Block block, int x, int y, int z,
			EntityLivingBase entity) {
		if (entity instanceof EntityPlayer) {
			entity.addPotionEffect(new PotionEffect(3, 200, 0));
		}
		return super.onBlockDestroyed(itemStack, world, block, x, y, z, entity);
	}

}
