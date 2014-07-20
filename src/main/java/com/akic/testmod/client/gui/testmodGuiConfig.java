package com.akic.testmod.client.gui;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.akic.testmod.handler.ConfigurationHandler;
import com.akic.testmod.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class testmodGuiConfig extends GuiConfig{
	public testmodGuiConfig(GuiScreen guiScreen){
		super(guiScreen,
				(List<IConfigElement>) new ConfigElement((ConfigCategory) ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL).getChildren()),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}
