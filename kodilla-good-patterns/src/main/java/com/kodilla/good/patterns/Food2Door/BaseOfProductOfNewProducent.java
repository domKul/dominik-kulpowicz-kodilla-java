package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class BaseOfProductOfNewProducent implements ProductsInformations {

    Map<Product, Integer>newProducentProductList= new HashMap<>();

    @Override
    public Product porductInfo(String productName, Integer quantity) {
        newProducentProductList.put(new Product("product a", 23.5), 100);
        newProducentProductList.put(new Product("product b", 2.5), 458);
        newProducentProductList.put(new Product("product c", 31.3), 300);
        newProducentProductList.put(new Product("product d", 42.1), 95);
        for (Map.Entry<Product,Integer> entry :newProducentProductList.entrySet()){
            Integer substractingQuantity =  entry.getValue()-quantity;
            Product product = entry.getKey();
            if (entry.getKey().getProductName()==productName&&substractingQuantity>=0){
              Double totalPrice = entry.getKey().getPrice()*quantity;
                System.out.println("Name: " + product+ " X"+quantity);
                System.out.println("Total Price: "+totalPrice);
            }
        }
        return null;
    }
}
