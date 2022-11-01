package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args) {

      /*  PoemDecorator poemDecorator1 = a -> System.out.println(a + " Testing Stream "+ a);
        poemDecorator1.decorate("ABC");
        poemDecorator1.decorate("!!!");
        PoemDecorator poemDecorator2 = a -> System.out.println(a + " Testing Stream "+ a);
        poemDecorator2.decorate("abcdea".toUpperCase());
        poemDecorator2.decorate("oOoOoO".toLowerCase());
        poemDecorator2.decorate("@".repeat(5));

       */

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AAA", s -> System.out.println(s + " Test Text " + s));
        poemBeautifier.beautify("CCC", s -> System.out.println(s.toUpperCase() + " Test Text " + s));
        poemBeautifier.beautify("@", s -> System.out.println(s.repeat(3) + " Test Text " + s));
        poemBeautifier.beautify("III", s -> System.out.println(s.toLowerCase() + " Test Text " + s));






        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);









    }


}
