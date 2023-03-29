package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalHamDecorator extends AbstractBasicPizzaDecorator{
    protected AdditionalHamDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", ham";
    }
}
