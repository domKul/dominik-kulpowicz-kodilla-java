package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractBasicPizzaDecorator implements PizzaMaker {

    private final PizzaMaker pizzaMaker;

    protected AbstractBasicPizzaDecorator(PizzaMaker pizzaMaker) {
        this.pizzaMaker = pizzaMaker;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaMaker.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizzaMaker.getIngredients();
    }
}
