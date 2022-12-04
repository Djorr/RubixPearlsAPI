package eu.vortexgg.vortexpearls.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Called when player is getting pearl refund
 */
public class PlayerPearlRefundEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    public PlayerPearlRefundEvent(Player who) {
        super(who);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
