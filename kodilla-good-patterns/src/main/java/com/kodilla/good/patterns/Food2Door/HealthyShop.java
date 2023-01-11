package com.kodilla.good.patterns.Food2Door;

import static com.kodilla.good.patterns.Food2Door.CheckingProcess.checkingAvailability;

public class HealthyShop implements FoodProducer{
    @Override
    public Supplier suplierName() {
        return new Supplier("HealthyShop");
    }

    @Override
    public Supplier process(String productName, int quantity) {
        return checkingAvailability(productName, quantity);
    }




}
