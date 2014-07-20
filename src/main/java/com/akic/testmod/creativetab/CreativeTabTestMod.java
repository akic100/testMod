package com.akic.testmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.akic.testmod.init.ModItems;
import com.akic.testmod.reference.Reference;

public class CreativeTabTestMod{
	public static final CreativeTabs TEST_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){

		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}
		
		};
}