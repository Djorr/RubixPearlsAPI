package eu.vortexgg.vortexpearls.hook;

import org.bukkit.entity.Player;

public interface Hook {

    default boolean isOnCooldown(Player p) {
        return false;
    }

}
