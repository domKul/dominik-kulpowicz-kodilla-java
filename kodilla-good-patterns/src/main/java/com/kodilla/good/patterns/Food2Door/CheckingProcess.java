package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class CheckingProcess {




    static Supplier checkingAvailability(String productName, int quantity) {
        Map<Product, Integer> producentProductList = BaseOfProducts.getProducentProductList();
        for (Map.Entry<Product, Integer> entry : producentProductList.entrySet()) {
            int subtractingQuantity = entry.getValue() - quantity;
            double totalPrice = entry.getKey().getPrice() * quantity;
            if (entry.getKey().getProductName().equals(productName) && subtractingQuantity >= 0 && quantity > 0) {
                System.out.println(entry.getKey());
                System.out.println("Amound: " + quantity);
                System.out.println("Total price: " + totalPrice);
                return new Supplier("ExtraFoodShop");
            }
        }
        return null;
    }

}
