package org.example.StrategyPattern.characterExample;

import org.example.StrategyPattern.characterExample.behaviors.AxwBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new AxwBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am the King");
    }
}
