package net.aspectnetwork.main;

import org.bukkit.plugin.java.JavaPlugin;

import net.aspectnetwork.main.commands.AddEnchantment;
import net.aspectnetwork.main.commands.GiveEnchantmentBook;
import net.aspectnetwork.main.customenchants.AddEnchant;
import net.aspectnetwork.main.customenchants.Agility;
import net.aspectnetwork.main.customenchants.Unbreaking;
import net.aspectnetwork.main.customenchants.WaterAspect;
import net.aspectnetwork.main.customenchants.WindAspect;
import net.aspectnetwork.main.events.CustomOres;
import net.aspectnetwork.main.events.MinersDreamEvent;
import net.aspectnetwork.main.events.PlayerJoinEvents;
import net.aspectnetwork.main.items.AgilityBook;
import net.aspectnetwork.main.items.MinersDream;
import net.aspectnetwork.main.items.WaterAspectBook;
import net.aspectnetwork.main.items.WindAspectBook;
import net.aspectnetwork.main.tools.FierySword;
import net.minecraft.server.v1_8_R3.EntitySquid;




public class Main extends JavaPlugin
{

	
	public void onEnable()
	{
		AddEnchant.onEnable();
		
		
		
		
		getServer().getPluginManager().registerEvents(new PlayerJoinEvents(), this);
		getServer().getPluginManager().registerEvents(new MinersDreamEvent(), this);
		getServer().getPluginManager().registerEvents(new Unbreaking(), this);
		getServer().getPluginManager().registerEvents(new CustomOres(), this);
		getServer().getPluginManager().registerEvents(new Agility(this), this);
		getServer().getPluginManager().registerEvents(new AgilityBook(), this);
		getServer().getPluginManager().registerEvents(new WindAspect(), this);
		getServer().getPluginManager().registerEvents(new WindAspectBook(), this);
		getServer().getPluginManager().registerEvents(new WaterAspect(), this);
		getServer().getPluginManager().registerEvents(new WaterAspectBook(), this);



		
        this.getCommand("giveStaff").setExecutor(new FierySword());
        this.getCommand("giveStaff").setExecutor(new MinersDream());
        this.getCommand("addEnchants").setExecutor(new AddEnchantment());
        this.getCommand("giveEnchantmentbook").setExecutor(new GiveEnchantmentBook());

	}
	
	public void onDisable()
	{
		
	}
	

	
	
	
	
}
