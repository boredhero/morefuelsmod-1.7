package com.bored.morefuelsmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

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
				if (fuel.getItem() == Items.oak_door){
					return 600;
				}
				if (fuel.getItem() == Items.acacia_door){
					return 600;
				}
				if (fuel.getItem() == Items.birch_door){
					//you little birch!
					return 600;
				}
				if (fuel.getItem() == Items.dark_oak_door){
					return 600;
				}
				if (fuel.getItem() == Items.jungle_door){
					return 600;
				}
				if (fuel.getItem() == Items.spruce_door){
					return 600;
				}
				//Buttons
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.wooden_button)){
					return 300;
				}
				if (fuel.getItem() == Items.bowl){
				//Actual calculation here was 225 but I rounded.
					return 240;
				}
				if (fuel.getItem() == Items.boat){
					return 1500;
				}
				if (fuel.getItem() == Items.reeds){
					return 300;
				}
				if (fuel.getItem() == Items.paper){
					return 300;
				}
				//Books, all burn times 300 ticks.
				if (fuel.getItem() == Items.book) {
					return 1000;
				}
				if (fuel.getItem() == Items.writable_book){
					//unwritten writable book
					return 1120;
				}
				if (fuel.getItem() == Items.written_book){
					//already written writable book
					return 1120;
				}
				if (fuel.getItem() == Items.chest_minecart){
				//return time may not be logical.
				//need to investigate vanilla chest burn time.
				//might either adjust vanilla chest burn time or
			    //nerf burn time on this item.
					return 2500;
				}
				//Maps, all 200 ticks
				if (fuel.getItem() == Items.map){
					return 2500;
				}
				if (fuel.getItem() == Items.filled_map){
					return 2500;
				}
				//Fishing Rods and Carrot on a Stick.
				if (fuel.getItem() == Items.fishing_rod){
					return 320;
				}
				if (fuel.getItem() == Items.carrot_on_a_stick){
					return 340;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.tallgrass)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom_block)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom_block)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				//Armor stands
				if (fuel.getItem() == Items.armor_stand){
					return 620;
				}
				//Easter egg. Commented for now....because its pretty darn illogical tbh.
				//if (fuel.getItem() == Items.saddle){
				//	return 1000000;
				//}
				//Now for some weird misc. things
				if (fuel.getItem() == Items.fire_charge){
				//Actual calculation here was 1466.66~ but I rounded.
					return 1480;
				}
				if (fuel.getItem() == Items.firework_charge){
					return 3220;
				}
				if (fuel.getItem() == Items.fireworks){
					return 5120;
				}
				if (fuel.getItem() == Items.gunpowder){
					return 1600;
				}
				if (fuel.getItem() == Items.blaze_powder){
					return 1200;
				}
				if (fuel.getItem() == Items.magma_cream){
					return 2000;
				}
				if (fuel.getItem() == Items.ghast_tear){
					return 2000;
				}
				//Attempt to implement spawn eggs as being burnable...idk why.
				if (fuel.getItem() == Items.spawn_egg){
					return 5000;
				}
				//Stupid stuff made burn-able just so we can get rid of it.
				if (fuel.getItem() == Items.poisonous_potato){
					return 100;
				}
				if (fuel.getItem() == Items.rotten_flesh){
					return 100;
				}
				if (fuel.getItem() == Items.spider_eye){
					return 100;
				}
				if (fuel.getItem() == Items.fermented_spider_eye){
					return 220;
				}
				if (fuel.getItem() == Items.rabbit_foot){
					return 200;
				}
				//Lets make all leather burnable...it makes some sense.
				//All leather items ticks are calculated by multiplying the base tick.
				//Working on being able to burn damaged leather.
				if (fuel.getItem() == Items.leather){
					return 100;
				}
				if (fuel.getItem() == Items.leather_boots){
					return 400;
				}
				if (fuel.getItem() == Items.leather_chestplate){
					return 800;
				}
				if (fuel.getItem() == Items.leather_helmet){
					return 500;
				}
				if (fuel.getItem() == Items.leather_leggings){
					return 700;
				}
				return 0;
	}
}
