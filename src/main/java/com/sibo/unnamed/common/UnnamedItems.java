package com.sibo.unnamed.common;

import com.sibo.unnamed.items.IItemModelProvider;
import com.sibo.unnamed.items.IItemOreDict;
import com.sibo.unnamed.items.ItemBase;
import com.sibo.unnamed.items.ItemCorn;
import com.sibo.unnamed.items.ItemOreDict;
import com.sibo.unnamed.items.seeds.ItemSeedCorn;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnnamedItems {

	public static ItemBase ingotCopper;
	public static ItemSeedCorn seedCorn;
	public static ItemCorn cropCorn;
	
	
	public static void init(){
		ingotCopper = register(new ItemOreDict("ingotCopper", "ingotCopper"));
		seedCorn = register(new ItemSeedCorn());
		cropCorn = register(new ItemCorn());
	}
	
	private static <T extends Item> T register(T item){
		GameRegistry.register(item);
		
		if (item instanceof IItemModelProvider){
			((IItemModelProvider)item).registerItemModel(item);		
		}
		
		if(item instanceof IItemOreDict){
			((IItemOreDict)item).initOreDict();
		}
		
		return item;
	}

}
