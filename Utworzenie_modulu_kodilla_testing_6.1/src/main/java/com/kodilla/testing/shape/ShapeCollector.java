package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector{
    List<Shape> figuresCollection = new ArrayList<>();
   // Circle circle = new Circle("Circle");
   // Square square = new Square("Square");
    //Triangle triangle = new Triangle("Triangle");


    public void addFigure(Shape shape){
        figuresCollection.add(shape);

    }
    public void removeFigure(Shape shape){
        figuresCollection.remove(shape);
    }

   public int getFigure(int n){
        for (n = 0; n < figuresCollection.size(); n++){
            figuresCollection.get(n);
        }
        return n;
    }

    public void showFigures() {

    }



    }



