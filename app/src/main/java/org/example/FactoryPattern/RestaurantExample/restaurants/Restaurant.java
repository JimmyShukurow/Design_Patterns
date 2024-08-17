package org.example.FactoryPattern.RestaurantExample.restaurants;

import org.example.FactoryPattern.RestaurantExample.Burgers.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = create();
        burger.prepare();
        return burger;
    }

    public abstract Burger create();
}
