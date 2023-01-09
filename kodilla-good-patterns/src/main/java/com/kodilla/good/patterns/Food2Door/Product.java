package com.kodilla.good.patterns.Food2Door;

public class Product {

    String productName;
    double price;

    public Product(String productName,double price){
        this.productName = productName;
        this.price = price;

    }
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Product name : " + productName;
    }


}
