package com.headfirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.headfirst.factorydomain.Pizza;
import com.headfirst.factorydomain.pizzas.NYStyleCheesePizza;
import com.headfirst.factorydomain.pizzastores.NYPizzaStore;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static NYPizzaStore nyPizzaStore;
    private static Pizza pizza1;
    
    
	//Add Setup
	@BeforeClass
	public static void setUp() {
		// instantiate instance variables here
		nyPizzaStore = new NYPizzaStore();  
		pizza1 = nyPizzaStore.orderPizza("cheese");
	}
	
	
  	// Test order
    @Test
    public void orderTest()
    {
    	// Check that a cheese type pizza has been returned 
    	assertThat(nyPizzaStore.orderPizza("cheese"), instanceOf(NYStyleCheesePizza.class));
    	
    }
    
    @Test
    public void preparePizzaTest() {
    	
    }
    
 
    
    // Add tear down method
    @After
    public void tearDown() {
    //	nyPizzaStore = null;
    }
}
