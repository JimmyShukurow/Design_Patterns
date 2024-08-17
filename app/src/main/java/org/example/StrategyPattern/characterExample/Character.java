package org.example.StrategyPattern.characterExample;

import org.example.StrategyPattern.characterExample.behaviors.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
