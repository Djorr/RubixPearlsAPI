package eu.vortexgg.vortexpearls.config;

import java.util.Arrays;
import java.util.List;

public enum VSettings {

    FIXWALLGLITCH(true, "Pearl-Checks.Anti-Glitch.FixWallsGlitch"),
    REFUNDIFSOCLOSEDISTANCE(1.0, "Pearl-Checks.Prevent-Suffocation.RefundIfSoCloseDistance"),
    CHESTFENCEENABLED(false, "Pearl-Checks.Anti-Glitch.ChestUnderFenceEnabled"),
    HOPPERFENCENABLED(false, "Pearl-Checks.Anti-Glitch.HopperUnderFenceEnabled"),
    TALITELEPORT(false, "Pearl-Checks.TaliTeleport"),
    REFUNDIFSUFFOCATING(true, "Pearl-Checks.Prevent-Suffocation.RefundPearlIfSuffocating"),
    REFUNDRISKYPEARL(true, "Pearl-Checks.Prevent-Suffocation.RefundRiskyPearl"),
    TALITELEPORTY(0.5, "Pearl-Checks.TaliTeleportY"), MAXPEARLTHRUPASSBLOCKS(0, "Pearl-Checks.MaxPearlPassThruBlocks"),
    HITTHRUBLOCK(true, "Pearl-Checks.Pearl-Thru.HitThruBlock"),
    PRETHRUBLOCK(true, "Pearl-Checks.Pearl-Thru.PreThruBlock"),
    BETTERHITDETECTION(true, "Pearl-Checks.EntityTeleport.betterHitDetection"),
    PEARLPARTICLES(true, "Other.PearlParticles"), PEARLPARTICLESAMOUNT(32, "Other.ParticlesAmount"),
    CROSSPEARLMOVEHELPER(0.3, "Pearl-Checks.CrosspearlMoveHelper"),

    APIPRELAUNCH(false, "API.PrePearlLaunchEvent"), PLACEHOLDERAPI(false, "API.registerPAPI-Placeholders"),

    PEARLDAMAGE(5.0, "Other.PearlDamage"),

    GETOUTFROMONEBYONE(false, "Pearl-Checks.EntityTeleport.getOutFromOneByOne"),

    KOHIDISPLAY("&dEnderpearl&7: &f%time%", "Cooldown.KohiDisplay"),
    COOLDOWNCANTUSE("&7(&d&l!&7) &fYou can't use Enderpearl for another &5%time% seconds&f!", "Cooldown.cantUse"),
    COOLDOWNNOCAN("&7(&d&l!&7) &fYou can now use Enderpearl!", "Cooldown.nowCan"), COOLDOWNTIME(15, "Cooldown.time"),
    COOLDOWNHASANOTHER(false, "Cooldown.haveAnotherCooldown"),
    ONQUITREMOVECOOLDOWN(false, "Cooldown.onQuitRemoveCooldown"),

    REFUNDONCRITBLOCK(false, "Pearl-Checks.Pearl-Thru.RefundOnCritblock"),

    INSTANTLYPASTHRU(false, "Pearl-Checks.Pearl-Thru.InstantlyPassThru"),

    OPENFENCEGATELAUNCH(true, "Other.onOpenFencegateLaunch"),

    LAZARUS_COOLDOWN_REMOVE_NO_MESSAGE_ON_GLITCH(false, "Other.LazarusCooldownRemoveNoMessageOnGlitch"),
    ONGLITCHREMOVECOOLDOWN(true, "Cooldown.onGlitchRemoveCooldown"),
    ONGLITCHRETURNPEARL(true, "Other.onGlitchReturnPearl"),
    ONGLITCHMESSAGE("&7(&d&l!&7) &fYour pearl was refunded!", "Other.onGlitchMessage"),
    ONGLITCHCONSOLECOMMAND("", "Other.onGlitchConsoleCommand"),

    AUTOLAUNCHLIST(Arrays.asList("FURNACE", "ANVIL", "SIGN", "SIGN_POST", "WALL_SIGN", "HOPPER", "CHEST", "ENDER_CHEST",
            "TRAPPED_CHEST", "WORKBENCH", "ENCHANTMENT_TABLE", "BEACON", "ANVIL"), "Other.onClickAutoLaunch"),

    THRUFENCEGATE(true, "Pearl-Checks.Thru.FenceGates"), THRUCOBWEB(true, "Pearl-Checks.Thru.Cobweb"),
    THRUSTRING(true, "Pearl-Checks.Thru.String"), THRUPLANTS(false, "Pearl-Checks.Thru.Plants"),

    REFUNDIFSOCLOSE(true, "Pearl-Checks.Prevent-Suffocation.RefundIfSoClose"),

    SLABS(true, ""), SLABS_ENABLE(true, "Pearl-Checks.Thru.Slabs.enabled"),
    SLABS_DIAGONAL(true, "Pearl-Checks.Thru.Slabs.diagonal"),
    SLABS_CRITBLOCK(true, "Pearl-Checks.Thru.Slabs.critblock"),
    SLABS_CROSSPEARL(true, "Pearl-Checks.Thru.Slabs.crosspearl"),

    STAIRS(true, ""), STAIRS_ENABLE(true, "Pearl-Checks.Thru.Stairs.enabled"),
    STAIRS_DIAGONAL(true, "Pearl-Checks.Thru.Stairs.diagonal"),
    STAIRS_CRITBLOCK(true, "Pearl-Checks.Thru.Stairs.critblock"),
    STAIRS_CROSSPEARL(true, "Pearl-Checks.Thru.Stairs.crosspearl"),

