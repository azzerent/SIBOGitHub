package com.sibo.unnamed.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UnnamedTab extends CreativeTabs{
	
	public UnnamedTab(){
		super(Unnamed.modId);
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public Item getTabIconItem(){
		return UnnamedItems.ingotCopper;
	}
	
	@Override
	public boolean hasSearchBar(){
		return true;
	}
	
}
