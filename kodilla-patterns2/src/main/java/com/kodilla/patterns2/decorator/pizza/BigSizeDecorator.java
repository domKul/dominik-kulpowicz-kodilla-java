package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BigSizeDecorator extends AbstractBasicPizzaDecorator{
    protected BigSizeDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Big Size";
    }
}
