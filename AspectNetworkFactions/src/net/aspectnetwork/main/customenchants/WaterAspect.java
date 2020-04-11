package net.aspectnetwork.main.customenchants;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;

import net.aspectnetwork.main.Main;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;

public class WaterAspect implements Listener
{

	private HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();
	private int cooldowntime = 30;
	
	private Main plugin = Main.getPlugin(Main.class);
	
	
	Random r = new Random();

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e)
	{
		if(e.getDamager() instanceof Player)
		{
			if(e.getEntity() instanceof Player)
			{
				Player p = (Player) e.getEntity();
				ItemStack item = p.getItemInHand();
			
				
				
					ItemMeta itemmeta1 = null;
					ItemMeta itemmeta2 = null;
					ItemMeta itemmeta3 = null;
					ItemMeta itemmeta4 = null;
					if(item != null && item.hasItemMeta()) {
						itemmeta1 = item.getItemMeta();
					}

					
						if(itemmeta1 != null && itemmeta1.hasLore())
						{
							List<String> lore1 = itemmeta1.getLore();
							for(int i = 0; i<lore1.size(); i++)
							{
								if(lore1.get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Water Aspect"))
								{
									check(p,e.getDamager());
								}
							}
						}
				}
		}
	}
	
	private void check(Player p, Entity e)
	{
			int randomNumber = r.nextInt(100);
		//	if(randomNumber <= 15)
		//	{
				
				
				e.getLocation().getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
				e.getLocation().getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
				e.getLocation().getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);

				p.getWorld().getBlockAt((int)p.getLocation().getX(),(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX(),(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()+1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX(),(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()-1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()+1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()+1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()-1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()-1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()+1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()+1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()-1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()+1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()+1).setType(Material.WATER);
				p.getWorld().getBlockAt((int)p.getLocation().getX()-1,(int)p.getLocation().getY()-1,(int)p.getLocation().getZ()).setType(Material.WATER);
				Location loc3 = p.getLocation();
				
				PacketPlayOutWorldParticles particles = new PacketPlayOutWorldParticles(EnumParticle.DRIP_WATER, true, (float)loc3.getX(),(float)loc3.getY(),(float)loc3.getZ(),1f,1f,1f,1,100,1);

				for(int a =0; a<1; a++)
				{
					((CraftPlayer) p).getHandle().playerConnection.sendPacket(particles);
				}
			//}
	}
	

	
	
	
	
	
}
