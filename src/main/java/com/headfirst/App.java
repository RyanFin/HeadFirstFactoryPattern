package com.headfirst;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.PizzaStore;
import com.headfirst.factorydomain.pizzas.NYStyleCheesePizza;
import com.headfirst.factorydomain.pizzastores.NYPizzaStore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
     // Instantiate a new york pizza store
      PizzaStore nyPizzaStore = new NYPizzaStore();
      
      // Take an order
      System.out.println(nyPizzaStore.orderPizza("cheese"));
      
      Pizza pizza = nyPizzaStore.createPizza("cheese"); 
      System.out.println(pizza);
      
    }
}
