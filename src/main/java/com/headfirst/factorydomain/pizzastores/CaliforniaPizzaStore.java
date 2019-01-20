package com.headfirst.factorydomain.pizzastores;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.PizzaStore;
import com.headfirst.factorydomain.pizzas.CalifornianStyleBeefPizza;
import com.headfirst.factorydomain.pizzas.CalifornianStyleClamPizza;


public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CalifornianStyleBeefPizza();
		} else if(type.equals("veggie")) {
			return new CalifornianStyleClamPizza();
		} else return null;
	}

}
