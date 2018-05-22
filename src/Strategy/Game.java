package Strategy;

import Strategy.character.Character;
import Strategy.character.Rogue;
import Strategy.weaponbehavior.AxeBehavior;
import Strategy.weaponbehavior.KnifeBehavior;
import Strategy.weaponbehavior.WeaponBehavior;

public class Game {
    public static void main(String[] args){

        // Demonstrating the strategy pattern by having Character abstract class with subclasses that can use different
        // weapon behaviors. Weapon behavior is the strategy.

        // Create rogue, set weapon to knife
        Character rogue = new Rogue("Rogue");
        WeaponBehavior knife = new KnifeBehavior();
        WeaponBehavior axe = new AxeBehavior();
        rogue.setWeapon(knife);

        // Rogue slashes!
        rogue.fight();

        rogue.setWeapon(axe);
        rogue.fight();
    }
}
