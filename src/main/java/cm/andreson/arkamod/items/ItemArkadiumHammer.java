package cm.andreson.arkamod.items;


import cm.andreson.arkamod.ArkadiumMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemArkadiumHammer extends ItemHammer {
   public ItemArkadiumHammer() {
      super(ToolMaterialArkadium.toolTypeArkadium);
      this.setUnlocalizedName("arkadiumhammer");
      this.setTextureName("hammer");
      this.setCreativeTab(ArkadiumMod.Arkatab);
   }




   public void breakOtherBlock(EntityPlayer player, ItemStack stack, int x, int y, int z, int originX, int originY, int originZ, int side) {
      World world = player.worldObj;
      Material mat = world.getBlock(x, y, z).getMaterial();
      if (!world.isAirBlock(x, y, z)) {
         ForgeDirection direction = ForgeDirection.getOrientation(side);
         int range = Math.max(0, 1);
         int rangeY = Math.max(1, range);
         boolean doX = direction.offsetX == 0;
         boolean doY = direction.offsetY == 0;
         boolean doZ = direction.offsetZ == 0;
      }
   }

   

   public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
      return false;
   }
}
