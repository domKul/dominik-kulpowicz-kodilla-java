package com.kodilla.good.patterns.challenges;

public class SendInfoService implements SendInformation {


    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
