package eu.vortexgg.vortexpearls;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;

import eu.vortexgg.vortexpearls.hook.Hook;

public class VortexPearls {
    public static ItemStack ENDER_PEARL = new ItemStack(Material.ENDER_PEARL);
    public static boolean LAZARUS_ENABLED = false;
    
    public static VortexPearls getInstance() {
	return null;
    }
    
    public Hook getHook() {
	return null;
    }

    public void setHook(Hook hook) {
    }

    public void refundPearl(Player player) {
    }
    
    public boolean isOnCooldown(Player p) {
        return false;
    }
    
    public void addCooldown(Player p) {
    }
    
    public int getCooldownTimeSeconds(Player p) {
        return 0;
    }

    public long getCooldownTime(Player p) {
        return 0;
    }
    
    public void removeCooldown(Player p) {
    }
    
    public void startDisplaying(Player player) {
    }
    
    public void stopDisplaying(Player p) {
    }
    
    public Map<String, Long> getCooldown() {
	return null;
    }
    
    public Map<String, BukkitTask> getCooldownTasks() {
	return null;
    }
    
    public ConcurrentMap<Object, Object> getItemNameFakes() {
	return null;
    }


}
