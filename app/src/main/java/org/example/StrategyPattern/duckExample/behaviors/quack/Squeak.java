package org.example.StrategyPattern.duckExample.behaviors.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am squeaking duck!");
    }
}
