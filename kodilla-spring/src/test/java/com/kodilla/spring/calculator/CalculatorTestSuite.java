package com.kodilla.spring.calculator;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;


    @Test
    void testCalculations(){
        //Given
        //When
       double result1 = calculator.add(3.3,1.3);
       double result2 =calculator.sub(3.3,3.3);
       double result3 =calculator.div(15,3.0);
       double result4 = calculator.mul(3.3,19.3);
        //Then
        assertEquals(4.6,result1);
        assertEquals(0,result2);
        assertEquals(5,result3);
        assertEquals(63.69,result4);
    }

    @Test
    void testContext(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Display.class);
        //When&Then
        System.out.println("List");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
