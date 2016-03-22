package com.bored.morefuelsmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
					return 200;
				}
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.cactus)){
					return 300;
				}
				//Sponges. Wet sponge burns too, need to figure out how to disable that.
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.sponge)){
				//}
				//Removed until further notice. Will be re added but must be enabled by config flag.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.web)){
					return 160;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.lever)){
					return 120;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.grass)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.double_plant)){
					return 200;
				}
				//Flowers start here
				//This code SHOULD cover all flowers.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_flower)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.yellow_flower)){
					return 100;
				}
				//Flowers end here
				if (fuel.getItem() == Items.item_frame){
					return 900;
				}
				if (fuel.getItem() == Items.bed){
					return 1500;
				}
				if (fuel.getItem() == Items.painting){
					return 1000;
				}
				if (fuel.getItem() == Items.sign){
				//Actual calculation here was 633.33~ but I rounded.
					return 640;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.ladder)){
				//Actual calculation here was 233.33~ but I rounded.
					return 240;
				}
				//Rails start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.rail)) {
				//Actual calculation here was 13.75  but I rounded.
					return 20;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.activator_rail)){
				//Actual calculation here was 73.33~ but I rounded.
					return 80;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.detector_rail)){
				//Actual calculation here was 23.33~ but I rounded.
					return 20;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.golden_rail)){
					return 40;
				}
				//Pistons start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.piston)){
					return 1020;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.sticky_piston)){
					return 1040;
				}
				//Pistons end here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.vine)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.waterlily)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.tripwire_hook)){
				//Actual calculation here was 210 but I rounded.
					return 220;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.hay_block)){
					return 900;
				}
				//Wool and Carpet handled here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.carpet)){
				//Actual calculation here was 133.33~ but I rounded.
					return 140;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.wool)){
					return 200;
				}
				//Arrows handled here
				if (fuel.getItem() == Items.arrow){
				//Actual calculation here was 55 but I rounded
					return 60;
				}
				if (fuel.getItem() == Items.feather){
					return 100;
				}
				if (fuel.getItem() == Items.wheat){
					return 100;
				}
				//Seeds handled here, all 60 tick burn times
				if (fuel.getItem() == Items.wheat_seeds){
					return 100;
				}
				if (fuel.getItem() == Items.melon_seeds){
					return 100;
				}
				if (fuel.getItem() == Items.pumpkin_seeds){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.torch)){
				//Actual calculation here was 30 but I rounded.
					return 40;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.redstone_torch)){
					return 120;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.unlit_redstone_torch)){
				//just in case someone gets one of these in their inventory..
					return 120;
				}
				//Doors! Try the back one ;)
				if (fuel.getItem() == Items.wooden_door){
					return 600;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.wooden_button)){
					return 300;
				}
				if (fuel.getItem() == Items.chest_minecart){
				//Vanilla chest burns for 300 ticks.
					return 400;
				}
				return 0;
			}
		}