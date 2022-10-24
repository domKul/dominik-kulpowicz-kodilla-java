package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector{
    List<Shape> figuresCollection = new ArrayList<>();

    public void addFigure(Shape shape){

        figuresCollection.add(shape);
    }
    public void removeFigure(Shape shape){

        figuresCollection.remove(shape);
    }

   public Shape getFigure(int n){
       return figuresCollection.get(n);
    }

    public String showFigures() {
        return Arrays.toString(figuresCollection.toArray());
    }

}



