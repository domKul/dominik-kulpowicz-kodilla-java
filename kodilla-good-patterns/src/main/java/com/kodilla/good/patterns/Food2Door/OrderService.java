package com.kodilla.good.patterns.Food2Door;



public class OrderService {

    final FoodProducer foodProducer;
    final ProductsInformations productsInformations;

    public OrderService(FoodProducer foodProducer, ProductsInformations productsInformations) {
        this.foodProducer = foodProducer;
        this.productsInformations = productsInformations;
    }



    public void orderExecution( FoodProducer foodProducer, String productName, int quantity){
        if (foodProducer.process(productName,quantity)!=null){
            System.out.println(foodProducer.suplierName());
            System.out.println("Order placed");

        }else{
            System.out.println("Problem with order");
        }

            }





}
