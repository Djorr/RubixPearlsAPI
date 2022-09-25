package eu.vortexgg.vortexpearls.api.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

public class PrePearlLaunchEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled;

    public PrePearlLaunchEvent(final Entity what) {
        super(what);
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

    public Projectile getEntity() {
        return (Projectile) entity;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
