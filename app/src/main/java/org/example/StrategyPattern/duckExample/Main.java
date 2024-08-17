package org.example.StrategyPattern.duckExample;

import org.example.StrategyPattern.duckExample.behaviors.fly.FlyNoWay;
import org.example.StrategyPattern.duckExample.behaviors.fly.FlyRocketBehavior;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketBehavior());
        modelDuck.performFly();

        System.out.println(List.of(MallardDuck.class.getSimpleName(), FlyNoWay.class.getSimpleName()));
    }
}
