package com.kodilla.good.patterns.Food2Door;

public class Delivery implements DeliveryProcess{
    final UserInformation userInformation;
   final ProductsInformations productsInformations;


    public Delivery( UserInformation userInformation,ProductsInformations productsInformations) {
        this.userInformation = userInformation;
        this.productsInformations = productsInformations;
    }

    @Override
    public void process(String firstName, String lastName, String productName, int quantity) {
       User aboutUser= userInformation.userInformation(firstName,lastName);
       Product aboutProduct= productsInformations.porductInfo(productName,quantity);
       if (aboutProduct!=null){
           System.out.println(aboutProduct);
           System.out.println("Order placed for :");
       }else{
           System.out.println("Problem with the name or quantity, try again");
       }
       if (aboutUser!=null){
           System.out.println(aboutUser);
       }else{
           System.out.println("Wrong user Information's , try again");
       }





    }
}
