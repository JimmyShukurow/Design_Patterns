package org.example.FactoryPattern.RestaurantExample.restaurants;

import org.example.FactoryPattern.RestaurantExample.Burgers.BeefBurger;
import org.example.FactoryPattern.RestaurantExample.Burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger create() {
        return new BeefBurger();
    }
}
