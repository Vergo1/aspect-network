package net.aspectnetwork.main.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WaterAspectBook implements Listener
{
	@EventHandler
	public void InventoryClick(InventoryClickEvent e)
	{
		if(e.getAction() == InventoryAction.PLACE_ALL || e.getAction() == InventoryAction.SWAP_WITH_CURSOR)
		{
			if(e.getCurrentItem().getType().equals(Material.DIAMOND_SWORD) || e.getCurrentItem().getType().equals(Material.DIAMOND_SPADE) || e.getCurrentItem().getType().equals(Material.DIAMOND_HOE) || e.getCurrentItem().getType().equals(Material.DIAMOND_AXE)
					|| e.getCurrentItem().getType().equals(Material.WOOD_SWORD) || e.getCurrentItem().getType().equals(Material.WOOD_SPADE) || e.getCurrentItem().getType().equals(Material.WOOD_HOE) || e.getCurrentItem().getType().equals(Material.WOOD_AXE)
					|| e.getCurrentItem().getType().equals(Material.GOLD_SWORD) || e.getCurrentItem().getType().equals(Material.GOLD_AXE) || e.getCurrentItem().getType().equals(Material.GOLD_HOE) || e.getCurrentItem().getType().equals(Material.GOLD_SPADE)
					|| e.getCurrentItem().getType().equals(Material.IRON_SWORD) || e.getCurrentItem().getType().equals(Material.IRON_AXE) || e.getCurrentItem().getType().equals(Material.IRON_HOE) || e.getCurrentItem().getType().equals(Material.IRON_SPADE)
					|| e.getCurrentItem().getType().equals(Material.STONE_SWORD) || e.getCurrentItem().getType().equals(Material.STONE_SPADE) || e.getCurrentItem().getType().equals(Material.STONE_HOE) || e.getCurrentItem().getType().equals(Material.STONE_AXE))
			{
				if(e.getCursor().hasItemMeta())
				{
					if(e.getCursor().getItemMeta().hasDisplayName())
					{
						if(e.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Water Aspect"))
						{
							
								
								ItemStack item = e.getCurrentItem();
								ItemMeta meta = item.getItemMeta();
						
								if(meta.hasLore())
								{
									for(int i = 0; i < meta.getLore().size(); i++)
									{
										if( meta.getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Water Aspect"))
										{
											return;
										}
									}
									List<String> lore = meta.getLore();
									lore.add(ChatColor.LIGHT_PURPLE + "Water Aspect");
									meta.setLore(lore);
									
								}else {
									ArrayList<String> lore = new ArrayList<String>();
									lore.add(ChatColor.LIGHT_PURPLE + "Water Aspect");
									meta.setLore(lore);
								}
								
								e.setCancelled(true);
								e.getWhoClicked().setItemOnCursor(null);
								item.setItemMeta(meta);
								e.setCurrentItem(item);
								
							}
					}else {
						return;
					}
				}
			
			}
		}
	}
}
