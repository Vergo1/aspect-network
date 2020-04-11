package net.aspectnetwork.main.customenchants;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class Unbreaking implements Listener
{
	
	
	@EventHandler
	public void onDamageEvent(PlayerItemDamageEvent e)
	{
		Player p = e.getPlayer();
		ItemStack item = e.getPlayer().getItemInHand();
		
		if(item.hasItemMeta())
		{
			for(int i = 0; i<item.getItemMeta().getLore().size(); i++)
			{
				
				
				if(item.getItemMeta().getLore().get(i).contains(ChatColor.LIGHT_PURPLE + "Unbreaking"))
				{
					item.setDurability((short) 0);
					e.getPlayer().setItemInHand(item);
				}
			}
		}
		
	}
	
	
	
}
