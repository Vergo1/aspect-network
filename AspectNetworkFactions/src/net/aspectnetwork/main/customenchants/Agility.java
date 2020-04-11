package net.aspectnetwork.main.customenchants;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Agility implements Listener
{

	private Plugin plugin = null;
	
	private boolean addPotioneffect = false;
	PotionEffect pe = new PotionEffect(PotionEffectType.SPEED,100,1);
	PotionEffect pe1 = new PotionEffect(PotionEffectType.SPEED,100,2);
	PotionEffect pe2 = new PotionEffect(PotionEffectType.SPEED,100,3);

	
	public Agility(JavaPlugin plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void playerInteractionEvent(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		if(p.getInventory().getBoots() != null)
		{
			if(p.getInventory().getBoots().hasItemMeta())
			{
				if(p.getInventory().getBoots().getItemMeta().hasLore())
				{
					for(int i = 0; i<p.getInventory().getBoots().getItemMeta().getLore().size(); i++)
					{
			
						if(p.getInventory().getBoots().getItemMeta().getLore().get(i).contains(ChatColor.LIGHT_PURPLE + "Agility"))
						{
			
							if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 1"))
							{
								addEffect(p,1);
							}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 2"))
							{
								addEffect(p,2);
							}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 3"))
							{
								addEffect(p,3);
							}
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void inventoryActionEvent(InventoryClickEvent e)
	{
		Player p = (Player) e.getWhoClicked();
		if(p.getInventory().getBoots() != null)
		{
			if(p.getInventory().getBoots().hasItemMeta())
			{
				for(int i = 0; i<p.getInventory().getBoots().getItemMeta().getLore().size(); i++)
				{
		
					if(p.getInventory().getBoots().getItemMeta().getLore().get(i).contains(ChatColor.LIGHT_PURPLE + "Agility"))
					{
		
						if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 1"))
						{
							addEffect(p,1);
						}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 2"))
						{
							addEffect(p,2);
						}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 3"))
						{
							addEffect(p,3);
						}
					}
				}
			}
		}
		
		
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent e)
	{
		Player p = (Player) e.getPlayer();
		
		if(p.getInventory().getBoots() == null)
		{
			
		}else {
		
			if(p.getInventory().getBoots() != null)
			{
			
			
			
				if(p.getInventory().getBoots().hasItemMeta())
				{
					for(int i = 0; i<p.getInventory().getBoots().getItemMeta().getLore().size(); i++)
					{
			
						if(p.getInventory().getBoots().getItemMeta().getLore().get(i).contains(ChatColor.LIGHT_PURPLE + "Agility"))
						{
			
							if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 1"))
							{
								addEffect(p,1);
							}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 2"))
							{
								addEffect(p,2);
							}else if(p.getInventory().getBoots().getItemMeta().getLore().get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Agility 3"))
							{
								addEffect(p,3);
							}
						}
					}
				}
			}
		}
		
	}
	
	
	
	

	
	private void addEffect(Player p,int level)
	{		
				if(level == 1)
				{
					p.addPotionEffect(pe);
				}else if(level == 2)
				{
					p.addPotionEffect(pe1);
				}else if(level == 3)
				{
					p.addPotionEffect(pe2);
				}
	}
	
}
