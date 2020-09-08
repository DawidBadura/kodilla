package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> myShapes = new ArrayList<>();

    void addFigure(Shape shape) {
        myShapes.add(shape);
    }

    void removeFigure(Shape shape) {
        if (myShapes.contains(shape)) {
            myShapes.remove(shape);
        }

    }

    Shape getFigure(int n) {
        if ((myShapes.size() > n) && (n > 0)) {
            return myShapes.get(n);
            //System.out.println(myShapes.get(n).getShapeName()+": "+myShapes.get(n).getField());
        } else return null;
    }

    void showFigures() {
        for (Shape i : myShapes) {
            System.out.println(i.getShapeName() + ": " + i.getField());
        }
    }
}
