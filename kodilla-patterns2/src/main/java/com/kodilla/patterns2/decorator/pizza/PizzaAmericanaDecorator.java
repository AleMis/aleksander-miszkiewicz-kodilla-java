package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaAmericanaDecorator extends AbstractPizzaDecorator {

    public PizzaAmericanaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(15));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " + paprika, onion, maize, chicken";
    }


}
