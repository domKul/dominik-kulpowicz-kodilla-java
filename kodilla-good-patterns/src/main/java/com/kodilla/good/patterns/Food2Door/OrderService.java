package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class OrderService {

    final FoodProducer foodProducer;
    final ProductsInformations productsInformations;

    public OrderService(FoodProducer foodProducer, ProductsInformations productsInformations) {
        this.foodProducer = foodProducer;
        this.productsInformations = productsInformations;
    }



    public void process(String name, String productName, int quantity){
       Supplier supplierProducer =foodProducer.suplierInformation(name);
        System.out.println(supplierProducer);
        Map<Product, Integer> producentProductList = BaseOfProducts.getProducentProductList();
        for (Map.Entry<Product,Integer> entry : producentProductList.entrySet()){
            int subtractingQuantity =  entry.getValue()-quantity;
            double totalPrice = entry.getKey().getPrice()*quantity;
            if (entry.getKey().getProductName().equals(productName)&&subtractingQuantity>=0&&quantity>0){
                System.out.println(entry.getKey());
                System.out.println("Amound: " + quantity);
                System.out.println("Total price: "+totalPrice);
                System.out.println("Order placed");
            }


        }

    }
}
