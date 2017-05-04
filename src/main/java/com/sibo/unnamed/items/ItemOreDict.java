package com.sibo.unnamed.items;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOreDict extends ItemBase implements IItemOreDict{

	private String oreName;
	
	public ItemOreDict(String name, String oreName) {
		super(name);
		
		this.oreName = oreName;
	}
	
	@Override
	public void initOreDict(){
		OreDictionary.registerOre(oreName, this);
	}
	

}
