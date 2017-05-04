package com.sibo.unnamed.common;

import com.sibo.unnamed.blocks.OreBase;
import com.sibo.unnamed.blocks.crops.BlockCropCorn;
import com.sibo.unnamed.items.IItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnnmedBlocks {

	public static OreBase oreCopper;
	public static BlockCropCorn cropCorn;
	
	public static void init(){
		oreCopper = register(new OreBase("oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		cropCorn = register(new BlockCropCorn(), null);
		
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock){
		GameRegistry.register(block);
		if(itemBlock != null){
			GameRegistry.register(itemBlock);

			if(block instanceof IItemModelProvider){
				((IItemModelProvider)block).registerItemModel(itemBlock);
			}
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block){
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
