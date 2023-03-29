package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseOnTheEdgesDecorator extends AbstractBasicPizzaDecorator{
    protected CheeseOnTheEdgesDecorator(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", cheese on the edges";
    }
}
