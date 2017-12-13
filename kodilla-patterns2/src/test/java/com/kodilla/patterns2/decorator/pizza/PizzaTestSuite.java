package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testPizzaMargheritaGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testPizzaMargheritaGetPizzaDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();

        //When
        String description = pizzaOrder.getPizzaDescription();

        //Then
        assertEquals("Pizza dough, sauce and cheese", description);
    }

    @Test
    public void testPizzaMafiosoGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaMafiosoDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(25), price);
    }

    @Test
    public void testPizzaMafiosoGetPizzaDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaMafiosoDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Pizza dough, sauce and cheese + tabasco, salami, pepperoni pepper", description);
    }

    @Test
    public void testPizzaAmericanaAdditionalCheeseGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaAmericanaDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(34), price);
    }

    @Test
    public void testPizzaAmericanaAdditionalCheeseGetPizzaDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaAmericanaDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getPizzaDescription();

        //Then
        assertEquals("Pizza dough, sauce and cheese + paprika, onion, maize, chicken + additional cheese", description);
    }
}
