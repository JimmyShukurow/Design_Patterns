package org.example.FactoryPattern.PizzaExample;

import org.example.FactoryPattern.PizzaExample.Stores.NYStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
//        PizzaStore chicStylePizzaStore = new ChicStylePizzaStore();
//        chicStylePizzaStore.orderPizza("pepperoni");
    }
}
