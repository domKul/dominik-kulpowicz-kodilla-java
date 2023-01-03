package com.kodilla.good.patterns.challenges;

public class SendInfoService implements SendInformation {

    String message;


    @Override
    public void sendMessage() {
        System.out.println("Message has been sent to your email");
    }
}
