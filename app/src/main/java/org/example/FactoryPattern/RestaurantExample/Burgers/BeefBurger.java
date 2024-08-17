package org.example.FactoryPattern.RestaurantExample.Burgers;

public class BeefBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("Add some Beef to burger");
        cut();
        box();
    }
}
