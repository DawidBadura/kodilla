package com.kodilla.testing.shape;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapecollector=new ShapeCollector();
        //When
        shapecollector.addFigure(new Triangle(14,10));
        //Then
        Assert.assertEquals(1,shapecollector.myShapes.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapecollector=new ShapeCollector();
        shapecollector.addFigure(new Square(14,10));
        //When
        shapecollector.removeFigure(new Square(14,10));
        //Then
        Assert.assertEquals(0,shapecollector.myShapes.size());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapecollector = new ShapeCollector();
        shapecollector.addFigure(new Triangle(14, 10));
        shapecollector.addFigure(new Circle(10));
        shapecollector.addFigure(new Square(4, 10));
        //When
        Shape testShape = shapecollector.getFigure(1);
        Shape testShape1 = shapecollector.getFigure(-1);
        Shape testShape2 = shapecollector.getFigure(6);

        //Then
        Assert.assertEquals(new Circle(10), testShape);
        Assert.assertNull(testShape1);
        Assert.assertNull(testShape2);


    }


}
