package eu.vortexgg.vortexpearls.api.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

/**
 * Called before player launching an enderpearl
 */
public class PrePearlLaunchEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled;

    public PrePearlLaunchEvent(Entity what) {
        super(what);
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Gets the EnderPearl provided class
     *
     * @see org.bukkit.entity.EnderPearl
     * @return Projectile of ender pearl
     */
    public Projectile getEntity() {
        return (Projectile) entity;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
