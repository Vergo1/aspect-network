package net.aspectnetwork.main.events;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class CustomOres implements Listener
{

	Random rand = new Random();
	
	@EventHandler
	public void blockBreak(BlockBreakEvent event)
	{
		Player p = event.getPlayer();
		Block b = event.getBlock();		
		
		
		if(b.getType().equals(Material.DIAMOND_ORE))
		{
			int randomInteger = rand.nextInt(100);

			if(randomInteger <= 40)
			{
				ItemStack pinkDiamond = new ItemStack(Material.DIAMOND);
				ItemMeta meta = pinkDiamond.getItemMeta();
				
				meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink Diamond");
				pinkDiamond.setItemMeta(meta);
				event.setCancelled(true);
				p.getInventory().addItem(pinkDiamond);
				b.setType(Material.AIR);
			}
		}else if(b.getType().equals(Material.IRON_ORE))
		{
			int randomInteger = rand.nextInt(100);

			if(randomInteger <= 10)
			{
				ItemStack steel = new ItemStack(Material.IRON_INGOT);
				ItemMeta meta = steel.getItemMeta();
				
				meta.setDisplayName(ChatColor.GRAY + "Steel");
				steel.setItemMeta(meta);
				event.setCancelled(true);
				p.getInventory().addItem(steel);
				b.setType(Material.AIR);
			}
		}else if(b.getType().equals(Material.IRON_ORE))
		{
			int randomInteger = rand.nextInt(100);

			if(randomInteger <= 10)
			{
				ItemStack gold = new ItemStack(Material.GOLD_INGOT);
				ItemMeta meta = gold.getItemMeta();
				
				meta.setDisplayName(ChatColor.GOLD + "24 K Gold");
				gold.setItemMeta(meta);
				event.setCancelled(true);
				p.getInventory().addItem(gold);
				b.setType(Material.AIR);
			}
		}
		
	}
	
	
}
