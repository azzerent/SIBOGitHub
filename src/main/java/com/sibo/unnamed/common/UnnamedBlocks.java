package com.sibo.unnamed.common;

import com.sibo.unnamed.blocks.BlockPedestal;
import com.sibo.unnamed.blocks.OreBase;
import com.sibo.unnamed.blocks.crops.BlockCropCorn;
import com.sibo.unnamed.items.IItemModelProvider;
import com.sibo.unnamed.items.IItemOreDict;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnnamedBlocks {

	public static OreBase oreCopper;
	public static BlockCropCorn cropCorn;
	public static BlockPedestal pedestal;
	
	public static void init(){
		oreCopper = register(new OreBase("oreCopper", "oreCopper"));
		cropCorn = register(new BlockCropCorn(), null);
		pedestal = register(new BlockPedestal());
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock){
		GameRegistry.register(block);
		if(itemBlock != null){
			GameRegistry.register(itemBlock);

			if(block instanceof IItemModelProvider){
				((IItemModelProvider)block).registerItemModel(itemBlock);
			}
			
			if(block instanceof IItemOreDict){
				((IItemOreDict)block).initOreDict();
			}
			
			if(itemBlock instanceof IItemOreDict){
				((IItemOreDict)itemBlock).initOreDict();
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
