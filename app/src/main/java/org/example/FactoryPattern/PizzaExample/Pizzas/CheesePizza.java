package org.example.FactoryPattern.PizzaExample.Pizzas;

import org.example.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import org.example.FactoryPattern.PizzaExample.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}


