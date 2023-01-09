package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class BaseOfProductOfNewProducent implements ProductsInformations {

    Map<Product, Integer>newProducentProductList= new HashMap<>();

    @Override
    public Product porductInfo(String productsName, Integer quantity) {
        newProducentProductList.put(new Product("product a", 23.5), 100);
        newProducentProductList.put(new Product("product b", 2.5), 458);
        newProducentProductList.put(new Product("product c", 31.3), 300);
        newProducentProductList.put(new Product("product d", 42.1), 95);
        for (Map.Entry<Product,Integer> entry :newProducentProductList.entrySet()){
            Integer substractingQuantity =  entry.getValue()-quantity;
            Double totalPrice = entry.getKey().getPrice()*quantity;
            if (entry.getKey().getProductName().equals(productsName)&&substractingQuantity>=0){
                System.out.println("Total price: "+totalPrice);
                return entry.getKey();
            }
        }
        return null;
    }
}
