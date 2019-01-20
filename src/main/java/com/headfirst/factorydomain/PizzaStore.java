package com.headfirst.factorydomain;

/**
 * 
 * @author ryanfin
 * 
 * Abstract creator class: never knows what the concrete implementation entails :)
 *
 */

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	// Factory method
	public abstract Pizza createPizza(String type);
	
}
