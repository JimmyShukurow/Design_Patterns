package org.example.FactoryPattern.RestaurantExample.restaurants;

import org.example.FactoryPattern.RestaurantExample.Burgers.Burger;
import org.example.FactoryPattern.RestaurantExample.Burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger create() {
        return new VeggieBurger();
    }
}
