package com.kodilla.good.patterns.Food2Door;


public class ExtraFoodShop implements FoodProducer {

    @Override
    public Supplier suplierInformation(String name) {
        if (name=="ExtraFoodShop"){
        return new Supplier(name);
        }
        return null ;
    }

}
