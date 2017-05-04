package com.sibo.unnamed.common;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class UnnamedRecipes {

	public static void init(){
		GameRegistry.addShapelessRecipe(new ItemStack(UnnamedItems.seedCorn), UnnamedItems.cropCorn);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_STEW), " R ", "CPM", " B ", 'R', Items.COOKED_RABBIT, 'C', UnnamedItems.cropCorn, 'P', Items.BAKED_POTATO, 'M', Blocks.BROWN_MUSHROOM, 'B', Items.BOWL);
		
		//Smelting
		GameRegistry.addSmelting(UnnamedBlocks.oreCopper, new ItemStack(UnnamedItems.ingotCopper, 2), 0.7f);
		
		//OreDict
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET,  "I I", " I ", 'I', "ingotCopper"));
	}
}
