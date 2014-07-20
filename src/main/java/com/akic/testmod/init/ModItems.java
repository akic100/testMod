package com.akic.testmod.init;

import com.akic.testmod.item.ItemMapleLeaf;
import com.akic.testmod.item.ItemTest;
import com.akic.testmod.reference.ItemNames;
import com.akic.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
@ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemTest mapleLeaf = new ItemMapleLeaf();
	
	
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, ItemNames.MAPLE_LEAF);
	}
}
