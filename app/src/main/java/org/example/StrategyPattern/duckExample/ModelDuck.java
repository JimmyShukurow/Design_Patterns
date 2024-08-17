package org.example.StrategyPattern.duckExample;

import org.example.StrategyPattern.duckExample.behaviors.fly.FlyNoWay;
import org.example.StrategyPattern.duckExample.behaviors.quack.Quack;

public class ModelDuck extends Duck{


    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void display() {
        System.out.println("I am model duck!");
    }
}
