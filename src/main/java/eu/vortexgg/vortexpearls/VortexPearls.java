package eu.vortexgg.vortexpearls;

import eu.vortexgg.vortexpearls.api.event.PlayerPearlRefundEvent;
import eu.vortexgg.vortexpearls.handler.CooldownHandler;
import eu.vortexgg.vortexpearls.hook.Hook;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Represents the VortexPearls main class
 */
public class VortexPearls {

    /**
     * Get the instance of VortexPearls
     *
     * @return instance of VortexPearls
     */
    public static VortexPearls getInstance() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Get current hook of a plugin with
     * cooldown system
     *
     * @see Hook
     * @return current hook
     */
    public Hook getHook() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Set the current hook for VortexPearls
     *
     * @param hook Hook to change
     */
    public void setHook(Hook hook) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Get cooldown handler
     *
     * @see CooldownHandler
     * @return cooldown handler
     */
    public CooldownHandler getCooldownHandler() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Refund an ender pearl to player
     * <p>
     *     Removes cooldown if there is any and it's enabled
     *     Returns an ender pearl if it's enabled
     *     Sends "return" message to player
     *     Executes "return" console command with %player% placeholder
     *     Calls {@link PlayerPearlRefundEvent} if it's been used any where
     *
     *     @see PlayerPearlRefundEvent
     * </p>
     *
     * @param player Player to refund the pearl to
     */
    public void refundPearl(Player player) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    /**
     * Reloads config of VortexPearls
     * <p>
     *     Reloads config options
     *     Reloads config comments and header
     * </p>
     */
    public void reloadConfig() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

}
