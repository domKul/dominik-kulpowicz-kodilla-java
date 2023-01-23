package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User adam = new Millenials("Adam");
        User seb = new ZGeneration("Seb");
        User kamil = new YGeneration("Kamil");

        //When
        String adamSocialMedia = adam.sharePost();
        System.out.println("Adam: " + adamSocialMedia);
        String sebSocialMedia = seb.sharePost();
        System.out.println("Seb: " + sebSocialMedia);
        String kamilSocialMedia = kamil.sharePost();
        System.out.println("Kamil: " + kamilSocialMedia);

        //Thne
        assertEquals("Snapchat", adamSocialMedia);
        assertEquals("Facebook",sebSocialMedia);
        assertEquals("Twitter", kamilSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamBeforeChange = adam.sharePost();
        System.out.println("Snap " + adamBeforeChange);
        adam.setSocialPublisher(new FacebookPublisher());
       String adamAfterChange= adam.sharePost();
        System.out.println("Snap to " + adamAfterChange);
        //Then
        assertEquals("Facebook",adamAfterChange);

    }
}
