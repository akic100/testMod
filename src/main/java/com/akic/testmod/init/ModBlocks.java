package com.akic.testmod.init;

import com.akic.testmod.blocks.BlockFlag;
import com.akic.testmod.blocks.BlockTest;
import com.akic.testmod.reference.BlockNames;
import com.akic.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockTest flag = new BlockFlag();
	
	public static void init(){
		GameRegistry.registerBlock(flag, BlockNames.FLAG);
	}
}
