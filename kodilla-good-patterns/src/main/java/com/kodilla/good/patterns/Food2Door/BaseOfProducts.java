package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class BaseOfProducts implements ProductsInformations {

    public static Map<Product, Integer> getProducentProductList() {
        return producentProductList;
    }

     static Map<Product, Integer> producentProductList = new HashMap<>();
     static {
         producentProductList.put(new Product("product a", 23.5), 100);
         producentProductList.put(new Product("product b", 2.5), 458);
         producentProductList.put(new Product("product c", 31.3), 300);
         producentProductList.put(new Product("product d", 42.1), 95);

          }


    @Override
    public Product porductInfo(String productName) {
        for (Map.Entry<Product,Integer> entry : producentProductList.entrySet()){
            if (entry.getKey().getProductName().equals(productName)){
                return entry.getKey();
            }
        }
        return null;
    }
}
