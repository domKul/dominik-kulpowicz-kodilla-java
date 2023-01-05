package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class DataBaseProductInfo implements ProductInformation{


    Map<Integer, Products> productsList = new HashMap<>();

    @Override
    public Products productName(Integer productID) {
        productsList.put(1, new Products("Ksiazka", 1));
        productsList.put(2, new Products("Sluchawki", 2));
        productsList.put(3, new Products("Szczotka do zebow", 3));
        for (Map.Entry<Integer, Products> entry : productsList.entrySet()) {
            if(entry.getValue().getProductID()==productID){
                return entry.getValue();
            }
        }
        return null;
    }
}
