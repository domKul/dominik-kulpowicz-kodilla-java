package com.kodilla.good.patterns.Food2Door;



public class Main {
    public static void main(String[] args) {

        ProductsInformations productsInformations = new BaseOfProducts();
        FoodProducer foodProducer1 = new ExtraFoodShop();
        FoodProducer foodProducer2 = new FastFoodShop();
        FoodProducer foodProducer3 = new GlutenFreeShop();
        FoodProducer foodProducer4 = new HealthyShop();

        OrderService orderService1 = new OrderService(foodProducer1,productsInformations);
        orderService1.process("ExtraFoodShop","product a", 10);

        OrderService orderService2 = new OrderService(foodProducer2,productsInformations);
        orderService2.process("FastFoodShop", "product b", 200);

        OrderService orderService3 = new OrderService(foodProducer3,productsInformations);
        orderService3.process("GlutenFreeShop", "product c", 90);

        OrderService orderService4 = new OrderService(foodProducer4,productsInformations);
        orderService4.process("HealthyShop", "product d",100);











    }
}
