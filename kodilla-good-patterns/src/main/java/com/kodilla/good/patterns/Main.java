package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
      /*  MovieStore movieStore = new MovieStore();
        String joining = movieStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(joining);

       */


        UserInformation userInformation = new DataBaseUserInfo();
        ProductInformation productInformation = new DataBaseProductInfo();
        SendInformation sendInformation = new SendInfoService();

        ProductOrderService productOrderService = new ProductOrderService(userInformation, productInformation, sendInformation);
         productOrderService.ProductOrderServiceProcessor(123,3);












    }
}
