package eu.vortexgg.vortexpearls.config;

import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Arrays;
import java.util.List;

public enum Config {
    CROSSPEARL_EXTRA_XZ(0.3, "Speeds up passing through block after crosspearl", "Pearl-Checks.CrosspearlMoveHelper"),

    PASS_THRU_EXTRA_BLOCKS(0, "Number of extra blocks that can be thrown thru slab (for ex.). \nBy default it's only 1 slab already.", "Pearl-Checks.PassThruExtraBlocks"),

    THRU_FENCEGATE(true, "Pearl thru all types of fence gates", "Pearl-Checks.Thru.FenceGates"),
    THRU_COBWEB(true, "Pearl thru cob web", "Pearl-Checks.Thru.Cobweb"),
    THRU_STRING(true, "Pearl thru string", "Pearl-Checks.Thru.String"),
    THRU_PLANTS(false, "Pearl thru all types of plants", "Pearl-Checks.Thru.Plants"),

    FIX_WALL_GLITCH(true, "Fixes glitching thru wall", "Pearl-Checks.Anti-Glitch.FixWallsGlitch"),
    CHEST_UNDER_GATE_ENABLED(false, "Fixes pearl thru chest that is under fence gate", "Pearl-Checks.Anti-Glitch.ChestUnderGateEnabled"),
    HOPPER_UNDER_GATE_ENABLED(false, "Fixes pearl thru hopper that is under fence gate", "Pearl-Checks.Anti-Glitch.HopperUnderGateEnabled"),
    FIX_GATE_GLITCH(true, "Fixes fence gate glitching", "Pearl-Checks.Anti-Glitch.FixFenceGateGlitch"),

    REFUND_ON_CRITBLOCK(false, "Refunds pearl on disabled critblock pearl", "Pearl-Checks.Pearl-Thru.RefundOnCritblock"),
    INSTANTLY_PASS_THRU(false, "Instantly teleports you to the point after pearl thru slab", "Pearl-Checks.Pearl-Thru.InstantlyPassThru"),
    HIT_THRU_BLOCK(true, "Pearl hits slab even if pearl didn't hit it", "Pearl-Checks.Pearl-Thru.HitThruBlock"),
    PRE_THRU_BLOCK(true, "Pearl hits slab even if pearl landed near to it", "Pearl-Checks.Pearl-Thru.PreThruBlock"),

    TELEPORT_TO_ENTITY(true, "Teleports you to the hit entity location", "Pearl-Checks.EntityTeleport.teleportToEntity"),
    GET_OUT_FROM_ONE_BY_ONE(false, "Pearl ignores the enemy if he is in you", "Pearl-Checks.EntityTeleport.getOutFromOneByOne"),
    REFUND_IF_SO_CLOSE_DISTANCE(1.0, "Refunds if pearl landed next to against block. -1 to disable", "Pearl-Checks.Prevent-Suffocation.RefundIfSoCloseDistance"),
    REFUND_IF_SUFFOCATING(true, "Refunds if pearl and player is in block", "Pearl-Checks.Prevent-Suffocation.RefundIfSuffocating"),
    REFUND_RISKY_PEARL(true, "Refunds pearl that can get the player suffocating", "Pearl-Checks.Prevent-Suffocation.RefundRiskyPearl"),

    COOLDOWN_ENABLED(true, "Enables VortexPearls cooldown system", "cooldown.enabled"),
    COOLDOWN_KOHI_DISPLAY_ENABLED(true, null, "cooldown.kohiDisplay.enabled"),
    COOLDOWN_KOHI_DISPLAY("&dEnderpearl&7: &f%time%", "Displays cooldown time in the hotbar of item name", "cooldown.kohiDisplay.display"),
    COOLDOWN_CANT_USE("&7(&d&l!&7) &fYou can't use Enderpearl for another &5%time% seconds&f!", null, "cooldown.message.cantUse"),
    COOLDOWN_NOW_CAN("&7(&d&l!&7) &fYou can now use Enderpearl!", null, "cooldown.message..nowCan"),
    COOLDOWN_DURATION(15.0, "Duration of cooldown. Doubles can be used.", "cooldown.duration"),

    REFUND_REMOVE_COOLDOWN(true, "Removes VortexPearls cooldown on refund", "refund.removeCooldown"),
    REFUND_LAZARUS_REMOVE_COOLDOWN(false, "Removes Lazarus's cooldown silently without notify in console", "refund.removeSilentLazarusCooldown"),
    REFUND_RETURN_PEARL(true, "Returns pearl on refund", "refund.returnPearl"),
    REFUND_MESSAGE("&7(&d&l!&7) &fYour pearl was refunded!", null, "refund.message"),
    REFUND_CONSOLE_COMMAND("", "Console command on refund. Example: /timer %player% ENDER_PEARL 0", "refund.consoleCommand"),

    AUTO_LAUNCH_LIST(Arrays.asList("FURNACE", "ANVIL", "SIGNS", "HOPPER", "CHESTS",
            "FENCE_GATES", "WORKBENCH", "ENCHANTMENT_TABLE", "BEACON", "ANVIL"
    ), "Pearl launches if player has right-clicked the block", "other.autoLaunchClick"),
    PEARL_DAMAGE(5.0, "Pearl damage on land", "other.pearlDamage"),

    DISABLED_BLOCKS(Arrays.asList("FENCES", "THIN_GLASS"), "Refunds pearl if it landed in the block", "Pearl-Checks.Thru.DisabledBlocks"),
    CRIT_BLOCKS(Arrays.asList(
            "SLABS", "STAIRS", "COBBLE_WALL", "CHEST", "ENDER_CHEST", "TRAPPED_CHEST",
            "BED_BLOCK", "ENDER_PORTAL_FRAME", "ANVIL", "ENCHANTMENT_TABLE", "DAYLIGHT_DETECTOR",
            "PISTON_STICKY_BASE", "PISTON_EXTENSION", "TRAP_DOOR", "IRON_TRAPDOOR"
    ), "Enabled critblocks", "Pearl-Checks.Thru.CritBlock"),
    DIAGONAL_BLOCKS(Arrays.asList(
            "SLABS", "STAIRS", "COBBLE_WALL", "CHEST", "ENDER_CHEST", "TRAPPED_CHEST",
            "BED_BLOCK", "ENDER_PORTAL_FRAME", "ANVIL", "ENCHANTMENT_TABLE", "DAYLIGHT_DETECTOR",
            "PISTON_STICKY_BASE", "PISTON_EXTENSION", "TRAP_DOOR", "IRON_TRAPDOOR"
    ), "Enabled diagonal blocks", "Pearl-Checks.Thru.DiagonalBlock"),
    CROSSPEARL_BLOCKS(Arrays.asList(
            "SLABS", "STAIRS", "COBBLE_WALL", "CHEST", "ENDER_CHEST", "TRAPPED_CHEST",
            "BED_BLOCK", "ENDER_PORTAL_FRAME", "ANVIL", "ENCHANTMENT_TABLE", "DAYLIGHT_DETECTOR",
            "PISTON_STICKY_BASE", "PISTON_EXTENSION", "TRAP_DOOR", "IRON_TRAPDOOR"
    ), "Enabled crosspearl blocks", "Pearl-Checks.Thru.CrossPearl")

    ;

    Config(Object value, String comment, String configSection) {
    }

    public Object getValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public boolean getBooleanValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public double getDoubleValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public List<?> getListValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public int getIntValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public void setValue(Object value) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public void set(Object value) {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public String getStringValue() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public String getComment() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }

    public String getConfigSection() {
        throw new IllegalPluginAccessException("VortexPearls not found");
    }
}
