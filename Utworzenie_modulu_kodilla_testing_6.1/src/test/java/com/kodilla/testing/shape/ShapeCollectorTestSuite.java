package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

@BeforeAll
    public static void beforeAllTests(){
    System.out.println("Begin of tests");
}
@AfterAll
    public static void afterAllTests(){
    System.out.println("All tests are done");
}
@BeforeEach
    public void beforEachTest(){
    testCounter++;
    System.out.println("Preparing for execute test #" + testCounter);
}

    @Nested
    @DisplayName("Adding and removing figures test")
    class ShapeCollectionTestOne{

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle");
        Square square = new Square("Square1");

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals(2, shapeCollector.figuresCollection.size());
        Assertions.assertTrue(shapeCollector.figuresCollection.contains(circle));
        Assertions.assertTrue(shapeCollector.figuresCollection.contains(square));
    }

    @Test
    void testRemovingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle= new Circle("Circle");
        Square square = new Square("Square1");

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(circle);

        //Then
        Assertions.assertTrue(shapeCollector.figuresCollection.contains(square));
        Assertions.assertEquals(1, shapeCollector.figuresCollection.size());
    }
}
   @Nested
   @DisplayName("Testing how to show and get the firgures")
   class ShapeCollectorTestTwo{
    @Test
    void testGetFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle");
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.getFigure(0);

        //Then
        Assertions.assertTrue(shapeCollector.figuresCollection.size()>0);
        Assertions.assertEquals(1, shapeCollector.getFigure(1));

    }
    @Test
    void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle");
        Triangle triangle = new Triangle("Triangle");
        Square square = new Square("Square");

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.showFigures();

        //Then
        String expectedResult = "[Circle, Triangle]";
        Assertions.assertEquals(2,shapeCollector.figuresCollection.size());
        Assertions.assertEquals(expectedResult, shapeCollector.showFigures());


    }

}

}
