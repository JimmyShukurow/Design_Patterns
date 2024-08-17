package org.example.StrategyPattern.duckExample.behaviors.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am quacking duck!");
    }
}
