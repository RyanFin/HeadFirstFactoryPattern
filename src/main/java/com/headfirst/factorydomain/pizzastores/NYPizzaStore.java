package com.headfirst.factorydomain.pizzastores;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.PizzaStore;
import com.headfirst.factorydomain.pizzas.NYStyleCheesePizza;
import com.headfirst.factorydomain.pizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else return null;

	}

}
