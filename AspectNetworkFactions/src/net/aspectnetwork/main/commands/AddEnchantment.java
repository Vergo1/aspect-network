package net.aspectnetwork.main.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.aspectnetwork.main.MainAPI;
import net.aspectnetwork.main.customenchants.AddEnchant;

public class AddEnchantment implements CommandExecutor
{
	



	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player plr = (Player) sender;

			if(label.equalsIgnoreCase("addEnchants"))
			{
				if(args[0].equalsIgnoreCase("Unbreaking"))
				{
					ItemStack enchantedItem = plr.getItemInHand();
					ItemMeta meta = enchantedItem.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					meta.setLore(lore);
					enchantedItem.setItemMeta(meta);
					AddEnchant.addEnchant("Unbreaking", 1, enchantedItem, ChatColor.LIGHT_PURPLE, plr, null);

					plr.setItemInHand(enchantedItem);

					
					
				}else if(args[0].equalsIgnoreCase("Drillpick"))
				{
					ItemStack Drillpick = new ItemStack(Material.DIAMOND_PICKAXE);
					Drillpick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
					Drillpick.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 2);
					ItemMeta DrillpickMeta = Drillpick.getItemMeta();
					DrillpickMeta.setDisplayName(ChatColor.GOLD + "Drill Pick11");
					Drillpick.setItemMeta(DrillpickMeta);
					AddEnchant.addEnchant("Drill", 1, Drillpick, ChatColor.LIGHT_PURPLE, plr, null);
					plr.getInventory().addItem(Drillpick);
					
				}else if(args[0].equalsIgnoreCase("Agility1"))
				{
					ItemStack enchantedItem = plr.getItemInHand();
					ItemMeta meta = enchantedItem.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					meta.setLore(lore);
					enchantedItem.setItemMeta(meta);
					AddEnchant.addEnchant("Agility", 1, enchantedItem, ChatColor.LIGHT_PURPLE, plr, null);

					plr.setItemInHand(enchantedItem);	
				}else if(args[0].equalsIgnoreCase("Agility2"))
				{
					ItemStack enchantedItem = plr.getItemInHand();
					ItemMeta meta = enchantedItem.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					meta.setLore(lore);
					enchantedItem.setItemMeta(meta);
					AddEnchant.addEnchant("Agility", 2, enchantedItem, ChatColor.LIGHT_PURPLE, plr, null);

					plr.setItemInHand(enchantedItem);	
				}else if(args[0].equalsIgnoreCase("Agility3"))
				{
					ItemStack enchantedItem = plr.getItemInHand();
					ItemMeta meta = enchantedItem.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					meta.setLore(lore);
					enchantedItem.setItemMeta(meta);
					AddEnchant.addEnchant("Agility", 3, enchantedItem, ChatColor.LIGHT_PURPLE, plr, null);

					plr.setItemInHand(enchantedItem);	
				}
				
				else {
					MainAPI.sendMessage(plr, "Incorrect Item!", ChatColor.RED);
				}
			}
		}
		return true;
	}

}
