package org.example.FactoryPattern.PizzaExample.Stores;

import org.example.FactoryPattern.PizzaExample.Ingredients.NYPizzaIngredientsFactory;
import org.example.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import org.example.FactoryPattern.PizzaExample.Pizza;
import org.example.FactoryPattern.PizzaExample.PizzaStore;
import org.example.FactoryPattern.PizzaExample.Pizzas.CheesePizza;
import org.example.FactoryPattern.PizzaExample.Pizzas.ClamPizza;
import org.example.FactoryPattern.PizzaExample.Pizzas.PepperoniPizza;
import org.example.FactoryPattern.PizzaExample.Pizzas.VeggiePizza;

public class ChicStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientsFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
