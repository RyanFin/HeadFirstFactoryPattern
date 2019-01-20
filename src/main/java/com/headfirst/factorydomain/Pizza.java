package com.headfirst.factorydomain;

import java.util.ArrayList;

/**
 * 
 * @author ryanfin
 *
 * Product class produced by the factory 
 */

public abstract class Pizza {
	
	protected String name, dough, sauce;
	
	protected ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings ...");
		for(String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350 degrees");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	// add getter method
	public String getName() {
		return this.name;
	}
	
}
