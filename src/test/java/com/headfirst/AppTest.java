package com.headfirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.pizzas.ChicagoStyleCheesePizza;
import com.headfirst.factorydomain.pizzas.NYStyleCheesePizza;
import com.headfirst.factorydomain.pizzastores.ChicagoPizzaStore;
import com.headfirst.factorydomain.pizzastores.NYPizzaStore;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static NYPizzaStore nyPizzaStore;
    private static ChicagoPizzaStore chicagoPizzaStore;
    private static Pizza pizza1, pizza2;
    
    
	//Add Setup
	@BeforeClass
	public static void setUp() {
		// instantiate instance variables here
		nyPizzaStore = new NYPizzaStore();  
		pizza1 = nyPizzaStore.orderPizza("cheese"); //cheese type pizza
		chicagoPizzaStore = new ChicagoPizzaStore();
		pizza2 = chicagoPizzaStore.orderPizza("cheese");
		
	}
	
	
  	// Test order of cheese pizza from New York Pizza Store
    @Test
    public void orderFromNYStoreTest(){
    	// Check that a cheese type pizza has been returned 
    	assertThat(nyPizzaStore.orderPizza("cheese"), instanceOf(NYStyleCheesePizza.class));
    	System.out.println("Ethan ordered a " + pizza1.getName() + "\n");
    }
    
    // Test order of cheese pizza from the Chicago Pizza Store
    @Test
    public void orderFromChicagoStoretest() {
    	// check that a chicago pizza is 
    	assertThat(pizza2, instanceOf(ChicagoStyleCheesePizza.class));
    	System.out.println("Joel ordered a " + pizza2.getName() + "\n");
    }
    
    // Add tear down method
    @After
    public void tearDown() {
    //	nyPizzaStore = null;
    }
}
