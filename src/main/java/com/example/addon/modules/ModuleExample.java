public class PrimeAutoTotem extends Module {
    public PrimeAutoTotem() {
        super(PrimeAddon.CATEGORY, "prime-auto-totem",
              "Automatically replenishes the totem in your offhand.");
    }

    @EventHandler
    private void onTick(TickEvent.Pre event) {
        if (mc.player.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) return;

        FindItemResult totem = InvUtils.find(Items.TOTEM_OF_UNDYING);
        if (!totem.found()) return;

        InvUtils.move().from(totem.slot()).toOffhand();
    }
}
