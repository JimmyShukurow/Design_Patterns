package org.example.StrategyPattern.characterExample;


import org.example.StrategyPattern.characterExample.behaviors.BowAndArrowBehavior;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am th Queen");
    }
}