    CHESTS(true, ""), CHESTS_ENABLE(true, "Pearl-Checks.Thru.Chests.enabled"),
    CHESTS_DIAGONAL(true, "Pearl-Checks.Thru.Chests.diagonal"),
    CHESTS_CRITBLOCK(true, "Pearl-Checks.Thru.Chests.critblock"),
    CHESTS_CROSSPEARL(true, "Pearl-Checks.Thru.Chests.crosspearl"),

    BED(true, ""), BED_ENABLE(true, "Pearl-Checks.Thru.Bed.enabled"),
    BED_DIAGONAL(true, "Pearl-Checks.Thru.Bed.diagonal"), BED_CRITBLOCK(true, "Pearl-Checks.Thru.Bed.critblock"),
    BED_CROSSPEARL(true, "Pearl-Checks.Thru.Bed.crosspearl"),

    COBBLEWALL(true, ""), COBBLEWALL_ENABLE(true, "Pearl-Checks.Thru.CobbleWall.enabled"),
    COBBLEWALL_DIAGONAL(true, "Pearl-Checks.Thru.CobbleWall.diagonal"),
    COBBLEWALL_CRITBLOCK(true, "Pearl-Checks.Thru.CobbleWall.critblock"),
    COBBLEWALL_CROSSPEARL(true, "Pearl-Checks.Thru.CobbleWall.crosspearl"),

    PISTONS(true, ""), PISTONS_ENABLE(true, "Pearl-Checks.Thru.Pistons.enabled"),
    PISTONS_DIAGONAL(true, "Pearl-Checks.Thru.Pistons.diagonal"),
    PISTONS_CRITBLOCK(true, "Pearl-Checks.Thru.Pistons.critblock"),
    PISTONS_CROSSPEARL(true, "Pearl-Checks.Thru.Pistons.crosspearl"),

    PORTALFRAME(true, ""), PORTALFRAME_ENABLE(true, "Pearl-Checks.Thru.PortalFrame.enabled"),
    PORTALFRAME_DIAGONAL(true, "Pearl-Checks.Thru.PortalFrame.diagonal"),
    PORTALFRAME_CRITBLOCK(true, "Pearl-Checks.Thru.PortalFrame.critblock"),
    PORTALFRAME_CROSSPEARL(true, "Pearl-Checks.Thru.PortalFrame.crosspearl"),

    ENCHANTTABLE(true, ""), ENCHANTTABLE_ENABLE(true, "Pearl-Checks.Thru.EnchantTable.enabled"),
    ENCHANTTABLE_DIAGONAL(true, "Pearl-Checks.Thru.EnchantTable.diagonal"),
    ENCHANTTABLE_CRITBLOCK(true, "Pearl-Checks.Thru.EnchantTable.critblock"),
    ENCHANTTABLE_CROSSPEARL(true, "Pearl-Checks.Thru.EnchantTable.crosspearl"),

    ANVIL(true, ""), ANVIL_ENABLE(true, "Pearl-Checks.Thru.Anvil.enabled"),
    ANVIL_DIAGONAL(true, "Pearl-Checks.Thru.Anvil.diagonal"),
    ANVIL_CRITBLOCK(true, "Pearl-Checks.Thru.Anvil.critblock"),
    ANVIL_CROSSPEARL(true, "Pearl-Checks.Thru.Anvil.crosspearl"),

    DAYLIGHTSENSOR(true, ""), DAYLIGHTSENSOR_ENABLE(true, "Pearl-Checks.Thru.DayLightSensor.enabled"),
    DAYLIGHTSENSOR_DIAGONAL(true, "Pearl-Checks.Thru.DayLightSensor.diagonal"),
    DAYLIGHTSENSOR_CRITBLOCK(true, "Pearl-Checks.Thru.DayLightSensor.critblock"),
    DAYLIGHTSENSOR_CROSSPEARL(true, "Pearl-Checks.Thru.DayLightSensor.crosspearl"),

    TRAPDOOR(true, ""), TRAPDOOR_ENABLE(true, "Pearl-Checks.Thru.TrapDoor.enabled"),
    TRAPDOOR_DIAGONAL(true, "Pearl-Checks.Thru.TrapDoor.diagonal"),
    TRAPDOOR_CRITBLOCK(true, "Pearl-Checks.Thru.TrapDoor.critblock"),
    TRAPDOOR_CROSSPEARL(true, "Pearl-Checks.Thru.TrapDoor.crosspearl"),

    FIXFENCEGATEGLITCH(true, "Pearl-Checks.Anti-Glitch.FixFencegateGlitch");

    private Object value;
    private final String configSection;

    public String getConfigSection() {
        return configSection;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    VSettings(Object value, String configSection) {
        this.value = value;
        this.configSection = configSection;
    }

    public boolean getBooleanValue() {
        return false;
    }

    public double getDoubleValue() {
        return 0;
    }

    public List<?> getListValue() {
        return null;
    }

    public boolean isCritblock() {
        return false;
    }

    public boolean isDiagonal() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isCrosspearl() {
        return false;
    }

    public int getIntValue() {
        return 0;
    }

    public String getStringValue() {
        return null;
    }

}
