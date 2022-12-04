package eu.vortexgg.vortexpearls.api.event;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Called when player is cross pearling thru
 * a specified cross pearl block
 */
public class PlayerCrossPearlEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Location from;
    private Location to;
    private boolean cancelled;

    public PlayerCrossPearlEvent(Player player, Location from, Location to) {
        super(player);
        this.from = from;
        this.to = to;
    }

    /**
     * Gets the player current location
     *
     * @return player location
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Gets the new teleport location
     *
     * @return new teleport location
     */
    public Location getTo() {
        return to;
    }

    /**
     * Sets new teleport location
     *
     * @param to new teleport location
     */
    public void setTo(Location to) {
        this.to = to;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
