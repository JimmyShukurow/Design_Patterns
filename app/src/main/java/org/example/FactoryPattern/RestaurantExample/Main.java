package org.example.FactoryPattern.RestaurantExample;

import org.example.FactoryPattern.RestaurantExample.restaurants.BeefBurgerRestaurant;
import org.example.FactoryPattern.RestaurantExample.restaurants.Restaurant;
import org.example.FactoryPattern.RestaurantExample.restaurants.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();
        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();
    }

}
