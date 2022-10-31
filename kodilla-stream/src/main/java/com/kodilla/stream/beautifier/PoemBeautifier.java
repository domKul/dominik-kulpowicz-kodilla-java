package com.kodilla.stream.beautifier;

public class PoemBeautifier{

    public void beautify(String txt){
        PoemDecorator poemDecorator = a -> System.out.println(a + " "+ txt + " " + a);
        poemDecorator.decorate("!!!");
        poemDecorator.decorate("asd".toUpperCase());
        poemDecorator.decorate("@".repeat(5));
        for (int i = 0; i< txt.length(); i++){
            poemDecorator.decorate("@>@".repeat(i));

        }


    }



}
