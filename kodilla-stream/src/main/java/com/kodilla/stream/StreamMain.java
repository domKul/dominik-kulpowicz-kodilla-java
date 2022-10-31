package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;


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
        poemBeautifier.beautify("tekst");



    }


}
