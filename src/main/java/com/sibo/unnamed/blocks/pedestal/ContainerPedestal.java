package com.sibo.unnamed.blocks.pedestal;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;


public class ContainerPedestal extends Container{

	public ContainerPedestal(InventoryPlayer playerInv, final TileEntityPedestal pedestal) {
		IItemHandler inventory = pedestal.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
		addSlotToContainer(new SlotItemHandler(inventory, 0, 80, 35) {
			@Override
			public void onSlotChanged() {
				pedestal.markDirty();
			}
		});
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
	
		for (int k = 0; k < 9; k++) {
			addSlotToContainer(new Slot(playerInv, k, 8 + k * 18, 142));
		}
	}
	
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
	
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index){
		ItemStack itemStack = null;
		Slot slot = inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack()){
			ItemStack itemStack1 = slot.getStack();
			itemStack = itemStack1.copy();
			
			int containerSlots = inventorySlots.size() - player.inventory.mainInventory.length;
			
			if(index < containerSlots){
				if(!this.mergeItemStack(itemStack1, containerSlots, inventorySlots.size(), true)){
					return null;
				}			
			}else if(!this.mergeItemStack(itemStack1, 0, containerSlots, false)){
				return null;
				
			}
			
			if(itemStack1.stackSize == 0){
				slot.putStack(null);
			}else{
				slot.onSlotChanged();
			}
			
			if(itemStack1.stackSize == itemStack.stackSize){
				return null;
			}
			
			slot.onPickupFromSlot(player, itemStack1);
		}
		return itemStack;
	}
	
	

	
	
}
