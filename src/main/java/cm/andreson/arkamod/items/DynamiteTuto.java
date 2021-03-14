package cm.andreson.arkamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cm.andreson.arkamod.entity.EntityDynamite;
import java.util.Random;

import cm.andreson.arkamod.ArkadiumMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DynamiteTuto extends net.minecraft.item.Item
{
  public DynamiteTuto()
  {
    setMaxStackSize(64);
    setUnlocalizedName("dynamitebig");
    setCreativeTab(ArkadiumMod.Arkatab);
    setTextureName("palamod:DynamiteBig");
  }
  

  public int getItemEnchantability()
  {
    return 0;
  }
  

  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
  {
    if (entityplayer.inventory.consumeInventoryItem(this))
    {
      if (!world.isRemote)
      {
        world.spawnEntityInWorld(new EntityDynamite(world, entityplayer, 40 + itemRand.nextInt(10), EntityDynamite.BIG));
      }
    }
    return itemstack;
  }
  

  @SideOnly(Side.CLIENT)
  public boolean shouldRotateAroundWhenRendering()
  {
    return true;
  }
  

  @SideOnly(Side.CLIENT)
  public boolean isFull3D()
  {
    return true;
  }
}