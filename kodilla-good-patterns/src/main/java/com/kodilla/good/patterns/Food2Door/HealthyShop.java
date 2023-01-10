package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements FoodProducer{
    @Override
    public Supplier suplierInformation(String name) {
        return new Supplier(name);
    }
}
