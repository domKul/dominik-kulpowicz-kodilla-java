package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalSalamiDecorator extends AbstractBasicPizzaDecorator{
    protected AdditionalSalamiDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", pices of salami";
    }
}
