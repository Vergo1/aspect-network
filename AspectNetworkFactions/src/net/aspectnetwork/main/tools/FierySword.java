package net.aspectnetwork.main.tools;

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

public class FierySword implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			
			if(label.equalsIgnoreCase("giveStaff"))
			{
				if(args[0].equalsIgnoreCase("FierySword"))
				{
					ItemStack FierySword = new ItemStack(Material.GOLD_SWORD);
					Enchantment fire = Enchantment.FIRE_ASPECT;
					FierySword.addUnsafeEnchantment(fire, 100);
					FierySword.setDurability((short) -102);
					FierySword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
					ItemMeta FierySwordMeta = FierySword.getItemMeta();
					FierySwordMeta.setDisplayName(ChatColor.GOLD + "Fiery Sword");
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
