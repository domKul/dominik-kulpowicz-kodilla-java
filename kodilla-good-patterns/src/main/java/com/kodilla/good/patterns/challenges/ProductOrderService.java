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
      User buyer=  userInformation.getUserInfo(userID);
      Products productsToBuy = productInformation.productName(productsID);
       if (buyer!=null&&productsToBuy!=null){
          sendInformation.sendMessage("Purchase information has been sent");
       }else {
           sendInformation.sendMessage("Problem with the purchase");
       }


    }



}
