package eu.vortexgg.vortexpearls.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CooldownHandler implements Listener {

    public boolean isOnCooldown(Player player) {
        return false;
    }

    public void addCooldown(Player player) {
    }

    public int getCooldownTimeSeconds(Player player) {
        return (int) (getCooldownTime(player) / 1000);
    }

    public long getCooldownTime(Player player) {
        return 0L;
    }

    public void removeCooldown(Player player) {
    }

    public void startDisplaying(Player playerlayer) {
    }

    public void stopDisplaying(Player player) {
    }

}
