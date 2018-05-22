package Strategy.weaponbehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("CHOP! You've been chunked by my axe!");
    }
}
