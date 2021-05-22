package cm.andreson.arkamod.craft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArkadiumMachineRecipe {
   private static final ArkadiumMachineRecipe instance = new ArkadiumMachineRecipe();
   private Map<ItemStack[], ItemStack> smeltingList = new HashMap();

   public void add(ItemStack stack1, ItemStack stack2, ItemStack stack3, ItemStack stack4, ItemStack stack5, ItemStack stack) {
      ItemStack[] stackList = new ItemStack[]{stack1, stack2, stack3, stack4, stack5};
      this.smeltingList.put(stackList, stack);
   }

   public void add(Item item1, Block item2, Item item3, Block item4, Item item5, ItemStack stack) {
      this.add(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
   }

   public void add(Item item1, Item item2, Item item3, Item item4, Item item5, ItemStack stack) {
      this.add(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
   }

   public void add(Block item1, Block item2, Item item3, Block item4, Block item5, ItemStack stack) {
      this.add(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
   }

   public void add(Item item1, Block item2, Block item3, Block item4, Block item5, ItemStack stack) {
      this.add(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
   }

   public ItemStack getSmeltingResult(ItemStack[] stack) {
      Iterator iterator = this.smeltingList.entrySet().iterator();

      while(iterator.hasNext()) {
         Entry entry = (Entry)iterator.next();
         if (this.isSameKey(stack, (ItemStack[])((ItemStack[])entry.getKey()))) {
            return (ItemStack)entry.getValue();
         }
      }

      return null;
   }

   private boolean isSameKey(ItemStack[] stackList, ItemStack[] stackList2) {
      boolean isSame = false;

      for(int i = 0; i <= 4; ++i) {

         isSame = true;
      }

      return isSame;
   }

   public Map<ItemStack[], ItemStack> getSmeltingList() {
      return this.smeltingList;
   }

   public static ArkadiumMachineRecipe getManager() {
      return instance;
   }
}
