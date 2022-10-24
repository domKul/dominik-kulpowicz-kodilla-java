package com.kodilla.testing.shape;

public class Square implements Shape {

    public Square(String name) {
        this.name = name;
    }

    private String name = "Square";
    private double a = 7;

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double result = a * a;
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}