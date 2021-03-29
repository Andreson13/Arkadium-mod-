package cm.andreson.arkamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import cm.andreson.arkamod.ArkadiumMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemUnclaimFinder extends Item {
   private String[] type = new String[]{"UnclaimFinder", "UnclaimFinder_Orange", "UnclaimFinder_Red", "UnclaimFinder_Precise"};
   private IIcon[] iconArray;

   public ItemUnclaimFinder() {
      this.setMaxStackSize(1);
      this.setCreativeTab(ArkadiumMod.Arkatab);
      this.setUnlocalizedName("unclaimfinder");
   }

   public void registerIcons(IIconRegister iconregister) {
      this.iconArray = new IIcon[this.type.length];

      for(int i = 0; i < this.type.length; ++i) {
         this.iconArray[i] = iconregister.registerIcon("arkamod:unclaim_finder" + this.type[i]);
      }

   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(Item Item, CreativeTabs creativeTabs, List list) {
      for(int metadata = 0; metadata < this.type.length; ++metadata) {
         list.add(new ItemStack(Item, 1, metadata));
      }

   }

   @SideOnly(Side.CLIENT)
   public IIcon getIconFromDamage(int metadata) {
      return metadata < this.type.length && metadata >= 0 ? this.iconArray[metadata] : this.iconArray[0];
   }
}
