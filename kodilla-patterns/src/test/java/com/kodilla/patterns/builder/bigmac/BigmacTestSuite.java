package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testCreatingBigMac(){
        //Give
        Bigmac bigmac =new Bigmac.BigmacBuilder()
                .bun("hamburger bun")
                .sauce("barbecue")
                .ingredients("onion")
                .burgers(3)
                .ingredients("chilli")
                .ingredients("lettuce")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int ingrediensQuantity= bigmac.getIngredients().size();
        //Then
        assertEquals(4,ingrediensQuantity);
    }
}
