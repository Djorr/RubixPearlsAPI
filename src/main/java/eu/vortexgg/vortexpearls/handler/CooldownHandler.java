package eu.vortexgg.vortexpearls.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CooldownHandler implements Listener {

    public boolean isOnCooldown(Player p) {
        return false;
    }

    public void addCooldown(Player p) {
    }

    public int getCooldownTimeSeconds(Player p) {
        return (int) (getCooldownTime(p) / 1000);
    }

    public long getCooldownTime(Player p) {
        return 0L;
    }

    public void removeCooldown(Player p) {
    }

    public void startDisplaying(Player player) {
    }

    public void stopDisplaying(Player p) {
    }

}
