package Strategy.character;

import Strategy.weaponbehavior.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weapon;
    private String name;

    public Character(String name){
        this.name = name;
    }

    public void setWeapon(WeaponBehavior b){
        this.weapon = b;
    }

    public void fight(){
        this.weapon.useWeapon();
    };

}
