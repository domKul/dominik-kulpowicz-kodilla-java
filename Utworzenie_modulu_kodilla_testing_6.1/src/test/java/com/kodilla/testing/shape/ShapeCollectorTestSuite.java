package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(2, shapeCollector.figuresCollection.size());
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
        assertEquals(1, shapeCollector.figuresCollection.size());
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
        Triangle triangle = new Triangle("Triangle");
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //When
        String result= String.valueOf(shapeCollector.getFigure(0));
        //Shape result = shapeCollector.getFigure(0);
        String name = circle.getShapeName();

        //Then
        assertEquals(2, shapeCollector.figuresCollection.size());
        assertEquals(circle.getShapeName(), result);

    }
    @Test
    void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle");
        Triangle triangle = new Triangle("Triangle");

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        String result =shapeCollector.showFigures();

        //Then
        String expectedResult = "[Circle, Triangle]";
        assertEquals(2,shapeCollector.figuresCollection.size());
        assertEquals(expectedResult, result);


    }

}

}
