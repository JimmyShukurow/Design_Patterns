package org.example.StrategyPattern.duckExample;

import org.example.StrategyPattern.duckExample.behaviors.fly.FlyWithWings;
import org.example.StrategyPattern.duckExample.behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("I am swimming Mallard Duck!");
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
