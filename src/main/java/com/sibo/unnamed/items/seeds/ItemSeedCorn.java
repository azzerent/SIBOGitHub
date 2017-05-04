package com.sibo.unnamed.items.seeds;

import com.sibo.unnamed.common.Unnamed;
import com.sibo.unnamed.common.UnnamedBlocks;
import com.sibo.unnamed.items.IItemModelProvider;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemSeedCorn extends ItemSeeds implements IItemModelProvider{
	
	public ItemSeedCorn(){
		super(UnnamedBlocks.cropCorn, Blocks.FARMLAND);
		setUnlocalizedName("seedCorn");
		setRegistryName("seedCorn");
		setCreativeTab(Unnamed.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Unnamed.proxy.registerItemRenderer(item, 0, "seedCorn");
	}
	
	

}
