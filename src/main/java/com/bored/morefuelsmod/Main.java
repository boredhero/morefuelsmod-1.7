package com.bored.morefuelsmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.IFuelHandler;
import com.bored.morefuelsmod.Fuels;

@Mod(modid = Main.MODID, version = Main.VERSION, name=Main.MODNAME)
public class Main {

	public static final String MODID = "morefuelsmod-1.7.10";
	public static final String VERSION = "1.3.2";
	public static final String MODNAME = "More Fuels Mod";
	
	@Instance(value = Main.MODID)
    public static Main instance;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.3F);
		config.save();
		}

	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.registerFuelHandler(new Fuels());
		}
}