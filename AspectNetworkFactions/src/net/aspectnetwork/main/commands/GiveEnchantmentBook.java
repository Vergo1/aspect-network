package net.aspectnetwork.main.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class GiveEnchantmentBook implements CommandExecutor
{

	
	private ChatColor epic = ChatColor.LIGHT_PURPLE;
	private ChatColor common = ChatColor.GRAY;
	private ChatColor rare = ChatColor.BLUE;
	private ChatColor aspect = ChatColor.GOLD;
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player plr = (Player) sender;
			
			if(label.equalsIgnoreCase("giveEnchantmentbook"))
			{
				if(args[0].equalsIgnoreCase("agility1"))
				{
					ItemStack enchantedBook = new ItemStack(Material.BOOK);
					ItemMeta meta = enchantedBook.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					
					meta.setDisplayName(ChatColor.WHITE + "Agility I");
					lore.add(common + "COMMON");
					
					meta.setLore(lore);
					enchantedBook.setItemMeta(meta);
					
					plr.getInventory().addItem(enchantedBook);
				}else if(args[0].equalsIgnoreCase("agility2"))
				{
					ItemStack enchantedBook = new ItemStack(Material.BOOK);
					ItemMeta meta = enchantedBook.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					
					meta.setDisplayName(ChatColor.WHITE + "Agility II");
					lore.add(rare + "RARE");
					
					meta.setLore(lore);
					enchantedBook.setItemMeta(meta);
					
					plr.getInventory().addItem(enchantedBook);
				}else if(args[0].equalsIgnoreCase("agility3"))
				{
					ItemStack enchantedBook = new ItemStack(Material.BOOK);
					ItemMeta meta = enchantedBook.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					
					meta.setDisplayName(ChatColor.WHITE + "Agility III");
					lore.add(epic + "EPIC");
					
					meta.setLore(lore);
					enchantedBook.setItemMeta(meta);
					
					plr.getInventory().addItem(enchantedBook);
				}else if(args[0].equalsIgnoreCase("windaspect"))
				{
					ItemStack enchantedBook = new ItemStack(Material.BOOK);
					ItemMeta meta = enchantedBook.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					
					meta.setDisplayName(ChatColor.WHITE + "Wind Aspect");
					lore.add(aspect + "Aspect");
					
					meta.setLore(lore);
					enchantedBook.setItemMeta(meta);
					
					plr.getInventory().addItem(enchantedBook);
				}else if(args[0].equalsIgnoreCase("wateraspect"))
				{
					ItemStack enchantedBook = new ItemStack(Material.BOOK);
					ItemMeta meta = enchantedBook.getItemMeta();
					ArrayList<String> lore = new ArrayList<String>();
					
					meta.setDisplayName(ChatColor.WHITE + "Water Aspect");
					lore.add(aspect + "Aspect");
					
					meta.setLore(lore);
					enchantedBook.setItemMeta(meta);
					
					plr.getInventory().addItem(enchantedBook);
				}
			}
		}
		
		return true;
	}

}
