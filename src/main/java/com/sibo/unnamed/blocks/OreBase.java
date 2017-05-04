package com.sibo.unnamed.blocks;

import com.sibo.unnamed.items.IItemOreDict;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class OreBase extends BlockBase implements IItemOreDict{
	
	private String oreName;
	
	public OreBase(String name, String oreName){
		super(Material.ROCK, name);
		
		this.oreName = oreName;
		
		setHardness(3f);
		setResistance(3f);
	}
	
	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public OreBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

}
