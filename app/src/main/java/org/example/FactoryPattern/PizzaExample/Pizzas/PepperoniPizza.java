package org.example.FactoryPattern.PizzaExample.Pizzas;

import org.example.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import org.example.FactoryPattern.PizzaExample.Pizza;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
