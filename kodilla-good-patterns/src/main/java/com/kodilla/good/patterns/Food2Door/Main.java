package com.kodilla.good.patterns.Food2Door;



public class Main {
    public static void main(String[] args) {

        ProductsInformations productsInformations = new BaseOfProducts();
        FoodProducer foodProducer1 = new ExtraFoodShop();
        FoodProducer foodProducer2 = new FastFoodShop();
        FoodProducer foodProducer3 = new GlutenFreeShop();
        FoodProducer foodProducer4 = new HealthyShop();


        OrderService orderService1 = new OrderService(foodProducer1,productsInformations);
        orderService1.orderExecution(foodProducer1,"product a", 109);













    }
}
