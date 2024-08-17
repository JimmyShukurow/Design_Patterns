package org.example.StrategyPattern.characterExample;

import org.example.StrategyPattern.characterExample.behaviors.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a Knight");
    }
}
