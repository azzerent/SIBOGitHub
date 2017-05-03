package com.sibo.unnamed.common;

import com.sibo.unnamed.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnnamedItems {

	public static ItemBase ingotCopper;
	
	
	public static void init(){
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
	}
	
	private static <T extends Item> T register(T item){
		GameRegistry.register(item);
		
		if (item instanceof ItemBase){
			((ItemBase)item).registerItemModel();		
		}
		
		return item;
	}

}
