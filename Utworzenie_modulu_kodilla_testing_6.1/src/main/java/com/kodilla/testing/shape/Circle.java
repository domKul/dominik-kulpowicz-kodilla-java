package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    private double r= 3.5;
    private double PI= 3.14;
    private double result = r*r*PI;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return result;
    }

    @Override
    public String toString() {
        return  name;
    }
}
