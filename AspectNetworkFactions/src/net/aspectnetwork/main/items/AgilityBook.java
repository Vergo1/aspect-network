package net.aspectnetwork.main.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AgilityBook implements Listener
{

	
	@EventHandler
	public void InventoryClick(InventoryClickEvent e)
	{
		if(e.getAction() == InventoryAction.PLACE_ALL || e.getAction() == InventoryAction.SWAP_WITH_CURSOR)
		{
			if(e.getCursor().hasItemMeta())
			{
				if(e.getCursor().getItemMeta().hasDisplayName())
				{
					if(e.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Agility I"))
					{
						if(e.getCurrentItem().getType().equals(Material.DIAMOND_BOOTS) || e.getCurrentItem().getType().equals(Material.CHAINMAIL_BOOTS) || e.getCurrentItem().getType().equals(Material.GOLD_BOOTS)||e.getCurrentItem().getType().equals(Material.IRON_BOOTS)||e.getCurrentItem().getType().equals(Material.LEATHER_BOOTS))
						{
							
							ItemStack item = e.getCurrentItem();
							ItemMeta meta = item.getItemMeta();
					
							if(meta.hasLore())
							{
								for(int i = 0; i < meta.getLore().size(); i++)
								{
									if( meta.getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 1"))
									{
										return;
									}
								}
								List<String> lore = meta.getLore();
								lore.add(ChatColor.LIGHT_PURPLE + "Agility 1");
								meta.setLore(lore);
								
							}else {
								ArrayList<String> lore = new ArrayList<String>();
								lore.add(ChatColor.LIGHT_PURPLE + "Agility 1");
								meta.setLore(lore);
							}
							
							e.setCancelled(true);
							e.getWhoClicked().setItemOnCursor(null);
							item.setItemMeta(meta);
							e.setCurrentItem(item);
							
						}
					}
				}else {
					return;
				}
			}
		
		}
	}
	
	

	
}
