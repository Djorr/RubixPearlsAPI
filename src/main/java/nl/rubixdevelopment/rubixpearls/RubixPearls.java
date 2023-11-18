package nl.rubixdevelopment.rubixpearls;

import nl.rubixdevelopment.rubixpearls.api.event.PlayerPearlRefundEvent;
import nl.rubixdevelopment.rubixpearls.handler.CooldownHandler;
import nl.rubixdevelopment.rubixpearls.hook.Hook;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Represents the RubixPearls main class
 */
public class RubixPearls {

    /**
     * Get the instance of RubixPearls
     *
     * @return instance of RubixPearls
     */
    public static RubixPearls getInstance() {
        throw new IllegalPluginAccessException("RubixPearls not found");
    }

    /**
     * Get current hook of a plugin with
     * cooldown system
     *
     * @see Hook
     * @return current hook
     */
    public Hook getHook() {
        throw new IllegalPluginAccessException("RubixPearls not found");
    }

    /**
     * Set the current hook for RubixPearls
     *
     * @param hook Hook to change
     */
    public void setHook(Hook hook) {
        throw new IllegalPluginAccessException("RubixPearls not found");
    }

    /**
     * Get cooldown handler
     *
     * @see CooldownHandler
     * @return cooldown handler
     */
    public CooldownHandler getCooldownHandler() {
        throw new IllegalPluginAccessException("RubixPearls not found");
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
        throw new IllegalPluginAccessException("RubixPearls not found");
    }

    /**
     * Reloads config of RubixPearls
     * <p>
     *     Reloads config options
     *     Reloads config comments and header
     * </p>
     */
    public void reloadConfig() {
        throw new IllegalPluginAccessException("RubixPearls not found");
    }

}
