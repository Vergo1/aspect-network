package net.aspectnetwork.main.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class MinersDreamEvent implements Listener
{
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		Action a = e.getAction();
		Block b = e.getClickedBlock();
		
		if(a.equals(a.LEFT_CLICK_BLOCK))
		{
			
			if(p.getItemInHand() != null)
			{
				if(p.getItemInHand().hasItemMeta())
				{
					if(p.getItemInHand().getItemMeta().hasDisplayName())
					{
						if(p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Miners Dream"))
						{					
			
			
							
							for(int i = 0; i<500; i++)
							{
								Block topblock = p.getWorld().getBlockAt(b.getX(),b.getY()+1,b.getZ());
								Block topRightblock = p.getWorld().getBlockAt(b.getX(),b.getY()+1,b.getZ()+1-i);
								Block topLeftblock = p.getWorld().getBlockAt(b.getX(),b.getY()+1,b.getZ()+1+i);
								
								Block middleBlock = p.getWorld().getBlockAt(b.getX(),b.getY(),b.getZ());
								Block middleRightblock = p.getWorld().getBlockAt(b.getX(),b.getY(),b.getZ()+1-i);
								Block middleLeftblock = p.getWorld().getBlockAt(b.getX(),b.getY(),b.getZ()+1+i);
								
								Block bottomblock = p.getWorld().getBlockAt(b.getX(),b.getY()-1,b.getZ());
								Block bottomRightblock = p.getWorld().getBlockAt(b.getX(),b.getY()-1,b.getZ()+1-i);
								Block bottomLeftblock = p.getWorld().getBlockAt(b.getX(),b.getY()-1,b.getZ()+1+i);
			
								topblock.breakNaturally();
								topRightblock.breakNaturally();
								topLeftblock.breakNaturally();
								
								middleBlock.breakNaturally();
								middleRightblock.breakNaturally();
								middleLeftblock.breakNaturally();
								
								bottomblock.breakNaturally();
								bottomRightblock.breakNaturally();
								bottomLeftblock.breakNaturally();
							}
							ItemStack air = new ItemStack(Material.AIR);
							p.setItemInHand(air);
						}
					}
				}
			}
		}
	}
	

}
