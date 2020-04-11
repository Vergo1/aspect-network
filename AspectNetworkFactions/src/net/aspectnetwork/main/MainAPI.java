package net.aspectnetwork.main;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MainAPI 
{
	
	
	
	public static void sendMessage(Player p, String msg, ChatColor clr)
	{
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD +  "Aspect" + ChatColor.YELLOW + "" + ChatColor.BOLD + "Network" + ChatColor.YELLOW +"" + ChatColor.BOLD + "] " + clr + msg);
	}
	
	
	
}
