package eu.vortexgg.vortexpearls.hook;

import eu.vortexgg.vortexpearls.VortexPearls;
import org.bukkit.entity.Player;

public interface Hook {

    default boolean isOnCooldown(Player p) {
        return false;
    }

}
