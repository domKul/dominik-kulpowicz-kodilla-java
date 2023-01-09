package com.kodilla.good.patterns.Food2Door;



public class Main {
    public static void main(String[] args) {

        UserInformation userInformation = new DataBaseOfUsers();
        ProductsInformations productInformations = new BaseOfProductOfNewProducent();
        DeliveryProcess deliveryProcess = new Delivery(userInformation, productInformations);

        deliveryProcess.process("Adam", "aaa","product a", 100);



    }
}
