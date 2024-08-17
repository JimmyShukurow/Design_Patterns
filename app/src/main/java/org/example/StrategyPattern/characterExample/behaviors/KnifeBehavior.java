package org.example.StrategyPattern.characterExample.behaviors;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with knife");
    }
}
