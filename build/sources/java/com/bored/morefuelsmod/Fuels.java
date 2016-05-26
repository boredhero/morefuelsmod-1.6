package com.bored.morefuelsmod;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Fuels implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		//Item Frame
		if(fuel.getItem() == Item.itemFrame){
			return 900;
		}
		//Bed
		if(fuel.getItem() == Item.bed){
			return 1500;
		}
		//Painting
		if(fuel.getItem() == Item.painting){
			return 1000;
		}
		//Sign
		if(fuel.getItem() == Item.sign){
			return 640;
		}
		//Arrow
		if(fuel.getItem() == Item.arrow){
			return 60;
		}
		//Feather
		if(fuel.getItem() == Item.feather){
			return 100;
		}
		//Wheat
		if(fuel.getItem() == Item.wheat){
			return 100;
		}
		//Wheat Seeds
		if(fuel.getItem() == Item.seeds){
			return 100;
		}
		//Melon Seeds
		if(fuel.getItem() == Item.melonSeeds){
			return 100;
		}
		//Pumpkin Seeds
		if(fuel.getItem() == Item.pumpkinSeeds){
			return 100;
		}
		//Wooden Door Item?
		if(fuel.getItem() == Item.doorWood){
			return 600;
		}
		//Minecart with Chest
		if(fuel.getItem() == Item.minecartCrate){
			return 400;
		}
		//Minecart with TNT
		if(fuel.getItem() == Item.minecartTnt){
			return 8180;
		}
		//Lets try 1.6 Blocks. Please work!
		//Deadbush
		if(fuel.getItem() == Item.itemsList[32]){
			return 200;
		}
		//Cactus
		if(fuel.getItem() == Item.itemsList[81]){
			return 300;
		}
		//Cobweb
		if(fuel.getItem() == Item.itemsList[30]){
			return 160;
		}
		//Lever
		if(fuel.getItem() == Item.itemsList[69]){
			return 120;
		}
		//Grass
		if(fuel.getItem() == Item.itemsList[31]){
			return 100;
		}
		//Tall Grass, Sunflower, Lilac, Large Fern,
		//Rose Bush, Peony
		if(fuel.getItem() == Item.itemsList[175]){
			return 200;
		}
		//Poppy, Blue Orchid, Allium, Azure Bluet,
		//Tulips, Oxeye Daisy
		if(fuel.getItem() == Item.itemsList[38]){
			return 100;
		}
		//Dandelion
		if(fuel.getItem() == Item.itemsList[37]){
			return 100;
		}
		//Ladder
		if(fuel.getItem() == Item.itemsList[65]){
			return 240;
		}
		//Rail
		if(fuel.getItem() == Item.itemsList[66]){
			return 20;
		}
		//Activator Rail
		if(fuel.getItem() == Item.itemsList[157]){
			return 80;
		}
		//Detector Rail
		if(fuel.getItem() == Item.itemsList[28]){
			return 20;
		}
		//Powered Rail
		if(fuel.getItem() == Item.itemsList[27]){
			return 40;
		}
		//Piston
		if(fuel.getItem() == Item.itemsList[33]){
			return 1020;
		}
		//Sticky Piston
		if(fuel.getItem() == Item.itemsList[29]){
			return 1040;
		}
		//Vines
		if(fuel.getItem() == Item.itemsList[106]){
			return 100;
		}
		//Waterlily
		if(fuel.getItem() == Item.itemsList[111]){
			return 100;
		}
		//Tripwire Hook
		if(fuel.getItem() == Item.itemsList[131]){
			return 220; 
		}
		//Hay Block
		if(fuel.getItem() == Item.itemsList[170]){
			return 900;
		}
		//Carpet
		if(fuel.getItem() == Item.itemsList[171]){
			return 140;
		}
		//Wool
		if(fuel.getItem() == Item.itemsList[35]){
			return 140;
		}
		//Torch
		if(fuel.getItem() == Item.itemsList[50]){
			return 40;
		}
		//Redstone Torch
		if(fuel.getItem() == Item.itemsList[76]){
			return 120;
		}
		//Unlit Redstone Torch
		if(fuel.getItem() == Item.itemsList[75]){
			return 120;
		}
		//Wooden Door
		if(fuel.getItem() == Item.itemsList[64]){
			return 600;
		}
		//Wooden Button
		if(fuel.getItem() == Item.itemsList[143]){
			return 300;
		}
		//TNT Block
		if(fuel.getItem() == Item.itemsList[46]){
			return 8080; 
		}
		return 0;
	}

}
