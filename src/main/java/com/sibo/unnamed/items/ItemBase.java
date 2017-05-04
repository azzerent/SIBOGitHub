package com.sibo.unnamed.items;

import com.sibo.unnamed.common.Unnamed;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IItemModelProvider{

	protected String name;
	
	public ItemBase(String name){
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);		
		setCreativeTab(Unnamed.creativeTab);
	}
	
	public void registerItemModel(Item item){
		Unnamed.proxy.registerItemRenderer(item, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
	
}
