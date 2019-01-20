package com.headfirst.factorydomain.pizzastores;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.PizzaStore;
import com.headfirst.factorydomain.pizzas.ChicagoStyleCheesePizza;
import com.headfirst.factorydomain.pizzas.ChicagoStylePepperoniPizza;


public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}

}
