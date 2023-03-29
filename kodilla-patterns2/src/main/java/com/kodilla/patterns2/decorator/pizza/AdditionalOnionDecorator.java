package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalOnionDecorator extends AbstractBasicPizzaDecorator{
    protected AdditionalOnionDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", pieces of onion";
    }
}
