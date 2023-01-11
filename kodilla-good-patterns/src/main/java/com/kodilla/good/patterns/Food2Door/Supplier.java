package com.kodilla.good.patterns.Food2Door;


public class Supplier {

    String suplierName;

    public Supplier(String suplierName) {
        this.suplierName = suplierName;

    }

    public String getSuplierName() {
        return suplierName;
    }

    public String toString(){
        return "Suplier Name: " + suplierName;

    }


}
