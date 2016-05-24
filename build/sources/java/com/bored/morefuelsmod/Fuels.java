package com.bored.morefuelsmod;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Fuels implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Item.itemFrame){
			return 900;
		}
		if(fuel.getItem() == Item.bed){
			return 1500;
		}
		if(fuel.getItem() == Item.painting){
			return 1000;
		}
		if(fuel.getItem() == Item.sign){
			return 640;
		}
		if(fuel.getItem() == Item.arrow){
			return 60;
		}
		if(fuel.getItem() == Item.feather){
			return 100;
		}
		if(fuel.getItem() == Item.wheat){
			return 100;
		}
		if(fuel.getItem() == Item.seeds){
			return 100;
		}
		if(fuel.getItem() == Item.melonSeeds){
			return 100;
		}
		if(fuel.getItem() == Item.pumpkinSeeds){
			return 100;
		}
		if(fuel.getItem() == Item.doorWood){
			return 600;
		}
		if(fuel.getItem() == Item.minecartCrate){
			return 400;
		}
		if(fuel.getItem() == Item.minecartTnt){
			return 8180;
		}
		return 0;
	}

}
