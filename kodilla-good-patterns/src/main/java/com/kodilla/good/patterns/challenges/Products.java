package com.kodilla.good.patterns.challenges;

public class Products {

    String productName;
    int productID;

    public Products(String productName, int productID) {
        this.productName = productName;
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }
}
