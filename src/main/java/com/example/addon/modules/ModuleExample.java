public class PrimeAddon extends MeteorAddon {
    public static final Category CATEGORY = new Category("Prime");

    @Override
    public void onInitialize() {
        Modules.get().add(new PrimeAutoTotem());
        Modules.get().add(new PrimeAutoArmor());
        Modules.get().add(new PrimeAutoTrap());
        Modules.get().add(new PrimeAutoCrystal());
        Modules.get().add(new PrimeAutoXP());
        Modules.get().add(new PrimeCriticals());
        Modules.get().add(new PrimeReplenish());
        Modules.get().add(new AutoWeb());
        // rest of your modules
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() { return "com.nbamazz.prime"; }
}
