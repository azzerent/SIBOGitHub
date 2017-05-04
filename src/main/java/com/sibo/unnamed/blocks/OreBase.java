package com.sibo.unnamed.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBase extends BlockBase{
	
	public OreBase(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(3f);
	}
	
	@Override
	public OreBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

}
