package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

     private final UserInformation userInformation;
     private final ProductInformation productInformation;
     private final SendInformation sendInformation;

    public ProductOrderService(UserInformation userInformation, ProductInformation productInformation, SendInformation sendInformation) {
        this.userInformation = userInformation;
        this.productInformation = productInformation;
        this.sendInformation = sendInformation;
    }

    public void ProductOrderServiceProcessor(final Integer userID, final Integer productsID){
        User buyingProcess=userInformation.getUserInfo(userID);
        Products procuctToBuy = productInformation.productName(productsID);

        if (buyingProcess.equals(userID)&&procuctToBuy.equals(productsID)){

        }



    }


}
