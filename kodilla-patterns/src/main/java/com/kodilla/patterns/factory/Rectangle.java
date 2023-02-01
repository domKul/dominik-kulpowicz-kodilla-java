package com.kodilla.patterns.factory;

import java.util.Objects;

public final class Rectangle implements Shape {

    private final String name;
    private final double width;
    private final double length;

    public Rectangle(final String name, final double width, final double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.length, length) == 0 && Objects.equals(name, rectangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length);
    }
}
