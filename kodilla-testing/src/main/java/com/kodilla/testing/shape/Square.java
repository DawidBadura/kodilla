package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private Double a, b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a.equals(square.a) &&
                b.equals(square.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
