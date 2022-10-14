package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.Calculator.Calculator;



public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }

        System.out.println("Test- Pierwszy test jednostkowy");

        Calculator calculator = new Calculator();
        int addresult = calculator.add(123, 123);
        int substractresult = calculator.substract(123, 123);

        System.out.println("Add result test of ");
        if(addresult == 246){
            System.out.println("Result of 123 + 123 are 246");
        }else{
            System.out.println("Error");
        }
        System.out.println("Substract result test");
        if (substractresult ==(0)) {
            System.out.println("result of 123 - 123  are 0");
        }else{
            System.out.println("Error");
        }


    }
}
