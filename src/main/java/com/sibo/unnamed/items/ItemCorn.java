package com.sibo.unnamed.items;

import com.sibo.unnamed.common.Unnamed;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCorn extends ItemFood implements IItemModelProvider, IItemOreDict{
	
	public ItemCorn(){
		super(3, 0.6f, false);
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
		setCreativeTab(Unnamed.creativeTab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		Unnamed.proxy.registerItemRenderer(this, 0, "cropCorn");
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("cropCorn", this);
	}
	

}
