package com.kodilla.testing.shape;

public class Triangle implements Shape{
    public Triangle(String name) {
        this.name = name;
    }

    private String name = "Treiangle";
    private double a1= 3.5;
    private double a2= 4.7;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
       double a3 = a1*a2;
       return a3;
    }

    @Override
    public String toString() {
        return name;
    }
}
