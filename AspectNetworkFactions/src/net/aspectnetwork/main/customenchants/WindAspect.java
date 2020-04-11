package net.aspectnetwork.main.customenchants;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;


public class WindAspect implements Listener
{
	Random r = new Random();

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e)
	{
		if(e.getDamager() instanceof Player)
		{
			if(e.getEntity() instanceof Player)
			{
				Player p = (Player) e.getEntity();
				ItemStack chest = p.getInventory().getChestplate();
				ItemStack boots = p.getInventory().getBoots();
				ItemStack helm = p.getInventory().getHelmet();
				ItemStack legs = p.getInventory().getLeggings();
			
				
				
					ItemMeta itemmeta1 = null;
					ItemMeta itemmeta2 = null;
					ItemMeta itemmeta3 = null;
					ItemMeta itemmeta4 = null;
					if(chest != null && chest.hasItemMeta()) {
						itemmeta1 = chest.getItemMeta();
					}else if(boots != null && boots.hasItemMeta())
					{
						itemmeta2 = boots.getItemMeta();
					}else if(helm != null && helm.hasItemMeta())
					{
						itemmeta3 = helm.getItemMeta();
					}else if(legs != null && legs.hasItemMeta())
					{
						itemmeta4 = legs.getItemMeta();
					}

					
						if(itemmeta1 != null && itemmeta1.hasLore())
						{
							List<String> lore1 = itemmeta1.getLore();
							for(int i = 0; i<lore1.size(); i++)
							{
								if(lore1.get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Wind Aspect"))
								{
									check(p,e.getDamager());
								}
							}
						}else if(itemmeta2 != null && itemmeta2.hasLore())
						{
							List<String> lore2 = itemmeta2.getLore();
							for(int i = 0; i<lore2.size(); i++)
							{
								if(lore2.get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Wind Aspect"))
								{
									check(p,e.getDamager());
								}
							}
						}else if(itemmeta3 != null && itemmeta3.hasLore())
						{
							List<String> lore3 = itemmeta3.getLore();
							for(int i = 0; i<lore3.size(); i++)
							{
								if(lore3.get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Wind Aspect"))
								{
									check(p,e.getDamager());
								}
							}
						}else if(itemmeta4 != null && itemmeta4.hasLore())
						{
							List<String> lore4 = itemmeta4.getLore();
							for(int i = 0; i<lore4.size(); i++)
							{
								if(lore4.get(i).equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Wind Aspect"))
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
		if(p.getHealth() <= 10.0D)
		{
			int randomNumber = r.nextInt(100);
			if(randomNumber <= 15)
			{
				Vector unitVector = new Vector(p.getLocation().getDirection().getX(), p.getLocation().getDirection().getY() + .1d, p.getLocation().getDirection().getZ());
				Vector unitVector1 = new Vector(e.getLocation().getDirection().getX(), e.getLocation().getDirection().getY() + .1d, e.getLocation().getDirection().getZ());

				unitVector = unitVector.normalize();             
				p.setVelocity(unitVector.multiply(-8)); 
				((Player)e).setVelocity(unitVector1.multiply(-8));
				Location loc1 = p.getLocation();
				Location loc2 = ((Player)e).getLocation();
				
				PacketPlayOutWorldParticles particles = new PacketPlayOutWorldParticles(EnumParticle.CLOUD, true, (float)loc1.getX(),(float)loc1.getY(),(float)loc1.getZ(),1f,1f,1f,1,100,1);

				for(int a =0; a<1; a++)
				{
					((CraftPlayer) p).getHandle().playerConnection.sendPacket(particles);
					((CraftPlayer) e).getHandle().playerConnection.sendPacket(particles);
				}
			}
		}
	}
	
}
