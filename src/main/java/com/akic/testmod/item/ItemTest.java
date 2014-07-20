package com.akic.testmod.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.akic.testmod.creativetab.CreativeTabTestMod;
import com.akic.testmod.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTest extends Item{
	
	public ItemTest(){
		super();
		this.setCreativeTab(CreativeTabTestMod.TEST_TAB);
	}
	
	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+ 1);
	}
}
