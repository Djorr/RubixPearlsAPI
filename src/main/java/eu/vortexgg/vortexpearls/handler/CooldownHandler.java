package eu.vortexgg.vortexpearls.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.IllegalPluginAccessException;

public class CooldownHandler implements Listener {

    /**
     * Gets whether this player is on ender pearl cooldown or not.
     *
     * @param player Player to check
     *
     * @return whether this player is on ender pearl cooldown or not
     */
    public boolean isOnCooldown(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Sets the player cooldown on ender pearl
     * for the time specified in the config
     *
     * @param player Player to start the display
     *
     */
    public void addCooldown(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Gets current player ender pearl cooldown in seconds.
     *
     * @param player Player to check
     *
     * @return remaining seconds of cooldown or zero
     */
    public int getCooldownTimeSeconds(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Gets current player ender pearl cooldown in millis.
     *
     * @param player Player to check
     *
     * @return remaining millis of cooldown or zero
     */
    public long getCooldownTime(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Removes ender pearl cooldown from player
     *
     * @param player Player to remove ender pearl cooldown
     *
     */
    public void removeCooldown(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Starts item name cooldown display if
     * player is on ender pearl cooldown
     *
     * @param player Player to start the display
     *
     */
    public void startDisplaying(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Stops item name cooldown display if player has it running
     *
     * @param player Player to stop the display
     *
     */
    public void stopDisplaying(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

}
