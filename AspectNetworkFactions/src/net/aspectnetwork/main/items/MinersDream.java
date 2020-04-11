package net.aspectnetwork.main.items;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import net.aspectnetwork.main.MainAPI;

public class MinersDream implements CommandExecutor{
	

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			
			if(label.equalsIgnoreCase("giveStaff"))
			{
				if(args[0].equalsIgnoreCase("MinersDream"))
				{
					ItemStack FierySword = new ItemStack(Material.ENDER_PEARL);
					ItemMeta FierySwordMeta = FierySword.getItemMeta();
					FierySwordMeta.setDisplayName(ChatColor.GOLD + "Miners Dream");
					FierySword.setItemMeta(FierySwordMeta);
					p.getInventory().addItem(FierySword);
					
				}
			}else {
				MainAPI.sendMessage(p, "Add what custom item you would like to be given!", ChatColor.RED);
			}
		}
			
		
		return true;
	}
	
	
	
}
