package org.example.FactoryPattern.PizzaExample.Pizzas;

import org.example.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import org.example.FactoryPattern.PizzaExample.Pizza;

public class VeggiePizza extends Pizza
{
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
