package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMafiosoDecorator extends AbstractPizzaDecorator{

    public PizzaMafiosoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " + tabasco, salami, pepperoni pepper";
    }
}
