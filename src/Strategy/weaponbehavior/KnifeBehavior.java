package Strategy.weaponbehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Slash-slash. I cut you with my knife.");
    }
}
