package eu.vortexgg.vortexpearls.api.event;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerCrossPearlEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private Location from, to;

    private boolean cancelled;
    
    public Location getFrom() {
	return from;
    }
    
    public Location getTo() {
	return to;
    }

    public boolean isCancelled() {
	return cancelled;
    }
    
    public void setTo(Location to) {
	this.to = to;
    }
    
    public void setCancelled(boolean cancelled) {
	this.cancelled = cancelled;
    }
    
    public void setFrom(Location from) {
	this.from = from;
    }
    
    public PlayerCrossPearlEvent(final Player player, final Location from, final Location to) {
        super(player);
        this.from = from;
        this.to = to;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
