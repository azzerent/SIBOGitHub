package com.sibo.unnamed.blocks;

import com.sibo.unnamed.common.Unnamed;
import com.sibo.unnamed.items.IItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IItemModelProvider{

	private String name;
	
	public BlockBase(Material material, String name){
		super(material);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Unnamed.creativeTab);
	}
	
	public void registerItemModel(Item itemBlock){
		Unnamed.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
