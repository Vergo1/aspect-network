package net.aspectnetwork.main.customenchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AddEnchant implements Listener
{
	
	//TODO: Enchant Colors Common: White, Rare: Blue, Legendary: Orange

	private static ArrayList<String> enchants = new ArrayList<String>();
	
	public static void createEnchant(String name)
	{
		enchants.add(name);
	}
	
	public static void addEnchant(String enchant, int level, ItemStack item, ChatColor clr, Player plr, Material mat)
	{
		for(int i = 0; i<enchants.size(); i++)
		{
			if(enchant.equalsIgnoreCase(enchants.get(i)))
			{
				
				ItemMeta itemMeta = item.getItemMeta();

				if(mat == null)
				{
					mat = item.getType();
				}
				
				if(item.getItemMeta().getLore() != null)
				{
					item.setType(mat);
					List<String> lore = item.getItemMeta().getLore();
					lore.add(clr + enchants.get(i) + " " + level);
					itemMeta.setLore(lore);
					item.setItemMeta(itemMeta);
					plr.setItemInHand(item);
					

				}else {
					item.setType(mat);
					ArrayList<String> lore = new ArrayList<String>();
					lore.add(clr + enchants.get(i) + " " + level);
					itemMeta.setLore(lore);
					item.setItemMeta(itemMeta);
					plr.setItemInHand(item);
					
					
				}
				
			}
		}
	}
	

	public static void onEnable() {
		createEnchant("Unbreaking");
		createEnchant("Drill");
		createEnchant("Agility");

	}
	
	public static boolean getEnchantment(String enchant)
	{
		for(int i = 0; i<enchants.size(); i++)
		{
			if(enchant.equalsIgnoreCase(enchants.get(i)))
			{
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
