package org.example.StrategyPattern.characterExample;

import org.example.StrategyPattern.characterExample.behaviors.KnifeBehavior;

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am Troll");
    }
}
