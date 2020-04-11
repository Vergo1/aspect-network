package net.aspectnetwork.main.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.aspectnetwork.main.MainAPI;

public class PlayerJoinEvents implements Listener{

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player p = event.getPlayer();
		
		MainAPI.sendMessage(p, "Players Online: " + Bukkit.getOnlinePlayers().size(), ChatColor.GOLD);
	}
	
	
	
}
