package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements PizzaOrder {

    private PizzaOrder pizzaOrder;

    public AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getPizzaDescription() {
        return pizzaOrder.getPizzaDescription();
    }
}
