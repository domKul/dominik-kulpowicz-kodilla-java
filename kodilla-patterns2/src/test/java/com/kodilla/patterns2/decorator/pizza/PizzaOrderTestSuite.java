package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaPrice(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(15),thePrice);
    }

    @Test
    public void testBasicPizzaIngredients(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza ingredients: pizza dough, tomato sauce, cheese",ingredients);
    }

    @Test
    public void testBasicPizzaWithOnionPrice(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new AdditionalOnionDecorator(thePizza);
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(18),thePrice);
    }

    @Test
    public void testBasicPizzaWithOnionIngredients(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new AdditionalOnionDecorator(thePizza);
        System.out.println(thePizza.getIngredients());
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza ingredients: pizza dough," +
                " tomato sauce, cheese, pieces of onion",ingredients);
    }

    @Test
    public void testBasicPizzaBigSizeWithSalamiAndHamPrice(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new BigSizeDecorator(thePizza);
        thePizza = new AdditionalSalamiDecorator(thePizza);
        thePizza = new AdditionalHamDecorator(thePizza);
        System.out.println(thePizza.getPrice());
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(31),thePrice);
    }

    @Test
    public void testBasicPizzaBigSizeWithSalamiAndHamIngredients(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new BigSizeDecorator(thePizza);
        thePizza = new AdditionalSalamiDecorator(thePizza);
        thePizza = new AdditionalHamDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza ingredients: pizza dough, " +
                "tomato sauce, cheese, Big Size, pices of salami, ham",ingredients);
    }

    @Test
    public void testBasicPizzaAllInOnePrice(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new BigSizeDecorator(thePizza);
        thePizza = new AdditionalSalamiDecorator(thePizza);
        thePizza = new AdditionalHamDecorator(thePizza);
        thePizza = new AdditionalOnionDecorator(thePizza);
        thePizza = new CheeseOnTheEdgesDecorator(thePizza);
        thePizza = new AdditionalCheeseDecorator(thePizza);
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(42),thePrice);
    }

    @Test
    public void testBasicPizzaAllInOneIngredients(){
        //Given
        PizzaMaker thePizza = new BasicPizza();
        thePizza = new BigSizeDecorator(thePizza);
        thePizza = new AdditionalSalamiDecorator(thePizza);
        thePizza = new AdditionalHamDecorator(thePizza);
        thePizza = new AdditionalOnionDecorator(thePizza);
        thePizza = new CheeseOnTheEdgesDecorator(thePizza);
        thePizza = new AdditionalCheeseDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza ingredients: pizza dough, tomato sauce, cheese," +
                " Big Size, pices of salami, ham, pieces of onion," +
                " cheese on the edges, extra chesse",ingredients);
    }

}
