package eu.vortexgg.vortexpearls.hook;

import org.bukkit.entity.Player;

/**
 * Represents the Hook clas
 */
public class Hook {

    /**
     * Gets whether this player is on ender pearl cooldown or not.
     *
     * @param player Player to check
     *
     * @return whether this player is on ender pearl cooldown or not
     */
    public boolean isOnCooldown(Player player) {
        throw new IllegalArgumentException("Hook not found");
    }

    /**
     * Removes ender pearl cooldown from player
     *
     * @param player Player to remove ender pearl cooldown
     *
     */
    public void removeCooldown(Player player) {
        throw new IllegalArgumentException("Hook not found");
    }

}
