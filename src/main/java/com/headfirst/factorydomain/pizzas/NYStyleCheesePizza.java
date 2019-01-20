package com.headfirst.factorydomain.pizzas;

import com.headfirst.factorydomain.Pizza;

/**
 * 
 * @author ryanfin
 *
 * Concrete pizza implementation class
 */

public class NYStyleCheesePizza extends Pizza{
	
	// create constructor
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marianara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
