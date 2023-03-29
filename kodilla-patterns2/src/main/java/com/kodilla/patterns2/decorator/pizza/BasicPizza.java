package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaMaker{
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }

    @Override
    public String getIngredients() {
        return "Pizza ingredients: pizza dough, tomato sauce, cheese";
    }
}
